package lessons;

public class StringComparisons {

	public static void main(String[] args) {

		// Use .equals() method to compare Strings.
		// Do not use math comparison operators (<, <=, >, >=, !=, ==)
		// to compare Strings.
		
		String myString1 = "foo";
		String myString2 = "bar";
		
		if (myString1.equals(myString2))  {
			
			System.out.println("Same");
		}
		
		else  {
			
			System.out.println("Different");
		}
		
	}

}
