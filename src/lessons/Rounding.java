package lessons;

public class Rounding {

	public static void main(String[] args) {

		// rounding doubles involves a few steps
		
		double cost = 16.748434;

		// to round to nearest penny, first 
		// move the decimal over 2 places right
		cost = cost * 100;
		
		// use Math.round() command to round to 
		// nearest ones
		cost = Math.round(cost);
		
		// move decimal back to original position
		cost = cost / 100;
		
		System.out.println(cost);
		
		// printing numbers
		String answer = "";
		answer = answer + "$";
		answer = answer + cost;
		
		System.out.println(answer);
		
		
		

	}

}
