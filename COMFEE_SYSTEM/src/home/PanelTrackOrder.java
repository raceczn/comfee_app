package home;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.Timer;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

public class PanelTrackOrder extends JPanel {
	private JTextField orderNo_textfield;
	private JTextField email_textfield;

	private Image end = new ImageIcon(PanelHome.class.getResource("/img/Footer.png")).getImage().getScaledInstance(1370,
			600, Image.SCALE_SMOOTH);

	public PanelTrackOrder() {
		setBackground(new Color(255, 255, 255));
		setBounds(0, 0, 1370, 660);
		setLayout(null);

		JPanel panelmain = new JPanel();
		panelmain.setBounds(0, 0, 1370, 660);
		add(panelmain);
		panelmain.setLayout(null);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBorder(new EmptyBorder(0, 0, 0, 0));
		scrollPane.setBounds(0, 0, 1370, 665);
		scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);

		scrollPane.getVerticalScrollBar().setUnitIncrement(35);
		scrollPane.getVerticalScrollBar().setBlockIncrement(50);
		panelmain.add(scrollPane);

		JPanel panel_scroll = new JPanel();
		panel_scroll.setBackground(new Color(255, 255, 255));
		panel_scroll.setPreferredSize(new Dimension(1370, 1124));
		panel_scroll.setLayout(null);

		// add your components to the panel_scroll here

