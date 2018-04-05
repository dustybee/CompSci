import java.util.Scanner;

public class AlphabeticOrder {
	public static void main(String[] args) {
		String lastName;
		Scanner keyboard = new Scanner(System.in);
		System.out.print("What is your last name? ");
		lastName = keyboard.next();
		
		if (lastName.compareTo("Carswell")) {
			System.out.println("you don't have to wait long, "+lastName);
		} else if ("Jones".compareTo(lastName)) {
			System.out.println("That's not bad, "+lastName);
		} else if ("Smith".compareTo(lastName)) {
			System.out.println("Looks like a bit of wait, "+lastName);
		} else if ("Young".compareTo(lastName)) {
			System.out.println("It's going to be a while, "+lastName);
		} else if ("Young".compareTo(lastName) && "young".compareTo(lastname)>"young") {
			System.out.println("Not going anywhere, "+lastName);
		}
	}
}