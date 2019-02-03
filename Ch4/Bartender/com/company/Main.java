package com.company;
import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.println("What kind of drink would you like?\n" +
                "1: Water\n" +
                "2: Cola\n" +
                "3: Glen Rio Ale");

        int drinkChoice = input.nextInt();
        int customerAge;
        if (drinkChoice == 1)
        {
            System.out.println("Here is your water!");
        }
        else if (drinkChoice == 2)
        {
            System.out.println("Here is your cola!");
        }
        else if (drinkChoice == 3)
        {
            System.out.println("What is your age?");
            customerAge = input.nextInt();
            if (customerAge >= 21)
            {
                System.out.println("Here is your ale!");
            }
            else
            {
                if (21 - customerAge == 1)
                {
                    System.out.println("No drink for you! Come back in " + (21 - customerAge) + " year!");
                }
                else
                {
                    System.out.println("No drink for you! Come back in " + (21 - customerAge) + " years!");
                }
            }
        }
    }
}
