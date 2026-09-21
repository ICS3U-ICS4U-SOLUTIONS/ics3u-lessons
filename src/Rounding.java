
public class Rounding {

	public static void main(String[] args) {

		// Math.round() rounds double to nearest int
		// and returns double.
		
		double myDouble = 13.3245;
		System.out.println(Math.round(myDouble));

		// How to round to specific decimal place example.
		double price = 19.873;
		price = Math.round(price);
		System.out.println("$" + price);
		
		
	}

}
