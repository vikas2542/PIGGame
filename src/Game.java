import java.util.Scanner;
import java.util.Random;

public class Game {
	public static void main(String[] args) {
		playPig();
	}

	public static int rollDie() {
		Random random = new Random();
		return random.nextInt(6) + 1;
	}

	public static void playPig() {
		Scanner scanner = new Scanner(System.in);
		int totalScore = 0;
		int turns = 0;
		System.out.println("Let's Play PIG!");

		while (true) {
			turns++;
			System.out.println("\nTURN " + turns);

			int turnScore = 0;
			while (true) {
				System.out.print("Roll or hold? (r/h): ");
				String action = scanner.next().toLowerCase();

				if (action.equals("r")) {
					int dieRoll = rollDie();
					System.out.println("Die: " + dieRoll);

					if (dieRoll == 1) {
						System.out.println("Turn over. No score.");
						turnScore = 0;
						break;
					} else {
						turnScore += dieRoll;
					}
				} else if (action.equals("h")) {
					System.out.println("Score for turn: " + turnScore);
					totalScore += turnScore;
					System.out.println("Total score: " + totalScore);
					break;
				} else {
					System.out.println("Invalid input. Please enter 'r' to roll or 'h' to hold.");
				}
			}

			if (totalScore >= 20) {
				break;
			}
		}

		System.out.println("\nYou finished in " + turns + " turns!");
		System.out.println("\nGame over!");
		scanner.close();
	}
}


