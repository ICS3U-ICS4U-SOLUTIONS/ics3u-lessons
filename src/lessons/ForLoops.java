package lessons;

public class ForLoops {

	public static void main(String[] args) {

		// variables
		int numRepeats = 3;
		
		// For Loop is used when we know how many times
		// we want to repeat a task
		for(int i=0; i<numRepeats; i++)  {
			// task
			System.out.println(i+1 + " Hello World!");	
			
			// nested loop
			for(int j=0; j<2; j++)  {
				
				System.out.println(j+1 + " fubar");
			}
			
		}

	}

}
