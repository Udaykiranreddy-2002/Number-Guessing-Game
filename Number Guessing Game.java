import java.util.Random;
import java.util.Scanner;

class NumberGuessingGame {

    private static final int MAX_ATTEMPTS = 5;
    private static int score = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        boolean playAgain = true;

        System.out.println("=== Welcome to the Number Guessing Game ===");

        while (playAgain) {
            int numberToGuess = random.nextInt(100) + 1; // 1–100
            int attemptsLeft = MAX_ATTEMPTS;
            boolean guessedCorrectly = false;

            System.out.println("\nI have generated a number between 1 and 100.");
            System.out.println("You have " + MAX_ATTEMPTS + " attempts to guess it.");

            while (attemptsLeft > 0) {
                System.out.print("Enter your guess: ");
                int userGuess = scanner.nextInt();

                if (userGuess == numberToGuess) {
                    System.out.println("🎉 Correct! You guessed the number.");
                    score++;
                    guessedCorrectly = true;
                    break;
                } else if (userGuess > numberToGuess) {
                    System.out.println("Too High!");
                } else {
                    System.out.println("Too Low!");
                }

                attemptsLeft--;
                System.out.println("Attempts left: " + attemptsLeft);
            }

            if (!guessedCorrectly) {
                System.out.println("❌ You've used all attempts. The number was: " + numberToGuess);
            }

            System.out.println("Current Score: " + score);

            System.out.print("\nDo you want to play again? (yes/no): ");
            String response = scanner.next();

            playAgain = response.equalsIgnoreCase("yes");
        }

        System.out.println("\nThanks for playing! Final Score: " + score);
        scanner.close();
    }
}