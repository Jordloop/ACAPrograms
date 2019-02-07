package com.company;

import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        String[] menu = new String[3];
        menu[0] = "Freeze Dried Sushi";
        menu[1] = "Spock's Brain Blast";
        menu[2] = "Alien Asparagus";

        printMenu(menu);
        printSales(menu);
    }

    public static void printMenu(String[] menu)
    {
        System.out.println("Please select from:");
        System.out.println("0)\t" + menu[0]);
        System.out.println("1)\t" + menu[1]);
        System.out.println("2)\t" + menu[2]);
    }

    public static int[] printSales(String[] menu)
    {
        boolean secretCodeEntered = false;

        int[] numOfItemsSold = new int[3];
        numOfItemsSold[0] = 0;
        numOfItemsSold[1] = 0;
        numOfItemsSold[2] = 0;

        while (!secretCodeEntered)
        {

            Scanner input = new Scanner(System.in);
            System.out.println("Your selection: ");
            int userSelection = input.nextInt();
            if (userSelection == 99)
            {
                System.out.println("Final Sails Totals:");
                System.out.println(numOfItemsSold[0] + " of " + menu[0]);
                System.out.println(numOfItemsSold[1] + " of " + menu[1]);
                System.out.println(numOfItemsSold[2] + " of " + menu[2]);
                System.out.println("Goodbye!");
                secretCodeEntered = true;
            }
            else if (userSelection > 2)
            {
                System.out.println("Invalid selection!");
            }
            else
            {
                numOfItemsSold[userSelection]++;
                System.out.println("Your selection: " + menu[userSelection]);
            }
        }
        return numOfItemsSold;
    }
}
