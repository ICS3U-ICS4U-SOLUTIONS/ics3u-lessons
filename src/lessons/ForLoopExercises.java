package lessons;

public class ForLoopExercises {

	public static void main(String[] args) {

		// create a for loop to count in 2's up to 10
		for (int i=2; i<=10; i+=2)  {
			
		//	System.out.println(i);
		}
		
		// create a for loop to count backwards from 10 to 1
		for (int i=10; i>=1; i--)  {
			
		//	System.out.println(i);
		}
		
		// create the following output using for loops:
		/*
		  Loop Number: 1
		  3
		  2
		  1
		  Loop Number 2:
		  3
		  2
		  1
		  Loop Number 3:
		  3
		  2
		  1
		*/
		
		// Solution:
		for(int i=0; i<3; i++)  {
			
			System.out.println("Loop Number: " + (i+1));
			
			for(int j=3; j>=1; j--)  {
				
				System.out.println(j);
			}
			
		}
		
	}

}
