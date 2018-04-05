import java.util.Scanner;
import java.util.Random;

public class HiLiLimited {
	public static void main(String args[]) {
		Random r = new Random();
		Scanner keyboard = new Scanner(System.in);
		
		int n = 1+r.nextInt(100);
		int guesses = 0;
		int guessed = 0;
		
		
		System.out.println("I am thinking of a number between 1-100. you have 7 guesses, Good luck!");
		System.out.println(n);
		System.out.print("First guess: ");
		guessed = keyboard.nextInt();
		guesses++;
		
		while (guessed!=n && guesses<7) {
			System.out.print("Guess #"+(guesses+1)+": ");
			guessed = keyboard.nextInt();
			guesses++;
			
			if(guessed<n){
			System.out.println("Sorry, Thats too low");
		} else if(guessed>n){
			System.out.println("Sorry, Thats too high");
		} else if(guessed==n){
			System.out.println("Yay! Thats it! you guessed it in "+guesses+" tries!");
		}
			if(guesses==7){
			System.out.println("Im sorry, You didnt guess it in 7 tries!");
		}
		}
	}
}