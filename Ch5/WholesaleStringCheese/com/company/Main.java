package com.company;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        while(true)
        {
            System.out.println("How many flipping diameters would you like?!");
            int diameter = input.nextInt();
            System.out.println("How many flipping yards would you like?!");
            int yards = input.nextInt();

            int orderCost = calculateOrder(yards, diameter);
            System.out.println("That will be $" + orderCost + "! Because I'm crazy!");
        }
    }

    public static int calculateOrder(int yards, int diameter)
    {
        int shipping = 5;
        switch (diameter)
        {
            case 1:
                shipping += (2 * yards);
                if (yards < 50)
                {
                    shipping += 2;
                }
                break;
            case 2:
                shipping += (4 * yards);
                if (yards < 75)
                {
                    shipping += 2;
                }
                break;
            case 3:
                shipping += (6 * yards);
                if (yards < 25)
                {
                    shipping += 4;
                }
                break;
            default:
                shipping = 0;
                System.out.println("That is far too crazy!");
        }
        return shipping;
    }
}