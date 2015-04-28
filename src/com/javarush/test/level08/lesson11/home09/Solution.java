package com.javarush.test.level08.lesson11.home09;

import java.util.Date;/* Работа с датой
1. Реализовать метод isDateOdd(String date) так, чтобы он возвращал true, если количество дней с начала года - нечетное число, иначе false
2. String date передается в формате MAY 1 2013
Пример:
JANUARY 1 2000 = true
JANUARY 2 2020 = false
*/

public class Solution
{
    public static void main(String[] args)
    {
        System.out.println(isDateOdd("JANUARY 1 2015"));
        System.out.println(isDateOdd("JANUARY 2 2015"));
        System.out.println(isDateOdd("JANUARY 5 2015"));
    }

    public static boolean isDateOdd(String date)
    {

       Date yearStartTime = new Date();
        yearStartTime.setSeconds(0);
        yearStartTime.setMinutes(0);
        yearStartTime.setHours(0);
        yearStartTime.setDate(1);
        yearStartTime.setMonth(0);

        Date currentDate = new Date(date);
        long periodMs =  currentDate.getTime() - yearStartTime.getTime();
        long dayMs = 24*60*60*1000;

        int valueOfDays = (int)Math.ceil( (double)periodMs / dayMs);
        System.out.println(valueOfDays);

        if (valueOfDays % 2 == 0){
            return false;
        } else
            return true;
    }
}
