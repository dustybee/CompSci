import java.util.Scanner;

public class GenderGame {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		String name;
		String lastName;
		String gender;
		String married;
		int age;
		
		System.out.print("What is your gender? (M, F or Apache Helicopter): ");
		gender = keyboard.next();
		System.out.print("First name: ");
		name = keyboard.next();
		System.out.println("");
		System.out.print("Last name: ");
		lastName = keyboard.next();
		System.out.print("Age: ");
		age = keyboard.nextInt();
		
		if ("f".equals(gender) && age>=20) {
			System.out.println("Are you married, "+name+" (y or n) ");
			married = keyboard.next();
			if ("y".equals(married)) {
				System.out.println("Then i'll call you Mrs. "+lastName);
			} 
			else if ("n".equals(married)) {
					System.out.println("THen i'll call you Ms. "+lastName);
			}
		}
		if ("m".equals(gender) && age<=20) {
			System.out.println("THen i shall call you "+name+" "+lastName);
		} else if ("m".equals(gender) && age>=20) {
			System.out.println("Then i shall call you Mr. "+name);
		}
		if ("apache helicopter".equals(gender)) {
			System.out.println("Then i shall call you Apache Helicopter. "+name);
		}
	}
}