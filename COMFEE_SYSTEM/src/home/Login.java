package home;


import java.awt.Color;
import java.awt.Cursor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.JCheckBox;

public class Login extends JFrame {

	private JTextField usernamelbl;
	private JPasswordField passlbl;
	private boolean showPassword = false;

	// for images

	private Image userpng = new ImageIcon(Login.class.getResource("/img/user.png")).getImage().getScaledInstance(41, 32,
			Image.SCALE_SMOOTH);
	private Image passpng = new ImageIcon(Login.class.getResource("/img/pass.png")).getImage().getScaledInstance(41, 32,
			Image.SCALE_SMOOTH);
	private Image poster1 = new ImageIcon(Login.class.getResource("/img/comfeebg.png")).getImage()
			.getScaledInstance(382, 485, Image.SCALE_SMOOTH);
	
	private Image googlee = new ImageIcon(Login.class.getResource("/img/googleIcon.png")).getImage()
			.getScaledInstance(31, 29, Image.SCALE_SMOOTH);
	private Image fcb = new ImageIcon(Login.class.getResource("/img/fbIcon.png")).getImage().getScaledInstance(31, 29,
			Image.SCALE_SMOOTH);
	private Image exitIcon = new ImageIcon(Login.class.getResource("/img/exit.png"))
			.getImage().getScaledInstance(25, 25,Image.SCALE_SMOOTH);

	public Login() {
		initialize();
	}
	
	

	private void initialize() {
		setUndecorated(true);
		getContentPane().setForeground(new Color(255, 255, 255));
		setResizable(true);
		getContentPane().setBackground(new Color(255, 255, 255));
		setBounds(200, 200, 750, 485);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);

		JPanel mainpane = new JPanel();
		mainpane.setBorder(new EmptyBorder(0, 0, 0, 0));
		mainpane.setBackground(new Color(255, 255, 255));
		mainpane.setBounds(381, 0, 369, 485);
		getContentPane().add(mainpane);
		mainpane.setLayout(null);

		usernamelbl = new JTextField();
		usernamelbl.setBorder(null);
		usernamelbl.setBackground(new Color(255, 255, 255));
		usernamelbl.setBounds(90, 168, 238, 32);
		usernamelbl.setForeground(new Color(22, 22, 22));
		usernamelbl.setFont(new Font("Tahoma", Font.PLAIN, 17));
		usernamelbl.setColumns(10);
		mainpane.add(usernamelbl);

