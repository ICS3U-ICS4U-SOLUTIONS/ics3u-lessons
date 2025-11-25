package lessons;
import methods.MyMethods;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;

import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FactorialGUI {

	private JFrame frame;
	private JTextField textField1;
	private JTextField textField2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FactorialGUI window = new FactorialGUI();
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
	public FactorialGUI() {
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
		
		JButton btnNewButton = new JButton("Factorial");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int answer = 0;
				int argument = 0;
				
				try {
				
					argument = Integer.parseInt(textField1.getText());
				}
				
				catch (Exception e1)  {
					
					textField2.setText(Integer.toString(-1));
					
				}
				answer = MyMethods.factorial(argument);
				
				textField2.setText(Integer.toString(answer));
				
			}
		});
		btnNewButton.setBounds(167, 181, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		textField1 = new JTextField();
		textField1.setBounds(63, 117, 86, 20);
		frame.getContentPane().add(textField1);
		textField1.setColumns(10);
		
		textField2 = new JTextField();
		textField2.setBounds(279, 117, 86, 20);
		frame.getContentPane().add(textField2);
		textField2.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Enter integer");
		lblNewLabel.setBounds(71, 89, 95, 20);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Answer");
		lblNewLabel_1.setBounds(293, 92, 58, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Factorial");
		lblNewLabel_2.setBounds(183, 31, 151, 23);
		frame.getContentPane().add(lblNewLabel_2);
	}
}
