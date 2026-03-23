package lessons;

public class ForLoops {

	public static void main(String[] args) {

		// NOTE -  i++  is shortcut for  i = i+1
		// NOTE -  i+=2 is shortcut for  i = i+2
		
		// for-loops are used when you know how many 
		// times to repeat a set of instructions
		for(int i=0; i<3; i++) {
			
			System.out.println(i);
		}
		
		// TASK 1 - create a loop to count by 2's up to 10
		for(int i=2; i<11; i=i+2)  {
			
			System.out.println(i);
		}
		
		// TASK 2 - create a loop to count backwards from
		// 10 to 1
		for(int i=10; i>0; i--)  {
			
			System.out.println(i);
		}
		
		// TASK 3 - Create a nested for-loop to display:
		/*
		 *	Loop Number: 1
		 *	3
		 *	2
		 *	1 
		 *  Loop Number: 2
		 *	3
		 *	2
		 *	1 
		 *  Loop Number: 3
		 *	3
		 *	2
		 *	1 
		 */
		for(int i=0; i<3; i++)  {
			
			System.out.println("Loop Number: " + (i+1));
			
			for(int j=3; j>0; j--)  {
				
				System.out.println(j);
			}
		}
		
	}

}
