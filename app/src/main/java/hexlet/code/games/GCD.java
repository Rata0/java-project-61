package hexlet.code.games;


import static hexlet.code.Engine.ROUNDS;
import static hexlet.code.Engine.gameLauncher;
import static hexlet.code.Engine.generateRandomNumber;


public class GCD {
    public static void startGame() {
        String gameTitle = "Find the greatest common divisor of given numbers.";
        String[][] questionAndAnswer = new String[ROUNDS][2];

        for (int index = 0; index < ROUNDS; index += 1) {
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
