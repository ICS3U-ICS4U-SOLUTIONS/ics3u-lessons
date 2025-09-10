package lessons;

public class CombiningConditions {

	public static void main(String[] args) {

		// We can have more than 1 condition per statement.
		// Keywords && (and) and || (or) can be used.

		// && (and) - both conditions have to be true for the expression to be true
		if ( (13 > 7) && (3 < 7) )  {
			
			System.out.println("true");
		}
		
		else  {
			
			System.out.println("false");
		}
		
		
		// || (or) - one condition has to be true for the expression to be true
		if ( false || false )  {
					
			System.out.println("true");
		}
				
		else  {
					
			System.out.println("false");
		}
		
	}

}
