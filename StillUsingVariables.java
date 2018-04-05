import java.util.Scanner;

public class StillUsingVariables {
	public static void main(String[] args){
		
		Scanner input = new Scanner (System.in);
		
		String name;
		int gradYear;
		
		System.out.print("WHat is your name?");
		name = input.next();
		System.out.print("What year did you graduate in?");
		gradYear = input.nextInt();
		System.out.println("Your name is "+name+" and you graduated in "+gradYear);
	}
}