import java.util.Scanner;

public class NameAgeAndSalary {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		String name;
		int age;
		double salary;
		
		System.out.print("Hello. What is your name? ");
		name = keyboard.next();
		System.out.print("Hi, " +name+ "!   How old are you? ");
		age = keyboard.nextInt();
		System.out.print("So you're "+age+" eh?  Thats not old at all!");
		System.out.print("How much do you make "+name+"?");
		salary = keyboard.nextDouble();
		System.out.print(+salary+" hope that's not per year!");
	}
}