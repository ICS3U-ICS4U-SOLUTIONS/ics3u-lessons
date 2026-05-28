package lessons;

public class Encryption {

	public static void main(String[] args) {
		
		int shift = 3;
		
		// cast to int
		int ascii = (int)'a';
		System.out.println(ascii);

		ascii = ascii + shift;
		System.out.println((char)ascii);
		
		
	}

}
