/*

Algorithm Design

1. IPO Chart
2. Pseudo Code
3. Flow Charts
4. Code


High Level Pseudo Code (small steps, correct sequencing, use IPO)
----------------------
1. Get the number of seconds from the user.
2. Calculate number of hours.
3. Calculate the number of minutes.
4. Calculate the number of seconds.
5. Output the number of hours, minutes and seconds to the user.


Detailed Pseudo Code (no human judgement involved)
--------------------

Get totalSeconds from user.

Calculate number of hours:

	hours = totalSeconds / ( 60 x 60 )

Calculate remaining second:

	remainingSeconds = totalSeconds % (60 x 60)

Calculate number of minutes:

	minutes = remainingSeconds / 60

Calculate number of second:

	seconds = remainingSeconds % 60

Output the number of hours, minutes and seconds to the user.
*/



package lessons;
import java.util.Scanner;

public class AlgorithmDesign {

	// Program will determine number of hours, minutes 
	// and seconds from total number of seconds from user.
	public static void main(String[] args) {

		// variables
		Scanner sc = new Scanner(System.in);
		int totalSeconds = 0;
		int hours = 0;
		int remainingSeconds = 0;
		int minutes = 0;
		int seconds = 0;
		final int NUM_SECS_IN_MIN = 60;
		final int NUM_MIN_IN_HOUR = 60;
		
		// get total seconds from user
		System.out.println("Enter total seconds: ");
		
		try  {
			totalSeconds = sc.nextInt();
		}
		
		catch (Exception e)  {
			
			System.out.println("Invalid, program exiting ...");
		}
		
		// calculate total hours
		hours = totalSeconds / (NUM_SECS_IN_MIN * NUM_MIN_IN_HOUR);
		
		// calculate remaining seconds
		remainingSeconds = totalSeconds % (NUM_SECS_IN_MIN * NUM_MIN_IN_HOUR);

		// Calculate number of minutes
		minutes = remainingSeconds / NUM_SECS_IN_MIN;
		
		// Calculate number of seconds
		seconds = remainingSeconds % NUM_SECS_IN_MIN;
				
		// Output the number of hours, minutes and seconds to the user.
		System.out.println("Total number of seconds: " + totalSeconds);
		System.out.println("HOURS: " + hours);
		System.out.println("MINUTES: " + minutes);
		System.out.println("SECONDS: " + seconds);
		
	}

}


