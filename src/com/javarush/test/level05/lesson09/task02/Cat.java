package com.javarush.test.level05.lesson09.task02;

/* Создать класс Cat
Создать класс Cat (кот) с пятью конструкторами:
- Имя,
- Имя, вес, возраст
- Имя, возраст (вес стандартный)
- вес, цвет, (имя, адрес и возраст – неизвестные. Кот - бездомный)
- вес, цвет, адрес ( чужой домашний кот)
Задача инициализатора – сделать объект валидным. Например, если вес не
известен, то нужно указать какой-нибудь средний вес. Кот не может ничего
не весить. То же касательно возраста. А вот имени может и не быть (null).
То же касается адреса: null.
*/

public class Cat {
    //Напишите тут ваш код
    private String name, color = "grey", address;
    int age = 3, weight = 3;

    public Cat(final String name) {
        this.name = name;
        address = "our cat";
    }

    public Cat(final String name, final int age, final int weight) {
        this(name);
        this.age = age;
        this.weight = weight;
        address = "our cat";
    }

    public Cat(final String name, final int age) {
        this(name);
        this.age = age;
        address = "our cat";

    }

    public Cat(final int weight, final String color) {
        this.weight = weight;
        this.color = color;
        System.out.println("asdasd" + "adasda");
    }

    public Cat(final int weight, final String color, final String address) {
        this(weight, color);
        this.address = address;
    }
}
