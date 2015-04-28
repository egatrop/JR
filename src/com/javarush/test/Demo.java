package com.javarush.test;

import java.util.HashSet;

/**
 * Created by Egor on 18.04.2015.
 */
public class Demo {

    public static void main(String[] args) {
       A a1 = new A(1);
        A a2 = new A(2);
        A a3 = new A(1);
        System.out.println(a1 == a2);
        System.out.println(a1.equals(a2));
        System.out.println(a1 == a3);
        System.out.println(a1.equals(a3));

        System.out.println("a1 hash=" + a1.hashCode());
        System.out.println("a2 hash=" + a2.hashCode());
        System.out.println("a3 hash=" + a3.hashCode());


        HashSet<A> set = new HashSet<A>();
        set.add(a1);
        set.add(a2);
        set.add(a3);

        for (A a : set){
            System.out.println("-----");
        }

    }


}
class A{
    int i;
    A(int i) {
        this.i = i;
    }

    @Override
    public boolean equals(Object obj) {
        A a = (A)obj;
        if (this.i == a.i) return true;
        else return false;
    }

    @Override
    public int hashCode() {
        return new Integer(i).hashCode();
    }
}
