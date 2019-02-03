package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        printHeader();


        System.out.println("Enter your birth  year:");
        int birthYear = input.nextInt();
        System.out.println("Enter your first name:");
        String firstName = input.next();
        System.out.println("Enter your last name:");
        String lastName = input.next();
        System.out.println("Enter your 5 digit employee number:");
        int employeeNumber = input.nextInt();

        printName(firstName, lastName);
        printAge(birthYear);
        printEvenOrOdd(employeeNumber);
        printGeneratedSecretPassword(employeeNumber);
    }

    private static void printHeader()
    {
        System.out.println("Welcome to the WallabyTech Employee Application");
        System.out.println("===============================================");
    }

    private static void printName(String firstName, String lastName)
    {
        System.out.println(lastName + ", " + firstName);
    }

    private static void printAge(int age)
    {
        System.out.println("Your age is: " + (2019 - age));
    }

    private static void printEvenOrOdd(int employeeNumber)
    {
        System.out.println("Employee number is even: " + (employeeNumber % 2 == 0));
    }

    private static void  printGeneratedSecretPassword(int employeeNumber)
    {
        Random rng = new Random();
        int randomNumber = rng.nextInt(10) +1;
        int password = (employeeNumber + randomNumber) * 5;
        System.out.println("Employee's random secret password is: " + password);
    }
}
