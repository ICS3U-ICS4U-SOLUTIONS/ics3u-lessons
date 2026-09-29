package lessons;

import javax.swing.ImageIcon;	// import library for images
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AddingImages {

	// variables
	ImageIcon myPicture = new ImageIcon(getClass().getResource("/resources/dog.jpg"));
	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddingImages window = new AddingImages();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public AddingImages() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel myLabel = new JLabel("New label");
		myLabel.setBounds(121, 41, 195, 163);
		// display picture on label
		myLabel.setIcon(myPicture);
		frame.getContentPane().add(myLabel);
	}
}
