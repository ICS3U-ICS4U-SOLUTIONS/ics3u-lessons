package methods;

public class MyMethods {

	public static void main()  {
		
		
		System.out.println(factorial(-2));
	}
	
	
	/*	DESCRIPTION - Returns factorial of n>=0, else returns -1.
	 * 	PARAMETERS - int n
	 *  RETURN TYPE - int
	 */
	public static int factorial(int n)  {
		
		int answer = 1;
				
		// error case
		if (n < 0)
			return -1;
		
		// base case (n = 0)
		if ((n == 0) || (n == 1))
			return 1;
		
		// calculate factorial using loop
		for (int i=1; i<=n; i++)
			answer = answer * i;
		
		return answer;
	}
	
	
	/* DESCRIPTION - Rounds double parameter to nearest hundredth.
	 * PARAMETERS - double a
	 * RETURN TYPE - double
	 */
	public static double roundMoney(double a)  {
		
		a = a * 100;
		a = Math.round(a);
		a = a / 100;
		
		return a;
	}

}
