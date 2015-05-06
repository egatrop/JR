package com.javarush.test.level07.lesson12.home06;

/* Семья
Создай класс Human с полями имя(String), пол(boolean),возраст(int), отец(Human), мать(Human). Создай объекты и заполни их так, чтобы получилось: Два дедушки, две бабушки, отец, мать, трое детей. Вывести объекты на экран.
Примечание:
Если написать свой метод String toString() в классе Human, то именно он будет использоваться при выводе объекта на экран.
Пример вывода:
Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя
Имя: Катя, пол: женский, возраст: 55
Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня
…
*/

public class Solution
{
    public static void main(String[] args)
    {
        //Написать тут ваш код
        Human granFatherM = new Human("vasya", true, 65);
        Human granMotherM = new Human("ira", false, 64);
        Human granFatherF = new Human("yura", true, 67);
        Human granMotherF = new Human("tonya", false, 68);
        Human mother = new Human("larisa", false, 45, granFatherM, granMotherM);
        Human father = new Human("sergey", true, 46, granFatherF, granMotherF);
        Human me = new Human("egor", true, 26, father, mother);
        Human brother = new Human("nikita", true, 18, father, mother);
        Human sister = new Human("ann", false, 2, father, mother);


        System.out.println(granFatherF);
        System.out.println(granMotherF);
        System.out.println(granFatherM);
        System.out.println(granMotherM);
        System.out.println(mother);
        System.out.println(father);
        System.out.println(me);
        System.out.println(brother);
        System.out.println(sister);
    }



}   class Human
{
    //Написать тут ваш код
    String name;
    boolean sex;
    int age;
    Human mother;
    Human father;

    public Human(String name, boolean sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public Human(String name, boolean sex, int age, Human father, Human mother) {
        this(name, sex, age);
        this.mother = mother;
        this.father = father;
    }

    public String toString()
    {
        String text = "";
        text += "Имя: " + this.name;
        text += ", пол: " + (this.sex ? "мужской" : "женский");
        text += ", возраст: " + this.age;

        if (this.father != null)
            text += ", отец: " + this.father.name;

        if (this.mother != null)
            text += ", мать: " + this.mother.name;

        return text;
    }
}
