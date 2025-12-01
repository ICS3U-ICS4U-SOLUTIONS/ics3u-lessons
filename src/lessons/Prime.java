package lessons;

public class Prime {

	public static void main(String[] args) {

		/*	A PRIME NUMBER is a whole number, greater than 1 that cannot
		 *  be exactly divided by any whole number other than itself and 1
		 */
		
		System.out.println(prime(7));		// this should return true

	}

	
	/*	DESCRIPTION - Returns true if n is prime, else false.
	 *  PARAMETERS - int n
	 *  RETURN TYPE - boolean
	 */
	public static boolean prime(int n) {
		
		// special cases
		if (n <= 1)
			return false;
		
		// check if number is divisible by any other number except 1 and itself
		for(int i=2; i<n/2; i++)  {
			
			if (n%i == 0)
				
				return false;
		}
		
		return true;
	}
	
}
