package com.javarush.test;

import java.util.Stack;

/**
 * Created by Ivanov_E_S on 24.04.2015.
 */
public class Hanoi {
    public static void main(String[] args) {
        Stack<Integer> from = new Stack<Integer>();
        Stack<Integer> help = new Stack<Integer>();
        Stack<Integer> to = new Stack<Integer>();
        from.push(4);
        from.push(3);
        from.push(2);
        from.push(1);
        System.out.println(from);
        exchange(from, help, to, from.size());
        System.out.println(to);

    }

    private static void exchange(Stack<Integer> from, Stack<Integer> help, Stack<Integer> to, int count) {
        if (count > 0){
            exchange(from, to, help, count - 1);
            int biggest = from.pop();
            to.push(biggest);
            exchange(help, from, to, count - 1);
        }
    }

}
