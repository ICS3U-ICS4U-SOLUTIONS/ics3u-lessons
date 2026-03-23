package lessons;

public class DoWhileLoops {

	public static void main(String[] args) {

		// do-while loops are the same as while loops, except
		// the block of code is guaranteed to be executed at least
		// once.  The conditional check is performed after the 
		// block of code has been executed.

		int counter = 0;
		
		do  {
			
			System.out.println("Hello World!");
			counter++;
			
		}  while (counter < 3);

	}

}
