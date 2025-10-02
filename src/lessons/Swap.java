package lessons;

public class Swap {

	public static void main(String[] args) {

		String cottonCanvas = "Picasso";
		String linenCanvas = "Monet";
		String scrapCanvas = "empty";

		// You can only use assignment operator "=" to assign 
		// a painting to another canvas.  For example,
		// to replicate "Monet" onto cottonCanvas:
		// 
		// cottonCanvas = linenCanvas;

		// ONE SOLUTION:
		scrapCanvas = cottonCanvas;
		cottonCanvas = linenCanvas;
		linenCanvas = scrapCanvas;

		System.out.println(cottonCanvas);
		System.out.println(linenCanvas);

		// Desired Output:
		//
		// Monet
		// Picasso
	}

}
