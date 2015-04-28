package com.javarush.test.level06.lesson08.task04;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Класс ConsoleReader
Сделать класс ConsoleReader, у которого будут 4 статических метода:
String readString() – читает с клавиатуры строку
int readInt() – читает с клавиатуры число
double readDouble() – читает с клавиатуры дробное число
void readLn() – ждет нажатия enter [использовать readString()]
*/

public class ConsoleReader {
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static String readString() throws Exception {
        //Напишите тут ваш код

        return reader.readLine();
    }

    public static int readInt() throws Exception {
        //Напишите тут ваш код
        return Integer.parseInt(reader.readLine());
    }

    public static double readDouble() throws Exception {
        //Напишите тут ваш код
        return Double.parseDouble(reader.readLine());
    }

    public static void readLn() throws Exception {
        //Напишите тут ваш код
        while (true) {
            char[] string = readString().toCharArray();
            int length = string.length;
            if (length != 0) {
                int intOfLastChar = Character.getNumericValue(string[length - 1]);
                System.out.println("the last char of string - " + intOfLastChar);
            }
            System.out.println("the length of array= " + length);

            if (length == 0)

                break;

            // readString();


        }
    }

    public static void main(String[] args) throws Exception {
        System.out.println(readString() == "\n");
        System.out.println(readString().equals("\n"));
        /*System.out.println(readString());
        readLn();
        System.out.println(readString());*/

    }
}
