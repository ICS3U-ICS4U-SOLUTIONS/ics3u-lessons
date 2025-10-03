package lessons;

public class SwitchStatementsNumbers {

	public static void main(String[] args) {

		// Switch Statements - alternative to if-elseif-if statements
		// Easier to read and maintain.
		
		int number = 7;
		
		switch (number)  {
		
		
			case 1:
			
				System.out.println("Case 1 was matched.");
				System.out.println("Hello World!");
				break;	// to prevent "switch fall-through"
				
			case 2:
			
				System.out.println("Case 2 was matched.");
				System.out.println("Taylor Swift's album was great.");
				break;  // to prevent "switch fall-through"
			
			case 3:
				
				System.out.println("Case 3 was matched.");
				System.out.println("Taylor Swift's album was bad.");
				break;  // to prevent "switch fall-through"
			
			default:
				
				System.out.println("No matches were found.");
				System.out.println("Taylor Swift's album is out on cassette.");
		}
	
		

	}

}
