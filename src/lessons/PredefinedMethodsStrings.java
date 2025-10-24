package lessons;
import java.lang.String;  // this import is not necessary

public class PredefinedMethodsStrings {

	public static void main(String[] args) {

		// predefined methods are "commands" which perform a specific task
		// these methods were written by Java developers
		// programmers, in turn, use these commands to perform complext tasks
		// Methods are located in a file called a class, for example String.
		
		// Google "oracle java String" for documentation
		// You will be expected to know how to read this.
		
		// variables
		String myString = "Hello World!";		
		String myString2 = " fubar";
		
		//System.out.println(myString.charAt(4));
		
		//String newString = "";
		//newString = myString.concat(myString2);
		//System.out.println(newString);
				
		// Display it
		System.out.println(myString.length());
		
		// Use it
		System.out.println(4 + myString.length());
		
		// Keep it
		int numCars = myString.length();
		
	}

}
