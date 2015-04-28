package com.javarush.test.level07.lesson12.home03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* Максимальное и минимальное числа в массиве
Создать массив на 20 чисел. Заполнить его числами с клавиатуры. Найти максимальное и минимальное числа в массиве.
Вывести на экран максимальное и минимальное числа через пробел.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int  maximum;
        int  minimum;

        int[] data = new int[20];

        for (int i = 0; i < data.length; i++) {
            data[i] = Integer.parseInt(reader.readLine());
        }

        maximum = data[0];
        minimum = data[0];

        for (int i = 0; i < data.length; i++) {
            if (data[i] > maximum)
                maximum = data[i];
            if ( data[i] < minimum)
            minimum = data[i];

        }

        //Напишите тут ваш код


        System.out.println(maximum);
        System.out.println(minimum);
    }
}
