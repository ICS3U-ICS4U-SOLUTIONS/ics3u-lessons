package lessons;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Counter {

	// variables
	int counter = 0;
	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Counter window = new Counter();
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
	public Counter() {
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
		
		JLabel lblNewLabel = new JLabel("Counter");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(176, 44, 83, 22);
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(238, 130, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton button1 = new JButton("Increment");
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// button code starts here
				
				counter++;    // SAME AS: 	counter = counter + 1;
				textField.setText(Integer.toString(counter));
				
				// button code ends here
			}
		});
		button1.setBounds(90, 115, 89, 23);
		frame.getContentPane().add(button1);
		
		JButton button2 = new JButton("Decrement");
		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// button code starts here
				
				counter--;   //  	SAME AS:  counter = counter - 1;
				textField.setText(Integer.toString(counter));
				
				// button code ends here
			}
		});
		button2.setBounds(90, 149, 89, 23);
		frame.getContentPane().add(button2);
	}
}
