import java.util.Scanner;

public class AgeIn5 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		String name;
		int age;
		
		System.out.print("Hello. What is your name? ");
		name = keyboard.next();
		System.out.print("Hi, "+name+"! how old are you? ");
		age = keyboard.nextInt();
		
		System.out.println("Did you know that in 5 years you will be "+(age+5)+" years old?");
		System.out.println("And five years ago you were "+(age-5)+" imagine that!");
	}
}