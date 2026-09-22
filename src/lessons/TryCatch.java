package lessons;
import java.util.Scanner;

public class TryCatch {

	public static void main(String[] args) {

		// variables
		Scanner sc = new Scanner(System.in);
		int myInteger = 0;
		
		// get input
		System.out.println ("Enter integer: ");
		
		
		try {
			
			myInteger = sc.nextInt();  // code which may crash program
		}
		
		catch(Exception e)  {
			
			e.printStackTrace();  // prints exception error
			System.out.println("Invalid entry ...");  // can do anything in catch block
		}
		
		System.out.println("Program continues ...");
		;
	}

}
