package lessons;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class HelloWorldGUI {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HelloWorldGUI window = new HelloWorldGUI();
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
	public HelloWorldGUI() {
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
		
		JButton button1 = new JButton("Click Me!");
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// button code goes here
				textField.setText("Hello World!");
				
			}
		});
		button1.setBounds(32, 111, 89, 23);
		frame.getContentPane().add(button1);
		
		textField = new JTextField();
		textField.setBounds(177, 111, 177, 22);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel myLabel = new JLabel("My Hello World Program");
		myLabel.setFont(new Font("Times New Roman", Font.BOLD, 14));
		myLabel.setBounds(107, 47, 199, 23);
		frame.getContentPane().add(myLabel);
	}
}
