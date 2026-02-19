package lessons;
import java.util.Scanner;

public class TryCatchLoopCLI {

	public static void main(String[] args) {

		// variables
		Scanner sc = new Scanner(System.in);
		int myInteger = 0;
		boolean validEntry = false;
		
		while(validEntry == false)  {
			
			// input
			try {
				
				System.out.println("Enter integer: ");
				
				// work-around for java 8 error:
				// get entry as String, then cast it
				String temp = sc.nextLine();
				myInteger = Integer.parseInt(temp);

				validEntry = true;
			}

			catch (Exception e)  {
				
				System.out.println("Invalid entry, please try again.");
			}
			
		}
		
		System.out.println("Continuing with program ...");
	}

}
