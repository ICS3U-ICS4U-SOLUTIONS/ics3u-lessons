package lessons;

public class SwtichStatements {

	public static void main(String[] args) {

		// break statements break out of blocks of code
		// break statements are required to prevent "Switch fall through"
		
		// variables
		int number = 2;
		
		switch(number)  {
		
			case 1:
				System.out.println("You entered 1.");
				System.out.println("One is a good choice.");
				break;
				
			case 2:
				System.out.println("You entered 2.");
				System.out.println("Two is a good choice.");
				break;
				
			case 3:
				System.out.println("You entered 3.");
				System.out.println("Three is a good choice.");
				break;
				
			default:
				System.out.println("Invalid entry.");
				
		}
		
		
		// variables
		String myString = "a";
		
		switch(myString)  {
		
			case "A", "a":
				System.out.println("You entered A.");
				System.out.println("A is a good choice.");
				break;
				
			case "B", "b":
				System.out.println("You entered B.");
				System.out.println("B is a good choice.");
				break;
				
			case "C", "c":
				System.out.println("You entered C.");
				System.out.println("C is a good choice.");
				break;
				
			default:
				System.out.println("Invalid entry.");
				
		}
		
		

	}

}
