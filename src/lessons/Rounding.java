package lessons;

public class Rounding {

	public static void main(String[] args) {
		
		double price = 13.579;
		System.out.println("$" + price);
		
		// STEP 1 - move decimal past the penny
		price = price * 100;
		System.out.println("$" + price);
		
		// STEP 2 - use Java method to round to nearest int
		price = Math.round(price);
		System.out.println("$" + price);
		
		// STEP 1 - move decimal back
		price = price / 100;
		System.out.println("$" + price);
		

	}

}
