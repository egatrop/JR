package com.javarush.test.level05.lesson07.task05;

/* Создать класс прямоугольник (Rectangle)
Создать класс прямоугольник (Rectangle). Его данными будут top, left, width, height (левая координата, верхняя, ширина и высота). Создать для него как можно больше методов initialize(…)
Примеры:
-	заданы 4 параметра: left, top, width, height
-	ширина/высота не задана (оба равны 0)
-	высота не задана (равно ширине) создаём квадрат
-	создаём копию другого прямоугольника (он и передаётся в параметрах)
*/

public class Rectangle
{
    //Напишите тут ваш код
private int left, top, width, height;

    public void initialize (int left, int top, int width, int height){
        this.height = height;
        this.left = left;
        this.top = top;
        this.width = width;
    }

    public void initialize (int left, int top){

        this.left = left;
        this.top = top;
        width = height = 0;

    }

    public void initialize (int left, int top, int width){
        height = width;
        this.left = left;
        this.top = top;
        this.width = width;
    }

    public void initialize (Rectangle rec){
        this.height = rec.height;
        this.left = rec.left;
        this.top = rec.top;
        this.width = rec.width;
    }

    public void copyRec (int left){
        height = 5;
        this.left = left;
        top = left;
        width = height;
    }



}
