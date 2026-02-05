package lessons;

public class Variables {

	public static void main(String[] args) {
		
		// Primitive data types:
		// int, double, char, boolean (true/false)
		// Object variable:
		// String
		
		// variables
		int myInteger = 0;
		double myDouble = 0.0;
		char myChar = 'p';
		boolean myBoolean1 = true;
		boolean myBoolean2 = false;
		String myString = "Hello World!";
		
		// this is a comment
		
		/*
		 * this is a 
		 * mutli-line
		 * comment
		 */
	
		// Constant variables are variables that should not change
		// in value.  We use a keyword "final" and use all capitals
		// for the variable name, with underscores between words:
		final double TAX_RATE = 0.13;
		
		
		myDouble = 4;
		
		// This is not permitted:
		// TAX_RATE = 0.17;
	}

}
