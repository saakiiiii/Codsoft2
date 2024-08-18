import java.util.Random;
import java.util.Scanner;
//Number Guessing Game
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String playAgain;

        do {
            Random rand = new Random();
            int numberToGuess = rand.nextInt(100) + 1;
            int guess;
            int attempts = 0;
            final int maxAttempts = 7;  // Limit to 5 attempts
            final int maxScore = 100;   // Maximum possible score
            int score;

            System.out.println("\nYou are Welcome to the number guessing game!");
            System.out.println("Please guess a number between 1 and 100:");
            System.out.println("You have " + maxAttempts + " attempts to guess the correct number.");

            while (attempts < maxAttempts) {
                guess = scanner.nextInt();
                attempts++;

                if (guess == numberToGuess) {
                    score = maxScore - (attempts - 1) * 20;
                    System.out.println("Congratulations, you guessed the number in " + attempts + " attempts!");
                    System.out.println("Your score is: " + score);
                    break;
                } else if (guess < numberToGuess) {
                    System.out.println("Sorry, your guess is too low. Try again:");
                } else {
                    System.out.println("Sorry, your guess is too high. Try again:");
                }

                if (attempts == maxAttempts) {
                    score = 0;
                    System.out.println("Sorry, you've reached the maximum number of attempts.");
                    System.out.println("The correct number was: " + numberToGuess);
                    System.out.println("Your score is: " + score);
                }
            }

            System.out.println("Do you want to play the game again? (yes/no)");
            playAgain = scanner.next().toLowerCase();
        } while (playAgain.equals("yes"));

        scanner.close();
        System.out.println("Thank you for playing the game!");
    }
}
