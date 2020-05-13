import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class AdminLogin {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminLogin window = new AdminLogin();
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
	public AdminLogin() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 627, 426);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblAdminLoginForm = new JLabel("Admin Login Form");
		lblAdminLoginForm.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		lblAdminLoginForm.setBounds(205, 23, 193, 41);
		frame.getContentPane().add(lblAdminLoginForm);
		
		JLabel lblEnterName = new JLabel("Enter Name");
		lblEnterName.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblEnterName.setBounds(143, 133, 143, 30);
		frame.getContentPane().add(lblEnterName);
		
		textField = new JTextField();
		textField.setBounds(267, 136, 184, 28);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblEnterPassword = new JLabel("Enter Password");
		lblEnterPassword.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		lblEnterPassword.setBounds(109, 201, 149, 30);
		frame.getContentPane().add(lblEnterPassword);
		
		textField_1 = new JTextField();
		textField_1.setBounds(267, 195, 184, 30);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnSubmit = new JButton("Login");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnSubmit.setFont(new Font("Times New Roman", Font.PLAIN, 16));
		btnSubmit.setBounds(267, 276, 97, 25);
		frame.getContentPane().add(btnSubmit);
	}
}
