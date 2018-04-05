public class WhatIf {
	public static void main(String[] args) {
		int people = 20;
		int cats = 20;
		int dogs = 15;
		
		if (people < cats) { //If it is true it executes the code below
			System.out.println("Not enough cats... But more than people :D");
		}
		if (people > cats) { //The curly braces are there to define the part of code that will be executed if true
			System.out.println("Not so many cats ;( There are moar people :(");
		}
		if (people < dogs) {
			System.out.println("There has been pooped on the world :D");
		}
		if (people > dogs) {
			System.out.println("There are moar people than dogs :(");
		}
		
		dogs +=5;
		
		if (people >= dogs) {
			System.out.println("people are greater than or equal to dogs");
		}
		if (people<= dogs) {
			System.out.println("People are less than or qeual to dawgs");
		}
		if (people == dogs) {
			System.out.println("People are dogs :D");
		}
	}
}