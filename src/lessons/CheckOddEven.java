package lessons;
import java.util.Scanner;

public class CheckOddEven {

	public static void main(String[] args) {
		
		// variables
		Scanner sc = new Scanner(System.in);
		int n = 0;
		
		// output
		System.out.println("Program determines if number is odd or even.");
		System.out.println("Enter integer: ");
		
		// input
		try {
			n = sc.nextInt();
		}
		
		catch(Exception e) {
			
			System.out.println("Incorrect entry, exiting program.");
		}
		
		// check if odd
		if ( (n % 2) > 0 )  {
			
			System.out.println(n + " is odd.");
		}
		
		// check if even
		else  {
			
			System.out.println(n + " is even.");
		}
		
		// end of program
		sc.close();
		
		
	}

}
