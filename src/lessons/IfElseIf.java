package lessons;
import java.util.Scanner;

public class IfElseIf {

	public static void main(String[] args) {

		// variables
		int grade = 0;
		Scanner sc = new Scanner(System.in);
		
		// output 
		System.out.println("Program determines level based on numeric grade.\n");
		
		// get user grade
		System.out.println("Enter grade: ");
		grade = sc.nextInt();
		
		// determine if Level 0
		if (grade < 50)  {
			
			System.out.println("Level 0");
		}
			
		// determine if Level 1
		else if (grade < 60)  {
			
			System.out.println("Level 1");
		}
	
		// determine if Level 2
		else if (grade < 70)  {
			
			System.out.println("Level 2");
		}
		
		// determine if Level 3
		else if (grade < 80)  {
			
			System.out.println("Level 3");
		}
		
		// determine if Level 4
		else  {
			
			System.out.println("Level 4");
		}
		
		// for memory management
		sc.close();
		
	}

}
