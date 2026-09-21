package lessons;
import java.util.Scanner;

public class AndOrNot {

	public static void main(String[] args) {

		// Combining conditions using Logical And "&&" and Logical Or "||"
		// And "&&" both conditions have to be true
		// Or "||" one or both conditions have to be true
		// Not "!" takes the opposite of the condition
	
		// variables
		int grade = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Program determines if grade is valid (0-100.");
		
		// input
		System.out.println("Enter grade: ");
		grade = sc.nextInt();
		
		// EXAMPLE "&&"
		if( (grade >=0) && (grade <=100) )  {
			
			System.out.println("Grade is valid.");
		}
		
		else  {
			
			System.out.println("Grade is not valid.");
		}
		
		// EXAMPLE "||"
		if( (grade < 0) || (grade > 100) )  {
			
			System.out.println("Grade is not valid.");
		}
		
		else  {
			
			System.out.println("Grade is valid.");
		}
		
		// EXAMPLE "!"
		if (!true)  {
			
			System.out.println("true");
		}
		
		else {
		
			System.out.println("false");
		}
		
		sc.close();
	}

}
