import java.util.Scanner;
import java.util.Random;

class Player {
    private int turnScore;
    private int totalScore;
    private Die die;
    private Scanner scanner;

    public Player() {
        turnScore = 0;
        totalScore = 0;
        die = new Die();
        scanner = new Scanner(System.in);
    }

    public int getTotalScore() {
        return totalScore;
    }

    public void takeTurn() {
        System.out.println("TURN");

        while (true) {
            System.out.print("Roll or hold? (r/h): ");
            String decision = scanner.nextLine().toLowerCase();

            if (decision.equals("r")) {
                int dieRoll = die.roll();
                System.out.println("Die: " + dieRoll);

                if (dieRoll == 1) {
                    System.out.println("Turn over. No score.");
                    turnScore = 0;
                    break;
                } else {
                    turnScore += dieRoll;
                }
            } else if (decision.equals("h")) {
                System.out.println("Score for turn: " + turnScore);
                totalScore += turnScore;
                System.out.println("Total score: " + totalScore);
                break;
            } else {
                System.out.println("Invalid input. Please enter 'r' to roll or 'h' to hold.");
            }
        }
    }
}

