package com.javarush.test.level05.lesson12.home05;

/* Вводить с клавиатуры числа и считать их сумму
Вводить с клавиатуры числа и считать их сумму, пока пользователь не введёт слово «сумма». Вывести на экран полученную сумму.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //Напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int s = 0;
        Object ob;
        while (true)
        {
             ob = reader.readLine();

            if ("сумма".equals(ob.toString()))
            {
                System.out.println(s);
                break;
            }
            s += Integer.parseInt(ob.toString());
        }
    }
}
