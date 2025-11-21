package lessons;
import java.util.Scanner;

public class U3A1_ErrorChecking {

	public static void main(String[] args) {

		// variables
		Scanner sc = new Scanner(System.in);
		String userInput = "";
		boolean stagePassed = false;
		
		// Stage 1
		while (stagePassed == false)  {
			
			System.out.println("Enter String greater than 6 characters: ");
			userInput = sc.nextLine();
			
			stagePassed = stageOne(userInput);
		}
	
		stagePassed = false;	// reset the boolean
		
		
		// Stage 2
		while (stagePassed == false)  {
			
			System.out.println("Enter String which contains \"a\": ");
			userInput = sc.nextLine();
			
			stagePassed = stageTwo(userInput);
		}
		
		stagePassed = false;	// reset the boolean
	}
	
	// DESCRIPTION - Returns true if String parameter is greater than 6 characters.
	// RETURN TYPE - boolean
	// PARAMETERS - String s
	public static boolean stageOne(String s)  {
		
		if (s.length() > 6)
			return true;
			
		return false;
	}
	
	
	// DESCRIPTION - Returns true if String contains "a".
	// RETURN TYPE - boolean
	// PARAMETERS - String s
	public static boolean stageTwo(String s)  {
		
		// to be completed ...
		
		return false;
	}

}
