package com.javarush.test.level14.lesson06.home01;

/**
 * Created by Ivanov_E_S on 30.04.2015.
 */
public class MoldovanHen extends Hen {
    @Override
    public int getCountOfEggsPerMonth() {

        return 150;
    }

    @Override
    public String getDescription() {
        String str = super.getDescription() + " Моя страна - " + Country.MOLDOVA + ". Я несу "
                + getCountOfEggsPerMonth() + " яиц в месяц.";
        return str;
    }
}
