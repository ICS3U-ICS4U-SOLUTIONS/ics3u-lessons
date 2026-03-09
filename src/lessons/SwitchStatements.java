package lessons;
import java.util.Scanner;

public class SwitchStatements {

	public static void main(String[] args) {

		// Switch statements are an alternative to if-elseIf-else statements
		// Easier to read/maintain
		
		// variables
		Scanner sc = new Scanner(System.in);
		int userInput = 0;
		String userInput2 = "";
		
		// input/output
		System.out.println("Enter 1, 2, or 3: ");
		userInput = sc.nextInt();
		
		switch(userInput)  {
		
			case 1: 
				System.out.println("You selected 1.");
				System.out.println("1 is a wise choice.");
				System.out.println("1 is an odd number.");
				break;
		
			case 2: 
				System.out.println("You selected 2.");
				System.out.println("2 is also a wise choice.");
				System.out.println("2 is an even number.");
				break;
				
			case 3: 
				System.out.println("You selected 3.");
				System.out.println("3 is a very wise choice.");
				System.out.println("3 is an odder number.");
				break;
				
			default:
				System.out.println("Invalid integer selected.");

		}
		
		// input for second example
		System.out.println("Enter A, B or C: ");
		userInput2 = sc.next();
		
		switch(userInput2)  {
		
			case "A": case "a":
				System.out.println("A is for apple.");
				break;
			
			case "B": case "b":
				System.out.println("B is for blueberry.");
				break;
			
			case "C": case "c":
				System.out.println("C is for cherry.");
				break;
			
			default:
				System.out.println("Invalid selection.");
		
		}

	}

}
