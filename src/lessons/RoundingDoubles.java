package lessons;

public class RoundingDoubles {

	public static void main(String[] args) {

		// we want to round to nearest cent
		double myPrice = 13.579;
		
		// multiply by 100 to move decimal to the right of where we want to round to
		myPrice = myPrice * 100;
		
		// round to nearest one's
		myPrice = Math.round(myPrice);
		
		// move decimal back to original location
		myPrice = myPrice / 100;
		
		System.out.println("$" + myPrice);
	}

}
