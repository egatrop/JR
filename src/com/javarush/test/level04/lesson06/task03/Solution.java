package com.javarush.test.level04.lesson06.task03;

/* Сортировка трех чисел
Ввести с клавиатуры три числа, и вывести их в порядке убывания.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //Напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sA = reader.readLine();
        String sB= reader.readLine();
        String sC= reader.readLine();
        int a = Integer.parseInt(sA);
        int b = Integer.parseInt(sB);
        int c = Integer.parseInt(sC);

        if (a > b && a > c)
        {
            System.out.print(a + " ");
            if (b > c)
            {
                System.out.print(b + " ");
                System.out.print(c + " ");
            }
            else
            {
                System.out.print(c + " ");
                System.out.print(b + " ");
            }
        }
        if (b > c && b > a)
        {
            System.out.print(b + " ");
            if (a > c)
            {
                System.out.print(a + " ");
                System.out.print(c + " ");
            }
            else
            {
                System.out.print(c + " ");
                System.out.print(a + " ");
            }
        }
        if ( c > a && c > b)
        {
            System.out.print(c + " ");
            if (b > a)
            {
                System.out.print(b + " ");
                System.out.print(a + " ");
            }
            else
            {
                System.out.print(a + " ");
                System.out.print(b + " ");
            }
        }
    }
}
