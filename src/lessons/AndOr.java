package lessons;

public class AndOr {

	public static void main(String[] args) {

		// Logical "And": &&
		// Both expressions must be true for the whole
		// expression to be true.
		if ( false && false )  {
			
			System.out.println("True");
		}
		
		else  {
			
			System.out.println("False");
		}
		
		
		// Logical "Or: ||
		// One or both expressions must be true for the whole
		// expression to be true.
		if ( true || true )  {
			
			System.out.println("True");
		}
		
		else  {
			
			System.out.println("False");
		}
		
	}

}
