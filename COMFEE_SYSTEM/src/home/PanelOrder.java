package home;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.Timer;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.BorderLayout;
import javax.swing.JCheckBox;
import javax.swing.JSpinner;

public class PanelOrder extends JPanel {

	private Image end = new ImageIcon(PanelHome.class.getResource("/img/Footer.png")).getImage().getScaledInstance(1370,
			600, Image.SCALE_SMOOTH);
	private Image seven = new ImageIcon(dashboard.class.getResource("/menuimg/affogato.png")).getImage()
			.getScaledInstance(275, 215, Image.SCALE_SMOOTH);
	private Image three = new ImageIcon(dashboard.class.getResource("/menuimg/Creme Brulee.png")).getImage()
			.getScaledInstance(275, 215, Image.SCALE_SMOOTH);

	JSpinner spinner1;
	JSpinner spinner2;
	JCheckBox checkbox1;
	JCheckBox checkbox2;

	public PanelOrder() {
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
		panel_scroll.setPreferredSize(new Dimension(1370, 1144));
		panel_scroll.setLayout(null);

		// add your components to the panel_scroll here

		scrollPane.setViewportView(panel_scroll);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(7, 7, 7));
		panel.setBounds(0, 0, 1370, 184);
		panel_scroll.add(panel);
		panel.setLayout(null);

		JLabel trackk = new JLabel("YOUR CART");
		trackk.setBounds(444, 45, 440, 96);
		panel.add(trackk);
		trackk.setHorizontalAlignment(SwingConstants.CENTER);
		trackk.setForeground(new Color(255, 255, 255));
		trackk.setFont(new Font("Tahoma", Font.BOLD, 39));

		JPanel footer = new JPanel();
		footer.setBounds(0, 540, 1370, 600);
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
		gallery.setFont(new Font("Tahoma", Font.BOLD, 18));
		gallery.setBackground(Color.WHITE);
		gallery.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
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
		shop.setBounds(688, 275, 132, 35);
		shop.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
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
		aboutus.setFont(new Font("Tahoma", Font.BOLD, 18));
		aboutus.setBackground(Color.WHITE);
		aboutus.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
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
		home.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		home.setBackground(new Color(255, 255, 255));
		home.setBounds(688, 205, 132, 35);
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

