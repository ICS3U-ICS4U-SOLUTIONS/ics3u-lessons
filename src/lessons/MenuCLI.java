package lessons;
import java.util.Scanner;

public class MenuCLI {

	public static void main(String[] args) {

		// variables
		Scanner sc = new Scanner(System.in);
		int userChoice = 0;
		final int DEPOSIT_CHOICE = 1;
		final int WITHDRAW_CHOICE = 2;
		final int BALANCE_CHOICE = 3;
		final int EXIT_CHOICE = 4;
	
		while ( userChoice != EXIT_CHOICE )  {
			
			// print out menu
			System.out.println("Welcome to the Bank.");
			System.out.println("Menu: ");
			System.out.println("1. Deposit");
			System.out.println("2. Withdraw");
			System.out.println("3. Balance");
			System.out.println("4. Exit");
			System.out.println("Enter Selection: ");
			userChoice = sc.nextInt();
			
			if (userChoice == DEPOSIT_CHOICE)  {

				System.out.println("Please put your money in the slot.");
			}
			
			else if (userChoice == WITHDRAW_CHOICE)  {

				System.out.println("Please enter amount to withdraw.");
			}
			
			else if (userChoice == BALANCE_CHOICE)  {

				System.out.println("Your balance is ...");
			}
			
		}
		
		System.out.println("Please take your card.");
	}

}
