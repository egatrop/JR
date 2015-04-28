package com.javarush.test.level08.lesson08.task05;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* Удалить людей, имеющих одинаковые имена
Создать словарь (Map<String, String>) занести в него десять записей по принципу «фамилия» - «имя».
Удалить людей, имеющих одинаковые имена.
*/

public class Solution
{
    public static HashMap<String, String> createMap()
    {
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

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map)
    {
        //Напишите тут ваш код
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (String name : copy.values()) {
            if (Collections.frequency(copy.values(),name ) > 1) {
                removeItemFromMapByValue(map, name);
            }
        }

    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value)
    {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : copy.entrySet())
        {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }
}
