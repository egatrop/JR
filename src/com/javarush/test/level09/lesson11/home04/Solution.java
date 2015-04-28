package com.javarush.test.level09.lesson11.home04;

/* Конвертер дат
Ввести с клавиатуры дату в формате «08/18/2013»
Вывести на экран эту дату в виде «AUG 18, 2013».
Воспользоваться объектом Date и SimpleDateFormat.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;


public class Solution {

    public static void main(String[] args) throws Exception {
        //Напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String dateInputString = reader.readLine();
        Date date = new Date(Date.parse(dateInputString));
        SimpleDateFormat dateFormat = new SimpleDateFormat("MMM dd, YYYY", Locale.US);
        System.out.println(dateFormat.format(date).toUpperCase());

    }
}

