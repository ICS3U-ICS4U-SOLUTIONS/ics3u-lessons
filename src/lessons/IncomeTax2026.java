package lessons;

import java.util.Scanner;

public class IncomeTax2026 {
	
	public static void main(String[] args)  {
		
		// variables
		double salary = 0;
		double provTax = 0;
		double fedTax = 0;
		double totalTax = 0;
		Scanner sc = new Scanner(System.in);
		
		// 2026 Ontario Income Tax Rates
		final double PROV_TAX_RATE_1 = 0.0505;
		final double PROV_TAX_RATE_2 = 0.0915;
		final double PROV_TAX_RATE_3 = 0.1116;
		final double PROV_TAX_RATE_4 = 0.1216;
		final double PROV_TAX_RATE_5 = 0.1316;
		
		// 2026 Federal Income Tax Rates
		final double FED_TAX_RATE_1 = 0.14;
		final double FED_TAX_RATE_2 = 0.205;
		final double FED_TAX_RATE_3 = 0.26;
		final double FED_TAX_RATE_4 = 0.29;
		final double FED_TAX_RATE_5 = 0.33;
		
		// 2026 Ontario Income Tax Brackets
		final double PROV_BRACKET_1_UPPER_LIMIT = 53891;
		final double PROV_BRACKET_2_LOWER_LIMIT = PROV_BRACKET_1_UPPER_LIMIT;
		final double PROV_BRACKET_2_UPPER_LIMIT = 107785;
		final double PROV_BRACKET_3_LOWER_LIMIT = PROV_BRACKET_2_UPPER_LIMIT;
		final double PROV_BRACKET_3_UPPER_LIMIT = 150000;
		final double PROV_BRACKET_4_LOWER_LIMIT = PROV_BRACKET_3_UPPER_LIMIT;
		final double PROV_BRACKET_4_UPPER_LIMIT = 220000;
		final double PROV_BRACKET_5_LOWER_LIMIT = PROV_BRACKET_4_UPPER_LIMIT;
	
		// 2026 Federal Income Tax Brackets
		final double FED_BRACKET_1_UPPER_LIMIT = 58523;
		final double FED_BRACKET_2_LOWER_LIMIT = FED_BRACKET_1_UPPER_LIMIT;
		final double FED_BRACKET_2_UPPER_LIMIT = 117045;
		final double FED_BRACKET_3_LOWER_LIMIT = FED_BRACKET_2_UPPER_LIMIT;
		final double FED_BRACKET_3_UPPER_LIMIT = 181440;
		final double FED_BRACKET_4_LOWER_LIMIT = FED_BRACKET_3_UPPER_LIMIT;
		final double FED_BRACKET_4_UPPER_LIMIT = 258482;
		final double FED_BRACKET_5_LOWER_LIMIT = FED_BRACKET_4_UPPER_LIMIT;
		
		// get user salary
		System.out.println("2026 Income Tax Calculator. ");
		System.out.println("Enter gross annual salary: ");
		salary = sc.nextDouble();
		
		// Ontario Tax Bracket 5
		if (salary > PROV_BRACKET_5_LOWER_LIMIT)  {
			
			provTax = (salary - PROV_BRACKET_5_LOWER_LIMIT) * PROV_TAX_RATE_5
					+ (PROV_BRACKET_4_UPPER_LIMIT - PROV_BRACKET_4_LOWER_LIMIT) * PROV_TAX_RATE_4
					+ (PROV_BRACKET_3_UPPER_LIMIT - PROV_BRACKET_3_LOWER_LIMIT) * PROV_TAX_RATE_3
					+ (PROV_BRACKET_2_UPPER_LIMIT - PROV_BRACKET_2_LOWER_LIMIT) * PROV_TAX_RATE_2
					+ PROV_BRACKET_1_UPPER_LIMIT * PROV_TAX_RATE_1;
		}
		
		// Ontario Tax Bracket 4
		else if (salary > PROV_BRACKET_4_LOWER_LIMIT)  {
			
			provTax = (salary - PROV_BRACKET_4_LOWER_LIMIT) * PROV_TAX_RATE_4
					+ (PROV_BRACKET_3_UPPER_LIMIT - PROV_BRACKET_3_LOWER_LIMIT) * PROV_TAX_RATE_3
					+ (PROV_BRACKET_2_UPPER_LIMIT - PROV_BRACKET_2_LOWER_LIMIT) * PROV_TAX_RATE_2
					+ PROV_BRACKET_1_UPPER_LIMIT * PROV_TAX_RATE_1;
		}
		
		// Ontario Tax Bracket 3
		else if (salary > PROV_BRACKET_3_LOWER_LIMIT)  {
			
			provTax = (salary - PROV_BRACKET_3_LOWER_LIMIT) * PROV_TAX_RATE_3
					+ (PROV_BRACKET_2_UPPER_LIMIT - PROV_BRACKET_2_LOWER_LIMIT) * PROV_TAX_RATE_2
					+ PROV_BRACKET_1_UPPER_LIMIT * PROV_TAX_RATE_1;
		}
		
		// Ontario Tax Bracket 2
		else if (salary > PROV_BRACKET_2_LOWER_LIMIT)  {
			
			provTax = (salary - PROV_BRACKET_2_LOWER_LIMIT) * PROV_TAX_RATE_2
					+ PROV_BRACKET_1_UPPER_LIMIT * PROV_TAX_RATE_1;
		}
		
		// Ontario Tax Bracket 1
		else  {  
			
			provTax = salary * PROV_TAX_RATE_1;
		}
		
		// Federal Tax Bracket 5
		if (salary > FED_BRACKET_5_LOWER_LIMIT)  {
		
			fedTax = (salary - FED_BRACKET_5_LOWER_LIMIT) * FED_TAX_RATE_5
					+ (FED_BRACKET_4_UPPER_LIMIT - FED_BRACKET_4_LOWER_LIMIT) * FED_TAX_RATE_4
					+ (FED_BRACKET_3_UPPER_LIMIT - FED_BRACKET_3_LOWER_LIMIT) * FED_TAX_RATE_3
					+ (FED_BRACKET_2_UPPER_LIMIT - FED_BRACKET_2_LOWER_LIMIT) * FED_TAX_RATE_2
					+ FED_BRACKET_1_UPPER_LIMIT * FED_TAX_RATE_1;
		}
		
		// Federal Tax Bracket 4
		else if (salary > FED_BRACKET_4_LOWER_LIMIT)  {
			
			fedTax = (salary - FED_BRACKET_4_LOWER_LIMIT) * FED_TAX_RATE_4
					+ (FED_BRACKET_3_UPPER_LIMIT - FED_BRACKET_3_LOWER_LIMIT) * FED_TAX_RATE_3
					+ (FED_BRACKET_2_UPPER_LIMIT - FED_BRACKET_2_LOWER_LIMIT) * FED_TAX_RATE_2
					+ FED_BRACKET_1_UPPER_LIMIT * FED_TAX_RATE_1;
		}
		
		// Federal Tax Bracket 3
		else if (salary > FED_BRACKET_3_LOWER_LIMIT)  {
			
			fedTax = (salary - FED_BRACKET_3_LOWER_LIMIT) * FED_TAX_RATE_3
					+ (FED_BRACKET_2_UPPER_LIMIT - FED_BRACKET_2_LOWER_LIMIT) * FED_TAX_RATE_2
					+ FED_BRACKET_1_UPPER_LIMIT * FED_TAX_RATE_1;
		}
		
		// Federal Tax Bracket 2
		else if (salary > FED_BRACKET_2_LOWER_LIMIT)  {
			
			fedTax = (salary - FED_BRACKET_2_LOWER_LIMIT) * FED_TAX_RATE_2
					+ FED_BRACKET_1_UPPER_LIMIT * FED_TAX_RATE_1;
		}
		
		// Federal Tax Bracket 1
		else  {  
			
			fedTax = salary * FED_TAX_RATE_1;
		}
		
		// Total Income Tax
		totalTax = provTax + fedTax;
		
		// Output
		System.out.println("Ontario Provincial Tax: $" + provTax);
		System.out.println("Federal Tax: $" + fedTax);
		System.out.println("Total Tax: $" + totalTax);
	}	
	
}