package lessons;

public class Arrays {

	public static void main(String[] args) {
		
		/*
		   	Java arrays are hold multiple ELEMENTS of any TYPE
			Single identifier (variable name) with indexes.
			INDEXES begin at 0, end at length - 1.
			Arrays are not dynamic, fixed in size.
		*/

		// examples
		int[] myArray = new int[3];
		double[] myDoubleArray = new double[5];
		boolean[] myBooleanArray = new boolean[7];
		char[] myCharArray = new char[11];
		String[] myStringArray = new String[13];
		
		// adding elements to array
		myArray[0] = 34;
		myArray[1] = 16;
		myArray[2] = 55;
		
		// accessing elements in array
		System.out.println(myArray[0]);
		System.out.println(myArray[1]);
		System.out.println(myArray[2]);
		
		int sum = myArray[0] + myArray[1] + myArray[2];
		System.out.println(sum);
		
		// out of bounds index error
		//System.out.println(myArray[3]);
		
		// determining length or size of array
		System.out.println(myArray.length);
		
		// creating an array with values upon creation (size will be fixed)
		int[] myInitializedArray = {13, 66, 324, 6, 324, 65, 388, 66};
		
		// print all elements in array using for loop
		for(int i=0; i<myInitializedArray.length; i++)  {
			
			System.out.println(myInitializedArray[i]);
		}
		
		
		
		
	}

}
