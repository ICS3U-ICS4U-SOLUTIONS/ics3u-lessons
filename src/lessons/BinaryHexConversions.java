package lessons;

public class BinaryHexConversions {

	public static void main(String[] args) {

		// int to binary-String
		String myBinary = Integer.toBinaryString(123);
		System.out.println(myBinary);
		
		// binary-String to int
		int myInteger = Integer.parseInt("01111011", 2);
		System.out.println(myInteger);
		
		// int to hex-String
		String myHex = Integer.toHexString(123);
		System.out.println(myHex);
		
		// hex-String to int
		int myInteger2 = Integer.parseInt("007B", 16);
		System.out.println(myInteger2);

	}

}
