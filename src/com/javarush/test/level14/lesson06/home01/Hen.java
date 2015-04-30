package com.javarush.test.level14.lesson06.home01;

/**
 * Created by Ivanov_E_S on 30.04.2015.
 */
public abstract class Hen {
    public String getDescription() {
        String str =  "Я курица.";
        return str;
    }

    public abstract int getCountOfEggsPerMonth();
}
