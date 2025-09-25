package lessons;

public class RandomNumbers {

	public static void main(String[] args) {

		// Math.random() is a method which generates a double
		// between (and including) 0.0 and less than 1.0
		System.out.println(Math.random());
		
		// To generate a random number, multiply by n.
		// This will generate a double >= 0 and < n.
		int n = 2;
		System.out.println(Math.random() * n);
		
		// To generate a whole number, cast double to int
		int n2 = 2;
		System.out.println( (int) (Math.random() * n2) );
		
		// Adding 1 to n, will increase upper range by 1, but does
		// not change lower end of 0.
		int n3 = 2;
		System.out.println( (int) (Math.random() * (n3+1) ) );

		// Adding 1 after generating random number AND before casting,
		// will generate random number between 1 and n
		int n4 = 2;
		System.out.println( (int) (Math.random() * n4) + 1);
		
	}

}
