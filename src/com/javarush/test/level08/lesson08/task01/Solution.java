package com.javarush.test.level08.lesson08.task01;

import java.util.HashSet;

/* 20 слов на букву «Л»
Создать множество строк (Set<String>), занести в него 20 слов на букву «Л».
*/

public class Solution
{
    public static HashSet<String> createSet()
    {
        //Напишите тут ваш код
        HashSet<String> set = new HashSet<String>();
        set.add("лето");
        set.add("лама");
        set.add("лифт");
        set.add("лень");
        set.add("лента");
        set.add("лофт");
        set.add("лет");
        set.add("лед");
        set.add("лига");
        set.add("лима");
        set.add("лео");
        set.add("ларец");
        set.add("летчик");
        set.add("лагерт");
        set.add("лейтенант");
        set.add("лафет");
        set.add("лебеда");
        set.add("лебедка");
        set.add("леонид");
        set.add("леофан");

        return set;

    }
}
