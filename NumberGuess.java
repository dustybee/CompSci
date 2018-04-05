import java.util.Scanner;
import java.util.Random;

public class NumberGuess {
	public static void main(String args[]) {
		Scanner keyboard = new Scanner(System.in);
		Random r = new Random();
		int secretNumber = 1 + r.nextInt(10);
		int answer1;
		System.out.println("WORST GUESSONG GAME EVER!\n");
		System.out.println("");
		System.out.println("Guess A number between 0 and 10");
		System.out.println("");
		System.out.print("> ");
		answer1 = keyboard.nextInt();
		
		if (secretNumber==answer1) {
			System.out.println("Thats right the answer was "+secretNumber);
		} else {
			System.out.println("No thats wrong, the answer was "+secretNumber);
		}
	}
}