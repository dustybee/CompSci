import java.util.Scanner;

public class AddingValuesInALoop {
	public static void main(String args[]) {
		Scanner keyboard = new Scanner(System.in);

		int number =0;
		int input=1;
		
		System.out.println("I will add up the numbers you give me.");

		while( input !=0 ) {
			System.out.print("Number: ");
			input = keyboard.nextInt();
			number=input+number;
		}
					System.out.println(number-1);
	}
}
