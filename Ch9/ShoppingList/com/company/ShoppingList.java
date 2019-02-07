package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ShoppingList
{

    ArrayList<String> items = new ArrayList<>();

    public void run()
    {
        boolean programRunning = true;

        do
        {
            Scanner input = new Scanner(System.in);
            printMenu();

            String userInput = input.next();
            switch (userInput)
            {
                case "a":
                case "A":
                case "Add":
                    String itemToAdd = input.next();
                    addItem(itemToAdd);
                    break;
                case "p":
                case "P":
                case "Print":
                    printList();
                    break;
                case "f":
                case "F":
                case "Find":
                    String itemToFind = input.next();
                    findItem(itemToFind);
                    break;
                case "s":
                case "S":
                case "Sort":
                    sortList();
                    break;
                case "r":
                case "R":
                case "Remove":
                    int itemToRemove = input.nextInt();
                    removeItem(itemToRemove);
                    break;
                case "c":
                case "C":
                case "Clear":
                    clearItemsList();
                    break;
                case "e":
                case "E":
                case "Exit":
                    System.out.println("Exiting program");
                    programRunning = false;
                    break;
                default:
                    System.out.println("Shame on you, that's not a thing!\nTry again!\n");
            }
        }
        while (programRunning);
    }

    private void addItem(String itemName)
    {
        items.add(itemName);
        System.out.println(itemName + " has been added to your list.");
    }

    private void printList()
    {
        System.out.println("\nSo far your list contains:");
        for (int i = 0; i < items.size(); i++)
        {
            String item = items.get(i);
            System.out.printf(i + " : " + item + "\t\t");
        }
        System.out.println("\n");
    }

    private void findItem(String itemToFind)
    {
        boolean isItemFound = false;

        for (String item : items)
        {
            if (itemToFind.equals(item))
            {
                isItemFound = true;
            }
        }

        if (isItemFound)
        {

            System.out.println("Found " + itemToFind + "!");
        }
        else
        {
            System.out.println("No such item exists!");
        }
    }

    private void sortList()
    {
        Collections.sort(items);
        System.out.println("Sorted alphabetically.");
    }

    private void removeItem(int itemIndex)
    {
        if (itemIndex > items.size() - 1 || itemIndex < 0)
        {
            System.out.println("");
            System.out.println("Shame on you, no item exists at index " + itemIndex + "!\nTry again!\n");
        }
        else
        {
            System.out.println("");
            System.out.println(items.get(itemIndex) + " has been removed.");
            this.items.remove(itemIndex);
        }
    }

    private void clearItemsList()
    {
        this.items.clear();
    }

    private void printMenu()
    {
        System.out.println("/---------Select One---------/");
        System.out.println("(A)dd <item>");
        System.out.println("(F)ing <item>");
        System.out.println("(P)rint");
        System.out.println("(S)ort");
        System.out.println("(R)emove <index>");
        System.out.println("(C)lear");
        System.out.println("(E)xit");
    }

}
