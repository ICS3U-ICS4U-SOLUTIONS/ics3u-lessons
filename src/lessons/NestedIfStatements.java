package lessons;
import java.util.Scanner;

public class NestedIfStatements {

	public static void main(String[] args) {

		// variables
		Scanner sc = new Scanner(System.in);
		String dietaryPreference = "";
		String meatChoice = "";
		String vegChoice = "";
		
		// Determine if Vegetarian or Meat Eater (no error checking for lesson)
		System.out.println("Do you eat Meat (M) or Vegetables (V)?");
		dietaryPreference = sc.next();
		
		// Meat Eaters
		if (dietaryPreference.equals("M"))  {
			
			System.out.println("You are a meat eater.");
			
			System.out.println("Chicken (C) or Beef (B)?");
			meatChoice = sc.next();
			
			if (meatChoice.equals("C"))  {
				
				System.out.println("Chicken is a healthy choice.");
			}
			
			else  {
				
				System.out.println("Beef is not as healthy as chicken.");
			}
			
		}
		
		// Vegetarians
		else  {
			
			System.out.println("You are a vegetarian.");
			
			System.out.println("Fries (F) or Salad (S)?");
			vegChoice = sc.next();
			
			if (vegChoice.equals("F"))  {
				
				System.out.println("Fries are not a healthy choice.");
			}
			
			else  {
				
				System.out.println("Salad is a good choice.");
			}
		}
		
	}
	


	
	
}
