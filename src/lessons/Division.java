package lessons;

public class Division {

	public static void main(String[] args) {

		// variables
		int myInteger1 = 13;
		int myInteger2 = 7;
		int answer1 = 0;
		double myDouble1 = 13.0;
		double myDouble2 = 7.0;
		double answer2 = 0.0;
		
		// dividing integer by integer will result in integer answer
		answer1 = 13 / 7;
		answer2 = 13 / 7;
		System.out.println(answer1);
		System.out.println(answer2);
		
		// double divided by double will result in double answer
		answer2 = myDouble1 / myDouble2;
		System.out.println(answer2);
		
		// if there is a mix of double and integer in a division operation,
		// the answer will be a double
		answer2 = myInteger1 / myDouble2;
		System.out.println(answer2);
		

	}

}
