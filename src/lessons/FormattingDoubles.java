package lessons;

public class FormattingDoubles {

	public static void main(String[] args) {

		double myDouble = 13.45764567;
		
		// round to nearest thousandths

		// STEP 1 - multiply by 1000
		myDouble = myDouble * 1000;
		
		// STEP 2 - round to nearest ones using Math.round()
		myDouble = Math.round(myDouble);
		
		// STEP 3 - move decimal back to original position, divide by 1000
		myDouble = myDouble / 1000;
		
		// Format double to be displayed with 2 decimal places
		String formattedDouble = String.format("%.2f", myDouble);
		
		// Print formatted String
		System.out.println(formattedDouble);
	}

}
