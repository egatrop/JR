package com.javarush.test;

import java.util.Arrays;

/**
 * Created by Ivanov_E_S on 17.04.2015.
 */
public class Bubble
{
    public static void main(String[] args)
    {
        int[] data = {10, 50, 40, 30, 20};

        for (int barriers = data.length-1; barriers > 0 ; barriers--)
        {
            for (int index = 0; index < barriers; index++)
            {
                conditionalSwap(data, index);
            }
        }

        System.out.println(Arrays.toString(data));
    }

    static void conditionalSwap(int[] array, int k){
        if (array[k] > array[k+1])
            swap(array, k);
    }

    static void swap (int[] array, int k){
        int temp = array[k];
        array[k] = array[k+1];
        array[k+1] = temp;
     }
}
