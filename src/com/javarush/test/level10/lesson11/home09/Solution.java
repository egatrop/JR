package com.javarush.test.level10.lesson11.home09;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* Одинаковые слова в списке
Ввести с клавиатуры в список 20 слов. Нужно подсчитать количество одинаковых слов в списке.
Результат нужно представить в виде словаря Map<String, Integer>, где первый параметр – уникальная строка,
а второй – число, сколько раз данная строка встречалась в списке.
Вывести содержимое словаря на экран.
В тестах регистр (большая/маленькая буква) не влияет на результат.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> words = new ArrayList<String>();
        for (int i = 0; i < 20; i++) {
            words.add(reader.readLine());
        }

        Map<String, Integer> map = countWords(words);

        for (Map.Entry<String, Integer> pair : map.entrySet()) {
            System.out.println(pair.getKey() + " " + pair.getValue());
        }
    }

    public static Map<String, Integer> countWords(ArrayList<String> list) {
        HashMap<String, Integer> result = new HashMap<String, Integer>();
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext())
        {
            String s=iterator.next();

            if(!(result.containsKey(s))) {
                result.put(s,1);
            } else {
                int count = result.get(s);
                count++;
                result.put(s, count);
            }
        }
        //Напишите тут ваш код
  /*      outer:
        for (int index = 0; index < list.size(); index++) {


            if (!result.isEmpty()) {
                Set<String> set = result.keySet();
                for (String str : set) {
                    if (str.equalsIgnoreCase(list.get(index))) {
                        result.put(str, result.get(str) + 1);
                        continue outer;
                    }
                }
                result.put(list.get(index), 1);
            } else {
                result.put(list.get(index), 1);
            }
        }*/

    /*    for ( String str : list) {
            if (!result.isEmpty() && result.containsKey(str.toLowerCase())){
                result.put(str.toLowerCase(), result.get(str.toLowerCase()) + 1);
            }
            else {
                result.put(str.toLowerCase(), 1);
            }
        }*/

        return result;
    }

}
