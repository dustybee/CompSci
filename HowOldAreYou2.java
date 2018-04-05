import java.util.Scanner;

public class HowOldAreYou2 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		int age;
		String name;
		
		System.out.print("Hey, What's your name? (Sorry i keep forgetting.) ");
		name = keyboard.next();
		
		System.out.print("Ok, "+name+" How old are you? ");
		age = keyboard.nextInt();
		
		if (age < 16) {
			System.out.println("You cant't drive a car, "+name);
		} else if (age < 18) {
			System.out.println("You can't vote, "+name);
		} else if (age < 25) {
			System.out.println("You can't rent a car, "+name);
		} else if (age>25) {
			System.out.println("You can do everything thats legal, "+name);
		}
	}
}