package com.company;

public class Main
{

    public static void main(String[] args)
    {
        Rectangle rectangle1 = new Rectangle();
        rectangle1.width = 10;
        rectangle1.height = 5;

        rectangle1.doubleWidth();
        rectangle1.doubleHeight();

        Rectangle rectangle2 = new Rectangle();
        rectangle2.width = 4;
        rectangle2.height = 9;
        rectangle2.doubleWidth();
        rectangle2.doubleHeight();

        boolean canContain = rectangle1.canContain(rectangle2);
        System.out.println(canContain);
    }



}
