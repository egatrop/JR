package com.javarush.test.level08.lesson08.task02;

import java.util.HashSet;
import java.util.Iterator;

/* Удалить все числа больше 10
Создать множество чисел(Set<Integer>), занести туда 20 различных чисел.
Удалить из множества все числа больше 10.
*/

public class Solution
{
    public static HashSet<Integer> createSet()
    {
        //Напишите тут ваш код
        HashSet<Integer> set = new HashSet<Integer>();
        set.add(10);
        set.add(20);
        set.add(40);
        set.add(50);
        set.add(60);
        set.add(70);
        set.add(9);
        set.add(3);
        set.add(0);
        set.add(100);
        set.add(310);
        set.add(320);
        set.add(330);
        set.add(340);
        set.add(350);
        set.add(360);
        set.add(370);
        set.add(3770);
        set.add(-10);
        set.add(2);

        return set;
    }

    public static HashSet<Integer> removeAllNumbersMoreThan10(HashSet<Integer> set)
    {
        //Напишите тут ваш код
        Iterator<Integer> iterator = set.iterator();

        while ( iterator.hasNext() ) {
            int target = iterator.next();
            if (target > 10) {
                iterator.remove();
            }
        }
        return  set;

    }

    public static void main(String[] args) {
        HashSet<Integer> set = createSet();
        set = removeAllNumbersMoreThan10(set);
        for (int i : set){
            System.out.println(i);
        }
    }
}