		JPanel order1 = new JPanel();
		order1.setBorder(new LineBorder(new Color(21, 21, 21)));
		order1.setBackground(new Color(216, 216, 216));
		order1.setBounds(104, 217, 537, 203);
		panel_scroll.add(order1);
		order1.setLayout(null);

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(229, 229, 229));
		panel_1.setBounds(291, 63, 217, 49);
		order1.add(panel_1);
		panel_1.setLayout(null);

		JLabel variation1 = new JLabel("Variation: Large, 3 cups");
		variation1.setHorizontalAlignment(SwingConstants.CENTER);
		variation1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		variation1.setBounds(0, 0, 217, 49);
		panel_1.add(variation1);

		JLabel photo_order1 = new JLabel("");
		photo_order1.setBounds(49, 11, 249, 181);
		photo_order1.setIcon(new ImageIcon(seven));
		order1.add(photo_order1);

		checkbox1 = new JCheckBox("");
		checkbox1.setBounds(17, 89, 30, 23);
		order1.add(checkbox1);

		JLabel name1 = new JLabel("AFFOGATO");
		name1.setFont(new Font("Tahoma", Font.PLAIN, 30));
		name1.setBounds(291, 23, 198, 39);
		order1.add(name1);

		spinner1 = new JSpinner();
		spinner1.setBounds(356, 140, 84, 30);
		spinner1.setValue(4);
		order1.add(spinner1);
		spinner1.addChangeListener(e -> {
			int value = (int) spinner1.getValue();
			if (value < 0) {
				spinner1.setValue(0); // Set the value to 0 if it is negative
			}
		});

		JLabel add1 = new JLabel("ADD:");
		add1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		add1.setBounds(302, 138, 57, 30);
		order1.add(add1);

		JPanel order2 = new JPanel();
		order2.setBorder(new LineBorder(new Color(21, 21, 21)));
		order2.setLayout(null);
		order2.setBackground(new Color(216, 216, 216));
		order2.setBounds(657, 217, 537, 203);
		panel_scroll.add(order2);

		JPanel variation_panel = new JPanel();
		variation_panel.setLayout(null);
		variation_panel.setBackground(new Color(229, 229, 229));
		variation_panel.setBounds(291, 63, 217, 49);
		order2.add(variation_panel);

		JLabel variation2 = new JLabel("Variation: Large, 1");
		variation2.setHorizontalAlignment(SwingConstants.CENTER);
		variation2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		variation2.setBounds(0, 0, 217, 49);
		variation_panel.add(variation2);

		JLabel photo_order2 = new JLabel("");
		photo_order2.setBounds(49, 11, 249, 181);
		photo_order2.setIcon(new ImageIcon(three));
		order2.add(photo_order2);

		checkbox2 = new JCheckBox("");
		checkbox2.setBounds(17, 89, 30, 23);
		order2.add(checkbox2);
		/*
		 * checkbox2.addActionListener(new ActionListener() {
		 * 
		 * @Override public void actionPerformed(ActionEvent e) { if
		 * (checkbox2.isSelected()) { spinner2.setValue(0); } } });
		 */

		JLabel name2 = new JLabel("CREME BRULEE");
		name2.setFont(new Font("Tahoma", Font.PLAIN, 30));
		name2.setBounds(291, 23, 217, 39);
		order2.add(name2);

		spinner2 = new JSpinner();
		spinner2.setBounds(356, 140, 84, 30);
		spinner2.setValue(2);
		order2.add(spinner2);
		spinner2.addChangeListener(e -> {
			int value = (int) spinner2.getValue();
			if (value < 0) {
				spinner2.setValue(0); // Set the value to 0 if it is negative
			}
		});

		JLabel add2 = new JLabel("ADD:");
		add2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		add2.setBounds(302, 138, 57, 30);
		order2.add(add2);

		JPanel placeorder_panel = new JPanel();
		placeorder_panel.setBackground(new Color(97, 122, 85));
		placeorder_panel.setBounds(978, 453, 216, 49);
		panel_scroll.add(placeorder_panel);
		placeorder_panel.setLayout(null);

		JLabel cartisEmpty = new JLabel("Your Cart is Empty...");
		cartisEmpty.setBounds(100, 248, 522, 123);
		cartisEmpty.setForeground(new Color(34, 0, 0));
		cartisEmpty.setFont(new Font("Century Gothic", Font.BOLD, 48));
		cartisEmpty.setVisible(false);
		panel_scroll.add(cartisEmpty);

		JLabel placeorder = new JLabel("PLACE ORDER");
		placeorder.setForeground(new Color(255, 255, 255));
		placeorder.setFont(new Font("Tahoma", Font.PLAIN, 18));
		placeorder.setHorizontalAlignment(SwingConstants.CENTER);
		placeorder.setBounds(0, 0, 216, 49);
		placeorder.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		placeorder_panel.add(placeorder);
		placeorder.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				if (checkbox1.isSelected()) {
					spinner1.setValue(0);
					order1.setVisible(false);
					order2.setBounds(104, 217, 537, 203);
				}

				if (checkbox2.isSelected()) {
					order2.setVisible(false);
					spinner2.setValue(0);
				}

				if (checkbox1.isSelected() && checkbox2.isSelected()) {
					cartisEmpty.setVisible(true);
				}
			}

			public void mouseEntered(MouseEvent e) {
				placeorder_panel.setBackground(new Color(160, 196, 157));
				placeorder_panel.setBorder(new LineBorder(new Color(0, 0, 0)));
				placeorder.setForeground(new Color(21, 21, 21));
			}

			public void mouseExited(MouseEvent e) {
				placeorder_panel.setBackground(new Color(96, 153, 102));
				placeorder.setForeground(new Color(224, 224, 224));
				placeorder_panel.setBorder(null);
			}
		});

		JPanel cancel_panel = new JPanel();
		cancel_panel.setBackground(new Color(97, 122, 85));
		cancel_panel.setBounds(749, 453, 216, 49);
		panel_scroll.add(cancel_panel);
		cancel_panel.setLayout(null);

		JLabel cancel = new JLabel("CANCEL ORDER");
		cancel.setForeground(new Color(255, 255, 255));
		cancel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		cancel.setHorizontalAlignment(SwingConstants.CENTER);
		cancel.setBounds(0, 0, 216, 49);
		cancel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		cancel_panel.add(cancel);
		cancel.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				Image icon = new ImageIcon(getClass().getResource("/img/sadface.png")).getImage().getScaledInstance(80,
						80, Image.SCALE_SMOOTH);
				int choice = JOptionPane.showConfirmDialog(null, "Are you sure you want to cancel your order?",
						"Cancellation of Order", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,
						new ImageIcon(icon));
				if (choice == JOptionPane.YES_OPTION) {
					// Perform cancellation logic here
					if (checkbox1.isSelected()) {
						spinner1.setValue(0);
						spinner2.setValue(0);
						order1.setVisible(false);
						order2.setBounds(104, 217, 537, 203);
					}

					if (checkbox2.isSelected()) {
						order2.setVisible(false);
					}

					if (checkbox1.isSelected() && checkbox2.isSelected()) {
						cartisEmpty.setVisible(true);
					}
				}
			}

			public void mouseEntered(MouseEvent e) {
				cancel_panel.setBackground(new Color(160, 196, 157));
				cancel_panel.setBorder(new LineBorder(new Color(0, 0, 0)));
				cancel.setForeground(new Color(21, 21, 21));
			}

			public void mouseExited(MouseEvent e) {
				cancel_panel.setBackground(new Color(96, 153, 102));
				cancel.setForeground(new Color(224, 224, 224));
				cancel_panel.setBorder(null);
			}
		});

	}
}
