package lessons;

public class Arrays {

	public static void main(String[] args) {

		// Java arrays are hold multiple ELEMENTS of any TYPE
		// Single identifier (variable name) with indexes.
		// INDEXES begin at 0, end at length - 1.
		// Arrays are not dynamic, fixed in size.

		// creating arrays
		int[] myIntArray = new int[3];
		double[] myDoubleArray = new double[5];
		boolean[] myBooleanArray = new boolean[7];
		char[] myCharArray = new char[11];
		String[] myStringArray = new String[13];
		
		// assigning values to arrays
		int[] exampleArray = new int[3];
		exampleArray[0] = 13;
		exampleArray[1] = 7;
		exampleArray[2] = 67;
		
		// accessing array elements
		System.out.println(exampleArray[0]);
		System.out.println(exampleArray[1]);
		System.out.println(exampleArray[2]);
		
		// Exceeding size of array will generate
		// Java Exception Error:
		// System.out.println(exampleArray[3]);
	
		// Initialize array with values upon creation
		int[] myInitializedArray = {13, 7, 67, 76, 21};
		
		// Determine the length of an array
		System.out.println(myInitializedArray.length);
		
		// Iterate entire array using for-loop and .length
		for(int i=0; i<myInitializedArray.length; i++)  {
			
			System.out.println(myInitializedArray[i]);
		}
		
	}

}
