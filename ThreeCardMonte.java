import java.util.Scanner;
import java.util.Random;

public class ThreeCardMonte {
	public static void main(String args[]) {
		Scanner keyboard = new Scanner(System.in);
		Random r = new Random();
		
		int ace = 1+r.nextInt(3);
		int answer;
		
		System.out.println("Three cards");
		System.out.println("Which one is the Ace?");
		System.out.println("			##	##	##");
		System.out.println("			##	##	##");
		System.out.println("			1	2	2");
		
		System.out.print("> ");
		answer = keyboard.nextInt();
		System.out.println("");
		
		if(answer==1 && ace==1) {
			System.out.println("You nailed it!");
			System.out.println("			AA	##	##");
			System.out.println("			AA	##	##");
			System.out.println("			1	2	2");
		} else if(answer==2 && ace==2) {
			System.out.println("WOW! how did you guess it!?!");
			System.out.println("			##	AA	##");
			System.out.println("			##	AA	##");
			System.out.println("			1	2	2");
		} else if 
	}
}