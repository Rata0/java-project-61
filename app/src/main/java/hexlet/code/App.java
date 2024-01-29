package hexlet.code;

import hexlet.code.games.EvenGame;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("0 - Exit");
        System.out.print("Your choice: ");
        int input = scanner.nextInt();

        switch (input) {
            case 2:
                EvenGame.startGame();
                break;
            case 1:
                Cli.runCli();
                break;
            case 0:
                System.out.println("Exiting the program.");
                break;
            default:
                System.out.println("Invalid choice. Exiting the program. Goodbye!");
        }
    }
}
