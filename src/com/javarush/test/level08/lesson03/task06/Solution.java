package com.javarush.test.level08.lesson03.task06;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/* Коллекция HashMap из Object
Есть коллекция HashMap<String, Object>, туда занесли 10 различных пар объектов.
Вывести содержимое коллекции на экран, каждый элемент с новой строки.
Пример вывода (тут показана только одна строка):
Sim - 5
*/

public class Solution {
    public static void main(String[] args) throws Exception {

/*
        Date currentTime = new Date();
        Thread.sleep(3000);
        Date newTime = new Date();
        long msDelay = newTime.getTime() - currentTime.getTime();
        System.out.println("Time distance is: " + msDelay + " in ms");
*/

       /* Date startTime = new Date();
        long endTime = startTime.getTime() + 5000;
        Date endDate = new Date(endTime);
        Thread.sleep(3000);
        Date currentTime = new Date();
        if (currentTime.after(endDate)) {
            System.out.println("EndTime!");
        }*/
Date currentTime = new Date();
        int hours = currentTime.getHours();
        int mins = currentTime.getMinutes();
        int secs = currentTime.getSeconds();

        System.out.println("Time from midnight " + hours + ":" + mins + ":" + secs);

    }
}
