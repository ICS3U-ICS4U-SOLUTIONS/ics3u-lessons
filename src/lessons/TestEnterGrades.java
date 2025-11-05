package lessons;
import java.util.Scanner;

public class TestEnterGrades {

	public static void main(String[] args) {
		
		int testArray[] = new int[3]; 
		
		testArray = gradesInput(3);
		
		for (int i=0; i<3; i++)  {
			
			System.out.println(testArray[i]);
		}

	}

	// DESCRIPTION - Obtains n grades from console, returns array of grades.
	// PARAMETERS - int n
	// RETURN - int[]
	public static int[] gradesInput(int n)  {
		
		// variables
		Scanner sc = new Scanner(System.in);
		int[] grades = new int[n];    
		
		// get grades
		for (int i=0; i<n; i++)  {
			
			System.out.println("Enter grade " + (i+1) + " : ");
			grades[i] = sc.nextInt();
		}
		
		return grades;
	}
	
	
	
}
