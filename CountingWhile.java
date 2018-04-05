import java.util.Scanner;

public class CountingWhile
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);

		System.out.println( "Type in a message, and I'll display it five times." );
		System.out.print( "Message: " );
		String message = keyboard.nextLine();
		System.out.println("Type in the amount of times you want this messsage to display");
		System.out.print("> ");
		int userint =  keyboard.nextInt();

		int n = 0;
		int counter = 0;
		while ( n < userint )
		{
			System.out.println( (counter+10) + ". " + message );
			n++; //adds one to the integer "n"
			counter+10;
		}

	}
}