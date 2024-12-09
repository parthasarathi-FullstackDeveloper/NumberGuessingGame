import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numberToGuess = random.nextInt(100) + 1;
        int attempts = 10;
        boolean hasWon = false;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I have selected a number between 1 and 100. Can you guess it?");

        while (attempts > 0) {
            System.out.print("You have " + attempts + " attempts left. Enter your guess: ");
            int guess = scanner.nextInt();

            if (guess == numberToGuess) {
                hasWon = true;
                break;
            } else if (guess < numberToGuess) {
                System.out.println("Too low!");
            } else {
                System.out.println("Too high!");
            }

            attempts--;
        }

        if (hasWon) {
            System.out.println("Congratulations! You've guessed the number correctly!");
        } else {
            System.out.println("Game over! The correct number was " + numberToGuess + ".");
        }

        scanner.close();
    }
}