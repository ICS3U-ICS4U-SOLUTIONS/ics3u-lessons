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
		final int SECONDS_IN_HOUR = 3600;
		final int SECONDS_IN_MINUTE = 60;
		
	 	// Get the number of seconds from the user.
		totalSeconds = getNumberOfSeconds(sc);
		
		// Calculate the number of hours
		hours = calculateNumberHours(totalSeconds, SECONDS_IN_HOUR);
		
		// Calculate remaining seconds
		remainingSeconds = calculateRemainingSeconds(totalSeconds, SECONDS_IN_HOUR);
		
		// Calculate the number of minutes
		minutes = calculateNumberMinutes(remainingSeconds, SECONDS_IN_MINUTE);
		
		// Calculate the number of seconds
		seconds = calculateNumberSeconds(remainingSeconds, SECONDS_IN_MINUTE);
		
		// Display hours, minutes and seconds
		displayTimes(hours, minutes, seconds);
		
		
	}
	
	
	/*	DESCRIPTION - Displays hours, minutes and seconds
	 * 	PARAMTERS - int h, int m, int s
	 * 	RETURN - void
	 */	
	public static void displayTimes(int h, int m, int s)  {
		
		System.out.println("HOURS: " + h);
		System.out.println("MINUTES: " + m);
		System.out.println("SECONDS: " + s);
	}
	
	
	/*	DESCRIPTION - Calculates number of seconds using remaining seconds.
	 * 	PARAMTERS - int remainSecs, int secsInMin
	 * 	RETURN - int
	 */	
	public static int calculateNumberSeconds(int remainSecs, int secsInMin)  {
		
		return(remainSecs%secsInMin);
	}
	
	
	/*	DESCRIPTION - Calculates number of minutes using remaining seconds after calculating number hours.
	 * 	PARAMTERS - int remainSecs, int secsInMin
	 * 	RETURN - int
	 */	
	public static int calculateNumberMinutes(int remainSecs, int secsInMin)  {
		
		return(remainSecs/secsInMin);
	}
	
	
	/*	DESCRIPTION - Calculates remaining seconds after calculating total number hours.
	 * 	PARAMTERS - int s, int secsInHour
	 * 	RETURN - int
	 */	
	public static int calculateRemainingSeconds(int s, int secsInHour)  {
		
		return(s%secsInHour);
	}
	
	
	/*	DESCRIPTION - Calculates number of hours using total number of seconds.
	 * 	PARAMTERS - int s, int secsInHour
	 * 	RETURN - int
	 */	
	public static int calculateNumberHours(int s, int secsInHour)  {
		
		return(s/secsInHour);
	}
	
	
	
	
	
	/*	DESCRIPTION - Gets number seconds from user.
	 * 	PARAMTERS - Scanner s
	 * 	RETURN - int
	 */	
	public static int getNumberOfSeconds(Scanner s)  {
		
		int seconds = 0;
		
		System.out.println("Enter total number of seconds: ");
		
		try  {
			
			seconds = s.nextInt();
		}
		
		catch(Exception e)  {
			
			System.out.println("Invalid entry.");
		}
		
		return seconds; 
	}
	

}
