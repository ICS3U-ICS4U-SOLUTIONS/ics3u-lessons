package lessons;
import java.util.Scanner;

public class AddCalculator {

	public static void main(String[] args) {

		// variables
		Scanner sc = new Scanner(System.in);
		int firstNumber = 0;
		int secondNumber = 0;
		int sum = 0;

		// get numbers from user
		System.out.println("Add Calculator\n");
		System.out.println("First Number: ");
		firstNumber = sc.nextInt();
		System.out.println("Second Number: ");
		secondNumber = sc.nextInt();
		
		// processing
		sum = firstNumber + secondNumber;
		
		// output
		System.out.println("SUM: " + sum);
	}

}
