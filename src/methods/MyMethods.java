package methods;

public class MyMethods {

	// DESCRIPTION - Rounds double parameter to nearest hundredth.
	// PARAMETERS - double a
	// RETURN TYPE - double
	public static double roundMoney(double a)  {
		
		a = a * 100;
		a = Math.round(a);
		a = a / 100;
		
		return a;
	}

}
