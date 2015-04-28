package com.javarush.test.level09.lesson02.task05;

/* Метод должен возвращать результат – глубину его стек-трейса
Написать метод, который возвращает результат – глубину его стек трейса – количество методов в нем (количество элементов в списке). Это же число метод должен выводить на экран.
*/

public class Solution
{
    public static void main(String[] args) {
        getStackTraceDeep();
    }
    public static int getStackTraceDeep()
    {
        //Напишите тут ваш код
        StackTraceElement[] elements = Thread.currentThread().getStackTrace();
        for (StackTraceElement element : elements) {
            System.out.println(element.getMethodName() + " " + element.getLineNumber());
        }
        return elements.length;

    }
}
