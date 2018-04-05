import java.util.Scanner;

public class TwoMoreQuestions {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		String answer1;
		String answer2;
		
		
		System.out.println("THO MORE QUESTIONS, BABY!");
		System.out.println("Think of something and i'll try to guess it!");
		System.out.println("");
		System.out.print("Question 1) does it stay inside, outside or both? ");
		answer1 = keyboard.next();
		System.out.print("Question 2) is it a living thing? ");
		answer2 = keyboard.next();
		System.out.println("");
		
		if (answer1.equals("inside") && "yes".equals(answer2)) {
			System.out.println("i think its a houseplant ");
		}
		if ("outside".equals(answer1) && "yes".equals(answer2)) {
			System.out.println("I think its a bison ");
		}
		if ("both".equals(answer1) && "no".equals(answer2)) {
			System.out.println("I am thinking of a cell phone ");
		}
		if ("both".equals(answer1) && "yes".equals(answer2)) {
			System.out.println("I am thinking of a dog");
		}
		if ("inside".equals(answer1) && "no".equals(answer2)) {
			System.out.println("I am thinking of a shower curtain");
		}
		if ("outside".equals(answer1) && "no".equals(answer2)) {
			System.out.println("I am thinking of a billboard ");
		}
	}
}