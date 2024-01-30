package hexlet.code.games;

import static hexlet.code.Engine.ROUNDS;
import static hexlet.code.Engine.gameLauncher;
import static hexlet.code.Engine.generateRandomNumber;

public class Progression {
    private static final int PROGRESSION_LENGTH = 10;
    public static void startGame() {
        String gameTitle = "What number is missing in the progression?";
        String[][] questionAndAnswer = new String[ROUNDS][2];

        for (int index = 0; index < ROUNDS; index += 1) {
            String[] progressionGenerate = generateProgression();
            int randomIndex = getRandomNumberUpTo10() - 1;
            String response = progressionGenerate[randomIndex];
            questionAndAnswer[index][1] = response;

            progressionGenerate[randomIndex] = "..";
            String progressionString = convertArrayToStringWithSpaces(progressionGenerate);
            questionAndAnswer[index][0] = progressionString;

        }

        gameLauncher(gameTitle, questionAndAnswer);
    }

    public static String[] generateProgression() {
        int length = PROGRESSION_LENGTH;
        String[] progression = new String[length];
        int startNumber = generateRandomNumber();
        int variance = generateRandomNumber();

        for (int index = 0; index < length; index += 1) {
            progression[index] = Integer.toString(startNumber + (index * variance));
        }

        return progression;
    }

    public static String convertArrayToStringWithSpaces(String[] array) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < array.length; i++) {
            result.append(array[i]);

            if (i < array.length - 1) {
                result.append(" ");
            }
        }

        return result.toString();
    }

    public static int getRandomNumberUpTo10() {
        return (int) (Math.random() * PROGRESSION_LENGTH) + 1;
    }

}
