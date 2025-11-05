package lessons;
import java.util.Scanner;

public class SummativeExample {

	/*
	 * Write a computer program that would allow you, or someone else, 
	 * to enter in their top six marks, determine their average, then 
	 * see if they are accepted into a program given a grade cut-off.
	 */
	
	public static void main(String[] args) {

		// variables
		final int NUM_GRADES = 6;
		int grades[] = new int[NUM_GRADES];
		int average = 0;
		final int CUT_OFF_GRADE = 80;
		boolean accepted = false;
		
		// get user grades into array
		grades = gradesInput(NUM_GRADES);
		
		// calculate average
		average = calculateAverage(grades);
		
		// determine acceptance
		accepted = programAcceptance(average, CUT_OFF_GRADE);
		
		// display acceptance
		outputAcceptance(accepted);

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
	
	
	
	// DESCRIPTION - Returns average of int[]
	// PARAMETERS - int[] a
	// RETURN - int
	public static int calculateAverage(int[] a)  {
		
		// variables
		int sum = 0;
		int average = 0;
		
		// sum all values in a
		for(int i=0; i<a.length; i++)  {
			
			sum = sum + a[i];
		}
		
		// calculate average
		average = sum / a.length;
		
		return average;
	}
	
	
	// DESCRIPTION - Returns true if n >= b, else false.
	// PARAMETERS - int a, int b
	// RETURN - boolean
	public static boolean programAcceptance(int a, int b)  {
		
		if (a >= b)
			return true;
		
		else
			return false;
	}
	
	
	// DESCRIPTION - Displays "Accepted" if a is true, else "Not accepted". 
	// PARAMETERS - boolean a
	// RETURN - void
	public static void outputAcceptance(boolean a)  {
		
		if (a == true)
			System.out.println("Accepted!");
		
		else
			System.out.println("Not accepted.");
		
	}
	
	
}
