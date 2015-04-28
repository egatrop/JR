package com.javarush.test;

/**
 * Created by Egor on 22.04.2015.
 */
public class Links {
    public static void main(String[] args) {
        int i =64;
        String bin = Integer.toBinaryString(i);
        int n = Integer.bitCount(25);
        System.out.println(n);
    }

    private static void change(int[] array) {
        array[1] = 100;
    }
    private static void change(Integer n) {
        n = 200;
    }
}
