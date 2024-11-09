package home;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.border.LineBorder;

public class dashboard extends JFrame {

	// panels to call
	private JPanel contentPane;
	private PanelHome panelhome;
	private PanelAbout panelabout;
	private PanelMenu panelmenu;
	private PanelContacts panelcontacts;
	private PanelOrder panelorder;
	private PanelTrackOrder paneltrack;
	private PanelGallery panelgallery;

	// initialization
	private JPanel panel_1;
	private JLabel shop;
	private JLabel menulabel;
	private JLabel cartIcon;

	// images
	private Image photo_big = new ImageIcon(dashboard.class.getResource("/img/cupcoffee.png")).getImage()
			.getScaledInstance(755, 679, Image.SCALE_SMOOTH);
	private Image cart = new ImageIcon(dashboard.class.getResource("/img/cart.png")).getImage().getScaledInstance(35,
			33, Image.SCALE_SMOOTH);
	private Image logoo = new ImageIcon(dashboard.class.getResource("/img/logo2.png")).getImage().getScaledInstance(180,
			61, Image.SCALE_SMOOTH);
	private Image exitIcon = new ImageIcon(Login.class.getResource("/img/exmo.png")).getImage().getScaledInstance(25,
			25, Image.SCALE_SMOOTH);
	private JLabel exit;

	public dashboard() {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1368, 720);
		contentPane = new JPanel() {
			@Override
			protected void paintComponent(Graphics g) {
				Graphics2D g2d = (Graphics2D) g;
				int w = getWidth();
				int h = getHeight();
				GradientPaint gp = new GradientPaint(0, 0, new Color(255, 255, 255), w, h, new Color(255, 255, 255));
				g2d.setPaint(gp);
				g2d.fillRect(0, 0, w, h);
			}
		};
		contentPane.setBackground(new Color(0, 0, 0));
		contentPane.setForeground(new Color(255, 255, 255));
		contentPane.setBorder(new LineBorder(new Color(188, 188, 188)));
		setLocationRelativeTo(null);
		setContentPane(contentPane);
		contentPane.setLayout(null);

		panelhome = new PanelHome();
		panelhome.setBounds(0, 0, 1370, 789);
		panelabout = new PanelAbout();
		panelabout.setBounds(0, 0, 1370, 717);
		panelmenu = new PanelMenu();
		panelcontacts = new PanelContacts();
		panelcontacts.setBounds(0, 0, 1370, 789);
		panelgallery = new PanelGallery();
		panelgallery.setBounds(0, 0, 1370, 717);
		panelorder = new PanelOrder();
		paneltrack = new PanelTrackOrder();

		JPanel mainpanel = new JPanel();
		mainpanel.setBounds(0, 60, 1370, 660);
		mainpanel.setBackground(new Color(245, 245, 220));
		contentPane.add(mainpanel);
		mainpanel.setLayout(null);
		mainpanel.add(panelabout);

		mainpanel.add(panelhome);
		mainpanel.add(panelabout);
		mainpanel.add(panelmenu);
		mainpanel.add(panelcontacts);
		mainpanel.add(panelgallery);
		mainpanel.add(panelorder);
		mainpanel.add(paneltrack);

		panel_1 = new JPanel();
		panel_1.setBackground(new Color(7, 7, 7));
		panel_1.setBounds(0, 0, 1370, 61);
		contentPane.add(panel_1);
		panel_1.setLayout(null);

