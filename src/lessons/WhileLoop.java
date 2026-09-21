package lessons;

public class WhileLoop {

	public static void main(String[] args) {

		// While loops will execute block of code if condition is true.
		// After block of code is executed, while loop will check the condition
		// again.  Condition must eventually change or you will have an infinite
		// loop!
		
		// variables
		int myInteger = 13;
		
		while (myInteger > 1)  {
			
			System.out.println("Number greater than 1.");
			myInteger = myInteger - 1;
		}
		

	}

}
