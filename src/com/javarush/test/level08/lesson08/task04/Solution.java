package com.javarush.test.level08.lesson08.task04;

import java.util.*;

/* Удалить всех людей, родившихся летом
Создать словарь (Map<String, Date>) и занести в него десять записей по принципу: «фамилия» - «дата рождения».
Удалить из словаря всех людей, родившихся летом.
*/

public class Solution
{
    public static HashMap<String, GregorianCalendar> createMap()
    {
        HashMap<String, GregorianCalendar> map = new HashMap<String, GregorianCalendar>();
        map.put("Сталлоне", new GregorianCalendar(1960, Calendar.AUGUST, 20) );
        map.put("Иванов", new GregorianCalendar(1960, Calendar.SEPTEMBER, 20));
        map.put("Петров", new GregorianCalendar(1960, Calendar.NOVEMBER, 20));
        map.put("Сидоров", new GregorianCalendar(1960, Calendar.AUGUST, 20));
        map.put("Гарин", new GregorianCalendar(1960, Calendar.DECEMBER, 20));
        map.put("Лазрев", new GregorianCalendar(1960, Calendar.AUGUST, 20));
        map.put("Билан", new GregorianCalendar(1960, Calendar.JULY, 20));
        map.put("Барон", new GregorianCalendar(1960, Calendar.JUNE, 20));
        map.put("Солодов", new GregorianCalendar(1960, Calendar.MAY, 20));
        map.put("Кузнецов", new GregorianCalendar(1960, Calendar.APRIL, 20));

        //Напишите тут ваш код
        return map;

    }

    public static void removeAllSummerPeople(HashMap<String, GregorianCalendar> map)
    {
        //Напишите тут ваш код
        /*Iterator<Map.Entry<String, GregorianCalendar>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            int month = iterator.next().getValue().get(Calendar.MONTH);
            if (month == GregorianCalendar.JUNE || month == GregorianCalendar.JULY || month == GregorianCalendar.AUGUST){
                iterator.remove();
            }




        }*/

        HashMap<String, GregorianCalendar> copy = new HashMap<String, GregorianCalendar>(map);
        for (Map.Entry<String, GregorianCalendar> pair : copy.entrySet()) {

            int month = pair.getValue().get(Calendar.MONTH);
            if ( month == GregorianCalendar.JUNE || month == GregorianCalendar.JULY || month == GregorianCalendar.AUGUST ){
                map.remove(pair.getKey());
            }
        }



    }


    public static void main(String[] args) {
        HashMap<String, GregorianCalendar> people = createMap();
        removeAllSummerPeople(people);
        for (Map.Entry<String, GregorianCalendar> pair : people.entrySet()){
            System.out.println(pair.getKey());
        }
    }
}
