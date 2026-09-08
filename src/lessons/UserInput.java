package lessons;
import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {

		// variables
		Scanner sc = new Scanner(System.in);
		String userName = "";
		
		// prompt user for input
		System.out.println("Enter your name: ");
		
		// get user input
		userName = sc.next();
		
		// print user name
		System.out.println("Your name is: " + userName);
		
	}

}
