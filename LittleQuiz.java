import java.util.Scanner;

public class LittleQuiz {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		int score=0;
		int answer1;
		int answer2;
		int answer3;
		String ready;
		
		System.out.print("Are you ready for a quizzzzzz?");
		ready = keyboard.next();
		
		System.out.println("Okay here it comes!");
		System.out.println("Q1) What is the capital of Alaska?");
		System.out.println(" 	1) Melbourne");
		System.out.println(" 	2) Anchorage");
		System.out.println(" 	3) Juneau");
		System.out.print("	> ");
		answer1 = keyboard.nextInt();
		if (answer1 == 3) {
			System.out.println("Thats right");
			score++;
		} else {
			System.out.println("Sorry thats wrong, It is 3, Juneau");
		}
		System.out.println("Q2) Can you store the value cat in a variable type of int?");
		System.out.println(" 	1) Yes");
		System.out.println(" 	2) No");
		System.out.print("	> ");
		answer2 = keyboard.nextInt();
		if (answer2 == 2) {
			System.out.println("Yayyyy, Thats right!");
			score++;
		} else {
			System.out.println("Sorry the value Cat is a string variable.");
		}
		System.out.println("Q3) What is the result of 9+6/3");
		System.out.println(" 	1) 5");
		System.out.println(" 	2) 11");
		System.out.println(" 	3) 15/3");
		System.out.print("	> ");
		answer3 = keyboard.nextInt();
		if (answer3 == 2) {
			System.out.println("Thats Roooooigghttt! into the news!");
			score++;
		} else {
			System.out.println("Sorry, The right answer is 2, 11");
		}
		System.out.println("Overall you have got "+score+" out of 3 correct.");
		System.out.println("Thank you for playing :D");
	}
}