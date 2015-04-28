package com.javarush.test.level08.lesson08.task03;

import java.util.Collection;
import java.util.HashMap;

/* Одинаковые имя и фамилия
Создать словарь (Map<String, String>) занести в него десять записей по принципу «Фамилия» - «Имя».
Проверить сколько людей имеют совпадающие с заданным имя или фамилию.
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        //Напишите тут ваш код
        HashMap<String, String> people = new HashMap<String, String>();
        people.put("Иванов", "Егор");
        people.put("Иванова", "Ольга");
        people.put("Петрова", "Анна");
        people.put("Сидоров", "Егор");
        people.put("Лях", "Данна");
        people.put("Пролат", "Елена");
        people.put("Крот", "Артем");
        people.put("Жарносек", "Елена");
        people.put("Прима", "Артем");
        people.put("DFCF", "Артем");

        return people;

    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name) {
        //Напишите тут ваш код
        int count = 0;

        Collection<String> firstNames = map.values();
        for (String firstName : firstNames) {
            if (firstName.equals(name)) {
                count++;
            }
        }

       /* Iterator<HashMap.Entry<String, String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            if (iterator.next().getValue().equals(name)){
                count++;
            }
        }*/

        return count;

    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String familiya) {
        //Напишите тут ваш код
        int count = 0;
       /* Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            if (iterator.next().getKey().equals(familiya)){
                count++;
            }
        }*/

        Collection<String> lastNames = map.keySet();
        for (String lastName : lastNames) {
            if (lastName.equals(familiya)) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println(getCountTheSameFirstName(createMap(), "Егор"));
        System.out.println(getCountTheSameLastName(createMap(), "Иванов"));
    }
}
