package com.javarush.test.level10.lesson11.home08;

import java.util.ArrayList;
import java.util.Arrays;

/* Массив списков строк
Создать массив, элементами которого будут списки строк. Заполнить массив любыми данными и вывести их на экран.
*/

public class Solution
{
    public static void main(String[] args)
    {
        ArrayList<String>[] arrayOfStringList =  createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList()
    {
        //Напишите тут ваш код
        ArrayList<?>[] arrayOfStringList =  new ArrayList<?>[3] ;
        arrayOfStringList[0] = new ArrayList<String>(Arrays.asList("123", "456", "789"));
        arrayOfStringList[1] = new ArrayList<String>(Arrays.asList("qwe", "asd", "asdasdasd"));
        arrayOfStringList[2] = new ArrayList<String>(Arrays.asList("qwe123", "asd123123"));

        return (ArrayList<String>[]) arrayOfStringList;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList)
    {
        for (ArrayList<String> list: arrayOfStringList)
        {
            for (String s : list)
            {
                System.out.println(s);
            }
        }
    }
}