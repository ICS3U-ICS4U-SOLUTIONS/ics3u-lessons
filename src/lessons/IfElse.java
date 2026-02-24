package lessons;

public class IfElse {

	public static void main(String[] args) {

		/* COMPARISON OPERATORS ARE PRIMARILY USED TO COMPARE NUMBERS:
		   >, <, ==, >=, <=, !=

		   DECISIONS CAN BE MADE BY USING:
		   if, if/else, if/else if/else
		*/
		
		
		int myAge = 15;
		final int DRIVING_AGE = 16;
		
		if (myAge >= DRIVING_AGE)  {
			
			System.out.println("Old enough to drive.");
		}

		else  {
			
			System.out.println("Not old enough to drive.");
		}

	}

}
