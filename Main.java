import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Iterator;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JOptionPane;




public class Main extends JFrame {

	private JPanel contentPane;
	private JTextField userTextField;
	private JPasswordField passwordTextField;
	 
		

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
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
	public Main() {
		setBackground(new Color(255, 255, 255));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 536, 303);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel titleLabel = new JLabel("Library Management - JavaTpoint");
		titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
		titleLabel.setFont(new Font("Times New Roman", Font.BOLD, 25));
		titleLabel.setBounds(10, 11, 500, 75);
		contentPane.add(titleLabel);
		
		JLabel usernameLabel = new JLabel("Username:");
		usernameLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		usernameLabel.setBounds(77, 97, 66, 17);
		contentPane.add(usernameLabel);
		
		JLabel passwordLabel = new JLabel("Password:");
		passwordLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		passwordLabel.setBounds(77, 132, 66, 17);
		contentPane.add(passwordLabel);
		
		userTextField = new JTextField();
		userTextField.setBounds(146, 97, 238, 20);
		contentPane.add(userTextField);
		userTextField.setColumns(10);
		
		JButton adminBtn = new JButton("ADMIN");
		adminBtn.setFont(new Font("Tahoma", Font.BOLD, 14));
		adminBtn.setBackground(new Color(192, 192, 192));
		adminBtn.setFocusable(false);
		adminBtn.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				if(e.getSource() == adminBtn) {
					String userID = userTextField.getText();
					String password = String.valueOf(passwordTextField.getPassword());
					
					if(userID.equals("admin_1") && password.equals("adminOne") ||
					   userID.equals("admin_2") && password.equals("adminTwo") ||
					   userID.equals("admin_3") && password.equals("adminThree"))  {
						
						JOptionPane.showMessageDialog(null, "Welcome to NU Library System");
						
					}
					else {
						JOptionPane.showMessageDialog(null, "INVALID USERNAME OR PASSWORD");
						
					}

				}
				
			}
		});
		adminBtn.setBounds(146, 163, 110, 31);
		contentPane.add(adminBtn);
		
		JButton librarianBtn = new JButton("LIBRARIAN");
		librarianBtn.setFont(new Font("Tahoma", Font.BOLD, 14));
		librarianBtn.setBackground(new Color(192, 192, 192));
		librarianBtn.setFocusable(false);
		librarianBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(e.getSource() == adminBtn) {
					String userID = userTextField.getText();
					String password = String.valueOf(passwordTextField.getPassword());
					
					if(userID.equals("Librarian_1") && password.equals("librarianOne") ||
					   userID.equals("Librarian_2") && password.equals("librarianTwo") ||
					   userID.equals("Librarian_3") && password.equals("librarianThree"))  {
						
						JOptionPane.showMessageDialog(null, "Welcome to NU Library");
						
					}
					else {
						JOptionPane.showMessageDialog(null, "INVALID USERNAME OR PASSWORD");
						
					}

				}
				
				
				
				
			}
		});
		librarianBtn.setBounds(274, 163, 110, 31);
		contentPane.add(librarianBtn);
		
		passwordTextField = new JPasswordField();
		passwordTextField.setBounds(146, 132, 238, 20);
		contentPane.add(passwordTextField);
		
		
	}
}
