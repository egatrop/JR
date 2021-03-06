package com.javarush.test.level07.lesson09.task04;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Буква «р» и буква «л»
1. Создай список слов, заполни его самостоятельно.
2. Метод fix должен:
2.1. удалять из списка строк все слова, содержащие букву «р»
2.2. удваивать все слова содержащие букву «л».
2.3. если слово содержит и букву «р» и букву «л», то оставить это слово без изменений.
2.4. с другими словами ничего не делать.
Пример:
роза
лира
лоза
Выходные данные:
лира
лоза
лоза
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> list = new ArrayList<String>();
        list.add("мона");
        list.add("роза");
        list.add("рева");
        list.add("лола");//0
        list.add("лира"); //1
        list.add("лоза"); //2
        list.add("рома");
        list.add("ролл");
        list.add("мама");
        list.add("мыло");
        list.add("клара");

        list = fix(list);

        for (String s : list) {
            System.out.println(s);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> list) {
        //add your code here -  добавь код тут
        /*int barrier = list.size();*/
        for (int i = 0; i < list.size(); i++) {

            if (list.get(i).contains("р") && list.get(i).contains("л")) {

            } else if (list.get(i).contains("р")) {
                list.remove(i);
                i--;
            } else if (list.get(i).contains("л")) {
                list.add(i, list.get(i));
                i++;
            }
        }


        return list;
    }
}