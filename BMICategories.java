import java.util.Scanner;

public class BMICategories {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		double height;
		double weight;
		
		
		System.out.print("Your height in meters: ");
		height = keyboard.nextDouble();
		System.out.print("Your weight in kg: ");
		weight = keyboard.nextDouble();
		double BMI = weight/(height*height);
		System.out.println(BMI);
		System.out.print("Your BMI catagory ");
		
		if (BMI<=15) {
			System.out.print("Very severely underweight");
		}
		if (BMI>=15 && BMI<=16.0) {
			System.out.print("Severely underweight");
		}
		if (BMI >=16.1 && BMI <=18.4) {
			System.out.print("Underweight");
		}
		if (BMI >=18.5 && BMI <=24.9) {
			System.out.print("Normaal weight");
		}
		if (BMI >= 25 && BMI<= 29.9) {
			System.out.print("Overweight");
		}
		if (BMI >= 30 && BMI<=34.9) {
			System.out.print("Moderately Obese");
		}
		if (BMI >= 35 && BMI<=39.9) {
			System.out.print("Severely Obese");
		}
		if (BMI >40) {
			System.out.print("Very severely obese");
		}
	}
}