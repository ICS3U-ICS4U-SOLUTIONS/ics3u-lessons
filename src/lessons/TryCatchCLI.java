package lessons;
import java.util.Scanner;

public class TryCatchCLI {

	public static void main(String[] args) {

		// variables
		Scanner sc = new Scanner(System.in);
		int myInteger = 0;
		
		// input
		System.out.println("Enter a valid integer: ");
	
		// try catch block to handle java exception errors
		try {
			
			myInteger = sc.nextInt();	
		}
		
		// this block will execute if the code within try block crashes
		catch(Exception e) {
			
			System.out.println("Invalid entry.");
		}
		
		System.out.println("Program will proceed ...");
		
	}

}
