package com.javarush.test.level13.lesson11.bonus01;

/* Сортировка четных чисел из файла
1. Ввести имя файла с консоли.
2. Прочитать из него набор чисел.
3. Вывести на консоль только четные, отсортированные по возрастанию.
Пример ввода:
5
8
11
3
2
10
Пример вывода:
2
8
10
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                reader = new BufferedReader(new FileReader(reader.readLine()));
        List<Integer> list = new ArrayList<>();
        while (reader.ready()) {
            list.add(Integer.parseInt(reader.readLine()));
        }
        Collections.sort(list);
        int target = 0;
        for (int i = 0; i < list.size(); i++) {
            target = list.get(i);
            if (target % 2 == 0) {
                System.out.println(target);
            }


        }
    }
}
