package lessons;
import methods.MyMethods;

public class UsingMethodsFromClass {

	public static void main(String[] args) {

		double money = 13.679842;

		money = MyMethods.roundMoney(money);

		System.out.println(money);
	}

}
