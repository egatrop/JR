package com.javarush.test.level14.lesson08.home05;

/**
 * Created by Ivanov_E_S on 30.04.2015.
 */
public class Mouse implements CompItem {
    @Override
    public String getName() {
        return this.getClass().getSimpleName();
    }
}
