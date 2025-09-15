package lessons;

public class Casting {

	public static void main(String[] args) {

		// casting means changing one variable type to another
		
		// int to String
		int myInteger1 = 13;
		String myString1 = Integer.toString(myInteger1);
		
		// String to int
		String myString2 = "18";
		int myInteger2 = Integer.parseInt(myString2);
		
		// double to String
		double myDouble3 = 13.3;
		String myString3 = Double.toString(myDouble3);
		
		// String to double
		String myString4 = "6.8";
		double myDouble4 = Double.parseDouble(myString4);
		
		// int to double - no need to cast, it's "auto-promoted"
		// no data lost
		int myInteger5 = 42;
		double myDouble5 = myInteger5;
		
		// double to int - data lost after casting
		double myDouble6 = 15.9;
		int myInteger6 = (int)myDouble6;
		
		// test print
		System.out.println(myInteger6);
		
		
		
		
	}

}
