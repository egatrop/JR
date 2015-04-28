package com.javarush.test.level10.lesson11.home06;

/* Конструкторы класса Human
Напиши класс Human с 6 полями. Придумай и реализуй 10 различных конструкторов для него. Каждый конструктор должен иметь смысл.
*/

public class Solution {
    public static void main(String[] args) {

    }

    public static class Human {
        //напишите тут ваши переменные и конструкторы
        private String name;
        private boolean sex;
        private int age;
        private int height;
        private String profession;
        private String dream;

        public Human(String name, boolean sex, int age, int height, String profession, String dream) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.height = height;
            this.profession = profession;
            this.dream = dream;
        }

        public Human(String name, int age, boolean sex) {
            this.name = name;
            this.age = age;
            this.sex = sex;
        }

        public Human(String name, String dream, String profession) {
            this.name = name;
            this.dream = dream;
            this.profession = profession;
        }

        public Human(String name, boolean sex) {
            this.name = name;
            this.sex = sex;
        }

        public Human(int height, int age, boolean sex) {
            this.height = height;
            this.age = age;
            this.sex = sex;
        }

        public Human(boolean sex, String profession, int age) {
            this.sex = sex;
            this.profession = profession;
            this.age = age;
        }

        public Human(String name) {
            this.name = name;
        }

        public Human(String profession, int age) {
            this.profession = profession;
            this.age = age;
        }

        public Human(int height, int age) {
            this.height = height;
            this.age = age;
        }

        public Human(boolean sex) {
            this.sex = sex;

        }
    }
}
