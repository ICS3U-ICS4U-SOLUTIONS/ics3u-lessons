package lessons;

public class Arrays {

	public static void main(String[] args) {
		
		// Arrays hold multiple elements of the same type
		// INDEXES begin at 0 and end at length - 1
		// Arrays are fixed in size, they can not change
		//	in length after creation.
		
		// examples
		int[] myList = new int[3];
		
		// assigning values to array
		myList[0] = 13;
		myList[1] = 7;
		myList[2] = 42;
		
		// accessing array elements
		System.out.println(myList[3]);
		
		// determining length of array
		System.out.println(myList.length);
		
		// loop through array
		for(int i=0; i<myList.length; i++)  {
			
			System.out.println(myList[i]);
		}
		
		// creating array with values
		int[] myList2 = {2, 4, 7, 2, 8};
		
		// creating arrays with different types
		String[] myList3 = new String[5];
		double[] myList4 = new double[6];
		boolean[] myList5 = new boolean[3];
		
		
		
		
		
		
		
		
		
	}

}
