package com.javarush.test;

/**
 * Created by Egor on 24.04.2015.
 */
public class StackOverFlow {
    public static void main(String[] args) {
        int i = 0;
        f(i);

    }

    static void f(int i){
        System.out.println(i);
        if ( i <= 5) {
            f(i + 1);
        }
        System.out.println(i);
        }
    }


