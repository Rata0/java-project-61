package hexlet.code;

import java.util.Scanner;

public class Engine {

    public static final int ROUNDS = 3;
    public static final int MAXRANGE = 100;

    public static void gameLauncher(String gameTitle, String[][] questionAndAnswerIndices) {
        System.out.println("\nWelcome to the Brain Games!");
        System.out.print("May I have your name? ");
        Scanner scanner = new Scanner(System.in);
        String userName = scanner.next();
        System.out.println("Hello, " + userName + "!");
        System.out.println(gameTitle);

        int correctUserResponse = 0;

        for (String[] questionAnswer : questionAndAnswerIndices) {
            System.out.println("Question: " + questionAnswer[0]);
            System.out.print("Your answer: ");
            String userResponse = scanner.next();
            if (userResponse.equals(questionAnswer[1])) {
                System.out.println("Correct!");
                correctUserResponse += 1;
            } else {
                System.out.println("'" + userResponse + "'" + " is wrong answer ;(. Correct answer was "
                        + "'" + questionAnswer[1] + "'");
                System.out.println("Let's try again, " + userName + "!");
                return;
            }
        }

        if (correctUserResponse == ROUNDS) {
            System.out.println("Congratulations, " + userName + "!");
        }
    }

    public static int generateRandomNumber() {
        return (int) (Math.random() * MAXRANGE) + 1;
    }

}
