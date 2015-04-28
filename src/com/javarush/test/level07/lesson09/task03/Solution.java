package com.javarush.test.level07.lesson09.task03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/* Слово «именно»
1. Создай список из слов «мама», «мыла», «раму».
2. После каждого слова вставь в список строку, содержащую слово «именно».
3. Используя цикл for вывести результат на экран, каждый элемент списка с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //Напишите тут ваш код
        /*String[] strings = new String[]{"мама", "мыла", "раму"};
        String[]    strings1 = {"мама", "мыла", "раму"};*/
        String insertString = "именно";
        ArrayList<String> list = new ArrayList<String>(Arrays.<String>asList(new String[]{"мама", "мыла", "раму"}));
        list.add(1, insertString);
        list.add(3, insertString);
        list.add(5, insertString);
        for (String string : list){
            System.out.println(string);
        }


    }
}
