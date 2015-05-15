package com.javarush.test.level19.lesson10.home01;

/* Считаем зарплаты
В метод main первым параметром приходит имя файла.
В этом файле каждая строка имеет следующий вид:
имя значение
где [имя] - String, [значение] - double. [имя] и [значение] разделены пробелом

Для каждого имени посчитать сумму всех его значений
Все данные вывести в консоль, предварительно отсортировав в возрастающем порядке по имени
Закрыть потоки

Пример входного файла:
Петров 2
Сидоров 6
Иванов 1.35
Петров 3.1

Пример вывода:
Иванов 1.35
Петров 5.1
Сидоров 6.0
*/

import java.io.*;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    private static Map<String, Double> map = new TreeMap<>();
    private static BufferedReader reader;
    public static void main(String[] args) throws IOException {
         reader = new BufferedReader(new InputStreamReader(new FileInputStream(args[0]), "UTF-8"));
        fillMap(reader);
        reader.close();
        printMap();
        
        
        
    }

    private static void printMap() {
        for(Map.Entry<String, Double> pair : map.entrySet()) {
            System.out.println(pair.getKey() + " " + pair.getValue());
        }
    }

    private static void fillMap(BufferedReader reader) throws IOException {
        while (reader.ready()) {
            String[] line = reader.readLine().split(" ");
            String key = line[0];
            Double value = Double.parseDouble(line[1]);
            if (map.containsKey(key)) {
                map.put(key, map.get(key) + value);
            } else {
                map.put(line[0], Double.parseDouble(line[1]));
            }

        }
    }
}
