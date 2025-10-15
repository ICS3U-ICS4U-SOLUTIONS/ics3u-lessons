package lessons;

public class DoWhileLoop {

	public static void main(String[] args) {

		// do-while loops are exactly like while-loops,
		// except the block of code is executed 
		// AT LEAST ONCE
		
		int counter = 0;
		final int REPEATS = 3;
		
		do  {
			
			System.out.println("Hello World!");
			counter++;
			
		}  while (counter < REPEATS);

	}

}
