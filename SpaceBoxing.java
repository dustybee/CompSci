import java.util.Scanner;

public class SpaceBoxing {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		int planetVisiting;
		double weight;
		
		System.out.print("Please enter your current earth weight: ");
		weight = keyboard.nextDouble();
		
		System.out.println("I have information for the following planets: ");
		System.out.println("1. Venus 	2. Mars 	3. Jupiter 	");
		System.out.println("4. Saturn 	5. Uranus 	6. Neptune ");
		
		System.out.print("Which planet are you visiting? ");
		planetVisiting = keyboard.nextInt();
		
		if (planetVisiting == 1) {
			System.out.println("you would be "+(weight*0.78)+" pounds on that planet");
		} else if (planetVisiting == 2) {
			System.out.println("you would be "+(weight*0.39)+" pounds on that planet");
		} else if (planetVisiting ==3) {
			System.out.println("you would be "+(weight*2.65)+" pounds on that planet");
		} else if (planetVisiting == 4) {
			System.out.println("you would be "+(weight*1.17)+" pounds on that planet");
		} else if (planetVisiting == 5) {
			System.out.println("you would be "+(weight*1.05)+" pounds on that planet");
		} else if (planetVisiting == 6) {
			System.out.println("you would be "+(weight*1.23)+" pounds on that planet");
		} else {
			System.out.println("Invalid planet");
		}
	}
}