		exit = new JLabel("");
		exit.setBounds(1345, 0, 25, 25);
		exit.setIcon(new ImageIcon(exitIcon));
		exit.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		panel_1.add(exit);
		exit.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
		});
		JLabel logo = new JLabel("");
		logo.setBounds(35, 0, 180, 61);
		logo.setIcon(new ImageIcon(logoo));
		panel_1.add(logo);

		cartIcon = new JLabel("");
		cartIcon.setBounds(1051, 17, 35, 33);
		cartIcon.setIcon(new ImageIcon(cart));
		panel_1.add(cartIcon);

		JLabel about = new JLabel("ABOUT");
		about.setBounds(510, 17, 81, 33);
		panel_1.add(about);
		about.setForeground(new Color(255, 255, 255));
		about.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				menuClicked(panelabout);
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				about.setForeground(new Color(143, 88, 67));
				about.setText("<html><u>ABOUT</u></html>");
			}

			@Override
			public void mouseExited(MouseEvent e) {
				about.setForeground(Color.white);
				about.setText("ABOUT");
			}
		});
		about.setFont(new Font("Arial", Font.PLAIN, 20));
		about.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR)); // sets the cursor to point

		JLabel cart = new JLabel("MY CART");
		JPopupMenu menu = new JPopupMenu();
		JMenuItem yourorder = new JMenuItem("Your Order");
		JMenuItem trackorder = new JMenuItem("Track Order");

		menu.setPreferredSize(new Dimension(150, 100));
		menu.setBackground(Color.white);
		menu.setBorder(null);
		yourorder.setFont(new Font("Arial", Font.BOLD, 15));
		trackorder.setFont(new Font("Arial", Font.BOLD, 15));
		menu.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		menu.add(yourorder);
		menu.add(trackorder);

		cart.setBounds(1092, 17, 103, 33);
		panel_1.add(cart);
		cart.setForeground(new Color(255, 255, 255));
		cart.setFont(new Font("Arial", Font.PLAIN, 20));
		cart.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

		// Show popup menu when shop label is clicked
		cart.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				menu.show(cart, 0, cart.getHeight());
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				cart.setForeground(new Color(143, 88, 67));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				cart.setForeground(Color.white);
			}
		});

		yourorder.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				menuClicked(panelorder);
			}
		});

		trackorder.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				menuClicked(paneltrack);
			}
		});
		JLabel contacts = new JLabel("CONTACTS");
		contacts.setBounds(860, 17, 133, 33);
		panel_1.add(contacts);
		contacts.setForeground(new Color(255, 255, 255));
		contacts.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				menuClicked(panelcontacts);
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				contacts.setForeground(new Color(143, 88, 67));
				contacts.setText("<html><u>CONTACTS</u></html>");
			}

			@Override
			public void mouseExited(MouseEvent e) {
				contacts.setForeground(Color.white);
				contacts.setText("CONTACTS");
			}
		});
		contacts.setFont(new Font("Arial", Font.PLAIN, 20));
		contacts.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

		JLabel homelbl = new JLabel("HOME");
		homelbl.setBounds(400, 17, 94, 33);
		panel_1.add(homelbl);
		homelbl.setBackground(new Color(255, 255, 255));
		homelbl.setForeground(new Color(255, 255, 255));
		homelbl.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR)); // sets the cursor to point
		homelbl.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				menuClicked(panelhome);
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				homelbl.setForeground(new Color(143, 88, 67));
				homelbl.setText("<html><u>HOME</u></html>");
			}

			@Override
			public void mouseExited(MouseEvent e) {
				homelbl.setForeground(Color.white);
				homelbl.setText("HOME");
			}
		});
		homelbl.setFont(new Font("Arial", Font.PLAIN, 20));

		JLabel gallery = new JLabel("GALLERY");
		gallery.setForeground(Color.WHITE);
		gallery.setFont(new Font("Arial", Font.PLAIN, 20));
		gallery.setBounds(735, 17, 133, 33);
		gallery.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		gallery.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				menuClicked(panelgallery);
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				gallery.setForeground(new Color(143, 88, 67));
				gallery.setText("<html><u>GALLERY</u></html>");
			}

			@Override
			public void mouseExited(MouseEvent e) {
				gallery.setForeground(Color.white);
				gallery.setText("GALLERY");
			}
		});
		panel_1.add(gallery);

		menulabel = new JLabel("SHOP");
		menulabel.setForeground(Color.WHITE);
		menulabel.setFont(new Font("Arial", Font.PLAIN, 20));
		menulabel.setBounds(635, 17, 81, 33);
		menulabel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		menulabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				menuClicked(panelmenu);
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				menulabel.setForeground(new Color(143, 88, 67));
				menulabel.setText("<html><u>SHOP</u></html>");
			}

			@Override
			public void mouseExited(MouseEvent e) {
				menulabel.setForeground(Color.white);
				menulabel.setText("SHOP");
			}
		});
		panel_1.add(menulabel);

		JLabel profile = new JLabel("PROFILE");
		profile.setForeground(Color.WHITE);
		profile.setFont(new Font("Arial", Font.PLAIN, 20));
		profile.setBounds(1232, 17, 103, 33);
		profile.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		panel_1.add(profile);

		JPopupMenu profilemenu = new JPopupMenu();
		JMenuItem admin = new JMenuItem("Admin");
		JMenuItem logout = new JMenuItem("Logout");
		profilemenu.setPreferredSize(new Dimension(140, 100));
		profilemenu.setBackground(Color.white);
		profilemenu.setBorder(null);
		admin.setFont(new Font("Arial", Font.BOLD, 15));
		logout.setFont(new Font("Arial", Font.BOLD, 15));
		profilemenu.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		profilemenu.add(admin);
		profilemenu.add(logout);

		profile.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (e.getButton() == MouseEvent.BUTTON1) { // Check if left mouse button is clicked
					profilemenu.show(profile, 0, profile.getHeight()); // Show the popup menu below the label
				}
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				profile.setForeground(new Color(143, 88, 67));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				profile.setForeground(Color.white);
			}
		});

		admin.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// codes
			}
		});

		logout.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Image icon = new ImageIcon(getClass().getResource("/img/sadface.png")).getImage().getScaledInstance(80,
						80, Image.SCALE_SMOOTH);
				int choice = JOptionPane.showConfirmDialog(null, "Are you sure you want to logout?",
						"Logout Confirmation", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,
						new ImageIcon(icon));
				if (choice == JOptionPane.YES_OPTION) {
					Login login = new Login();
					login.setVisible(true);
					dispose();
				}
			}
		});
	}

	public void menuClicked(JPanel panel) {
		panelhome.setVisible(false);
		panelabout.setVisible(false);
		panelmenu.setVisible(false);
		panelgallery.setVisible(false);
		panelcontacts.setVisible(false);
		panelorder.setVisible(false);
		paneltrack.setVisible(false);
		panel.setVisible(true);

	}

	public static void main(String[] args) {
		dashboard frame = new dashboard();
		frame.setVisible(true);
	}
}