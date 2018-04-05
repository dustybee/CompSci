import java.util.Random;
import java.util.Scanner;

public class OneShotHiLo {
	public static void main(String args[]) {
		Random r = new Random();
		Scanner keyboard = new Scanner(System.in);
		
		int num1 = 1 + r.nextInt(100);
		int answer1;
		
		System.out.println("I am thinking of a number between 1-100. Try to guess it.");
		System.out.print("> ");
		answer1 = keyboard.nextInt();
		
		if(answer1<=num1){
			System.out.println("Sorry thats too low, i was thinking of "+num1+".");
		} else if(answer1==num1){
			System.out.println("How did you guess that!?!");
		} else if(answer1>=num1){
			System.out.println("Thats too high! i was thinking of "+num1+".");
		} else {
			System.out.println("Howd u get herr?");
		}
	}
}