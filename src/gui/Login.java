package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTable;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login {

	private JFrame frame;
	private final JLabel label = new JLabel("\u7528\u6237\u540D");
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
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
	public Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 300, 280);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		label.setBounds(31, 39, 56, 40);
		frame.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("\u5BC6\u7801");
		label_1.setBounds(31, 103, 56, 40);
		frame.getContentPane().add(label_1);
		
		textField = new JTextField();
		textField.setBounds(97, 49, 141, 21);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(97, 113, 141, 21);
		frame.getContentPane().add(textField_1);
		
		JButton button = new JButton("\u5546\u5BB6\u767B\u5F55");
		button.setBounds(31, 190, 93, 23);
		frame.getContentPane().add(button);
		
		JButton button_1 = new JButton("\u5BA2\u6237\u767B\u5F55");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		button_1.setBounds(156, 190, 93, 23);
		frame.getContentPane().add(button_1);
		
		JButton btnNewButton = new JButton("\u6CE8\u518C");
		btnNewButton.setBounds(176, 144, 62, 23);
		frame.getContentPane().add(btnNewButton);
	}
}
