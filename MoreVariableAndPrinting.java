public class MoreVariableAndPrinting {
	public static void main(String[] args){
		String myName,myTeeth,myHair, myEyes;
		int myAge, myHeight,myWeight;
		
		myName="Damian Vera";
		myAge=16;
		myHeight=180; //cm
		myWeight=80; //kg
		myEyes="blue"; //eye color
		myTeeth="white";
		myHair="brown";
		
		System.out.println("Lets talk about "+myName+".");
		System.out.println("He's" +myHeight+" CM tall.");
		System.out.println("He's " +myWeight+" KG heavy.");
		System.out.println("Actually Thats now that heavy");
		System.out.println("He's got"+myEyes+" eyes and "+myHair +"hair");
		System.out.println("His teeth are usally "+myTeeth+" Depening on the coffee");
		System.out.println("if i add "+myAge+", " +myHeight+", and" +myWeight+"i get" +(myAge+myHeight+myWeight) +".");
		System.out.println("");
		
	}
}