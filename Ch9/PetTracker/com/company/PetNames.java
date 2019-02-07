package com.company;

import java.util.Scanner;

public class PetNames
{

    public static void receivePetNames()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("How many pets do you have?");
        int numOfPets = input.nextInt();
        System.out.println(numOfPets + " pets.");

        String[] petNames = new String[numOfPets];
        for (int i = 0; i < petNames.length; i++)
        {
            System.out.println("What is the pets name?");
            String name = input.next();
            petNames[i] = name;
        }

        System.out.println("Your pets name's are: ");
        for (String name : petNames)
        {
            System.out.println(name);
        }
    }
}


