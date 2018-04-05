import java.util.Scanner;

public class Adventure1 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		String answer1,answer2,answer3;
		//asking the first question
		System.out.println("WELCOME TO DUSTYBEE'S ADVENTURE!");
		System.out.println("");
		System.out.println("You are in a creepy house! would you like to go to the kitchen or go upstairs?");
		System.out.print("	> ");
		answer1 = keyboard.next();
		System.out.println("");
		//checking first question for "kitchen"
		if (answer1.equals("kitchen")) {
			//asking second question in "kitchen"
			System.out.println("there is a long coutertop with dirty dishes on it. Alongside the countertop there is a fridge. You may open the \"refrigerator\" or the \"cabinet\"");
			System.out.print("	> ");
			answer2 = keyboard.next();
			System.out.println("");
			//checking second answer for "refrigerator" in "kitchen"	
			
			if (answer2.equals("refrigerator")) {
				System.out.println("In the refridgerator there is rotten food it is naastyyyy.");
				System.out.println("Would you like to eat the food? (\"yes\" or \"no\") ");
				System.out.print("	> ");
				answer3 = keyboard.next();
				System.out.println("");
				//checking third answer for "yes" in "kitchen"
					if (answer3.equals("yes")) {
						System.out.println("You will die of poisoning... eventually");
					}
				//checking third answer for "no" in "kitchen"
				else if (answer3.equals("no")) {
					System.out.println("You will die of starvation... eventually");
				}
			}
			
				//checking second answer for "cabinet" in "kitchen"
				else if (answer2.equals("cabinet")) {
					System.out.println("you look in the cabinet. you see a pot of poison.");
				System.out.println("will you eat the poison? (\"yes\" or \"no\")");
				System.out.print("	> ");
				answer3 = keyboard.next();
				System.out.println("");
				//checking third answer for "yes" in "kitchen"
					if (answer3.equals("yes")) {
						System.out.println("You will die of poisoning.");
					}
				//checking trird answer for "no" in "kitchen"
				else if (answer3.equals("no")) {
					System.out.println("You will die of starvation.");
				}
			}
		}
		//checking first answer for "upstairs"
		if (answer1.equals("upstairs")) {
			System.out.println("Upstairs you see a hallway. At the end of the hallway there the master \"bedroom\". There is also a \"bathroom\" off the hallway. where would you like to go? ");
			System.out.print("	> "); 
			answer2=keyboard.next();
			System.out.println("");
				if (answer2.equals("bedroom")) {
					System.out.println("you are in a plush bedroom, with expensive-looking hardwood furniture. The bed is unmade. in the bakc of the room, the closest door os ajar. would you like to open the door? (\"yes\" or \"no\")");
					System.out.print("	> ");
					answer3 = keyboard.next();
					System.out.println("");
					if (answer3.equals("yes")) {
						System.out.println("there is a portal to another dimension behind the door.");
					}
					else if (answer3.equals("no")) {
						System.out.println("You'll never know what is behind that door.");
					}
				} 
				else if (answer2.equals("bathroom")) {
					System.out.println("You are now in the bathroom. You see a dirty bath with slime in it. on the wall there is a cabinet with medicine in it. will you eat the medicine?");
					System.out.println("(\"yes\" or \"no\")");
					System.out.print("	> ");
					answer3 = keyboard.next();
					System.out.println("");
					if (answer3.equals("yes")) {
						System.out.println("You will die in 24 hour.");
					} 
					else if (answer3.equals("no")) {
						System.out.println("Well nothing happens... I am tired of making nested if statements....");
					}
			}
		}
	}
}