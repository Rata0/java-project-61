package hexlet.code.games;

import java.util.Random;
import static hexlet.code.Engine.gameLauncher;
import static hexlet.code.Engine.generateRandomNumber;
public  class CalculatorGame {
    public static void startGame() {
        String gameTitle = "What is the result of the expression?";
        String[][] questionAndAnswer = new String[3][2];

        for (int index = 0; index < 3; index += 1) {
            int numberOne = generateRandomNumber();
            int numberTwo = generateRandomNumber();
            String operation = getRandomMathematicalOperation();

            String expression = toStringExpression(numberOne, operation, numberTwo);
            questionAndAnswer[index][0] = expression;

            int response = calculateExpression(numberOne, operation, numberTwo);
            questionAndAnswer[index][1] = response + "";
        }

        gameLauncher(gameTitle, questionAndAnswer);
    }

    public static String toStringExpression(int numberOne, String operation, int numberTwo) {
        return numberOne + " " + operation + " " +  numberTwo;
    }

    public static int calculateExpression(int numberOne, String operation, int numberTwo) {
        return switch (operation) {
            case "+" -> numberOne + numberTwo;
            case "-" -> numberOne - numberTwo;
            case "*" -> numberOne * numberTwo;
            default -> throw new RuntimeException("Unknown operator: " + operation);
        };
    }

    public static String getRandomMathematicalOperation() {
        String[] mathematicalOperations = {"+", "-", "*"};
        Random random = new Random();
        int randomIndex = random.nextInt(mathematicalOperations.length);

        return mathematicalOperations[randomIndex];
    }
}