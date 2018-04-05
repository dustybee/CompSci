import java.util.Scanner;

public class MoreUserInputOfData {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		String firstName;
		String lastName;
		int grade;
		int studentID;
		String login;
		double GPA;
		
		System.out.print("First name: ");
		firstName = keyboard.next();
		System.out.print("Last name: ");
		lastName = keyboard.next();
		System.out.print("Grade: ");
		grade = keyboard.nextInt();
		System.out.print("Student ID: ");
		studentID = keyboard.nextInt();
		System.out.print("Login: ");
		login = keyboard.next();
		System.out.print("GPA: ");
		GPA = keyboard.nextDouble();
		
		System.out.println("Your information:");
		System.out.println("		Login: 	"+login);
		System.out.println("		ID 	"+studentID);
		System.out.println("		Name: 	"+lastName+", "+firstName);
		System.out.println("		GPA: 	"+GPA);
		System.out.println("		grade: 	"+grade);
	}
}