package lessons;
import java.util.Scanner;

public class U3A1_ErrorChecking {

	public static void main(String[] args) {

		// variables
		Scanner sc = new Scanner(System.in);
		String userInput = "";
		boolean stageChecked = false;

		// stage 1
		while (stageChecked == false)  {
			
			System.out.println("Enter Sring greater than 6 chars: ");
			userInput = sc.next();
			
			stageChecked = stageOneMethod(userInput);
		}
		
		// reset boolean to get into next stage
		stageChecked = false;
		
		// stage 2
	//	while (stageTwoMethod == false)  {
			
			
	//	}
		
		// reset boolean to get into next stage
		stageChecked = false;
		
		// stage 3
		
		// stage 4
		
		// stage 5
		
		// stage 6
		
		
		System.out.println("End of program.");
	}
	
	/*	DESCRIPTION - Stage 1: method returns true if String > 6 in length.
	 * 	PARAMETERS - String s
	 * 	RETURN - boolean
	 */	
	public static boolean stageOneMethod(String s)  {
		
		if (s.length() > 6)
			return true;
		
		return false;
	}

	
	/*	DESCRIPTION - 
	 * 	PARAMETERS - 
	 * 	RETURN - 
	 */	
	
	
	/*	DESCRIPTION - 
	 * 	PARAMETERS - 
	 * 	RETURN - 
	 */	
	
	
	/*	DESCRIPTION - 
	 * 	PARAMETERS - 
	 * 	RETURN - 
	 */	
	
	
	/*	DESCRIPTION - 
	 * 	PARAMETERS - 
	 * 	RETURN - 
	 */	
	
	
	/*	DESCRIPTION - 
	 * 	PARAMETERS - 
	 * 	RETURN - 
	 */	
}
