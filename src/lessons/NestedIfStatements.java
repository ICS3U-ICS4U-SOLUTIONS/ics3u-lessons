package lessons;
import java.util.Scanner;

public class NestedIfStatements {

	public static void main(String[] args) {

		// variables
		Scanner sc = new Scanner(System.in);
		String menuChoice = "";
		String meatChoice = "";
		String vegChoice = "";

		// input/output
		System.out.println("Welcome to restarant.");
		System.out.println("Meat or Vegetarian Menu (M or V)?");
		menuChoice = sc.next();

		if (menuChoice.equals("M") || menuChoice.equals("m") )  {
			
			System.out.println("You are a meat eater.");
			
			System.out.println("Would you like Beef or Chicken (B or C)?");
			meatChoice = sc.next();
			
			if (meatChoice.equals("B") || meatChoice.equals("b"))  {
				
				System.out.println("Fantastic choice, steak is on the way.");
			}
			
			else if (meatChoice.equals("C") || meatChoice.equals("c"))  {
				
				System.out.println("Fantastic choice, chicken is on the way.");
			}
		}
		
		else if (menuChoice.equals("V") || menuChoice.equals("v") )  {
			
			System.out.println("You are a vegetarian.");
			
			System.out.println("Would you like Tofu or Beyond Meat (T or B)");
			vegChoice = sc.next();
			
			if (vegChoice.equals("T")  || vegChoice.equals("t"))  {
				
				System.out.println("Great choice, Tofu is on the way.");
			}
			
			else if (vegChoice.equals("B")  || vegChoice.equals("b"))  {
				
				System.out.println("Great choice, Beyond Meat is on the way.");
			}
			
		}
		
	}

}
