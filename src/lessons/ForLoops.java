package lessons;

public class ForLoops {

	public static void main(String[] args) {


		// scope of i is within first for loop
		for(int i=0; i<3; i++)  {
			
			System.out.print("\nOuter Loop #" + (i+1));
			
			// scope of j is within inner for loop
			for(int j=0; j<3; j++)  {
				
				System.out.print("\nInner Loop #" + (j+1));
			}
		}
	
	}

}
