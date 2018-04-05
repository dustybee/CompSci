import java.util.Random;

public class DiceDoubles {
	public static void main(String args[]) {
		Random r = new Random();
		int r1 = 0;
		int r2 = 1;
		int rTotal = 0;
		while(r1!=r2){
			 r1 = 1 + r.nextInt(6);
			 r2 = 1 + r.nextInt(6);
			 rTotal = r1+r2;
			System.out.println("HERE COMES THE DICE!");
			System.out.println("Roll #1: "+r1);
			System.out.println("Roll #2: "+r2);
			System.out.println("The total is "+rTotal);
		}
	}
}
