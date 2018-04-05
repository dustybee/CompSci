import java.util.Scanner;
import java.util.Random;

public class FortuneCookie
{
	public static void main(String args[])
	{
		Scanner keyboard = new Scanner(System.in);
		Random r = new Random();
		int number1 =1+r.nextInt(54);
		int number2 = 1+r.nextInt(54);
		int number3 = 1+r.nextInt(54);
		int number4 = 1+r.nextInt(54);
		int number5 = 1+r.nextInt(54);
		int number6 = 1+r.nextInt(54);
		System.out.println(number1+" - "+number2+" - "+number3+" - "+number4+" - "+number5+" - "+number6);
		if(number1>=45 && number1 <=50)
		{
			System.out.println("You will get a lot of money.");
		} else if(number1 == 50) {
			System.out.println("Your are unlucky!");
		} else if(number1>=10 && number1 <=20){
			System.out.println("Not so lucky, You got $10,-");
		} else if(number1>=30 && number1 <=45) {
			System.out.println("Somewhat lucky, You got 100$");
		} else if(number1>=1 && number1 <=5) {
			System.out.println("You got very lucky! you've got 1.000.000$!");
		} else {
		 	System.out.println("You won't get anything D:");
		}
	}
} 