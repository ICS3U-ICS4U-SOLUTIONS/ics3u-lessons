package lessons;
import java.util.Scanner;

public class IfElseIf {
 
	public static void main(String[] args) {
		
		// variables
		int mark = 0;
		Scanner sc = new Scanner(System.in);
		
		// input
		System.out.println("Program determines level based on numeric grade.\n");
		System.out.println("Enter numberic grade: ");
		mark = sc.nextInt();
		
		// processing
		if (mark < 50)  {
			
			System.out.println("Level R");
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
		
		System.out.println("End of program.");
		
		sc.close();
	
	}

}
