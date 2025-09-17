package lessons;
import java.util.Scanner;

public class TryCatch {

	public static void main(String[] args) {

		// variables
		Scanner sc = new Scanner(System.in);
		int myInteger = 0;
		
		// Prompt user for int, user may enter incorrect data.
		// We handle this using try-catch blocks
		System.out.println("Enter an int: ");

		
		try {
		
			myInteger = sc.nextInt();
		}
		
		catch (Exception e)  {
			
			
			System.out.println("Invalid input, please try again.");
			
		}
		
		// output
		System.out.println("You entered: " + myInteger);


	}

}
