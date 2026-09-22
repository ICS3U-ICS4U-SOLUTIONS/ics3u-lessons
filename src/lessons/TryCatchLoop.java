package lessons;
import java.util.Scanner;

public class TryCatchLoop {

	public static void main(String[] args) {

		// variables
		Scanner sc = new Scanner(System.in);
		int myInteger = 0;
		boolean validEntry = false;
		
		while(validEntry == false)  {
			
			System.out.println("Enter integer: ");
			
			try  {
				
				// work-around required to avoid infinite loop
				// bug with JRE 1.8
				String temp = sc.nextLine();
				myInteger = Integer.parseInt(temp);
				validEntry = true;
			}
			
			catch(Exception e)  {
				
				System.out.println("Invalid entry.");
			}
			
		}
		
		System.out.println("Program continues ...");

	}

}
