package lessons;
import java.util.Scanner;

public class OddEvenCheck {

	public static void main(String[] args) {

		// variables
		Scanner sc = new Scanner(System.in);
		int userInput = 0;
		
		System.out.println("Enter integer to check if odd or even: ");
		
		try  {
			
			userInput = sc.nextInt();
		}
		
		catch (Exception e)  {
			
			System.out.println("Invalid entry.");
		}
		
		if (userInput%2 == 0)  {
			
			System.out.println("Even number.");
		}
		
		else  {
			
			System.out.println("Odd number.");
		}
		
	}

}
