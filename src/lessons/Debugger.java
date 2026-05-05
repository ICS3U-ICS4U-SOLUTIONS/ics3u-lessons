package lessons;
import java.util.Scanner;

public class Debugger {

	public static void main(String[] args) {

		// variables
		Scanner sc = new Scanner(System.in);
		int firstNum = 0;
		int secondNum = 0;
		int sum = 0;
		
		System.out.println("Enter first num: ");
		firstNum = sc.nextInt();
		
		System.out.println("Enter second num: ");
		secondNum = sc.nextInt();
		
		sum = addTwoNumbers(firstNum, secondNum);

		System.out.println("Answer is: " + sum);
	}

	public static int addTwoNumbers(int x, int y)  {
		
		int sum = 0;
		sum = x + y;
		return sum;
	}
	
	
	
}
