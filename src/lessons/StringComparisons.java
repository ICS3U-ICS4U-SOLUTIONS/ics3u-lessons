package lessons;

public class StringComparisons {

	public static void main(String[] args) {

		// When comparing Strings, we do not use the Math comparison operator "=="
		// We use .equals() instead.  This method is case sensitive.
		
		// Recall:
		if (3 == 4)  {
			
			System.out.println("Numbers are the same.");
		}
		
		else  {
			
			System.out.println("Numbers are different.");
		}

		// For Strings:
		if ("dog".equals("dog"))  {
			
			System.out.println("Strings are same.");
		}
		
		else  {
			
			System.out.println("Strings are different.");
		}
		
		
		
	}

}
