package lessons;

public class WhileLoops {

	public static void main(String[] args) {

		// While Loops are used when we don't know how many
		// times to repeat a block of code.  While loop conditions
		// must be eventually satisfied or else you will get an
		// infinite loop.
		
		int counter = 0;
		
		while( counter < 3 )  {
			
			System.out.println("Hello World!");
			counter++;
			
		}
		

	}

}
