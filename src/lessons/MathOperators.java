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
		double quotient = 0.0;
		int modulus = 0;
		
		// addition
		sum = myInteger1 + myInteger2;
		System.out.println("SUM: " + sum);
		
		// subtraction
		difference = myInteger1 - myInteger2;
		System.out.println("DIFFERENCE: " + difference);
		
		// multiplication
		product = myInteger1 * myInteger2;
		System.out.println("PRODUCT: " + product);
		
		// division
		quotient = myInteger1 / myInteger2;
		System.out.println("QUOTIENT: " + quotient);
		
		// modulus: returns the remainder of a division operation
		modulus = myInteger1 % myInteger2;
		System.out.println("MODULUS: " + modulus);
		
		// you can mix variables and numbers in math operations
		sum = myInteger1 + 32;
		System.out.println("SUM OF VARIABLE AND NUMBER: " + sum);
		
	}

}
