package lessons;
import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {

		// variables
		Scanner sc = new Scanner(System.in);
		String myString = "";
		int myInteger = 0;
		double myDouble = 0.0;
		
		System.out.println("Enter double: ");
	  
		// takes input from console, up to, but not including spaces
		// myString = sc.next();
		
		// takes input from console, up to, but not including new line
		//myString = sc.nextLine();
		
		// takes integer from console, crashes if not int
		//myInteger = sc.nextInt();
		
		// takes number from console, crashes if not number
		myDouble = sc.nextDouble();
		
		
	}

}