		scrollPane.setViewportView(panel_scroll);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(7, 7, 7));
		panel.setBounds(0, 0, 1370, 184);
		panel_scroll.add(panel);
		panel.setLayout(null);

		JLabel trackk = new JLabel("TRACK YOUR ORDER");
		trackk.setBounds(444, 45, 440, 96);
		panel.add(trackk);
		trackk.setHorizontalAlignment(SwingConstants.CENTER);
		trackk.setForeground(new Color(255, 255, 255));
		trackk.setFont(new Font("Tahoma", Font.BOLD, 39));

		JLabel orderNo = new JLabel("ORDER NUMBER:");
		orderNo.setFont(new Font("Tahoma", Font.PLAIN, 22));
		orderNo.setHorizontalAlignment(SwingConstants.CENTER);
		orderNo.setBounds(532, 211, 245, 49);
		panel_scroll.add(orderNo);

		orderNo_textfield = new JTextField("  input your order number.");
		orderNo_textfield.setBorder(new LineBorder(new Color(21, 21, 21)));
		orderNo_textfield.setFont(new Font("Tahoma", Font.PLAIN, 20));
		orderNo_textfield.setForeground(Color.GRAY); // set initial placeholder text color
		orderNo_textfield.setBounds(437, 267, 463, 49);
		orderNo_textfield.addFocusListener(new FocusListener() {
			@Override
			public void focusGained(FocusEvent e) {
				if (orderNo_textfield.getText().equals("  input your order number.")) {
					orderNo_textfield.setText(""); // clear placeholder text
					orderNo_textfield.setForeground(Color.BLACK); // change text color to black
				}
			}

			@Override
			public void focusLost(FocusEvent e) {
				if (orderNo_textfield.getText().isEmpty()) {
					orderNo_textfield.setText("  input your order number."); // restore placeholder text
					orderNo_textfield.setForeground(Color.GRAY); // change text color to gray
				}
			}
		});
		panel_scroll.add(orderNo_textfield);

		JLabel email = new JLabel("EMAIL:");
		email.setHorizontalAlignment(SwingConstants.CENTER);
		email.setFont(new Font("Tahoma", Font.PLAIN, 22));
		email.setBounds(532, 327, 245, 49);
		panel_scroll.add(email);

		email_textfield = new JTextField("  email address");
		email_textfield.setBorder(new LineBorder(new Color(21, 21, 21)));
		email_textfield.setFont(new Font("Tahoma", Font.PLAIN, 20));
		email_textfield.setForeground(Color.GRAY); // set initial placeholder text color
		email_textfield.setBounds(437, 380, 463, 49);
		email_textfield.addFocusListener(new FocusListener() {
			@Override
			public void focusGained(FocusEvent e) {
				if (email_textfield.getText().equals("  email address")) {
					email_textfield.setText(""); // clear placeholder text
					email_textfield.setForeground(Color.BLACK); // change text color to black
				}
			}

			@Override
			public void focusLost(FocusEvent e) {
				if (email_textfield.getText().isEmpty()) {
					email_textfield.setText("  email address"); // restore placeholder text
					email_textfield.setForeground(Color.GRAY); // change text color to gray
				}
			}
		});
		panel_scroll.add(email_textfield);

		JPanel gap = new JPanel();
		gap.setBackground(new Color(97, 122, 85));
		gap.setBounds(427, 267, 10, 49);
		panel_scroll.add(gap);

		JPanel gap2 = new JPanel();
		gap2.setBounds(427, 380, 10, 49);
		gap2.setBackground(new Color(97, 122, 85));
		panel_scroll.add(gap2);

		JPanel sendpanel = new JPanel();
		sendpanel.setBackground(new Color(97, 122, 85));
		sendpanel.setBounds(565, 461, 179, 49);
		panel_scroll.add(sendpanel);
		sendpanel.setLayout(null);

		JLabel send = new JLabel("SEND");
		send.setForeground(new Color(255, 255, 255));
		send.setFont(new Font("Tahoma", Font.PLAIN, 18));
		send.setHorizontalAlignment(SwingConstants.CENTER);
		send.setBounds(0, 0, 179, 49);
		send.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		sendpanel.add(send);
		send.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				orderNo_textfield.setText(null);
				email_textfield.setText(null);
				JOptionPane.showMessageDialog(null, "Sent successfully.");

			}

			public void mouseEntered(MouseEvent e) {
				send.setForeground(new Color(22, 69, 35));
				sendpanel.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
				sendpanel.setBackground(new Color(164, 208, 164));
			}

			public void mouseExited(MouseEvent e) {
				send.setForeground(new Color(255, 255, 255));
				sendpanel.setBackground(new Color(96, 153, 102));
				sendpanel.setBorder(null);
			}
		});

		JPanel footer = new JPanel();
		footer.setBounds(0, 520, 1370, 600);
		panel_scroll.add(footer);
		footer.setLayout(null);

		JLabel contacts = new JLabel("CONTACTS");
		contacts.setHorizontalAlignment(SwingConstants.CENTER);
		contacts.setForeground(Color.WHITE);
		contacts.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		contacts.setFont(new Font("Tahoma", Font.BOLD, 18));
		contacts.setBackground(Color.WHITE);
		contacts.setBounds(688, 349, 132, 35);
		footer.add(contacts);
		contacts.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JScrollBar verticalScrollBar = scrollPane.getVerticalScrollBar();
				Timer timer = new Timer(5, new ActionListener() {
					private int currentPosition = verticalScrollBar.getValue();
					private final int scrollStep = -15;
					private final int targetPosition = 0;

					@Override
					public void actionPerformed(ActionEvent e) {
						if (currentPosition <= targetPosition) {
							((Timer) e.getSource()).stop();
							return;
						}
						int scrollPosition = Math.max(currentPosition + scrollStep, targetPosition);
						verticalScrollBar.setValue(scrollPosition);
						currentPosition = scrollPosition;
					}
				});
				timer.start();
			}

			public void mouseEntered(MouseEvent e) {
				contacts.setText("<html><u>CONTACTS</u></html>");
			}

			public void mouseExited(MouseEvent e) {
				contacts.setText("CONTACTS");
			}
		});

		JLabel gallery = new JLabel("GALLERY");
		gallery.setHorizontalAlignment(SwingConstants.CENTER);
		gallery.setForeground(Color.WHITE);
		gallery.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		gallery.setFont(new Font("Tahoma", Font.BOLD, 18));
		gallery.setBackground(Color.WHITE);
		gallery.setBounds(688, 313, 132, 35);
		footer.add(gallery);
		gallery.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JScrollBar verticalScrollBar = scrollPane.getVerticalScrollBar();
				Timer timer = new Timer(5, new ActionListener() {
					private int currentPosition = verticalScrollBar.getValue();
					private final int scrollStep = -15;
					private final int targetPosition = 0;

					@Override
					public void actionPerformed(ActionEvent e) {
						if (currentPosition <= targetPosition) {
							((Timer) e.getSource()).stop();
							return;
						}
						int scrollPosition = Math.max(currentPosition + scrollStep, targetPosition);
						verticalScrollBar.setValue(scrollPosition);
						currentPosition = scrollPosition;
					}
				});
				timer.start();
			}

			public void mouseEntered(MouseEvent e) {
				gallery.setText("<html><u>GALLERY</u></html>");
			}

			public void mouseExited(MouseEvent e) {
				gallery.setText("GALLERY");
			}
		});

		JLabel shop = new JLabel("SHOP");
		shop.setHorizontalAlignment(SwingConstants.CENTER);
		shop.setForeground(Color.WHITE);
		shop.setFont(new Font("Tahoma", Font.BOLD, 18));
		shop.setBackground(Color.WHITE);
		shop.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		shop.setBounds(688, 275, 132, 35);
		footer.add(shop);
		shop.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JScrollBar verticalScrollBar = scrollPane.getVerticalScrollBar();
				Timer timer = new Timer(5, new ActionListener() {
					private int currentPosition = verticalScrollBar.getValue();
					private final int scrollStep = -15;
					private final int targetPosition = 0;

					@Override
					public void actionPerformed(ActionEvent e) {
						if (currentPosition <= targetPosition) {
							((Timer) e.getSource()).stop();
							return;
						}
						int scrollPosition = Math.max(currentPosition + scrollStep, targetPosition);
						verticalScrollBar.setValue(scrollPosition);
						currentPosition = scrollPosition;
					}
				});
				timer.start();
			}

			public void mouseEntered(MouseEvent e) {
				shop.setText("<html><u>SHOP</u></html>");
			}

			public void mouseExited(MouseEvent e) {
				shop.setText("SHOP");
			}
		});

		JLabel aboutus = new JLabel("ABOUT US");
		aboutus.setHorizontalAlignment(SwingConstants.CENTER);
		aboutus.setForeground(Color.WHITE);
		aboutus.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		aboutus.setFont(new Font("Tahoma", Font.BOLD, 18));
		aboutus.setBackground(Color.WHITE);
		aboutus.setBounds(688, 240, 132, 35);
		footer.add(aboutus);
		aboutus.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JScrollBar verticalScrollBar = scrollPane.getVerticalScrollBar();
				Timer timer = new Timer(5, new ActionListener() {
					private int currentPosition = verticalScrollBar.getValue();
					private final int scrollStep = -15;
					private final int targetPosition = 0;

					@Override
					public void actionPerformed(ActionEvent e) {
						if (currentPosition <= targetPosition) {
							((Timer) e.getSource()).stop();
							return;
						}
						int scrollPosition = Math.max(currentPosition + scrollStep, targetPosition);
						verticalScrollBar.setValue(scrollPosition);
						currentPosition = scrollPosition;
					}
				});
				timer.start();
			}

			public void mouseEntered(MouseEvent e) {
				aboutus.setText("<html><u>ABOUT US</u></html>");
			}

			public void mouseExited(MouseEvent e) {
				aboutus.setText("ABOUT US");
			}
		});

		JLabel home = new JLabel("HOME");
		home.setHorizontalAlignment(SwingConstants.CENTER);
		home.setForeground(new Color(255, 255, 255));
		home.setFont(new Font("Tahoma", Font.BOLD, 18));
		home.setBackground(new Color(255, 255, 255));
		home.setBounds(688, 205, 132, 35);
		home.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		home.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		footer.add(home);
		home.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JScrollBar verticalScrollBar = scrollPane.getVerticalScrollBar();
				Timer timer = new Timer(5, new ActionListener() {
					private int currentPosition = verticalScrollBar.getValue();
					private final int scrollStep = -15;
					private final int targetPosition = 0;

					@Override
					public void actionPerformed(ActionEvent e) {
						if (currentPosition <= targetPosition) {
							((Timer) e.getSource()).stop();
							return;
						}
						int scrollPosition = Math.max(currentPosition + scrollStep, targetPosition);
						verticalScrollBar.setValue(scrollPosition);
						currentPosition = scrollPosition;
					}
				});
				timer.start();
			}

			public void mouseEntered(MouseEvent e) {
				home.setText("<html><u>HOME</u></html>");
			}

			public void mouseExited(MouseEvent e) {
				home.setText("HOME");
			}
		});

		JLabel footerphoto = new JLabel("");
		footerphoto.setBounds(0, 0, 1370, 600);
		footerphoto.setIcon(new ImageIcon(end));
		footer.add(footerphoto);

	}
	
}
