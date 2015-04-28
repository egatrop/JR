package com.javarush.test.level08.lesson11.home05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* Мама Мыла Раму. Теперь с большой буквы
Написать программу, которая вводит с клавиатуры строку текста.
Программа заменяет в тексте первые буквы всех слов на заглавные.
Вывести результат на экран.

Пример ввода:
  мама     мыла раму.

Пример вывода:
  Мама     Мыла Раму.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();

        //Напишите тут ваш код'
        char[] charArray = s.toCharArray();
        if (charArray.length > 0) charArray[0] = Character.toUpperCase(charArray[0]);
        for (int i = 1; i < charArray.length; i++) {

            if (Character.isSpaceChar(charArray[i - 1] ) && !Character.isSpaceChar(charArray[i])){
                charArray[i] = Character.toUpperCase(charArray[i]);
            }


        }
        System.out.println(String.valueOf(charArray));
    }


}