		passlbl = new JPasswordField();
		passlbl.setBorder(new EmptyBorder(0, 0, 0, 0));
		passlbl.setBackground(new Color(255, 255, 255));
		passlbl.setBounds(90, 235, 238, 32);
		passlbl.setEchoChar('\u2022');
		mainpane.add(passlbl);
		passlbl.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {

				if (e.getKeyCode() == KeyEvent.VK_ENTER) {
					@SuppressWarnings("deprecation")
					String password = passlbl.getText();
					String username = usernamelbl.getText();

					if (password.contains("admin") && username.contains("admin")) {
						usernamelbl.setText(null);
						passlbl.setText(null);
						dashboard dash = new dashboard();
						JOptionPane.showMessageDialog(null, "Successfully Login");
						dash.setVisible(true);
            dispose();
						
					} else {
						JOptionPane.showMessageDialog(null, "Invalid Login Details", "Login Error",
						JOptionPane.ERROR_MESSAGE);
						passlbl.setText(null);
						usernamelbl.setText(null);

					}
				}

			}
		});
		passlbl.setForeground(new Color(22, 22, 22));
		passlbl.setFont(new Font("Tahoma", Font.PLAIN, 19));

		JSeparator separator_1 = new JSeparator();
		separator_1.setBackground(new Color(85, 85, 85));
		separator_1.setBounds(90, 200, 222, 9);
		mainpane.add(separator_1);

		JSeparator separator_1_1 = new JSeparator();
		separator_1_1.setBackground(new Color(85, 85, 85));
		separator_1_1.setBounds(90, 270, 222, 9);
		mainpane.add(separator_1_1);

		JPanel loginpane = new JPanel();
		loginpane.setBackground(new Color(97, 122, 85));
		loginpane.setBounds(71, 315, 222, 40);
		mainpane.add(loginpane);
		loginpane.setLayout(null);

		JLabel loginlbl = new JLabel("SIGN IN");
		loginlbl.setBounds(0, 0, 222, 40);
		loginpane.add(loginlbl);
		loginlbl.setForeground(new Color(255, 255, 255));
		loginlbl.setFont(new Font("Century Gothic", Font.BOLD, 17));
		loginlbl.setHorizontalAlignment(SwingConstants.CENTER);

		loginlbl.addMouseListener(new MouseAdapter() {
			@SuppressWarnings("deprecation")
			public void mouseClicked(MouseEvent e) {
				String password = passlbl.getText();
				String username = usernamelbl.getText();

				if (password.contains("admin") && username.contains("admin")) {
					usernamelbl.setText(null);
					passlbl.setText(null);
					dashboard dash = new dashboard();
					JOptionPane.showMessageDialog(null, "Successfully Login");
					dispose();
					dash.setVisible(true);
				} else {
					JOptionPane.showMessageDialog(null, "Invalid Login Details", "Login Error",
							JOptionPane.ERROR_MESSAGE);
					passlbl.setText(null);
					usernamelbl.setText(null);
				}
			}

			public void mouseEntered(MouseEvent e) {
				loginlbl.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
				loginpane.setBackground(new Color(164, 208, 164));
				loginlbl.setForeground(new Color(21,21,21));
			}

			public void mouseExited(MouseEvent e) {
				loginlbl.setCursor(Cursor.getDefaultCursor());
				loginlbl.setForeground(new Color(255, 255, 255));
				loginpane.setBackground(new Color(97, 122, 85));
			}
		});
	

		JLabel user = new JLabel("");
		user.setBounds(39, 165, 41, 32);
		user.setIcon(new ImageIcon(userpng));
		mainpane.add(user);

		JLabel psswrd = new JLabel("");
		psswrd.setBounds(39, 235, 41, 32);
		psswrd.setIcon(new ImageIcon(passpng));
		mainpane.add(psswrd);

		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setFont(new Font("SansSerif", Font.PLAIN, 11));
		lblPassword.setBounds(90, 215, 93, 14);
		mainpane.add(lblPassword);

		JLabel lblUsername = new JLabel("Username:");
		lblUsername.setFont(new Font("SansSerif", Font.PLAIN, 11));
		lblUsername.setBounds(90, 153, 93, 14);
		mainpane.add(lblUsername);

		JLabel noAccount = new JLabel("Don't have an account?");
		noAccount.setFont(new Font("SansSerif", Font.PLAIN, 11));
		noAccount.setBounds(103, 438, 136, 15);
		mainpane.add(noAccount);

		JLabel signup = new JLabel("Sign Up");
		signup.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				signup.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
				signup.setForeground(new Color(235, 65, 65));
			}

			public void mouseExited(MouseEvent e) {
				signup.setForeground(new Color(4, 4, 255));
			}

			@Override
			public void mouseClicked(MouseEvent e) {
				Signup reg = new Signup();
				reg.setVisible(true);
			}
		});
		signup.setForeground(new Color(4, 4, 255));
		signup.setFont(new Font("SansSerif", Font.PLAIN, 13));
		signup.setBounds(222, 435, 60, 20);
		mainpane.add(signup);

		JLabel welcome = new JLabel("Welcome back");
		welcome.setFont(new Font("Comic Sans MS", Font.PLAIN, 28));
		welcome.setBounds(33, 31, 252, 72);
		mainpane.add(welcome);

		JLabel pleaselogin = new JLabel("Please enter the details for login to your account.");
		pleaselogin.setFont(new Font("SansSerif", Font.PLAIN, 12));
		pleaselogin.setBounds(37, 78, 279, 32);
		mainpane.add(pleaselogin);

		// for aesthetic purposes
		JPanel liner1 = new JPanel();
		liner1.setBounds(37, 118, 60, 3);
		liner1.setBackground(new Color(97, 122, 85));
		mainpane.add(liner1);

		JPanel liner2 = new JPanel();
		liner2.setBounds(102, 118, 60, 3);
		mainpane.add(liner2);

		JCheckBox checkShowpass = new JCheckBox("Show password");
		checkShowpass.setFont(new Font("Tahoma", Font.PLAIN, 10));
		checkShowpass.setFocusable(false);
		checkShowpass.setBorder(new EmptyBorder(0, 0, 0, 0));
		checkShowpass.setBounds(215, 285, 93, 20);
		checkShowpass.setBackground(new Color(255, 255, 255));
		

		checkShowpass.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				checkShowpass.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
				checkShowpass.setForeground(Color.RED);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				checkShowpass.setCursor(Cursor.getDefaultCursor());
				checkShowpass.setForeground(Color.BLACK);
			}
		});
		checkShowpass.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				showPassword = !showPassword;
				passlbl.setEchoChar(showPassword ? '\u0000' : '*');
			}
		});
		// Add the JCheckBox to your panel
		mainpane.add(checkShowpass);

		JLabel text = new JLabel("or sign in with");
		text.setForeground(new Color(18, 18, 18));
		text.setFont(new Font("Arial", Font.PLAIN, 11));
		text.setBounds(148, 366, 136, 14);
		mainpane.add(text);

		JLabel facebook = new JLabel("");
		facebook.setBounds(148, 391, 31, 29);
		facebook.setIcon(new ImageIcon(fcb));
		facebook.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		mainpane.add(facebook);

		JLabel google = new JLabel("");
		google.setBounds(190, 391, 31, 29);
		google.setIcon(new ImageIcon(googlee));
		google.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		mainpane.add(google);
		
		JLabel exit = new JLabel("");
		exit.setBounds(343, 0, 25, 25);
		exit.setIcon(new ImageIcon(exitIcon));
		exit.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		exit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
		});
		mainpane.add(exit);
		
		JPanel panelbg = new JPanel();
		panelbg.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				
			}
			public void mouseExited(MouseEvent e) {
				panelbg.setBackground(new Color(97, 122, 85));
			}
		});
		panelbg.setBackground(new Color(97, 122, 85));
		panelbg.setBounds(0, 0, 382, 485);
		getContentPane().add(panelbg);
		panelbg.setLayout(null);
		
	
		
		JLabel posterbg = new JLabel("");
		posterbg.setBounds(0, 0, 382, 485);
		posterbg.setIcon(new ImageIcon(poster1));
		panelbg.add(posterbg);
	

		JLabel login = new JLabel("Sign in:");
		login.setBounds(10, 44, 127, 49);
		login.setBackground(new Color(0, 0, 0));
		login.setForeground(new Color(0, 0, 0));
		login.setFont(new Font("Tahoma", Font.PLAIN, 27));
	
			
	

	}

	
}