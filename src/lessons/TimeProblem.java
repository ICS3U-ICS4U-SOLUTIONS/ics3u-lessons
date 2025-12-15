package lessons;
import java.util.Scanner;

public class TimeProblem {

	public static void main(String[] args) {

		// variables
		Scanner sc = new Scanner(System.in);
		int input = 0;
		int hours = 0;
		int secondsRemaining = 0;
		int minutes = 0;
		int seconds = 0;
		final int SECONDS_IN_HOUR = 3600;
		final int SECONDS_IN_MINUTE = 60;
		
		// get seconds from user
		System.out.println("Enter number of seconds: ");
		
		try  {
			input = sc.nextInt();
		}
		
		catch(Exception e)  {
			e.printStackTrace();
		}
		
		// calculate number of hours
		hours = input / SECONDS_IN_HOUR;
		
		// calculate seconds remaining
		secondsRemaining = input % SECONDS_IN_HOUR;
		
		// calculate minutes
		minutes = secondsRemaining / SECONDS_IN_MINUTE;
		
		// calculate seconds
		seconds = secondsRemaining % SECONDS_IN_MINUTE;
		
		
		// output
		System.out.println("Seconds entered: " + input);
		System.out.println("HOURS: " + hours);
		System.out.println("SECONDS REMAINING AFTER HOURS CALCULATED: " + secondsRemaining);
		System.out.println("MINUTES: " + minutes);
		System.out.println("SECONDS: " + seconds); 
	
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
