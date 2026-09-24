package lessons;

import javax.swing.JOptionPane;  // for dialog window
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AddCalculatorGUI {

	private JFrame frame;
	private JTextField firstNumber;
	private JTextField secondNumber;
	private JTextField sum;

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
		
		firstNumber = new JTextField();
		firstNumber.setBounds(164, 63, 86, 20);
		frame.getContentPane().add(firstNumber);
		firstNumber.setColumns(10);
		
		secondNumber = new JTextField();
		secondNumber.setBounds(164, 94, 86, 20);
		frame.getContentPane().add(secondNumber);
		secondNumber.setColumns(10);
		
		sum = new JTextField();
		sum.setBounds(164, 125, 86, 20);
		frame.getContentPane().add(sum);
		sum.setColumns(10);
		
		JButton addButton = new JButton("Add");
		addButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// add button code starts here
				
				// variables
				int x = 0;
				int y = 0;
				int answer = 0;
				
				try  {
					
					x = Integer.parseInt(firstNumber.getText());
					y = Integer.parseInt(secondNumber.getText());
				}
				
				catch (Exception e2)  {
					
					JOptionPane.showMessageDialog(null, "Invalid entry.");
				}

				answer = x + y;
				
				sum.setText(Integer.toString(answer));
				
				// add button code ends here
			}
		});
		addButton.setBounds(164, 196, 89, 23);
		frame.getContentPane().add(addButton);
		
		JLabel lblNewLabel = new JLabel("Add Calculator");
		lblNewLabel.setBounds(177, 21, 114, 20);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("First Number");
		lblNewLabel_1.setBounds(44, 66, 71, 17);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Second Number");
		lblNewLabel_2.setBounds(44, 97, 86, 17);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Sum");
		lblNewLabel_3.setBounds(44, 128, 71, 17);
		frame.getContentPane().add(lblNewLabel_3);
		
		JButton exitButton = new JButton("Exit");
		exitButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// exit button code starts here
				
				System.exit(0);
				// exit button code ends here
			}
		});
		exitButton.setBounds(161, 230, 89, 23);
		frame.getContentPane().add(exitButton);
	}
}
