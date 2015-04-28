package com.javarush.test.level04.lesson16.home02;

/* Среднее такое среднее
Ввести с клавиатуры три числа, вывести на экран среднее из них. Т.е. не самое большое и не самое маленькое.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        //Напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String A = reader.readLine();
        String B = reader.readLine();
        String C = reader.readLine();
        int a = Integer.parseInt(A);
        int b = Integer.parseInt(B);
        int c = Integer.parseInt(C);
       if ( (a > b && a < c) || (a > c && a < b) )
           System.out.println(a);
        if ( (c > b && c < a) || (c > a && c < b) )
        System.out.println(c);
        if ( (b > c && b < a) || (b > a && b < c) )
            System.out.println(b);
    }
}
