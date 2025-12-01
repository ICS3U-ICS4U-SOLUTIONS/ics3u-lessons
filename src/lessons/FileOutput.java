package lessons;
import java.io.*;	// libary for File Input/Output

public class FileOutput {

	public static void main(String[] args) {

		// Arrays from "ParallelArrays.java"
		String[] names = {"Tanner", "Pyna", "Abid", "Jeremy", "Yuyen"};
		int[] debt = {50, 22, 16, 100, 13};
		String[] loanReason = {"lunch", "soccer bet", "borrowed", "sold shoes", "dinner"};

		try  {
			
			// open new file to write data to
			FileOutputStream fout = new FileOutputStream("C:/Users/e28166/Desktop/debtList.txt");
			
			// load file into memory
			BufferedOutputStream bout = new BufferedOutputStream(fout);
		
			// create file writer
			// 8859_1 encoding style is default character set used for HTML 4.0
			OutputStreamWriter out = new OutputStreamWriter(bout, "8859_1");
			
			// write to file
			for(int i=0; i<names.length; i++)  {
	
				out.write(names[i] + "\n" + debt[i] + "\n" + loanReason[i] + "\n");
			}
		
			// force data to be pushed, even if program crashes
			out.flush();
			
			// close OutputStreamWriter
			out.close();
			
		}
		
		
		catch (Exception e)  {
			
			System.out.println(e.getMessage());
		}
		
	}

}
