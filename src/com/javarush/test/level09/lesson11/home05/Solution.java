package com.javarush.test.level09.lesson11.home05;

/* Гласные и согласные буквы
Написать программу, которая вводит с клавиатуры строку текста.
Программа должна вывести на экран две строки:
1. первая строка содержит только гласные буквы
2. вторая - только согласные буквы и знаки препинания из введённой строки.
Буквы соединять пробелом.

Пример ввода:
Мама мыла раму.
Пример вывода:
а а ы а а у
М м м л р м .
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //Написать тут ваш код
        List<Character> vowels = new ArrayList<Character>();
        List<Character> others = new ArrayList<Character>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String inputString = reader.readLine();
        for (int i = 0; i < inputString.length(); i++) {
            char c = inputString.charAt(i);
            if ( isVowel(c)) {
                vowels.add(c);
            } else if (!isVowel(c) && !Character.isSpaceChar(c) )
                others.add(c);

            }



        for (char vowel : vowels) {
            System.out.print(vowel + " ");
        }
        System.out.println();
        for (char vowel : others) {
            System.out.print(vowel + " ");
        }

    }


    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    //метод проверяет, гласная ли буква
    public static boolean isVowel(char c)
    {
        c = Character.toLowerCase(c);  //приводим символ в нижний регистр - от заглавных к строчным буквам

        for (char d : vowels)   //ищем среди массива гласных
        {
            if (c == d)
                return true;
        }
        return false;
    }
}
