package lessons;
import java.util.Scanner;

public class TimeProblem {

	public static void main(String[] args) {

		// variables
		Scanner sc = new Scanner(System.in);
		int totalSeconds = 0;
		int remainingSeconds = 0;
		int seconds = 0;
		int minutes = 0;
		int hours = 0;
		final int SECONDS_IN_HOUR = 3600;
		final int SECONDS_IN_MINITUE = 60;

		// get totalSeconds from user
		System.out.println("Enter total number of second: ");
		
		try {
			
			totalSeconds = sc.nextInt();
		}
		
		catch(Exception fubar)  {
			
			fubar.printStackTrace();
		}
		
		// calculate number of hours
		hours = totalSeconds / SECONDS_IN_HOUR;
		
		
		
	
	}

}


/* PROBLEM - Express a given number of seconds in terms of hours, 
 * minutes and seconds.
 * 
 * Example: Enter 9331 seconds. Program outputs the number of hours, 
 * minutes and seconds that this represents.
 * 
 * 
 * 
 * PSEUDO CODE (high level):
 *
 * 1.  Get the number of seconds from the user.
 * 2.  Calculate number of hours.
 * 3.  Calculate number of minutes.
 * 4.  Calculate number of seconds
 * 5.  Output hours, minutes and seconds.
 * 
 * 
 * PSEUDO CODE (detailed):
 * 
 * 1.  Get totalSeconds from user.
 * 2.  Calculate number of hours:
 * 
 * 			hours = totalSeconds / 3600 (or 60 * 60)
 * 
 * 3.  Calculate number of minutes.
 * 
 * 			remainingSeconds = totalSeconds % 3600
 * 			minutes = remainingSeconds / 60
 * 
 * 4.  Calculate number of seconds.
 * 
 * 			seconds = remainingSeconds % 60 			
 * 
 * 5.  Output hours, minutes and seconds.
 */
