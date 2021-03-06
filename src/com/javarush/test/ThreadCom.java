package com.javarush.test;


class TickTock {
    String state; // �������� �������� � ��������� �����
    synchronized void tick(boolean running) {
        if (!running) { // ���������� ����
            state = "ticked";
           // notify(); // ��������� ��������� ������
            return;
        }
        System.out.print("Tick ");
        state = "ticked"; // ���������� ������� ��������� ����� ����� "���"
        notify(); // ����� tick{) ���������� ����� tock()
// � ����������� ���������� ����������.
        try {
            while(!state.equals("tocked") )
                wait();// ����� tick() ������� ���������� ������ tock().
        }
        catch(InterruptedException exc) {
            System.out.println("Thread interrupted.");
        }
    }
    synchronized void tock(boolean running) {
        if(!running) { // ���������� ����
            state = "tocked";
            notify(); // ��������� ��������� ������
            return;
        }
        System.out.println("Tock");
        state = "tocked"; // ���������� ������� ��������� ����� ����� "���"
        notify(); // ����� tock() ���������� ����� tick()
        //� � ����������� ���������� ����������.
        try {
            while(!state.equals("ticked") )
                wait (); // ����� tock() ������� ���������� ������ tick().
        }
        catch(InterruptedException exc) {
            System.out.println("Thread interrupted.");
        }
    }
}
class MyThread implements Runnable {

    Thread thrd;
    TickTock ttOb;
   // ��������� ����� �����
    MyThread(String name, TickTock tt) {
        thrd = new Thread(this, name);
        ttOb = tt;
        thrd.start(); // ������ �����
    }
    // ������ ���������� ������ ������
    public void run() {
        if(thrd.getName().compareTo("Tick") == 0)	{
            for(int i=0; i<5; i++) ttOb.tick(true);
            ttOb.tick(false);
        }
        else {
            for(int i=0; i<5; i++) ttOb.tock(true);
            ttOb.tock(false);
        }
    }
}
class ThreadCom {
    public static void main(String args[]) {
        TickTock tt = new TickTock();
        MyThread mtl = new MyThread("Tick", tt) ;
        MyThread mt2 = new MyThread("Tock", tt) ;
        try {
            mtl.thrd.join();
            mt2.thrd.join();
        } catch(InterruptedException exc) {
            System.out.println("Main thread interrupted.");
        }
    }
}
