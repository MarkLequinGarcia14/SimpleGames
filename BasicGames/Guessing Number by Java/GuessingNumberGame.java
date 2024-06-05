// This a basic guessing number game using java
// Compiler use: Eclipse 2019

package bscs; //use your own package name
import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        
         System.out.println("Welcome to the Guessing Number Game.\nTIPS: Outside of the Maximum Number considered as Game Over so guess it wisely.\nIf you didn't guess the number you can play again.\nAlso, you have 5 trials each game Good Luck!!");
         
         
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        while (true) {
            int numberToGuess = random.nextInt(7) + 1;
            int maxTrials = 5;
            int currentTrial = 0;
            boolean hasGuessedCorrectly = false;

            System.out.println("Welcome to the Number Guessing Game!");
            System.out.println("Guess the number between 1 and 7.");

            while (currentTrial < maxTrials) {
                System.out.print("Enter your guess: ");
                int userGuess = scanner.nextInt();
                currentTrial++;

                if (userGuess == numberToGuess) {
                    hasGuessedCorrectly = true;
                    System.out.println("Congratulations! You guessed the correct number!");
                    break;
                } else if (userGuess < numberToGuess) {
                    System.out.println("Too low! Try again.");
                } else{ 
                    System.out.println("Out of bounds your number exceed the limit!. Game Over!");
                    break;
            }
            }

            if (!hasGuessedCorrectly) {
                System.out.println("Sorry, you've reached the maximum number of trials. The correct number was: " + numberToGuess);
            }

            System.out.print("Do you want to play again? (yes/no): ");
            String playAgain = scanner.next();

            if (!playAgain.equalsIgnoreCase("yes")) {
                System.out.println("Thanks for playing! Goodbye.");
                break;
            }
        }

        scanner.close();
    }
}