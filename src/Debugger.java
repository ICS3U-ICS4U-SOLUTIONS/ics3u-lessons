
public class Debugger {

	public static void main(String[] args) {
		
		// variables
		int foo = 13;
		int bar = 14;
		int answer = 0;
		
		for(int i=0; i<3; i++)  {
			
			System.out.println(i);
		}
		
		answer = addTwoNumbers(foo, bar);
		System.out.println(answer);
	}
	
	public static int addTwoNumbers(int x, int y)  {
		
		return x + y;
	}
	

}
