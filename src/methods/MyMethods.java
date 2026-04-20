package methods;

public class MyMethods {

	/*
	 * 	DESCRIPTION - Displays random program menu.
	 * 	PARAMETERS - none
	 * 	RETURN TYPE - void
	 */
	public static void printMenu()  {
		
		System.out.println("Welcome to my program.\n");
		System.out.println("1. Do something.");
		System.out.println("2. Do something else.");
		System.out.println("3. Do nothing.");
		System.out.println("4. Exit.");
		System.out.println("Your choice: ");
	}
	
	
	/*
	 * 	DESCRIPTION - Returns greater of x and y.
	 * 	PARAMETERS - int x, int y
	 * 	RETURN TYPE - int
	 */
	public static int biggerOfTwoNumbers(int x, int y)  {
		
		if (x > y)  
			return x;
			
		return y;		
	}

}
