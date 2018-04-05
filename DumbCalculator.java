import java.util.Scanner;

public class DumbCalculator {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		 double firstNumber;
		 double secondNumber;
		 double thirdNumber;
		 
		 System.out.print("What is your first number: ");
		 firstNumber = keyboard.nextInt();
		 
		 System.out.print("WHat is your first number: ");
		 secondNumber = keyboard.nextInt();
		 
		 System.out.print("And what is your third number: ");
		 thirdNumber = keyboard.nextInt();
		 
		 System.out.println("soooo "+firstNumber+" + "+secondNumber+" + "+thirdNumber+" is...."+((firstNumber+secondNumber+thirdNumber)/2));
	}
}