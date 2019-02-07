package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class IntegerCalculator
{

    private double answer;
    private ArrayList<String> history = new ArrayList<>();


    public void run()
    {
        Scanner input = new Scanner(System.in);


        System.out.println("Add or A <number>");
        System.out.println("Subtract or S <number>");
        System.out.println("Multiply or M <number>");
        System.out.println("Divide or D <number>");
        System.out.println("Clear or C");
        System.out.println("History or H");
        System.out.println("Exit or E");

        boolean programRunning = true;

        do
        {
            String userInput = input.next();

            switch (userInput)
            {

                case "a":
                case "A":
                case "Add":
                    long addNum = input.nextLong();
                    add(addNum);
                    addToHistory(" + ", addNum);
                    printAnswer();
                    break;
                case "s":
                case "S":
                case "Subtract":
                    long subtractNum = input.nextLong();
                    subtract(subtractNum);
                    addToHistory(" - ", subtractNum);
                    printAnswer();
                    break;
                case "m":
                case "M":
                case "Multiply":
                    long multiplyNum = input.nextLong();
                    multiply(multiplyNum);
                    addToHistory(" * ", multiplyNum);
                    printAnswer();
                    break;
                case "d":
                case "D":
                case "Divide":
                    long divideNum = input.nextLong();
                    divide(divideNum);
                    addToHistory(" / ", divideNum);
                    printAnswer();
                    break;
                case "c":
                case "C":
                case "Clear":
                    clear();
                    break;
                case "h":
                case "H":
                case "History":
                    viewHistory();
                    break;
                case "e":
                case "E":
                case "Exit":
                    System.out.println("Exiting program");
                    programRunning = false;
                    break;
                default:
                    System.out.println("Shame on you! That's not a thing!");
            }
        }
        while (programRunning);

    }

    private void add(long number)
    {
        this.answer += number;
    }

    private void subtract(long number)
    {
        this.answer -= number;
    }

    private void multiply(long number)
    {
        this.answer *= number;
    }

    private void divide(long number)
    {
        this.answer /= number;
    }

    private void clear()
    {
        this.answer = 0;
        System.out.println("Your calculation has be reset.");
    }

    private void printAnswer()
    {
        System.out.println("printAnswer: " + this.answer);
    }

    private void addToHistory(String operator, long operandUsed)
    {
        String operand = Long.toString(operandUsed);
        String calculation = operator + " " + operand;
        this.history.add(calculation);
    }

    private void viewHistory()
    {
        for (String item : this.history)
        {
            System.out.printf(item);
        }
        System.out.printf(" = " + this.answer
        );
    }

}
