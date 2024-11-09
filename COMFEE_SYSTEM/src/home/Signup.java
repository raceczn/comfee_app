package home;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Font;
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

public class Signup extends JFrame {

	private JTextField fname_txtfield;
	private JPasswordField newpass_passfield;

	// for images
	private Image poster1 = new ImageIcon(Signup.class.getResource("/img/comfeebg.png")).getImage()
			.getScaledInstance(382, 485, Image.SCALE_SMOOTH);
	private Image exitIcon = new ImageIcon(Login.class.getResource("/img/exit.png")).getImage()
			.getScaledInstance(25,25, Image.SCALE_SMOOTH);

	private JTextField lastn_txtfield;
	private JTextField email_txtfield;
	private JTextField midname_txtfield;
	private JTextField age_txtfield;
	private JTextField sex_txtfield;
	private JPasswordField confirm_passfield;

	public Signup() {
		initialize();
	}

	private void initialize() {
		setUndecorated(true);
		getContentPane().setForeground(new Color(255, 255, 255));
		setResizable(true);
		getContentPane().setBackground(new Color(255, 255, 255));
		setBounds(200, 200, 755, 485);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		setLocationRelativeTo(null);

		JPanel mainpane = new JPanel();
		mainpane.setBorder(new EmptyBorder(0, 0, 0, 0));
		mainpane.setBackground(new Color(255, 255, 255));
		mainpane.setBounds(382, 0, 369, 485);
		getContentPane().add(mainpane);
		mainpane.setLayout(null);

		fname_txtfield = new JTextField();
		fname_txtfield.setBorder(null);
		fname_txtfield.setBackground(new Color(255, 255, 255));
		fname_txtfield.setBounds(35, 110, 135, 30);
		mainpane.add(fname_txtfield);
		fname_txtfield.setForeground(new Color(22, 22, 22));
		fname_txtfield.setFont(new Font("Georgia", Font.PLAIN, 14));
		fname_txtfield.setColumns(10);

		newpass_passfield = new JPasswordField();
		newpass_passfield.setBorder(new EmptyBorder(0, 0, 0, 0));
		newpass_passfield.setBackground(new Color(255, 255, 255));
		newpass_passfield.setBounds(35, 295, 135, 30);
		newpass_passfield.setEchoChar('\u2022');
		mainpane.add(newpass_passfield);
		newpass_passfield.setForeground(new Color(22, 22, 22));
		newpass_passfield.setFont(new Font("Georgia", Font.PLAIN, 14));

		JSeparator handlling_fname = new JSeparator();
		handlling_fname.setBackground(new Color(85, 85, 85));
		handlling_fname.setBounds(35, 140, 135, 9);
		mainpane.add(handlling_fname);

		JSeparator handling_newpass = new JSeparator();
		handling_newpass.setBackground(new Color(85, 85, 85));
		handling_newpass.setBounds(35, 325, 135, 9);
		mainpane.add(handling_newpass);

		JLabel newpass_label = new JLabel("New Password:");
		newpass_label.setFont(new Font("SansSerif", Font.PLAIN, 11));
		newpass_label.setBounds(35, 275, 93, 14);
		mainpane.add(newpass_label);

		JLabel firstnamelbl = new JLabel("First Name:");
		firstnamelbl.setFont(new Font("SansSerif", Font.PLAIN, 11));
		firstnamelbl.setBounds(35, 90, 93, 14);
		mainpane.add(firstnamelbl);

		JLabel haveAccount = new JLabel("Already have an account?");
		haveAccount.setFont(new Font("SansSerif", Font.PLAIN, 11));
		haveAccount.setBounds(103, 438, 136, 15);
		mainpane.add(haveAccount);

		JLabel login_label = new JLabel("LOGIN");
		login_label.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Login log = new Login();
				log.setVisible(true);
				dispose();
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				login_label.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
				login_label.setForeground(new Color(235, 65, 65));
			}

