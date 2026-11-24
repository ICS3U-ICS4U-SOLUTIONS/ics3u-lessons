package lessons;
import java.util.Scanner;

public class U3A1_ErrorChecking {

	public static void main(String[] args) {

		// variables
		Scanner sc = new Scanner(System.in);
		String userInput = "";
		boolean stageChecked = false;
		
		// Stage 1
		while (stageChecked == false)  {
			
			System.out.println("Enter String greater than 6 characters: ");
			userInput = sc.nextLine();
			
			stageChecked = stageOne(userInput);
		}
		
		stageChecked = false;
		
		// Stage 2
		System.out.println("Stage 1 completed, beginning Stage 2...");
		
	}
	
	// DESCRIPTION - Returns true if String is greater than 6 characters in length.
	// PARAMETERS - String s
	// RETURN - boolean
	public static boolean stageOne(String s)  {
		
		if(s.length() > 6)
			return true;

		else 
			return false;
	}
	
	
	

}
