package lessons;
import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {

		// variables
		int num1 = 0;
		int num2 = 0;
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		
		// get user input
		System.out.println("Enter first integer: ");
		num1 = sc.nextInt();
		System.out.println("Enter second integer: ");
		num2 = sc.nextInt();
		
		// processing
		sum = num1 + num2;
		
		// output
		System.out.println("Sum of " + num1 + " and " + num2 + " is : " + sum);
		
	}

}
