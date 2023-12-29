import java.util.Random;
import java.util.Scanner;

public class Number_game{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        boolean play_again = true;

        while (play_again) {
            int random_number = random.nextInt(100) + 1;
            int Attempts = 10;

            while (true) {
                System.out.println();
                System.out.println("Number of attempts: " + Attempts);
                if (Attempts == 0) {
                    System.out.println("You lost. The correct number was: " + random_number);
                    break;
                }

                System.out.print("Enter a guess from 0 - 100 : ");
                Attempts--;
                int user_guess = sc.nextInt();

                if (random_number == user_guess) {
                    int score = 10 - Attempts;
                    int k = 10 - score;
                    System.out.println("Correct!! You have guessed the correct number.");
                    System.out.println("Your Score is : " + k + "/10");
                    break;
                } else if (random_number > user_guess) {
                    System.out.println("Incorrect!! The number is higher than " + user_guess + ". Guess again.");
                } else {
                    System.out.println("Incorrect!! The number is lower than " + user_guess + ". Guess again.");
                }
            }

            System.out.print("Do you want to play again? (yes/no): ");
            String playChoice = sc.next().toLowerCase();
            play_again = playChoice.equals("yes");
        }
    }
}
