package lessons;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AddCalculatorGUI {

	private JFrame frame;
	private JTextField textField1;
	private JTextField textField2;
	private JTextField textField3;
	private JButton clearButton;
	private JButton exitButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddCalculatorGUI window = new AddCalculatorGUI();
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
	public AddCalculatorGUI() {
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
		
		JLabel lblNewLabel = new JLabel("Add Calculator");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setBounds(145, 24, 158, 24);
		frame.getContentPane().add(lblNewLabel);
		
		textField1 = new JTextField();
		textField1.setBounds(42, 109, 86, 20);
		frame.getContentPane().add(textField1);
		textField1.setColumns(10);
		
		textField2 = new JTextField();
		textField2.setBounds(181, 109, 86, 20);
		frame.getContentPane().add(textField2);
		textField2.setColumns(10);
		
		textField3 = new JTextField();
		textField3.setBounds(319, 109, 86, 20);
		frame.getContentPane().add(textField3);
		textField3.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("+");
		lblNewLabel_1.setBounds(151, 112, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("=");
		lblNewLabel_2.setBounds(287, 112, 46, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JButton addButton = new JButton("Add");
		addButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// button code start
				
				// variables
				int sum = 0;
				int firstNumber = 0;
				int secondNumber = 0;
				
				// input
				firstNumber = Integer.parseInt(textField1.getText());
				secondNumber = Integer.parseInt(textField2.getText());
				
				// processing
				sum = firstNumber + secondNumber;
				
				// output
				textField3.setText(Integer.toString(sum));
				
				// button code end
			}
		});
		addButton.setBounds(75, 179, 89, 23);
		frame.getContentPane().add(addButton);
		
		clearButton = new JButton("Clear");
		clearButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// clear button start
				
				textField1.setText("");
				textField2.setText("");
				textField3.setText("");
				
				// clear button end
			}
		}); 
		clearButton.setBounds(181, 179, 89, 23);
		frame.getContentPane().add(clearButton);
		
		exitButton = new JButton("Exit");
		exitButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// exit button start
				
				System.exit(0);
				
				// exit button stop
			}
		});
		exitButton.setBounds(287, 179, 89, 23);
		frame.getContentPane().add(exitButton);
	}
}
