package hexlet.code.games;

import static hexlet.code.Engine.gameLauncher;
import static hexlet.code.Engine.generateRandomNumber;

public class EvenGame {
    public static void startGame() {
        String gameTitle = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        String[][] questionAndAnswer = new String[3][2];

        for (int index = 0; index < 3; index += 1) {
            int randomNumber = generateRandomNumber();
            questionAndAnswer[index][0] = Integer.toString(randomNumber);

            String response = isEven(randomNumber);
            questionAndAnswer[index][1] = response;
        }

        gameLauncher(gameTitle, questionAndAnswer);
    }


    static String isEven(int number) {
        return number % 2 == 0 ? "yes" : "no";
    }
}
