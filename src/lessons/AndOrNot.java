package lessons;
import java.util.Scanner;

public class AndOrNot {

	public static void main(String[] args) {

		/*
		 * Logical And:  &&   (both conditions must be true)
		 * Logical Or:   ||   (one or both conditions must be true)
		 * Not:			 !    (opposite must be true)
		 */
		
		// variables
		int grade = 0;
		Scanner sc = new Scanner(System.in);
		
		// input/output
		System.out.println("Pgrogram determines if grade is valid.\n");
		System.out.println("Enter grade: ");
		
		grade = sc.nextInt();
		

		/*
		if( (grade >= 0) && (grade <= 100) )  {
			
			System.out.println("This is a valid grade.");
		}
		
		else  {
			
			System.out.println("This is not a valid grade.");
		}
		*/
		
		/*

		if( (grade < 0) || (grade > 100) )  {
			
			System.out.println("This is a NOT valid grade.");
		}
		
		else  {
			
			System.out.println("This is a valid grade.");
		}
		
		*/
		
		
		if (!false)  {
			
			System.out.println("True");
		}
		
		else  {
			
			System.out.println("False");
		}
		
		
		
	}

}
