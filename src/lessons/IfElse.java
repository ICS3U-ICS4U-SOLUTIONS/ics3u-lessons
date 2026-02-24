package lessons;
import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {

		// variables
		int myAge = 0;
		final int DRIVING_AGE = 16;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Program determines if you're old enough to drive.");
		System.out.println("Enter age: ");
		
		try  {
			myAge = sc.nextInt();
		}
		
		catch (Exception e)  {
			
			System.out.println("Invalid response.");
		}
		
		if (myAge >= DRIVING_AGE)  {
			
			System.out.println("Old enough to drive.");
		}

		else  {
			
			System.out.println("Not old enough to drive.");
		}

	}

}
