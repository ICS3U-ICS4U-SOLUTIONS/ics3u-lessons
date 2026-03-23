package lessons;

public class WhileLoops {

	public static void main(String[] args) {

		// while-loops are used typically when you don't
		// know how many times to repeat a block of code

		int counter = 0;
		
		// check condition, if true, execute block
		// if false, exit while loop, continue with program
		while(counter < 3)  {
			
			// task(s) to perform
			System.out.println("Hello World!");
			
			counter++;
		}
		
		System.out.println("Continuing with program ...");
		
	}

}
