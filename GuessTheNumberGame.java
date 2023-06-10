
import java.util.Random;
import java.util.Scanner;

public class GuessTheNumberGame {
    public static void main(String[] args) {
        int maxAttempts = 5; // Maximum number of attempts
        int randomNumberRange = 100; // Range of random numbers (1 to 100)

        Random random = new Random();
        int randomNumber = random.nextInt(randomNumberRange) + 1; // Generate a random number

        System.out.println("Welcome to Guess the Number Game!");
        System.out.println("I'm thinking of a number between 1 and 100.");

        Scanner scanner = new Scanner(System.in);

        int attempts = 0;
        boolean hasWon = false;

        while (attempts < maxAttempts) {
            System.out.print("Enter your guess: ");
            int guess = scanner.nextInt();
            attempts++;

            if (guess == randomNumber) {
                hasWon = true;
                break;
            } else if (guess < randomNumber) {
                System.out.println("Too low!");
            } else {
                System.out.println("Too high!");
            }
        }

        if (hasWon) {
            System.out.println("Congratulations! You guessed the number in " + attempts + " attempts.");
        } else {
            System.out.println("Game over! The number was " + randomNumber + ".");
        }

        scanner.close();
    }
}
