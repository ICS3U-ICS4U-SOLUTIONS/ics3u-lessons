package lessons;

public class ParallelArrays {

	public static void main(String[] args) {

		// variables
		String[] names = {"Tanner", "Pyna", "Abid", "Jeremy", "Yuyen"};
		int[] debt = {50, 22, 16, 100, 13};
		String[] loanReason = {"lunch", "soccer bet", "borrowed", "sold shoes", "dinner"};
		
		// Let's print Jeremey's information
		//System.out.println(names[3] + " owes me $" + debt[3] + " because (of) " + loanReason[3]);
		
		// loop through all arrays
		for (int i=0; i<names.length; i++)  {
			
			System.out.println(names[i] + " owes me $" + debt[i] + " because (of) " + loanReason[i]);
			
		}
		

	}

}