			public void mouseExited(MouseEvent e) {
				login_label.setForeground(new Color(4, 4, 255));
			}

		});
		login_label.setForeground(new Color(4, 4, 255));
		login_label.setFont(new Font("Tahoma", Font.PLAIN, 12));
		login_label.setBounds(237, 438, 60, 14);
		mainpane.add(login_label);

		JLabel lastnamelbl = new JLabel("Last Name:");
		lastnamelbl.setFont(new Font("SansSerif", Font.PLAIN, 11));
		lastnamelbl.setBounds(193, 90, 93, 14);
		mainpane.add(lastnamelbl);

		lastn_txtfield = new JTextField();
		lastn_txtfield.setForeground(new Color(22, 22, 22));
		lastn_txtfield.setFont(new Font("Georgia", Font.PLAIN, 14));
		lastn_txtfield.setColumns(10);
		lastn_txtfield.setBorder(null);
		lastn_txtfield.setBackground(new Color(255, 255, 255));
		lastn_txtfield.setBounds(193, 110, 135, 30);
		mainpane.add(lastn_txtfield);

		JSeparator handling_Lname = new JSeparator();
		handling_Lname.setBackground(new Color(85, 85, 85));
		handling_Lname.setBounds(193, 140, 135, 9);
		mainpane.add(handling_Lname);

		JLabel lblNewLabel = new JLabel("Create your Account");
		lblNewLabel.setFont(new Font("Comic Sans MS", Font.PLAIN, 25));
		lblNewLabel.setBounds(35, 40, 251, 40);
		mainpane.add(lblNewLabel);

		JLabel email_lbl = new JLabel("Email (Username)");
		email_lbl.setFont(new Font("SansSerif", Font.PLAIN, 11));
		email_lbl.setBounds(35, 215, 93, 14);
		mainpane.add(email_lbl);

		email_txtfield = new JTextField();
		email_txtfield.setForeground(new Color(22, 22, 22));
		email_txtfield.setFont(new Font("Georgia", Font.PLAIN, 14));
		email_txtfield.setColumns(10);
		email_txtfield.setBorder(null);
		email_txtfield.setBackground(Color.WHITE);
		email_txtfield.setBounds(35, 235, 293, 30);
		mainpane.add(email_txtfield);

		JSeparator handling_email = new JSeparator();
		handling_email.setBackground(new Color(85, 85, 85));
		handling_email.setBounds(35, 265, 293, 9);
		mainpane.add(handling_email);

		JPanel registerpane = new JPanel();
		registerpane.setBackground(new Color(97, 122, 85));
		registerpane.setBounds(84, 379, 213, 40);
		mainpane.add(registerpane);
		registerpane.setLayout(null);

		JLabel register_label = new JLabel("REGISTER");
		register_label.setBounds(0, 0, 213, 40);
		registerpane.add(register_label);
		register_label.setForeground(new Color(255, 255, 255));
		register_label.setFont(new Font("Century Gothic", Font.BOLD, 17));
		register_label.setHorizontalAlignment(SwingConstants.CENTER);

		register_label.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				// Check if any field is empty
				if (fname_txtfield.getText().isEmpty() || midname_txtfield.getText().isEmpty()
						|| lastn_txtfield.getText().isEmpty() || email_txtfield.getText().isEmpty()
						|| age_txtfield.getText().isEmpty() || sex_txtfield.getText().isEmpty()
						|| newpass_passfield.getPassword().length == 0 || confirm_passfield.getPassword().length == 0) {
					JOptionPane.showMessageDialog(null, "Fill-out the details first.", "Error",
							JOptionPane.ERROR_MESSAGE);
					return;
				}

				// Kapag na fill-out na lahat
				fname_txtfield.setText(null);
				midname_txtfield.setText(null);
				lastn_txtfield.setText(null);
				email_txtfield.setText(null);
				age_txtfield.setText(null);
				sex_txtfield.setText(null);
				newpass_passfield.setText(null);
				confirm_passfield.setText(null);

				JOptionPane.showMessageDialog(null, "Sign up successfully. Enjoy your time with Comfee!");
			}

			public void mouseEntered(MouseEvent e) {
				register_label.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
				register_label.setForeground(new Color(34, 34, 34));
				registerpane.setBackground(new Color(164, 208, 164));
			}

			public void mouseExited(MouseEvent e) {
				register_label.setCursor(Cursor.getDefaultCursor());
				register_label.setForeground(new Color(255, 255, 255));
				registerpane.setBackground(new Color(97, 122, 85));
			}
		});

		midname_txtfield = new JTextField();
		midname_txtfield.setForeground(new Color(22, 22, 22));
		midname_txtfield.setFont(new Font("Georgia", Font.PLAIN, 14));
		midname_txtfield.setColumns(10);
		midname_txtfield.setBorder(null);
		midname_txtfield.setBackground(Color.WHITE);
		midname_txtfield.setBounds(35, 170, 135, 30);
		mainpane.add(midname_txtfield);

		JLabel midnamelbl = new JLabel("Middle Name (N/A if none):");
		midnamelbl.setFont(new Font("SansSerif", Font.PLAIN, 11));
		midnamelbl.setBounds(35, 155, 135, 14);
		mainpane.add(midnamelbl);

		JSeparator handling_midname = new JSeparator();
		handling_midname.setBackground(new Color(85, 85, 85));
		handling_midname.setBounds(35, 200, 135, 9);
		mainpane.add(handling_midname);

		age_txtfield = new JTextField();
		age_txtfield.setForeground(new Color(22, 22, 22));
		age_txtfield.setFont(new Font("Georgia", Font.PLAIN, 14));
		age_txtfield.setColumns(10);
		age_txtfield.setBorder(null);
		age_txtfield.setBackground(Color.WHITE);
		age_txtfield.setBounds(193, 170, 48, 30);
		mainpane.add(age_txtfield);

		JSeparator handling_age = new JSeparator();
		handling_age.setBackground(new Color(85, 85, 85));
		handling_age.setBounds(193, 200, 48, 9);
		mainpane.add(handling_age);

		JLabel agelbl = new JLabel("Age:");
		agelbl.setFont(new Font("SansSerif", Font.PLAIN, 11));
		agelbl.setBounds(195, 155, 48, 14);
		mainpane.add(agelbl);

		JLabel sexlbl = new JLabel("Sex (M/F):");
		sexlbl.setFont(new Font("SansSerif", Font.PLAIN, 11));
		sexlbl.setBounds(265, 155, 66, 14);
		mainpane.add(sexlbl);

		sex_txtfield = new JTextField();
		sex_txtfield.setForeground(new Color(22, 22, 22));
		sex_txtfield.setFont(new Font("Georgia", Font.PLAIN, 14));
		sex_txtfield.setColumns(10);
		sex_txtfield.setBorder(null);
		sex_txtfield.setBackground(Color.WHITE);
		sex_txtfield.setBounds(265, 170, 63, 28);
		mainpane.add(sex_txtfield);

		JSeparator handling_sex = new JSeparator();
		handling_sex.setBackground(new Color(85, 85, 85));
		handling_sex.setBounds(265, 200, 63, 9);
		mainpane.add(handling_sex);

		JLabel conpass_label = new JLabel("Confirm Password:");
		conpass_label.setFont(new Font("SansSerif", Font.PLAIN, 11));
		conpass_label.setBounds(195, 275, 93, 14);
		mainpane.add(conpass_label);

		confirm_passfield = new JPasswordField();
		confirm_passfield.setForeground(new Color(22, 22, 22));
		confirm_passfield.setFont(new Font("Georgia", Font.PLAIN, 14));
		confirm_passfield.setEchoChar('•');
		confirm_passfield.setBorder(new EmptyBorder(0, 0, 0, 0));
		confirm_passfield.setBackground(Color.WHITE);
		confirm_passfield.setBounds(195, 295, 135, 30);
		mainpane.add(confirm_passfield);

		JSeparator handling_conpass = new JSeparator();
		handling_conpass.setBackground(new Color(85, 85, 85));
		handling_conpass.setBounds(195, 325, 135, 9);
		mainpane.add(handling_conpass);

		JLabel login = new JLabel("Sign in:");
		login.setBounds(10, 44, 127, 49);
		login.setBackground(new Color(0, 0, 0));
		login.setForeground(new Color(0, 0, 0));
		login.setFont(new Font("Tahoma", Font.PLAIN, 27));

		JLabel exit = new JLabel("");
		exit.setBounds(345, 0, 25, 25);
		exit.setIcon(new ImageIcon(exitIcon));
		exit.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		exit.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
		});
		mainpane.add(exit);
		
		JLabel agree = new JLabel("<html> <u>Agree to terms and condition</u></html>");
		agree.setFont(new Font("Tahoma", Font.PLAIN, 11));
		agree.setHorizontalAlignment(SwingConstants.CENTER);
		agree.setBounds(112, 347, 161, 14);
		mainpane.add(agree);

		JPanel panelbg = new JPanel();
		panelbg.setBackground(new Color(97, 122, 85));
		panelbg.setBounds(0, 0, 382, 485);
		getContentPane().add(panelbg);
		panelbg.setLayout(null);

		JLabel photobg = new JLabel("");
		photobg.setBounds(0, 0, 382, 485);
		photobg.setIcon(new ImageIcon(poster1));
		panelbg.add(photobg);

	}

	public static void main(String[] args) {
		Signup frame = new Signup();
		frame.setVisible(true);

	}
}