package com.javarush.test.level09.lesson11.home08;

import java.util.ArrayList;

/*
 Список из массивов чисел
Создать список, элементами которого будут массивы чисел. Добавить в список пять объектов–массивов
 длиной 5, 2, 4, 7, 0 соответственно. Заполнить массивы любыми данными и вывести их на экран.
*/



public class Solution
{
    public static void main(String[] args)
    {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList()
    {
        //Написать тут ваш код
        ArrayList<int []> list = new ArrayList<int[]>();
     /*   int[] array5 = new int[5];
        Arrays.fill(array5, 10);
        int[] array2 = new int[]{1,2};
        int[] array4 = new int[]{new Integer(3), new Integer(4), new Integer(5)};
        int[] array7 = {6, 7, 8, 9, 10, 11, 12};
        int[] array0 = new int[0];
        list.addAll(Arrays.asList(array5, array2, array4, array7, array0));*/
        int[] array5 = {1,2,3,4,5};
        int[] array2 = {1,2};
        int[] array4 = {1,2,3,4};
        int[] array7 = {1, 2,3,4,5,6,7};
        int[] array0 = {};
        list.add(array5);
        list.add(array2);
        list.add(array4);
        list.add(array7);
        list.add(array0);
        return list;
    }

    public static void printList(ArrayList<int[]> list)
    {
        for (int[] array: list )
        {
            for (int x: array)
            {
                System.out.println(x);
            }
        }
    }
}
