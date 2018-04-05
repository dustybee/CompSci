import java.util.Scanner;

public class PinLockout {
	public static void main(String args[]) {
		Scanner keyboard = new Scanner(System.in);
		
		int lockout=0;
		int pin = 12345;
		int userpin;
		
		System.out.println("Welcome to my bank!");
		System.out.println("Please enter your pin");
		System.out.print("> ");
		userpin = keyboard.nextInt();
		lockout++;
		
		while (userpin!=pin && lockout<3) {
			System.out.println("INCORRECT! please try again, you have "+lockout+" tries left!");
			System.out.print("> ");
			userpin = keyboard.nextInt();
			lockout++;
		}
		if(userpin==pin) {
			System.out.println("\nPIN ACCEPTED!");
		} else if (lockout>=3)
			System.out.println("You have been locked out!");
	}
}