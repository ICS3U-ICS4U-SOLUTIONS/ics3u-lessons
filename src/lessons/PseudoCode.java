/*	PSEUDO-CODE EXAMPLE
 * 
 *	PROBLEM - Time Problem.  User enter number of seconds.  Program will compute number
 *			  of HOURS, MINUTES and SECONDS.	
 * 
 * 	IPO CHART - Outlines methods in terms of Input, Process, Output using squares.
 * 				See D2L for example.
 * 
 * 	HIGH-LEVEL PSEUDO-CODE: (similar steps as IPO chart)
 * 
 * 	1. Get the number of seconds from the user.
 * 	2. Calculate the number of hours.
 *  3. Calculate the number of minutes.
 *  4. Calculate the number of seconds.
 *  5. Output the number of hours, minutes and seconds.
 *  
 *  DETAILED PSEUDO-CODE: (detailed steps, no human judgement involved)
 *  
 *  1. Get totalSeconds from user.
 *  
 * 	2. Calculate the number of hours.
 *		 
 * 			hours = totalSeconds / (60 x 60)
 * 
 *  3. Calculate remaining seconds:
 *  
 *  		remainingSeconds = totalSeconds % (60 x 60)
 * 
 *  4. Calculate the number of minutes.
 *
 *			minutes = remainingSeconds / 60
 *
 *  5. Calculate the number of seconds.
 *  
 *  		seconds = remainingSeconds % 60
 *  
 *  6. Output the number of hours, minutes and seconds.
 *  
 */

package lessons;
import java.util.Scanner;

public class PseudoCode {

	public static void main(String[] args) {
		
		// variables
		Scanner sc = new Scanner(System.in);
		int totalSeconds = 0, remainingSeconds = 0, hours = 0, minutes = 0, seconds = 0;

	 	// Get the number of seconds from the user.
		totalSeconds = getNumberOfSeconds(sc);
		
		
		/*
		2. Calculate the number of hours.
	 	3. Calculate the number of minutes.
	 	4. Calculate the number of seconds.
	 	5. Output the number of hours, minutes and seconds.
		*/
		
	}
	
	/*	DESCRIPTION - Gets number seconds from user.
	 * 	PARAMTERS - Scanner sc
	 * 	RETURN - int
	 */	
	public static int getNumberOfSeconds(Scanner sc)  {
		
		int seconds = 0;
		
		System.out.println("Enter total number of seconds: ");
		
		try  {
			
			seconds = sc.nextInt();
		}
		
		catch(Exception e)  {
			
			System.out.println("Invalid entry.");
		}
		
		return seconds; 
	}
	

}
