import java.util.Scanner;

public class ForgetfullMachine {
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		
		System.out.print("Give me a word! ");
		userInput.next();
		System.out.print("Give me a second word ");
		userInput.next();
		System.out.print("great, now your favorite number? ");
		userInput.nextDouble();
		System.out.print("And your second favorite number... ");
		userInput.nextDouble();
		
		}
}