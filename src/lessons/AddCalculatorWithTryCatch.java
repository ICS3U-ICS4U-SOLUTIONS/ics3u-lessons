package lessons;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;

public class AddCalculatorWithTryCatch {

	private JFrame frame;
	private JTextField textField1;
	private JTextField textField2;
	private JTextField textField3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddCalculatorWithTryCatch window = new AddCalculatorWithTryCatch();
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
	public AddCalculatorWithTryCatch() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 502, 298);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Add Calculator");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setBounds(156, 39, 126, 14);
		frame.getContentPane().add(lblNewLabel);
		
		textField1 = new JTextField();
		textField1.setBounds(174, 92, 86, 20);
		frame.getContentPane().add(textField1);
		textField1.setColumns(10);
		
		textField2 = new JTextField();
		textField2.setBounds(174, 131, 86, 20);
		frame.getContentPane().add(textField2);
		textField2.setColumns(10);
		
		textField3 = new JTextField();
		textField3.setBounds(174, 174, 86, 20);
		frame.getContentPane().add(textField3);
		textField3.setColumns(10);
		
		JButton addButton = new JButton("Add");
		addButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// Add Button code begins here
				
				// variables
				int num1 = 0;
				int num2 = 0;
				int sum = 0;
				
				try {
					
					// get numbers from text fields
					num1 = Integer.parseInt(textField1.getText());
					num2 = Integer.parseInt(textField2.getText());
				}
				
				catch (Exception e2)  {
					
					JOptionPane.showMessageDialog(null, "Invalid entry.");
				}
								
				// processing
				sum = num1 + num2;
				
				// output answer
				textField3.setText(Integer.toString(sum));
						
				// Add Button code ends here
				
			}
		});
		addButton.setBounds(43, 108, 89, 23);
		frame.getContentPane().add(addButton);
		
		JLabel lblNewLabel_1 = new JLabel("First Number");
		lblNewLabel_1.setBounds(299, 95, 81, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Second Number");
		lblNewLabel_2.setBounds(299, 134, 106, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Sum");
		lblNewLabel_3.setBounds(299, 177, 46, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JButton clearButton = new JButton("Clear");
		clearButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// Clear Button code begins here
				
				textField1.setText("");
				textField2.setText("");
				textField3.setText("");
				
				// Clear Button code ends here
				
			}
		});
		clearButton.setBounds(43, 142, 89, 23);
		frame.getContentPane().add(clearButton);
		
		JButton exitButton = new JButton("Exit");
		exitButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// Exit Button code starts here
				
				System.exit(0);
				
				// Exit Button code ends here
			}
		});
		exitButton.setBounds(43, 173, 89, 23);
		frame.getContentPane().add(exitButton);
	}
}
