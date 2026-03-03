package lessons;

public class RandomNumbers {

	public static void main(String[] args) {

		// generates a double between 0.0 and < 1.0
		System.out.println(Math.random());

		// to generate a random number, multiply by n
		// this generates a double >=0 and < n
		int n = 2;
		
		// casting the product will generate an integer >= 0 and < n-1
		// must put brackets around (Math.random() * n) to force multiplication
		// before casting, else it will follow BEDMAS
		System.out.println((int)(Math.random() * n));
		
		// to generate a random number between 0-n, inclusive
		System.out.println((int)(Math.random() * (n+1)));
		
		// to generate number from 1-n, inclusive
		System.out.println((int)(Math.random() * n) + 1);

	}

}
