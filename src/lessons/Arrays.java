package lessons;

public class Arrays {

	public static void main(String[] args) {
		
		// Arrays hold multiple elements of the SAME TYPE.
		// INDEXES begin at 0 and end at length - 1
		// Arrays are fixed in size, they can not change in length after creation.
		
		// create int array size 3
		int[] myShelf = new int[3];
		
		// put elements in array
		myShelf[0] = 13;
		myShelf[1] = 7;
		myShelf[2] = 19;
		
		// determine size of array
		System.out.println(myShelf.length);
		
		// access individual elements in array
		System.out.println(myShelf[2]);
		
		// loop through array, use .length to avoid
		// "index out of bounds error"
		for(int i=0; i<myShelf.length; i++)  {
			
			System.out.println(myShelf[i]);
		}
		
		// pre-populate array upon creation
		double[] myDoubleList = {2.3, 5.3, 7.4, 8.9};
	
		
	}

}
