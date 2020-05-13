import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollBar;


public class AdminSection {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminSection window = new AdminSection();
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
	public AdminSection() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 559, 569);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblAdminSection = new JLabel("Admin Section");
		lblAdminSection.setFont(new Font("Times New Roman", Font.PLAIN, 30));
		lblAdminSection.setBounds(183, 13, 188, 42);
		frame.getContentPane().add(lblAdminSection);
		
		JButton btnNewButton = new JButton("Add Librarian");
		btnNewButton.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setBounds(183, 102, 188, 61);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnViewLibrarian = new JButton("View Librarian");
		btnViewLibrarian.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnViewLibrarian.setBounds(183, 202, 188, 61);
		frame.getContentPane().add(btnViewLibrarian);
		
		JButton btnDeleteLibrarian = new JButton("Delete Librarian");
		btnDeleteLibrarian.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnDeleteLibrarian.setBounds(183, 301, 188, 61);
		frame.getContentPane().add(btnDeleteLibrarian);
		
		JButton btnLogout = new JButton("Logout");
		btnLogout.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		btnLogout.setBounds(183, 401, 188, 61);
		frame.getContentPane().add(btnLogout);
	}
}
