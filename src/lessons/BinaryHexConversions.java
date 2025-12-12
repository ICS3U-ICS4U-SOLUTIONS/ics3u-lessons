package lessons;

public class BinaryHexConversions {

	public static void main(String[] args) {
		
		// int to binary-String
		int myInteger1 = 13;
		String myBinary1 = Integer.toBinaryString(myInteger1);
		System.out.println(myBinary1);
		
		// binary-String to int
		String myBinary2= "10101010";
		int baseTwo = 2;
		int myInteger2 = Integer.parseInt(myBinary2, baseTwo);
		System.out.println(myInteger2);
		
		// int to hexadecimal-String
		int myInteger3 = 59;
		String myHexadecimal1 = Integer.toHexString(myInteger3);
		System.out.println(myHexadecimal1);
		
		// hexadecimal-String to int
		String myHexadecimal2 = "14AA";
		int baseSixteen = 16;
		int myInteger4 = Integer.parseInt(myHexadecimal2, baseSixteen);
		System.out.println(myInteger4);
		
		
		

	}

}
