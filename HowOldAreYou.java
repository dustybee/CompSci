import java.util.Scanner;

public class HowOldAreYou {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		int age;
		String name;
		String lastName;
		
		System.out.print("What is your name? ");
		name = keyboard.next();
		
		System.out.print("What is your last name? ");
		lastName = keyboard.next();
		
		System.out.print("How old are you?");
		age = keyboard.nextInt();
		String fullName = name+" "+lastName;
		if(age < 16) {
			System.out.println("You are too young to drive. "+fullName);
		}
		if (age < 18) {
			System.out.println("You can't vote. "+fullName);
		}
		if (age < 25) {
			System.out.println("You can't rent a car, "+fullName);
		}
		if (age > 25) {
			System.out.println("You can do anything that is legal. "+fullName);
		}
	}
}