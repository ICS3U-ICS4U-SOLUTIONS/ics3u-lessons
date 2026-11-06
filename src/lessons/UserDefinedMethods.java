package lessons;

public class UserDefinedMethods {

	public static void main(String[] asfd) {
		
		displayCLIMenu();
		System.out.println(addTwoIntegers(8, 4));
		
		// CLASS ACTIVITIES:
//		addThreeDoubles(3, 4, 2);
//		printTodaysDateToConsole();
//		costOfItemWithTax(13.45);
//		largestOfThreeIntegers(3, 5, 2);
		
	}
	
	// DESCRIPTION - Returns sum of x and y. 
	// PARAMETERS - int x, int y
	// RETURN - int
	public static int addTwoIntegers(int x, int y)  {
		
		return Math.addExact(x, y);
	}
	
	// DESCRIPTION - Print program menu to console.
	// PARAMETERS - none
	// RETURN - void
	public static void displayCLIMenu()  {
		
		System.out.println("Program menu.\n");
		System.out.println("Choice 1.");
		System.out.println("Choice 2.");
		System.out.println("Choice 3.");
		System.out.println("Exit.\n");
		System.out.println("Enter choice: ");
	}

}
