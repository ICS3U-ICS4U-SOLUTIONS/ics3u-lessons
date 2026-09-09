package lessons;

public class MathOperators {

	public static void main(String[] args) {

		// Math Operators:
		// +, -, *, /, %
		
		// variables
		int myInteger1 = 13;
		int myInteger2 = 7;
		int sum = 0;
		int difference = 0;
		int product = 0;
		int quotient = 0;
		int modulus = 0;
		
		// addition
		sum = myInteger1 + myInteger2;
		
		// subtraction
		difference = myInteger1 - myInteger2;
		
		// multiplication 
		product = myInteger1 * myInteger2;
		
		// division - does not round
		quotient = myInteger1 / myInteger2;
		
		// modulus - remainder of a division operation
		modulus = myInteger1 % myInteger2;
		
		System.out.println(sum);
		System.out.println(difference);
		System.out.println(product);
		System.out.println(quotient);
		System.out.println(modulus);
	}

}
