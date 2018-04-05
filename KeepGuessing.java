import java.util.Scanner;
import java.util.Random;

public class KeepGuessing {
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
		
		while (secretNumber!=answer1) {
			System.out.println("No thats wrong, keep on guessing");
			System.out.print("> ");
			answer1 = keyboard.nextInt();
		} 
			System.out.println("Thats right!");
	}
}