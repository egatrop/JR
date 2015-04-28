package com.javarush.test.level12.lesson04.task03;

/* Пять методов print с разными параметрами
Написать пять методов print с разными параметрами.
*/

public class Solution
{
    public static void main(String[] args)
    {
        print(1,2,5L, 3L);
    }

    //Напишите тут ваши методы
    static void print (int i){
        System.out.println(i);
    }
    static void print (int i, int k) {
        System.out.println(i + k);
    }

    static void print (int i, int k, String s) {
        System.out.println(i + k);
    }

    static void print (int i, int k, long l) {
        System.out.println("1 лонг");
    }

    static void print (int i, int k, long... l) {
        System.out.println("несколько лонгов лонг");
    }
}
