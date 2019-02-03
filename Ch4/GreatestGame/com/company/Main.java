package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        Random rng = new Random();

        int playerGuess;
        int numOfTries;
        int totalNumOfTries = 0;
        int numOfGamesLost = 0;
        int numOfGamesWon = 0;
        boolean playerWantsToPlay = true;
        boolean correctGuess;
        boolean playerLost;
        System.out.println("What the heck is your name anyways?");
        String playerName = input.nextLine();

        while (playerWantsToPlay) //Game on/off switch
        {
            playerLost = false;
            correctGuess = false;
            int numToGuess = rng.nextInt(100) + 1;
            numOfTries = 0;

            System.out.println("Would you like to start a new game?\nSubmit 1 if you do, otherwise submit any other number");
            int wantsToPlayAgain = input.nextInt();
            if (wantsToPlayAgain != 1)
            {
                System.out.println("Quitter!");
                playerLost = true;
                playerWantsToPlay = false;
            }

            while (!correctGuess && !playerLost) //Main game engine
            {
                System.out.println("Guess a flipping number from 1-100!");
                playerGuess = input.nextInt();
                numOfTries++;

                if (playerGuess == numToGuess || numOfTries == 5) //Checks if game should end
                {
                    if (numOfTries == 5) //Player loses
                    {
                        numOfGamesLost++;
                        playerLost = true;
                        System.out.printf("%s you are so dumb that you lost!\n\n", playerName);
                    }
                    else //Player wins
                    {
                        numOfGamesWon++;
                        totalNumOfTries += numOfTries;
                        correctGuess = true;
                        System.out.println(playerGuess + " is correct, " + playerName);
                        System.out.println("Guesses this game: " + numOfTries);
                        System.out.println("Games you've won: " + numOfGamesWon);
                        System.out.println("Games you've lost: " +  numOfGamesLost);
                        System.out.println("Average guesses per game one: " + (totalNumOfTries + numOfGamesWon));
                    }
                }
                else if (playerGuess < numToGuess)
                {
                    System.out.println("Too small.");
                }
                else if (playerGuess > numToGuess)
                {
                    System.out.println("Too big.");
                }
            }
        }
    }
}