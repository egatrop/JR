package com.javarush.test.level08.lesson11.home06;

/* Вся семья в сборе
1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
3. Вывести все объекты Human на экран.
*/

import java.util.ArrayList;
import java.util.Arrays;

public class Solution
{
    public static void main(String[] args)
    {
        //Написать тут ваш код
        /*Human granFatherM = new Human("vasya", true, 65);
        Human granMotherM = new Human("ira", false, 64);
        Human granFatherF = new Human("yura", true, 67);
        Human granMotherF = new Human("tonya", false, 68);
        Human mother = new Human("larisa", false, 45, granFatherM, granMotherM);
        Human father = new Human("sergey", true, 46, granFatherF, granMotherF);
        Human me = new Human("egor", true, 26, father, mother);
        Human brother = new Human("nikita", true, 18, father, mother);
        Human sister = new Human("ann", false, 2, father, mother);*/

        Human me = new Human("egor", true, 26);
        Human brother = new Human("nikita", true, 18);
        Human sister = new Human("ann", false, 2);
        Human mother = new Human("larisa", false, 45, new ArrayList<Human>(Arrays.asList(me,brother,sister)));
        Human father = new Human("sergey", true, 46, new ArrayList<Human>(Arrays.asList(me,brother,sister)));
        Human grandFatherF = new Human("yura", true, 61, new ArrayList<Human>(Arrays.asList(father)));
        Human grandMotherF = new Human("tonya", false, 62, new ArrayList<Human>(Arrays.asList(father)));
        Human grandFatherM = new Human("vasya", true, 63, new ArrayList<Human>(Arrays.asList(mother)));
        Human grandMotherM = new Human("ira", false, 64, new ArrayList<Human>(Arrays.asList(mother)));

        System.out.println(me);
        System.out.println(brother);
        System.out.println(sister);
        System.out.println(mother);
        System.out.println(father);
        System.out.println(grandFatherF);
        System.out.println(grandMotherF);
        System.out.println(grandFatherM);
        System.out.println(grandMotherM);
    }

    public static class Human
    {
        //Написать тут ваш код
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children;

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = new ArrayList<Human>();
        }

        public Human(String name, boolean sex, int age, ArrayList<Human> children) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;
        }

        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0)
            {
                text += ", дети: "+this.children.get(0).name;

                for (int i = 1; i < childCount; i++)
                {
                    Human child = this.children.get(i);
                    text += ", "+child.name;
                }
            }

            return text;
        }
    }

}
