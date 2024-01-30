package hexlet.code;

import hexlet.code.games.EvenGame;
import hexlet.code.games.CalculatorGame;
import hexlet.code.games.GCD;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;

import java.util.Scanner;

public class App {
    public static final int EXIT_PROGRAM = 0;
    public static final int GREET = 1;
    public static final int EVEN = 2;
    public static final int CALC = 3;
    public static final int GCDN = 4;
    public static final int PROGRESSION = 5;
    public static final int PRIME = 6;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("6 - Prime");
        System.out.println("0 - Exit");
        System.out.print("Your choice: ");
        int input = scanner.nextInt();

        switch (input) {
            case EXIT_PROGRAM:
                System.out.println("Exiting the program.");
                break;
            case GREET:
                Cli.runCli();
                break;
            case EVEN:
                EvenGame.startGame();
                break;
            case CALC:
                CalculatorGame.startGame();
                break;
            case GCDN:
                GCD.startGame();
                break;
            case PROGRESSION:
                Progression.startGame();
                break;
            case PRIME:
                Prime.startGame();
                break;
            default:
                System.out.println("Invalid choice. Exiting the program. Goodbye!");
        }
    }
}
