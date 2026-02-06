package lessons;
import java.util.Scanner;

public class AddCalculator {

	public static void main(String[] args) {

		// variables
		int input1 = 0;
		int input2 = 0;
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		
		// input
		System.out.println("Welcome to Add calculator.\n");
		System.out.print("Enter first number: ");
		input1 = sc.nextInt();
		System.out.print("Enter second number: ");
		input2 = sc.nextInt();
		
		// processing
		sum = input1 + input2;
		
		// output
		System.out.println(input1 + " + " + input2 + " = " + sum);		

	}

}
