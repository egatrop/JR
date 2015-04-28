package com.javarush.test.level04.lesson02.task05;

/* Подсчитать количество котов
Написать код, чтобы правильно считалось количество созданных котов (count) и на экран выдавалось правильно их количество.
*/

public class Solution {
    public static void main(String[] args) {
        String str = new String("mama");
        change(str);
        System.out.println(str);
    }

    public static void change(String str) {
        str = "papa";
    }
}

