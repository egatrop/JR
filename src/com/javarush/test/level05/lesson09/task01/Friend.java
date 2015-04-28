package com.javarush.test.level05.lesson09.task01;

/* Создать класс Friend
Создать класс Friend (друг) с тремя конструкторами:
- Имя
- Имя, возраст
- Имя, возраст, пол
*/

public class Friend
{
    //Напишите тут ваш код
    String name;
    String sex;
    int age;

    public Friend(String name)
    {
        this.name = name;
    }


    public Friend(String name, int age)
    {
        this(name);
        this.age = age;
    }

    public Friend(String name, int age, String sex)
    {
        this(name, age);
        this.sex = sex;
    }


}