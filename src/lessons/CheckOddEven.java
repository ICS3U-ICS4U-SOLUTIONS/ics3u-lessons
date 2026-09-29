package lessons;
import java.util.Scanner;

public class CheckOddEven {

	public static void main(String[] args) {

		// variables
		Scanner sc = new Scanner(System.in);
		int n = 0;
		
		// get number from user
		System.out.println("Enter number: ");
		
		try  {
			
			n = sc.nextInt();
		}
		
		catch(Exception e)  {
			
			e.printStackTrace();
		}

		// decision
		if (n%2 == 0)  {
			
			// true (number is even)
			System.out.println("Even");
		}
		
		else  {
			
			// false (number is odd)
			System.out.println("Odd");
		}
		
		System.out.println("End of program.");
		sc.close();
		
	}

}
