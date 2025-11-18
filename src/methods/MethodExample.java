package methods;

public class MethodExample {

	public static void main(String[] args) {

		String myString = "fubar";
		char myChar;
		
		//myChar = myString.charAt(3);
		
		myChar = gimmeGimmeCharAt("fubar", 3);
		
		System.out.println(myChar);
	}
	
	public static char gimmeGimmeCharAt(String s, int n)  {
		
		return s.charAt(n);
	}
	
	
	

}
