package com.company;

import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        printMenu();
        shapeSelect();
    }

    private static void shapeSelect()
    {
        Scanner input = new Scanner(System.in);
        String shape = input.next();
        switch (shape)
        {
            case "C":
            case "c":
                calculateCircle();
                break;
            case "S":
            case "s":
                calculateSquare();
                break;
            case "R":
            case "r":
                calculateRectangle();
                break;
            default:
                System.out.println("ERRRRRR");
        }
    }

    private static void printMenu()
    {
        System.out.println("Find the area and perimeter of a shape!\n");
        System.out.println("Enter \"S\" for square, \"C\" for circle, or \"R\" for rectangle.");
    }

    //Circle
    private static void calculateCircle()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("What is the radius of the circle?");
        double radius = input.nextInt();

        double circumference = circumferenceOfCircle(radius);
        double area = areaOfCircle(radius);
        System.out.println("The area of the circle is: " + area + "\nThe circumference of the circle is: " + circumference);
    }

    private static double areaOfCircle(double radius)
    {
        double area = 3.14 * (radius * radius);
        return area;
    }

    private static double circumferenceOfCircle(double radius)
    {
        double circumference = (2 * 3.14) * radius;
        return circumference;
    }

    //Square
    private static void calculateSquare()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("What is the length of the square?");
        double squareLength = input.nextInt();

        double area = areaOfSquare(squareLength);
        double perimeter = perimeterOfSquare(squareLength);
        System.out.println("The area of the square is: " + area + "\nThe perimeter of the square is: " + perimeter);
    }

    private static double areaOfSquare(double length)
    {
        double area = length * 2;
        return area;
    }

    private static double perimeterOfSquare(double length)
    {
        double perimeter = length * 4;
        return perimeter;
    }

    //Rectangle
    private static void calculateRectangle()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("What is the length of the rectangle?");
        double length = input.nextInt();

        System.out.println("What is the height of the rectangle?");
        double height = input.nextInt();

        double area = areaOfRectangle(length, height);
        double perimeter = perimeterOfRectangle(length, height);

        System.out.println("The area of the rectangle is: " + area + "\nThe perimeter of the rectangle is: " + perimeter);
    }

    private static double areaOfRectangle(double length, double height)
    {
        double area = length * height;
        return area;
    }

    private static double perimeterOfRectangle(double length, double height)
    {
        double perimeter = 2 * (length + height);
        return perimeter;
    }

}






