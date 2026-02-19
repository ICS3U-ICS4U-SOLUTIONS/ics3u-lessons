package lessons;

import javax.swing.JOptionPane;		// import for error dialog
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TryCatchGUI {

	// variables
	private JFrame frame;
	private JTextField textField;
	int myInteger = 0;				// variable will be visible throughout program
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TryCatchGUI window = new TryCatchGUI();
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
	public TryCatchGUI() {
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
		
		textField = new JTextField();
		textField.setBounds(151, 99, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Enter int");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				// button code start
				try {
					myInteger = Integer.parseInt(textField.getText());
				}
				
				catch(Exception e2)  {
					
					JOptionPane.showMessageDialog(null, "Invalid.");
				}
				
				// button code end
			}
		});
		btnNewButton.setBounds(151, 154, 89, 23);
		frame.getContentPane().add(btnNewButton);
	}
}
