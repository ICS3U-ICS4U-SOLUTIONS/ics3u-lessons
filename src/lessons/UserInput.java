package lessons;
import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {

		// variables
		Scanner sc = new Scanner(System.in);
		String myString = "";
		int myInteger = 0;
		double myDouble = 0.0;
		
		// sc.next() - gets user input from console, up to, but not including first space
		// sc.nextLine() - gets user input from console, up to, but not including new line
		// sc.nextInt() - gets non-decimal numbers from console, else crashes
		// sc.nextDouble() - gets any number from console, changes to double, else crashes
		
		System.out.println("Enter double: ");
		myDouble = sc.nextDouble();
		System.out.println(myDouble);
		
	}

}
