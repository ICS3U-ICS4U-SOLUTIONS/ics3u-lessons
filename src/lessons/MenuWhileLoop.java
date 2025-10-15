package lessons;
import java.util.Scanner;


public class MenuWhileLoop {

	public static void main(String[] args) {

		// variables
		Scanner sc = new Scanner(System.in);
		int menuChoice = 0;
		final int EXIT_CHOICE = 3;
		
		while(menuChoice != EXIT_CHOICE)  {
			
			menuChoice = 0;
			
			// Present choices to user
			System.out.println("Enter 1 for \"Hello World!\"");
			System.out.println("Enter 2 for \"fubar\"");
			System.out.println("Enter 3 to \"Exit\"\n");
			
			// Get user choice
			System.out.println("Enter menu choice: ");
			String tempString = sc.next();
			
			try  {
			
				menuChoice = Integer.parseInt(tempString);
			}
			
			catch (Exception e)  {
				
				// invalid entry message will be displayed by else statement
			}
			
			// menu choices
			if (menuChoice == 1)  {
				
				System.out.println("Hello World!\n");
			}
			
			else if (menuChoice == 2)  {
				
				System.out.println("fubar\n");
			}
			
			else if (menuChoice == EXIT_CHOICE)  {
				
				System.out.println("Exiting.");
			}
			
			else  {
				
				System.out.println("Invalid choice.");
			}
			
			
		}
		
		
		

	}

}
