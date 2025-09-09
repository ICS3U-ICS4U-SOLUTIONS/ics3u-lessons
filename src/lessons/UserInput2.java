package lessons;
import java.util.Scanner;

public class UserInput2 {

	public static void main(String[] args) {

		// variables
		Scanner sc = new Scanner(System.in);
		int myInteger = 0;
		double myDouble = 0.0;
		String myString1 = "";
		String myString2 = "dog";

		
		// get int
		System.out.println("Enter int: ");
		myInteger = sc.nextInt();
		System.out.println(myInteger);
		
		// get double
		System.out.println("Enter double: ");
		myDouble = sc.nextDouble();
		System.out.println(myDouble);
		
		// get String (first token)
		System.out.println("Enter String1: ");
		myString1 = sc.next();
		System.out.println(myString1);

		// get String (whole line)
		System.out.println("Enter String2: ");
		myString2 = sc.nextLine();
		System.out.println(myString2);
		

	}

}
