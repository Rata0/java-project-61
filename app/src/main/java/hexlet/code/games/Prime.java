package hexlet.code.games;


import static hexlet.code.Engine.ROUNDS;
import static hexlet.code.Engine.gameLauncher;
import static hexlet.code.Engine.generateRandomNumber;


public class Prime {
    public static void startGame() {
        String gameTitle = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        String[][] questionAndAnswer = new String[ROUNDS][2];

        for (int index = 0; index < ROUNDS; index += 1) {
            int number = generateRandomNumber();
            questionAndAnswer[index][0] = Integer.toString(number);

            String response = isPrime(number) ? "yes" : "no";
            questionAndAnswer[index][1] = response;
        }

        gameLauncher(gameTitle, questionAndAnswer);
    }


    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

}
