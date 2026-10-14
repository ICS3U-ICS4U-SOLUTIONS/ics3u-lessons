package lessons;
import java.util.Scanner;

public class NestedIfStatements {

	public static void main(String[] args) {
		
		// variables
		Scanner sc = new Scanner(System.in);
		String dietaryPreference = "";
		String meatChoice = "";
		
		// get dietary preference
		System.out.println("Do you eat Meat (M) or Vegetables (V)?");
		dietaryPreference = sc.next();
		
		// determine what dietary preference is
		if(dietaryPreference.equals("M") || dietaryPreference.equals("m"))  {
			
			System.out.println("You like meat.");
			
			// nested if statement
			System.out.println("Chicken or Fish?");
			meatChoice = sc.next();
			
			if (meatChoice.equals("C") || meatChoice.equals("c"))  {
				
				System.out.println("Your meal will be glazed chicken.");
			}
			
			else if (meatChoice.equals("F") || meatChoice.equals("f"))  {
				
				System.out.println("Your meal will be poached salmon.");
			}
			
		}
		
		else if(dietaryPreference.equals("V") || dietaryPreference.equals("v"))  {
			
			System.out.println("You like vegetables.");
		}
		
		



	}

}
