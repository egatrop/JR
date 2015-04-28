package com.javarush.test.level04.lesson16.home03;

/* Посчитать сумму чисел
Вводить с клавиатуры числа и считать их сумму. Если пользователь ввел -1, вывести на экран сумму и завершить программу.  -1 должно учитываться в сумме.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        //Напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String A;
        int n;
        int s = 0;

        while(true){
            A = reader.readLine();
            if (A == null){
                n = 0;
            }

            else
            {
                n = Integer.parseInt(A);
            }
                if (n == -1)
                {
                    s += n;
                    System.out.println(s);
                    break;
                }
                s += n;

        }

    }
}
