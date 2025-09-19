package lessons;


// need to import library for pictures
import javax.swing.ImageIcon;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AddingImages {

	// variables
	private JFrame frame;
	ImageIcon myPicture = new ImageIcon(getClass().getResource("/resources/dog.jpg"));
	
	
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
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(109, 31, 213, 170);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Click Me!");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// button code begins here
				
				lblNewLabel.setIcon(myPicture);
				
				// button code ends here
			}
		});
		btnNewButton.setBounds(173, 212, 89, 23);
		frame.getContentPane().add(btnNewButton);
	}
}
