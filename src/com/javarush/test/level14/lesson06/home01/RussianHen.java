package com.javarush.test.level14.lesson06.home01;

/**
 * Created by Ivanov_E_S on 30.04.2015.
 */
public class RussianHen extends Hen {
    @Override
    public int getCountOfEggsPerMonth() {

        return 110;
    }

    @Override
    public String getDescription() {
        String str = super.getDescription() + " ��� ������ - " + Country.RUSSIA + ". � ���� "
                + getCountOfEggsPerMonth() + " ��� � �����.";
        return str;
    }
}
