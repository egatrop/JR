package com.javarush.test.level08.lesson11.bonus01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Date;

/* Номер месяца
Программа вводит с клавиатуры имя месяца и выводит его номер на экран в виде: «May is 5 month».
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        //add your code here - напиши код тут
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String nameOfMonth = reader.readLine();
        Date date = new Date("1970 " + nameOfMonth + " 1");

        int numberOfMonth = date.getMonth();
        System.out.println(nameOfMonth + " is " + (numberOfMonth + 1) + " month");
    }

}
