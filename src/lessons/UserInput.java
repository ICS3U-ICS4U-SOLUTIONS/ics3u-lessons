package lessons;
import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {

		// variables
		Scanner sc = new Scanner(System.in);
		String userName = "";
		
		// prompt user for name
		System.out.println("Enter your name: ");
		
		userName = sc.next();
		System.out.println("Your name is: " + userName);
		
	}

}
