package lessons;
import java.util.Scanner;

public class CLIMenu {

	public static void main(String[] args) {

		// variables
		Scanner sc = new Scanner(System.in);
		int userChoice = 0;
		final int DEPOSIT_CHOICE = 1;
		final int WITHDRAW_CHOICE = 2;
		final int BALANCE_CHOICE = 3;
		final int EXIT_CHOICE = 4;
		
		while (userChoice != EXIT_CHOICE)  {
			
			// print menu
			System.out.println("\nWelcome to the Bank.");
			System.out.println("Menu");
			System.out.println("1. Deposit");
			System.out.println("2. Withdraw");
			System.out.println("3. Balance");
			System.out.println("4. Exit");
			
			System.out.println("Enter Selection: ");
			userChoice = sc.nextInt();
			
			// deposit selected
			if (userChoice == DEPOSIT_CHOICE)  {
				
				System.out.println("Please deposit bills in slot.");
			}
			
			// withdraw selected
			if (userChoice == WITHDRAW_CHOICE)  {
				
				System.out.println("Enter amount to withdraw ...");
			}
			
			// balance selected
			if (userChoice == BALANCE_CHOICE)  {
				
				System.out.println("Your balance is ...");
			}
			
		}
		
		System.out.println("Please take your card.");
		sc.close();
	}

}
