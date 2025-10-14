package lessons;
import java.util.Scanner;


public class MenuWhileLoop {

	public static void main(String[] args) {

		// variables
		Scanner sc = new Scanner(System.in);
		int menuChoice = 0;
		
		while(  menuChoice != 3    )  {
			
			// Present options to user:
			System.out.println("Enter 1 for \"Hello World!\"");
			System.out.println("Enter 2 for \"fubar\"");
			System.out.println("Enter 3 to \"Exit\"\n");
			
			System.out.println("Enter menu choice: ");
			String tempString = sc.next();
			
			try  {
			
				menuChoice = Integer.parseInt(tempString);
			}
			
			catch (Exception e)  {
				
				System.out.println("Invalid entry, please try again.\n");
			}
			
			// menu choices
			if (menuChoice == 1)  {
				
				System.out.println("Hello World!\n");
			}
			
			else if (menuChoice == 3)  {
				
				System.out.println("fubar\n");
			}
			
		}
		
		
		

	}

}
