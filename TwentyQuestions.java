import java.util.Scanner;

public class TwentyQuestions {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		String answerq1;
		String biggerThanBreadbox;
		//asking the questions
		System.out.println("TWO QUESTIONS!");
		System.out.println("Think of any object and i'll try to gues it.");
		System.out.println("");
		System.out.println("Question 1) is it animal, vegetable or mineral?");
		System.out.print("	> ");
		answerq1 = keyboard.next();
		
		System.out.println("Question 2) Is it bigger than a breadbox?");
		System.out.print("	> ");
		biggerThanBreadbox = keyboard.next();
		
		if (answerq1.equals("animal")) {
			if (biggerThanBreadbox.equals("no")) {
				System.out.println("I am thinking of a squirrel");
			} 
			else if (biggerThanBreadbox.equals("yes")) {
				System.out.println("I think it's a cow");
			}
		}
		else if (answerq1.equals("vegetable")) {
			if (biggerThanBreadbox.equals("no")) {
				System.out.println("I am thinking of a carrot");
			}
			else if (biggerThanBreadbox.equals("yes")) {
				System.out.println("I am thinking of a Watermelon");
			}
		}
		else if (answerq1.equals("mineral")) {
			if (biggerThanBreadbox.equals("no")) {
				System.out.println("I think it is a paper clip");
			}
			else if (biggerThanBreadbox.equals("yes")) {
				System.out.println("I think you are thinking of a Camaro");
			}
		}
		System.out.println("I would ask you but i don't really care ;)");
	}
}