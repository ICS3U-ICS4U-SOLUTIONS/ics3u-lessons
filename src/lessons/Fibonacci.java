package lessons;

public class Fibonacci {

	public static void main(String[] args) {

		System.out.println(fibonacci(6));

	}
	
	/*	DESCRIPTION - Returns the corresponding number in the Fibonacci sequence (n). 
	 * 	PARAMETERS - int n
	 *  RETURN TYPE - int
	 */
	public static int fibonacci(int n)  {
		
		// variables
		int first = 0;
		int second = 1;
		int next = 0;
		
		// error cases
		if (n < 1)
			return -1;
		
		// first sequence number
		if (n == 1)
			return first;
		
		// second sequence number
		if (n == 2)
			return second;
		
		// method will reach this point if n > 2
		// therefore else statement is redundant
		
		// Any sequence number > 2
		for(int i=0; i<n-2; i++)  {
		
			next = first + second;
			first = second;
			second = next;
		}
		
		return next;
	}

}
