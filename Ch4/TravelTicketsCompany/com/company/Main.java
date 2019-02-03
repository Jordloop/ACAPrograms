package com.company;

import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your ticket number.");

        int ticketNumber = input.nextInt();
        int lastDigit = ticketNumber % 10;
        int ticketPrefix = (ticketNumber /= 10);
        boolean result = ticketPrefix % 7 == lastDigit;

        if (result)
        {
            System.out.println("Good number.");
        }
        else
        {
            System.out.println("Bad number.");
        }
    }
}
