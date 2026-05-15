package lessons;

public class Factorial {

	public static void main(String[] args) {

		int myInteger = 16;
		
		System.out.println(factorial(myInteger));

	}

	
	/*	DESCRIPTION - Returns factorial for n >= 0.  Returns -1 for invalid arguments.
	 * 	PARAMETERS - int n
	 * 	RETURN - int
	 */
	public static int factorial(int n)  {
		
		int answer = 1;
		
		// error case
		if (n < 0)
			return -1;
		
		// base case(s)
		if (n == 0 || n == 1)
			return answer;
		
		for(int i=n; i>0; i--)
			answer = answer * i;
		
		return answer;	
	}
	
	
}
