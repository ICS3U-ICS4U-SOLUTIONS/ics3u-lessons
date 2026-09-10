package lessons;
import java.util.Scanner;

public class IfElseIf {

	public static void main(String[] args) {

		// variables
		Scanner sc = new Scanner(System.in);
		int mark = 0;
		
		// display program
		System.out.println("Program determines level based on grade.");
		
		// prompt user for grade
		System.out.println("Enter numeric grade: ");
		mark = sc.nextInt();

		// determine if Level 0
		if (mark < 50)  {
			
			System.out.println("Level 0");
		}
		
		else if (mark < 60)  {
			
			System.out.println("Level 1");
		}
		
		else if (mark < 70)  {
			
			System.out.println("Level 2");
		}
		
		else if (mark < 80)  {
			
			System.out.println("Level 3");
		}
		
		else  {
			
			System.out.println("Level 4");
		}
		
	}

}
