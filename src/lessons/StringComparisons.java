package lessons;

public class StringComparisons {

	public static void main(String[] args) {

		// Do not use math comparison operators to compare Strings.
		// It may work sometimes, but may get errors or unpredictable
		// results.  Use .equals() method to compare Strings.
		
		String myString1 = "foo";
		String myString2 = "bar";
		String myString3 = "foo";
		
		if (myString1.equals(myString2))  {
			
			System.out.println("Same");
		}
		
		else  {
			
			System.out.println("Different");
		}
		
	}

}
