package com.javarush.test.level07.lesson09.task01;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* Три массива
1. Введи с клавиатуры 20 чисел, сохрани их в список и рассортируй по трём другим спискам:
Число делится на 3 (x%3==0), делится на 2 (x%2==0) и все остальные.
Числа, которые делятся на 3 и на 2 одновременно, например 6, попадают в оба списка.
2. Метод printList должен выводить на экран все элементы списка  с новой строки.
3. Используя метод printList выведи эти три списка на экран. Сначала тот, который для x%3, потом тот, который для x%2, потом последний.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //add your code here
        int[] array = new int[20];
        ArrayList<Integer> div2 = new ArrayList<Integer>();
        ArrayList<Integer> div3 = new ArrayList<Integer>();
        ArrayList<Integer> others = new ArrayList<Integer>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }

        for (int i = 0; i < array.length; i++) {

            if (array[i] % 2 == 0 && array[i] % 3 == 0) {
                div2.add(array[i]);
                div3.add(array[i]);
            } else if (array[i] % 2 == 0){
                div2.add(array[i]);
            }
            else if (array[i] % 3 == 0) {
                div3.add(array[i]);
            } else others.add(array[i]);

        }

        printList(div3);
      //  System.out.println("_______________");
        printList(div2);
      //  System.out.println("_______________");
        printList(others);
    }

    public static void printList(List<Integer> list) {
        //add your code here
        for (int n : list){
            System.out.println(n);
        }
    }
}
