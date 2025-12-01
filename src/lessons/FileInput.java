package lessons;
import java.io.*;	// library for File Input/Output

public class FileInput {

	public static void main(String[] args) {

		// 3 parallel (related) arrays
		String[] product = new String[5];
		int[] quantity = new int[5];
		double[] price = new double[5];
		
		try {
			
			// if you don't specify the location of your text file
			// you must put it under  C:\Users\<student number>\git
			//	FileReader file = new FileReader("inventory.txt");
			
			// if it's on your desktop:
			FileReader file = new FileReader("C:/Users/e28166/Desktop/inventory.txt");
			
			// load contents of file into memory
			BufferedReader buffer = new BufferedReader(file);
			
			// load data into arrays
			for(int i=0; i<product.length; i++)  {
				
				product[i] = buffer.readLine();
				quantity[i] = Integer.parseInt(buffer.readLine());
				price[i] = Double.parseDouble(buffer.readLine());
			}
			
			buffer.close();
		}
		
		catch (Exception e)  {
			
			System.out.println("Error reading file or buffer.");
		}
		
		// print all arrays
		for(int i=0; i<product.length; i++)  {
			
			System.out.println("There are " + quantity[i] + " " + product[i] + "(s) at $" + price[i]);
		}

	}

}
