package hexlet.code.games;

import java.util.Scanner;
import hexlet.code.Cli;

public class EvenGame {
    public static void startGame() {
        Cli.runCli();
        String name = Cli.userName;
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        for (int correctAnswers = 0; correctAnswers < 3; correctAnswers += 1) {
            int number = generateRandomNumber();
            System.out.println("Question: " + number);
            System.out.print("Your answer: ");
            Scanner scanner = new Scanner(System.in);
            String answer = scanner.nextLine();

            if ((isEven(number) ? "yes" : "no").equals(answer)) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. "
                        + "Correct answer was '" + (isEven(number) ? "yes" : "no") + "'.");
                System.out.println("Let's try again, " + name + "!");
                return;
            }
        }

        System.out.println("Congratulations, " + name + "!");
    }

    static int generateRandomNumber() {
        return (int) (Math.random() * 100) + 1;
    }

    static boolean isEven(int number) {
        return number % 2 == 0;
    }
}
