import java.util.Scanner;
import java.util.Random;

public class AgainWithTheNumberGuessing {
	public static void main(String args[]) {
		Scanner keyboard = new Scanner(System.in);
		Random r = new Random();
		
		int n = 1+r.nextInt(10);
		
		System.out.println("Guess a number between 1 to 10");
		System.out.print("Your guess: ");
		int guess = keyboard.nextInt();
		guesses++;
		
		while(n!=guess) {
			System.out.println("Thats wrong, Please ry again");
			System.out.print("Your guess: ");
			guess = keyboard.nextInt();
			guesses++;
		}
		if(n==guess) {
			System.out.println("Thats right! it took you "+guesses+" guesses!");
		}
	}
}