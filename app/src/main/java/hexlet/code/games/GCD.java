package hexlet.code.games;

import static hexlet.code.Engine.generateRandomNumber;
import static hexlet.code.Engine.gameLauncher;

public class GCD {
    public static void startGame() {
        String gameTitle = "What is the result of the expression?";
        String[][] questionAndAnswer = new String[3][2];

        for (int index = 0; index < 3; index += 1) {
            int numberOne = generateRandomNumber();
            int numberTwo = generateRandomNumber();
            String numbersString = numberOne + " " + numberTwo;
            questionAndAnswer[index][0] = numbersString;

            int response = findGCD(numberOne, numberTwo);
            questionAndAnswer[index][1] = Integer.toString(response);
        }

        gameLauncher(gameTitle, questionAndAnswer);
    }

    public static int findGCD(int numberOne, int numberTwo) {
        if (numberTwo == 0) {
            return numberOne;
        }

        return findGCD(numberTwo, numberOne % numberTwo);
    }

}
