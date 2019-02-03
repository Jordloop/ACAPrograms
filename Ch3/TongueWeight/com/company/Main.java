package com.company;

public class Main
{

    public static void main(String[] args)
    {
        java.util.Scanner input = new java.util.Scanner(System.in);

        System.out.println("What is the trailer's weight? ");
        int trailer = input.nextInt();
        System.out.println("What is the cargo's weight? ");
        int cargo = input.nextInt();
        int totalWeight = trailer + cargo;

        double min = totalWeight * .09;
        double max = totalWeight * .15;

        System.out.println("Minimum of " + min + "(lbs) and max of " + max + "(lbs).");
    }
}
