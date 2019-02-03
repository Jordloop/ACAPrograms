package com.company;

import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.println("How many tall are you in inches?");
        int inches = input.nextInt();

        if (inches <= 36)
        {
            System.out.println("Red band.");
        }
        else if (inches > 36 && inches < 54)
        {
            System.out.println("Yellow band.");
        }
        else if (inches >= 54 && inches <= 80)
        {
            System.out.println("Green  band.");
        }
        else
        {
            System.out.println("No band.");
        }
    }
}
