package com.company;


public class Main
{

    public static void main(String[] args)
    {
        java.util.Scanner input = new java.util.Scanner(System.in);

        System.out.println("How much money would you like to withdraw?");
        int withdrawal = input.nextInt();

        int twenties = withdrawal / 20;
        withdrawal -= twenties * 20;
        int tens = withdrawal / 10;
        withdrawal -= tens * 10;
        int fives = withdrawal / 5;
        withdrawal -= fives * 5;
        int ones = withdrawal % 5;

        double convenienceFee = ((twenties + tens + fives + ones) * .1) + 1;

        System.out.println(twenties + " twenties " + tens + " tens " +  fives + " fives and " + ones + " ones");
        System.out.println("We have charged a convenience fee of $" + convenienceFee);
    }
}
