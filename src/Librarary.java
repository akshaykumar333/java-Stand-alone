import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.FlowLayout;
import javax.swing.JCheckBox;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Librarary extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Librarary frame = new Librarary();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Librarary() {
		setTitle("Library");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 651, 495);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel LibraryManagement = new JLabel("library management");
		LibraryManagement.setFont(new Font("Times New Roman", Font.PLAIN, 20));
		LibraryManagement.setBounds(214, 13, 227, 32);
		LibraryManagement.setVerticalAlignment(SwingConstants.BOTTOM);
		contentPane.add(LibraryManagement);
		
		JButton btnAdminLogin = new JButton("Admin Login");
		btnAdminLogin.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnAdminLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnAdminLogin.setBounds(197, 143, 185, 66);
		contentPane.add(btnAdminLogin);
		
		JButton btnNewButton = new JButton("Libririan Login");
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 18));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton.setBounds(197, 254, 188, 66);
		contentPane.add(btnNewButton);
	}
}
