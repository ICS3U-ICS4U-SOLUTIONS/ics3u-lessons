package lessons;

public class Encryption {

	public static void main(String[] args) {

		int shift = 3;
		char myChar = 'a';
		
		// cast to int
		int ascii = (int)myChar;
		
		// add shift
		ascii = ascii + shift;
		
		// cast to char
		myChar = (char)ascii;
		
		System.out.println(myChar);
	}

}
