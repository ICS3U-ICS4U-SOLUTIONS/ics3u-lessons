package lessons;

public class RandomNumbers {

	public static void main(String[] args) {

		// variables
		int n = 6;
		
		// Math.random generates double >=0 and < 1
//		System.out.println(Math.random());
		
		// this will generate double >=0 and < n
//		System.out.println(Math.random() * n);
		
		// cast to int to generate int >= 0 and < n
//		System.out.println((int)(Math.random() * n));

		// add 1 to the above to generate int > 0 and <= n
//		System.out.println((int)(Math.random() * n) + 1);
	
		// Add 1 to n to generate int >=0 and <= n
//		System.out.println((int)(Math.random() * (n+1)));
	}

}
