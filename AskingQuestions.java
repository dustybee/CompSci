import java.util.Scanner;

public class AskingQuestions{
	public static void main(String[] args){
		Scanner userInput = new Scanner(System.in);
		
		int age;
		String height;
		double weight;
		
		System.out.print("How old are you? ");
		age = userInput.nextInt();
		
		System.out.print("How tall are you? ");
		height = userInput.next();
		
		System.out.print("How much do you weigh? ");
		weight = userInput.nextDouble();
		
		System.out.println("so you are "+age+" years old, weigh " +weight+" kg, and you are "+height+" CM tall ");
	}
}