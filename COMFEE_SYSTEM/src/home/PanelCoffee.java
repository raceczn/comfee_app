package home;

import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.border.LineBorder;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JSpinner;
import javax.swing.JComboBox;

public class PanelCoffee extends JPanel {

	private Image one = new ImageIcon(dashboard.class.getResource("/menuimg/hotamericano.png")).getImage()
			.getScaledInstance(275, 215, Image.SCALE_SMOOTH);
	private Image two = new ImageIcon(dashboard.class.getResource("/menuimg/iceamericano.png")).getImage()
			.getScaledInstance(275, 215, Image.SCALE_SMOOTH);
	private Image three = new ImageIcon(dashboard.class.getResource("/menuimg/icelatte.png")).getImage()
			.getScaledInstance(275, 215, Image.SCALE_SMOOTH);
	private Image four = new ImageIcon(dashboard.class.getResource("/menuimg/hotlatte.png")).getImage()
			.getScaledInstance(275, 215, Image.SCALE_SMOOTH);
	private Image five = new ImageIcon(dashboard.class.getResource("/menuimg/hotmocha.png")).getImage()
			.getScaledInstance(275, 215, Image.SCALE_SMOOTH);
	private Image six = new ImageIcon(dashboard.class.getResource("/menuimg/icemocha.png")).getImage()
			.getScaledInstance(275, 215, Image.SCALE_SMOOTH);
	private Image seven = new ImageIcon(dashboard.class.getResource("/menuimg/affogato.png")).getImage()
			.getScaledInstance(275, 215, Image.SCALE_SMOOTH);
	private Image eight = new ImageIcon(dashboard.class.getResource("/menuimg/caramelcoffee.png")).getImage()
			.getScaledInstance(275, 215, Image.SCALE_SMOOTH);
	private Image nine = new ImageIcon(dashboard.class.getResource("/menuimg/cappucino.png")).getImage()
			.getScaledInstance(275, 215, Image.SCALE_SMOOTH);
	private Image ten = new ImageIcon(dashboard.class.getResource("/menuimg/macchiato.png")).getImage()
			.getScaledInstance(275, 215, Image.SCALE_SMOOTH);
	private Image eleven = new ImageIcon(dashboard.class.getResource("/menuimg/espresso.png")).getImage()
			.getScaledInstance(275, 215, Image.SCALE_SMOOTH);
	private Image twelve = new ImageIcon(dashboard.class.getResource("/menuimg/longblack.png")).getImage()
			.getScaledInstance(275, 215, Image.SCALE_SMOOTH);

	public PanelCoffee() {
		setBackground(new Color(255, 255, 255));
		setBounds(0, 0, 1235, 1300);
		setLayout(null);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(0, 0, 1235, 1180);
		add(panel);
		panel.setLayout(null);

		JPanel container1 = new JPanel();
		container1.setBackground(new Color(255, 255, 255));
		container1.setBounds(29, 21, 295, 369);
		panel.add(container1);
		container1.setLayout(null);

		JLabel name1 = new JLabel("HOT AMERICANO");
		name1.setBounds(74, 225, 145, 28);
		name1.setHorizontalAlignment(SwingConstants.CENTER);
		name1.setFont(new Font("SansSerif", Font.BOLD, 16));
		container1.add(name1);

		JSpinner spinner1 = new JSpinner();
		spinner1.setBounds(182, 279, 68, 25);
		container1.add(spinner1);
		spinner1.addChangeListener(e -> {
			int value = (int) spinner1.getValue();
			if (value < 0) {
				spinner1.setValue(0); // Set the value to 0 if it is negative
			}
		});

		JPanel panel_add1 = new JPanel();
		panel_add1.setBounds(38, 315, 212, 40);
		panel_add1.setBackground(new Color(97, 122, 85));
		container1.add(panel_add1);
		panel_add1.setLayout(null);

		JLabel pic1 = new JLabel("");
		pic1.setBounds(10, 11, 275, 215);
		pic1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		pic1.setIcon(new ImageIcon(one));
		container1.add(pic1);

		pic1.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				spinner1.setValue((int) spinner1.getValue() + 1);
			}

			public void mouseEntered(MouseEvent e) {
				pic1.setBorder(new LineBorder(new Color(255, 255, 255), 6));
				pic1.setBounds(5, 0, 275, 215);
			}

			public void mouseExited(MouseEvent e) {
				pic1.setBorder(null);
				pic1.setBounds(10, 11, 275, 215);
			}
		});
		JComboBox comboBox1 = new JComboBox();
		comboBox1.setBounds(38, 280, 133, 24);
		comboBox1.addItem("Small");
		comboBox1.addItem("Medium");
		comboBox1.addItem("Large");
		comboBox1.setBackground(new Color(255, 255, 255));
		comboBox1.setForeground(new Color(51, 51, 51));
		Font newFont = new Font("Arial", Font.PLAIN, 14);
		comboBox1.setFont(newFont);
		comboBox1.setBorder(BorderFactory.createLineBorder(new Color(122, 168, 116), 1));
		comboBox1.setFocusable(false);
		comboBox1.setOpaque(true);
		container1.add(comboBox1);
		
		JLabel addtocart1 = new JLabel("ADD TO CART");
		addtocart1.setBounds(0, 0, 212, 40);
		panel_add1.add(addtocart1);
		addtocart1.setForeground(new Color(255, 255, 255));
		addtocart1.setFont(new Font("Century Gothic", Font.BOLD, 17));
		addtocart1.setHorizontalAlignment(SwingConstants.CENTER);
		addtocart1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		addtocart1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int spinnerValue = (Integer) spinner1.getValue();
				String selectedSize = (String) comboBox1.getSelectedItem();

				if (spinnerValue >= 1) {
					spinner1.setValue(0);
					ImageIcon icon = new ImageIcon(getClass().getResource("/img/check.png"));
					JOptionPane.showMessageDialog(null,
							"<html><font color='#0e1d73'><b>HOT AMERICANO</b></font> has been added to your cart."
									+ "<br><br><b>ITEM:</b> " + spinnerValue + "<br>" + " <b>SIZE:</b> "
									+ selectedSize + "</html>",
							"Successfully Added", JOptionPane.INFORMATION_MESSAGE, icon);
				} else {
					JOptionPane.showMessageDialog(null, "Please place an order before adding it to the cart.", "Warning",
							JOptionPane.WARNING_MESSAGE);
				}
			}
			
			public void mouseEntered(MouseEvent e) {
				panel_add1.setBackground(new Color(164, 208, 164));
				addtocart1.setForeground(new Color(22, 69, 35));
				panel_add1.setBorder(new LineBorder(new Color(22, 69, 35), 1));
			}
			public void mouseExited(MouseEvent e) {
				panel_add1.setBackground(new Color(97, 122, 85));
				addtocart1.setForeground(new Color(255, 255, 255));
				panel_add1.setBorder(null);
			}
		});


		JLabel price1 = new JLabel("<html><strong>PRICE: </strong> ₱65.00");
		price1.setFont(new Font("SansSerif", Font.PLAIN, 14));
		price1.setHorizontalAlignment(SwingConstants.CENTER);
		price1.setBounds(84, 250, 109, 25);
		container1.add(price1);

		comboBox1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String selectedOption = (String) comboBox1.getSelectedItem();
				if (selectedOption.equals("Small")) {
					price1.setText("<html><strong>PRICE: </strong> ₱65.00");
				} else if (selectedOption.equals("Medium")) {
					price1.setText("<html><strong>PRICE: </strong> ₱75.00");
				} else if (selectedOption.equals("Large")) {
					price1.setText("<html><strong>PRICE: </strong> ₱85.00");
				}
			}
		});

		JPanel container2 = new JPanel();
		container2.setBackground(new Color(255, 255, 255));
		container2.setLayout(null);
		container2.setBounds(330, 21, 295, 369);
		panel.add(container2);

		JLabel name2 = new JLabel("ICED AMERICANO");
		name2.setHorizontalAlignment(SwingConstants.CENTER);
		name2.setFont(new Font("SansSerif", Font.BOLD, 16));
		name2.setBounds(74, 225, 145, 28);
		container2.add(name2);

		JSpinner spinner2 = new JSpinner();
		spinner2.setBounds(182, 279, 68, 25);
		container2.add(spinner2);
		spinner2.addChangeListener(e -> {
			int value = (int) spinner2.getValue();
			if (value < 0) {
				spinner2.setValue(0); // Set the value to 0 if it is negative
			}
		});

		JPanel panel_add2 = new JPanel();
		panel_add2.setLayout(null);
		panel_add2.setBackground(new Color(97, 122, 85));
		panel_add2.setBounds(38, 315, 212, 40);
		container2.add(panel_add2);

		JComboBox comboBox2 = new JComboBox();
		comboBox2.addItem("Small");
		comboBox2.addItem("Medium");
		comboBox2.addItem("Large");
		comboBox2.setOpaque(true);
		comboBox2.setForeground(new Color(51, 51, 51));
		comboBox2.setFont(new Font("Arial", Font.PLAIN, 14));
		comboBox2.setFocusable(false);
		comboBox2.setBorder(BorderFactory.createLineBorder(new Color(204, 204, 204), 2));
		comboBox2.setBackground(Color.WHITE);
		comboBox2.setBounds(38, 280, 133, 24);
		container2.add(comboBox2);
		
		JLabel addtocart2 = new JLabel("ADD TO CART");
		addtocart2.setHorizontalAlignment(SwingConstants.CENTER);
		addtocart2.setForeground(Color.WHITE);
		addtocart2.setFont(new Font("Century Gothic", Font.BOLD, 17));
		addtocart2.setBounds(0, 0, 212, 40);
		addtocart2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		panel_add2.add(addtocart2);
		addtocart2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int spinnerValue = (Integer) spinner2.getValue();
				String selectedSize = (String) comboBox2.getSelectedItem();

				if (spinnerValue >= 1) {
					spinner2.setValue(0);
					ImageIcon icon = new ImageIcon(getClass().getResource("/img/check.png"));
					JOptionPane.showMessageDialog(null,
							"<html><font color='#0e1d73'><b>ICED AMERICANO</b></font> has been added to your cart."
									+ "<br><br><b>ITEM:</b> " + spinnerValue + "<br>" + " <b>SIZE:</b> " + selectedSize
									+ "</html>",
							"Successfully Added", JOptionPane.INFORMATION_MESSAGE, icon);
				} else {
					JOptionPane.showMessageDialog(null, "Please place an order before adding it to the cart.",
							"Warning", JOptionPane.WARNING_MESSAGE);
				}
			}


			public void mouseEntered(MouseEvent e) {
				panel_add2.setBackground(new Color(164, 208, 164));
				addtocart2.setForeground(new Color(22, 69, 35));
				panel_add2.setBorder(new LineBorder(new Color(22, 69, 35), 1));
			}

			public void mouseExited(MouseEvent e) {
				panel_add2.setBackground(new Color(97, 122, 85));
				addtocart2.setForeground(new Color(255, 255, 255));
				panel_add2.setBorder(null);
			}
		});

		JLabel pic2 = new JLabel("");
		pic2.setBounds(10, 11, 275, 215);
		pic2.setIcon(new ImageIcon(two));
		container2.add(pic2);
		pic2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		pic2.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				spinner2.setValue((int) spinner2.getValue() + 1);
			}

			public void mouseEntered(MouseEvent e) {
				pic2.setBorder(new LineBorder(new Color(255, 255, 255), 6));
				pic2.setBounds(5, 0, 275, 215);
			}

			public void mouseExited(MouseEvent e) {
				pic2.setBorder(null);
				pic2.setBounds(10, 11, 275, 215);
			}
		});


		JLabel price2 = new JLabel("<html><strong>PRICE: </strong> ₱65.00");
		price2.setHorizontalAlignment(SwingConstants.CENTER);
		price2.setFont(new Font("SansSerif", Font.PLAIN, 14));
		price2.setBounds(84, 250, 109, 25);
		container2.add(price2);

		comboBox2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String selectedOption = (String) comboBox2.getSelectedItem();
				if (selectedOption.equals("Small")) {
					price2.setText("<html><strong>PRICE: </strong> ₱65.00");
				} else if (selectedOption.equals("Medium")) {
					price2.setText("<html><strong>PRICE: </strong> ₱75.00");
				} else if (selectedOption.equals("Large")) {
					price2.setText("<html><strong>PRICE: </strong> ₱85.00");
				}
			}
		});

		JPanel container3 = new JPanel();
		container3.setBackground(new Color(255, 255, 255));
		container3.setLayout(null);
		container3.setBounds(630, 21, 295, 369);
		panel.add(container3);

		JLabel name3 = new JLabel("ICED LATTE");
		name3.setHorizontalAlignment(SwingConstants.CENTER);
		name3.setFont(new Font("SansSerif", Font.BOLD, 16));
		name3.setBounds(74, 225, 145, 28);
		container3.add(name3);

		JSpinner spinner3 = new JSpinner();
		spinner3.setBounds(182, 279, 68, 25);
		container3.add(spinner3);
		spinner3.addChangeListener(e -> {
			int value = (int) spinner3.getValue();
			if (value < 0) {
				spinner3.setValue(0); // Set the value to 0 if it is negative
			}
		});
		

		JPanel panel_add3 = new JPanel();
		panel_add3.setLayout(null);
		panel_add3.setBackground(new Color(97, 122, 85));
		panel_add3.setBounds(38, 315, 212, 40);
		container3.add(panel_add3);

		JComboBox comboBox3 = new JComboBox();
		comboBox3.addItem("Small");
		comboBox3.addItem("Medium");
		comboBox3.addItem("Large");
		comboBox3.setOpaque(true);
		comboBox3.setForeground(new Color(51, 51, 51));
		comboBox3.setFont(new Font("Arial", Font.PLAIN, 14));
		comboBox3.setFocusable(false);
		comboBox3.setBorder(BorderFactory.createLineBorder(new Color(204, 204, 204), 2));
		comboBox3.setBackground(Color.WHITE);
		comboBox3.setBounds(38, 280, 133, 24);
		container3.add(comboBox3);
		
		JLabel addtocart3 = new JLabel("ADD TO CART");
		addtocart3.setHorizontalAlignment(SwingConstants.CENTER);
		addtocart3.setForeground(Color.WHITE);
		addtocart3.setFont(new Font("Century Gothic", Font.BOLD, 17));
		addtocart3.setBounds(0, 0, 212, 40);
		addtocart3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		panel_add3.add(addtocart3);
		addtocart3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int spinnerValue = (Integer) spinner3.getValue();
				String selectedSize = (String) comboBox3.getSelectedItem();

				if (spinnerValue >= 1) {
					spinner3.setValue(0);
					ImageIcon icon = new ImageIcon(getClass().getResource("/img/check.png"));
					JOptionPane.showMessageDialog(null,
							"<html><font color='#0e1d73'><b>ICED LATTE</b></font> has been added to your cart."
									+ "<br><br><b>ITEM:</b> " + spinnerValue + "<br>" + " <b>SIZE:</b> "
									+ selectedSize + "</html>",
							"Successfully Added", JOptionPane.INFORMATION_MESSAGE, icon);
				} else {
					JOptionPane.showMessageDialog(null, "Please place an order before adding it to the cart.", "Warning",
							JOptionPane.WARNING_MESSAGE);
				}
			}

			public void mouseEntered(MouseEvent e) {
				panel_add3.setBackground(new Color(164, 208, 164));
				addtocart3.setForeground(new Color(22, 69, 35));
				panel_add3.setBorder(new LineBorder(new Color(22, 69, 35), 1));
			}

			public void mouseExited(MouseEvent e) {
				panel_add3.setBackground(new Color(97, 122, 85));
				addtocart3.setForeground(new Color(255, 255, 255));
				panel_add3.setBorder(null);
			}
		});
		
		JLabel pic3 = new JLabel("");
		pic3.setBounds(10, 11, 275, 215);
		pic3.setIcon(new ImageIcon(three));
		pic3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		container3.add(pic3);
		pic3.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				spinner3.setValue((int) spinner3.getValue() + 1);
			}

			public void mouseEntered(MouseEvent e) {
				pic3.setBorder(new LineBorder(new Color(255, 255, 255), 6));
				pic3.setBounds(5, 0, 275, 215);
			}

			public void mouseExited(MouseEvent e) {
				pic3.setBorder(null);
				pic3.setBounds(10, 11, 275, 215);
			}
		});

		JLabel price3 = new JLabel("<html><strong>PRICE: </strong> ₱65.00");
		price3.setHorizontalAlignment(SwingConstants.CENTER);
		price3.setFont(new Font("SansSerif", Font.PLAIN, 14));
		price3.setBounds(84, 250, 109, 25);
		container3.add(price3);

		comboBox3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String selectedOption = (String) comboBox3.getSelectedItem();
				if (selectedOption.equals("Small")) {
					price3.setText("<html><strong>PRICE: </strong> ₱65.00");
				} else if (selectedOption.equals("Medium")) {
					price3.setText("<html><strong>PRICE: </strong> ₱75.00");
				} else if (selectedOption.equals("Large")) {
					price3.setText("<html><strong>PRICE: </strong> ₱85.00");
				}
			}
		});

		JPanel container4 = new JPanel();
		container4.setBackground(new Color(255, 255, 255));
		container4.setLayout(null);
		container4.setBounds(930, 21, 295, 369);
		panel.add(container4);

		JLabel name4 = new JLabel("HOT LATTE");
		name4.setHorizontalAlignment(SwingConstants.CENTER);
		name4.setFont(new Font("SansSerif", Font.BOLD, 16));
		name4.setBounds(74, 225, 145, 28);
		container4.add(name4);

		JSpinner spinner4 = new JSpinner();
		spinner4.setBounds(182, 279, 68, 25);
		container4.add(spinner4);
		spinner4.addChangeListener(e -> {
			int value = (int) spinner4.getValue();
			if (value < 0) {
				spinner4.setValue(0); // Set the value to 0 if it is negative
			}
		});

		JPanel panel_add4 = new JPanel();
		panel_add4.setLayout(null);
		panel_add4.setBackground(new Color(97, 122, 85));
		panel_add4.setBounds(38, 315, 212, 40);
		container4.add(panel_add4);

		JComboBox comboBox4 = new JComboBox();
		comboBox4.addItem("Small");
		comboBox4.addItem("Medium");
		comboBox4.addItem("Large");
		comboBox4.setOpaque(true);
		comboBox4.setForeground(new Color(51, 51, 51));
		comboBox4.setFont(new Font("Arial", Font.PLAIN, 14));
		comboBox4.setFocusable(false);
		comboBox4.setBorder(BorderFactory.createLineBorder(new Color(204, 204, 204), 2));
		comboBox4.setBackground(Color.WHITE);
		comboBox4.setBounds(38, 280, 133, 24);
		container4.add(comboBox4);
		
		JLabel addtocart4 = new JLabel("ADD TO CART");
		addtocart4.setHorizontalAlignment(SwingConstants.CENTER);
		addtocart4.setForeground(Color.WHITE);
		addtocart4.setFont(new Font("Century Gothic", Font.BOLD, 17));
		addtocart4.setBounds(0, 0, 212, 40);
		addtocart4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		panel_add4.add(addtocart4);
		addtocart4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int spinnerValue = (Integer) spinner4.getValue();
				String selectedSize = (String) comboBox4.getSelectedItem();

				if (spinnerValue >= 1) {
					spinner4.setValue(0);
					ImageIcon icon = new ImageIcon(getClass().getResource("/img/check.png"));
					JOptionPane.showMessageDialog(null,
							"<html><font color='#0e1d73'><b>HOT LATTE</b></font> has been added to your cart."
									+ "<br><br><b>ITEM:</b> " + spinnerValue + "<br>" + " <b>SIZE:</b> "
									+ selectedSize + "</html>",
							"Successfully Added", JOptionPane.INFORMATION_MESSAGE, icon);
				} else {
					JOptionPane.showMessageDialog(null, "Please place an order before adding it to the cart.", "Warning",
							JOptionPane.WARNING_MESSAGE);
				}
			}

			public void mouseEntered(MouseEvent e) {
				panel_add4.setBackground(new Color(164, 208, 164));
				addtocart4.setForeground(new Color(22, 69, 35));
				panel_add4.setBorder(new LineBorder(new Color(22, 69, 35), 1));
			}

			public void mouseExited(MouseEvent e) {
				panel_add4.setBackground(new Color(97, 122, 85));
				addtocart4.setForeground(new Color(255, 255, 255));
				panel_add4.setBorder(null);
			}
		});

		JLabel pic4 = new JLabel("");
		pic4.setBounds(10, 11, 275, 215);
		pic4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		pic4.setIcon(new ImageIcon(four));
		container4.add(pic4);
		pic4.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				spinner4.setValue((int) spinner4.getValue() + 1);
			}

			public void mouseEntered(MouseEvent e) {
				pic4.setBorder(new LineBorder(new Color(255, 255, 255), 6));
				pic4.setBounds(5, 0, 275, 215);
			}

			public void mouseExited(MouseEvent e) {
				pic4.setBorder(null);
				pic4.setBounds(10, 11, 275, 215);
			}
		});

		JLabel price4 = new JLabel("<html><strong>PRICE: </strong> ₱65.00");
		price4.setHorizontalAlignment(SwingConstants.CENTER);
		price4.setFont(new Font("SansSerif", Font.PLAIN, 14));
		price4.setBounds(84, 250, 109, 25);
		container4.add(price4);

		comboBox4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String selectedOption = (String) comboBox4.getSelectedItem();
				if (selectedOption.equals("Small")) {
					price4.setText("<html><strong>PRICE: </strong> ₱65.00");
				} else if (selectedOption.equals("Medium")) {
					price4.setText("<html><strong>PRICE: </strong> ₱75.00");
				} else if (selectedOption.equals("Large")) {
					price4.setText("<html><strong>PRICE: </strong> ₱85.00");
				}
			}
		});

		JPanel container5 = new JPanel();
		container5.setBackground(new Color(255, 255, 255));
		container5.setLayout(null);
		container5.setBounds(29, 395, 295, 369);
		panel.add(container5);

		JLabel name5 = new JLabel("HOT MOCHA");
		name5.setHorizontalAlignment(SwingConstants.CENTER);
		name5.setFont(new Font("SansSerif", Font.BOLD, 16));
		name5.setBounds(74, 225, 145, 28);
		container5.add(name5);

		JSpinner spinner5 = new JSpinner();
		spinner5.setBounds(182, 279, 68, 25);
		container5.add(spinner5);
		spinner5.addChangeListener(e -> {
			int value = (int) spinner5.getValue();
			if (value < 0) {
				spinner5.setValue(0); // Set the value to 0 if it is negative
			}
		});
		
		JPanel panel_add5 = new JPanel();
		panel_add5.setLayout(null);
		panel_add5.setBackground(new Color(97, 122, 85));
		panel_add5.setBounds(38, 315, 212, 40);
		container5.add(panel_add5);

		JComboBox comboBox5 = new JComboBox();
		comboBox5.addItem("Small");
		comboBox5.addItem("Medium");
		comboBox5.addItem("Large");
		comboBox5.setOpaque(true);
		comboBox5.setForeground(new Color(51, 51, 51));
		comboBox5.setFont(new Font("Arial", Font.PLAIN, 14));
		comboBox5.setFocusable(false);
		comboBox5.setBorder(BorderFactory.createLineBorder(new Color(204, 204, 204), 2));
		comboBox5.setBackground(Color.WHITE);
		comboBox5.setBounds(38, 280, 133, 24);
		container5.add(comboBox5);
		
		JLabel addtocart5 = new JLabel("ADD TO CART");
		addtocart5.setHorizontalAlignment(SwingConstants.CENTER);
		addtocart5.setForeground(Color.WHITE);
		addtocart5.setFont(new Font("Century Gothic", Font.BOLD, 17));
		addtocart5.setBounds(0, 0, 212, 40);
		addtocart5.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		panel_add5.add(addtocart5);
		addtocart5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int spinnerValue = (Integer) spinner5.getValue();
				String selectedSize = (String) comboBox5.getSelectedItem();

				if (spinnerValue >= 1) {
					spinner5.setValue(0);
					ImageIcon icon = new ImageIcon(getClass().getResource("/img/check.png"));
					JOptionPane.showMessageDialog(null,
							"<html><font color='#0e1d73'><b>HOT MOCHA</b></font> has been added to your cart."
									+ "<br><br><b>ITEM:</b> " + spinnerValue + "<br>" + " <b>SIZE:</b> "
									+ selectedSize + "</html>",
							"Successfully Added", JOptionPane.INFORMATION_MESSAGE, icon);
				} else {
					JOptionPane.showMessageDialog(null, "Please place an order before adding it to the cart.", "Warning",
							JOptionPane.WARNING_MESSAGE);
				}
			}

			public void mouseEntered(MouseEvent e) {
				panel_add5.setBackground(new Color(164, 208, 164));
				addtocart5.setForeground(new Color(22, 69, 35));
				panel_add5.setBorder(new LineBorder(new Color(22, 69, 35), 1));
			}

			public void mouseExited(MouseEvent e) {
				panel_add5.setBackground(new Color(97, 122, 85));
				addtocart5.setForeground(new Color(255, 255, 255));
				panel_add5.setBorder(null);
			}
		});

		JLabel pic5 = new JLabel("");
		pic5.setBounds(10, 11, 275, 215);
		pic5.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		pic5.setIcon(new ImageIcon(five));
		container5.add(pic5);

		pic5.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				spinner5.setValue((int) spinner5.getValue() + 1);
			}

			public void mouseEntered(MouseEvent e) {
				pic5.setBorder(new LineBorder(new Color(255, 255, 255), 6));
				pic5.setBounds(5, 0, 275, 215);
			}

			public void mouseExited(MouseEvent e) {
				pic5.setBorder(null);
				pic5.setBounds(10, 11, 275, 215);
			}
		});

		JLabel price5 = new JLabel("<html><strong>PRICE: </strong> ₱65.00");
		price5.setHorizontalAlignment(SwingConstants.CENTER);
		price5.setFont(new Font("SansSerif", Font.PLAIN, 14));
		price5.setBounds(84, 250, 109, 25);
		container5.add(price5);

		comboBox5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String selectedOption = (String) comboBox5.getSelectedItem();
				if (selectedOption.equals("Small")) {
					price5.setText("<html><strong>PRICE: </strong> ₱65.00");
				} else if (selectedOption.equals("Medium")) {
					price5.setText("<html><strong>PRICE: </strong> ₱75.00");
				} else if (selectedOption.equals("Large")) {
					price5.setText("<html><strong>PRICE: </strong> ₱85.00");
				}
			}
		});

		JPanel container6 = new JPanel();
		container6.setBackground(new Color(255, 255, 255));
		container6.setLayout(null);
		container6.setBounds(330, 395, 295, 369);
		panel.add(container6);

		JLabel name6 = new JLabel("ICED MOCHA");
		name6.setHorizontalAlignment(SwingConstants.CENTER);
		name6.setFont(new Font("SansSerif", Font.BOLD, 16));
		name6.setBounds(74, 225, 145, 28);
		container6.add(name6);

		JSpinner spinner6 = new JSpinner();
		spinner6.setBounds(182, 279, 68, 25);
		container6.add(spinner6);
		spinner6.addChangeListener(e -> {
			int value = (int) spinner6.getValue();
			if (value < 0) {
				spinner6.setValue(0); // Set the value to 0 if it is negative
			}
		});
		
		JPanel panel_add6 = new JPanel();
		panel_add6.setLayout(null);
		panel_add6.setBackground(new Color(97, 122, 85));
		panel_add6.setBounds(38, 315, 212, 40);
		container6.add(panel_add6);

		JComboBox comboBox6 = new JComboBox();
		comboBox6.addItem("Small");
		comboBox6.addItem("Medium");
		comboBox6.addItem("Large");
		comboBox6.setOpaque(true);
		comboBox6.setForeground(new Color(51, 51, 51));
		comboBox6.setFont(new Font("Arial", Font.PLAIN, 14));
		comboBox6.setFocusable(false);
		comboBox6.setBorder(BorderFactory.createLineBorder(new Color(204, 204, 204), 2));
		comboBox6.setBackground(Color.WHITE);
		comboBox6.setBounds(38, 280, 133, 24);
		container6.add(comboBox6);
		
		JLabel addtocart6 = new JLabel("ADD TO CART");
		addtocart6.setHorizontalAlignment(SwingConstants.CENTER);
		addtocart6.setForeground(Color.WHITE);
		addtocart6.setFont(new Font("Century Gothic", Font.BOLD, 17));
		addtocart6.setBounds(0, 0, 212, 40);
		addtocart6.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		panel_add6.add(addtocart6);
		addtocart6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int spinnerValue = (Integer) spinner6.getValue();
				String selectedSize = (String) comboBox6.getSelectedItem();

				if (spinnerValue >= 1) {
					spinner6.setValue(0);
					ImageIcon icon = new ImageIcon(getClass().getResource("/img/check.png"));
					JOptionPane.showMessageDialog(null,
							"<html><font color='#0e1d73'><b>ICED MOCHA</b></font> has been added to your cart."
									+ "<br><br><b>ITEM:</b> " + spinnerValue + "<br>" + " <b>SIZE:</b> "
									+ selectedSize + "</html>",
							"Successfully Added", JOptionPane.INFORMATION_MESSAGE, icon);
				} else {
					JOptionPane.showMessageDialog(null, "Please place an order before adding it to the cart.", "Warning",
							JOptionPane.WARNING_MESSAGE);
				}
			}


			public void mouseEntered(MouseEvent e) {
				panel_add6.setBackground(new Color(164, 208, 164));
				addtocart6.setForeground(new Color(22, 69, 35));
				panel_add6.setBorder(new LineBorder(new Color(22, 69, 35), 1));
			}

			public void mouseExited(MouseEvent e) {
				panel_add6.setBackground(new Color(97, 122, 85));
				addtocart6.setForeground(new Color(255, 255, 255));
				panel_add6.setBorder(null);
			}
		});

		JLabel pic6 = new JLabel("");
		pic6.setBounds(10, 11, 275, 215);
		pic6.setIcon(new ImageIcon(six));
		pic6.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		container6.add(pic6);
		pic6.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				spinner6.setValue((int) spinner6.getValue() + 1);
			}

			public void mouseEntered(MouseEvent e) {
				pic6.setBorder(new LineBorder(new Color(255, 255, 255), 6));
				pic6.setBounds(5, 0, 275, 215);
			}

			public void mouseExited(MouseEvent e) {
				pic6.setBorder(null);
				pic6.setBounds(10, 11, 275, 215);
			}
		});

		JLabel price6 = new JLabel("<html><strong>PRICE: </strong> ₱65.00");
		price6.setHorizontalAlignment(SwingConstants.CENTER);
		price6.setFont(new Font("SansSerif", Font.PLAIN, 14));
		price6.setBounds(84, 250, 109, 25);
		container6.add(price6);

		comboBox6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String selectedOption = (String) comboBox6.getSelectedItem();
				if (selectedOption.equals("Small")) {
					price6.setText("<html><strong>PRICE: </strong> ₱65.00");
				} else if (selectedOption.equals("Medium")) {
					price6.setText("<html><strong>PRICE: </strong> ₱75.00");
				} else if (selectedOption.equals("Large")) {
					price6.setText("<html><strong>PRICE: </strong> ₱85.00");
				}
			}
		});

		JPanel container7 = new JPanel();
		container7.setBackground(new Color(255, 255, 255));
		container7.setLayout(null);
		container7.setBounds(630, 395, 295, 369);
		panel.add(container7);

		JLabel name7 = new JLabel("AFFOGATO");
		name7.setHorizontalAlignment(SwingConstants.CENTER);
		name7.setFont(new Font("SansSerif", Font.BOLD, 16));
		name7.setBounds(74, 225, 145, 28);
		container7.add(name7);

		JSpinner spinner7 = new JSpinner();
		spinner7.setBounds(182, 279, 68, 25);
		container7.add(spinner7);
		spinner7.addChangeListener(e -> {
			int value = (int) spinner7.getValue();
			if (value < 0) {
				spinner7.setValue(0); // Set the value to 0 if it is negative
			}
		});

		JPanel panel_add7 = new JPanel();
		panel_add7.setLayout(null);
		panel_add7.setBackground(new Color(97, 122, 85));
		panel_add7.setBounds(38, 315, 212, 40);
		container7.add(panel_add7);

		JComboBox comboBox7 = new JComboBox();
		comboBox7.addItem("Small");
		comboBox7.addItem("Medium");
		comboBox7.addItem("Large");
		comboBox7.setOpaque(true);
		comboBox7.setForeground(new Color(51, 51, 51));
		comboBox7.setFont(new Font("Arial", Font.PLAIN, 14));
		comboBox7.setFocusable(false);
		comboBox7.setBorder(BorderFactory.createLineBorder(new Color(204, 204, 204), 2));
		comboBox7.setBackground(Color.WHITE);
		comboBox7.setBounds(38, 280, 133, 24);
		container7.add(comboBox7);

		
		JLabel addtocart7 = new JLabel("ADD TO CART");
		addtocart7.setHorizontalAlignment(SwingConstants.CENTER);
		addtocart7.setForeground(Color.WHITE);
		addtocart7.setFont(new Font("Century Gothic", Font.BOLD, 17));
		addtocart7.setBounds(0, 0, 212, 40);
		addtocart7.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		panel_add7.add(addtocart7);
		addtocart7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int spinnerValue = (Integer) spinner7.getValue();
				String selectedSize = (String) comboBox7.getSelectedItem();

				if (spinnerValue >= 1) {
					spinner7.setValue(0);
					ImageIcon icon = new ImageIcon(getClass().getResource("/img/check.png"));
					JOptionPane.showMessageDialog(null,
							"<html><font color='#0e1d73'><b>AFFOGATO</b></font> has been added to your cart."
									+ "<br><br><b>ITEM:</b> " + spinnerValue + "<br>" + " <b>SIZE:</b> "
									+ selectedSize + "</html>",
							"Successfully Added", JOptionPane.INFORMATION_MESSAGE, icon);
				} else {
					JOptionPane.showMessageDialog(null, "Please place an order before adding it to the cart.", "Warning",
							JOptionPane.WARNING_MESSAGE);
				}
			}
			public void mouseEntered(MouseEvent e) {
				panel_add7.setBackground(new Color(164, 208, 164));
				addtocart7.setForeground(new Color(22, 69, 35));
				panel_add7.setBorder(new LineBorder(new Color(22, 69, 35), 1));
			}

			public void mouseExited(MouseEvent e) {
				panel_add7.setBackground(new Color(97, 122, 85));
				addtocart7.setForeground(new Color(255, 255, 255));
				panel_add7.setBorder(null);
			}
		});

		JLabel pic7 = new JLabel("");
		pic7.setBounds(10, 11, 275, 215);
		pic7.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		pic7.setIcon(new ImageIcon(seven));
		container7.add(pic7);
		pic7.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				spinner7.setValue((int) spinner7.getValue() + 1);
			}

			public void mouseEntered(MouseEvent e) {
				pic7.setBorder(new LineBorder(new Color(255, 255, 255), 6));
				pic7.setBounds(5, 0, 275, 215);
			}

			public void mouseExited(MouseEvent e) {
				pic7.setBorder(null);
				pic7.setBounds(10, 11, 275, 215);
			}
		});

		JLabel price7 = new JLabel("<html><strong>PRICE: </strong> ₱65.00");
		price7.setHorizontalAlignment(SwingConstants.CENTER);
		price7.setFont(new Font("SansSerif", Font.PLAIN, 14));
		price7.setBounds(84, 250, 109, 25);
		container7.add(price7);

		comboBox7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String selectedOption = (String) comboBox7.getSelectedItem();
				if (selectedOption.equals("Small")) {
					price7.setText("<html><strong>PRICE: </strong> ₱65.00");
				} else if (selectedOption.equals("Medium")) {
					price7.setText("<html><strong>PRICE: </strong> ₱75.00");
				} else if (selectedOption.equals("Large")) {
					price7.setText("<html><strong>PRICE: </strong> ₱85.00");
				}
			}
		});

		JPanel container8 = new JPanel();
		container8.setBackground(new Color(255, 255, 255));
		container8.setLayout(null);
		container8.setBounds(930, 395, 295, 369);
		panel.add(container8);

		JLabel name8 = new JLabel("Caramel Coffee");
		name8.setHorizontalAlignment(SwingConstants.CENTER);
		name8.setFont(new Font("SansSerif", Font.BOLD, 16));
		name8.setBounds(74, 225, 145, 28);
		container8.add(name8);

		JSpinner spinner8 = new JSpinner();
		spinner8.setBounds(182, 279, 68, 25);
		container8.add(spinner8);
		spinner8.addChangeListener(e -> {
			int value = (int) spinner8.getValue();
			if (value < 0) {
				spinner8.setValue(0); // Set the value to 0 if it is negative
			}
		});

		JPanel panel_add8 = new JPanel();
		panel_add8.setLayout(null);
		panel_add8.setBackground(new Color(97, 122, 85));
		panel_add8.setBounds(38, 315, 212, 40);
		container8.add(panel_add8);

		JComboBox comboBox8 = new JComboBox();
		comboBox8.addItem("Small");
		comboBox8.addItem("Medium");
		comboBox8.addItem("Large");
		comboBox8.setOpaque(true);
		comboBox8.setForeground(new Color(51, 51, 51));
		comboBox8.setFont(new Font("Arial", Font.PLAIN, 14));
		comboBox8.setFocusable(false);
		comboBox8.setBorder(BorderFactory.createLineBorder(new Color(204, 204, 204), 2));
		comboBox8.setBackground(Color.WHITE);
		comboBox8.setBounds(38, 280, 133, 24);
		container8.add(comboBox8);
		
		JLabel addtocart8 = new JLabel("ADD TO CART");
		addtocart8.setHorizontalAlignment(SwingConstants.CENTER);
		addtocart8.setForeground(Color.WHITE);
		addtocart8.setFont(new Font("Century Gothic", Font.BOLD, 17));
		addtocart8.setBounds(0, 0, 212, 40);
		addtocart8.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		panel_add8.add(addtocart8);
		addtocart8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int spinnerValue = (Integer) spinner8.getValue();
				String selectedSize = (String) comboBox8.getSelectedItem();

				if (spinnerValue >= 1) {
					spinner8.setValue(0);
					ImageIcon icon = new ImageIcon(getClass().getResource("/img/check.png"));
					JOptionPane.showMessageDialog(null,
							"<html><font color='#0e1d73'><b>CARAMEL COFFEE</b></font> has been added to your cart."
									+ "<br><br><b>ITEM:</b> " + spinnerValue + "<br>" + " <b>SIZE:</b> "
									+ selectedSize + "</html>",
							"Successfully Added", JOptionPane.INFORMATION_MESSAGE, icon);
				} else {
					JOptionPane.showMessageDialog(null, "Please place an order before adding it to the cart.", "Warning",
							JOptionPane.WARNING_MESSAGE);
				}
			}


			public void mouseEntered(MouseEvent e) {
				panel_add8.setBackground(new Color(164, 208, 164));
				addtocart8.setForeground(new Color(22, 69, 35));
				panel_add8.setBorder(new LineBorder(new Color(22, 69, 35), 1));
			}

			public void mouseExited(MouseEvent e) {
				panel_add8.setBackground(new Color(97, 122, 85));
				addtocart8.setForeground(new Color(255, 255, 255));
				panel_add8.setBorder(null);
			}
		});

		JLabel pic8 = new JLabel("");
		pic8.setBounds(10, 11, 275, 215);
		pic8.setIcon(new ImageIcon(eight));
		pic8.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		container8.add(pic8);

		pic8.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				spinner8.setValue((int) spinner8.getValue() + 1);
			}

			public void mouseEntered(MouseEvent e) {
				pic8.setBorder(new LineBorder(new Color(255, 255, 255), 6));
				pic8.setBounds(5, 0, 275, 215);
			}

			public void mouseExited(MouseEvent e) {
				pic8.setBorder(null);
				pic8.setBounds(10, 11, 275, 215);
			}
		});

		JLabel price8 = new JLabel("<html><strong>PRICE: </strong> ₱65.00");
		price8.setHorizontalAlignment(SwingConstants.CENTER);
		price8.setFont(new Font("SansSerif", Font.PLAIN, 14));
		price8.setBounds(84, 250, 109, 25);
		container8.add(price8);

		comboBox8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String selectedOption = (String) comboBox8.getSelectedItem();
				if (selectedOption.equals("Small")) {
					price8.setText("<html><strong>PRICE: </strong> ₱65.00");
				} else if (selectedOption.equals("Medium")) {
					price8.setText("<html><strong>PRICE: </strong> ₱75.00");
				} else if (selectedOption.equals("Large")) {
					price8.setText("<html><strong>PRICE: </strong> ₱85.00");
				}
			}
		});

		JPanel container9 = new JPanel();
		container9.setBackground(new Color(255, 255, 255));
		container9.setLayout(null);
		container9.setBounds(29, 771, 295, 369);
		panel.add(container9);

		JLabel name9 = new JLabel("CAPPUCCINO");
		name9.setHorizontalAlignment(SwingConstants.CENTER);
		name9.setFont(new Font("SansSerif", Font.BOLD, 16));
		name9.setBounds(74, 225, 145, 28);
		container9.add(name9);

		JSpinner spinner9 = new JSpinner();
		spinner9.setBounds(182, 279, 68, 25);
		container9.add(spinner9);
		spinner9.addChangeListener(e -> {
			int value = (int) spinner9.getValue();
			if (value < 0) {
				spinner9.setValue(0); // Set the value to 0 if it is negative
			}
		});

		JPanel panel_add9 = new JPanel();
		panel_add9.setLayout(null);
		panel_add9.setBackground(new Color(97, 122, 85));
		panel_add9.setBounds(38, 315, 212, 40);
		container9.add(panel_add9);

		JComboBox comboBox9 = new JComboBox();
		comboBox9.addItem("Small");
		comboBox9.addItem("Medium");
		comboBox9.addItem("Large");
		comboBox9.setOpaque(true);
		comboBox9.setForeground(new Color(51, 51, 51));
		comboBox9.setFont(new Font("Arial", Font.PLAIN, 14));
		comboBox9.setFocusable(false);
		comboBox9.setBorder(BorderFactory.createLineBorder(new Color(204, 204, 204), 2));
		comboBox9.setBackground(Color.WHITE);
		comboBox9.setBounds(38, 280, 133, 24);
		container9.add(comboBox9);
		
		JLabel addtocart9 = new JLabel("ADD TO CART");
		addtocart9.setHorizontalAlignment(SwingConstants.CENTER);
		addtocart9.setForeground(Color.WHITE);
		addtocart9.setFont(new Font("Century Gothic", Font.BOLD, 17));
		addtocart9.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		addtocart9.setBounds(0, 0, 212, 40);
		panel_add9.add(addtocart9);
		addtocart9.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int spinnerValue = (Integer) spinner9.getValue();
				String selectedSize = (String) comboBox9.getSelectedItem();

				if (spinnerValue >= 1) {
					spinner9.setValue(0);
					ImageIcon icon = new ImageIcon(getClass().getResource("/img/check.png"));
					JOptionPane.showMessageDialog(null,
							"<html><font color='#0e1d73'><b>CAPPUCINO</b></font> has been added to your cart."
									+ "<br><br><b>ITEM:</b> " + spinnerValue + "<br>" + " <b>SIZE:</b> "
									+ selectedSize + "</html>",
							"Successfully Added", JOptionPane.INFORMATION_MESSAGE, icon);
				} else {
					JOptionPane.showMessageDialog(null, "Please place an order before adding it to the cart.", "Warning",
							JOptionPane.WARNING_MESSAGE);
				}
			}


			public void mouseEntered(MouseEvent e) {
				panel_add9.setBackground(new Color(164, 208, 164));
				addtocart9.setForeground(new Color(22, 69, 35));
				panel_add9.setBorder(new LineBorder(new Color(22, 69, 35), 1));
			}

			public void mouseExited(MouseEvent e) {
				panel_add9.setBackground(new Color(97, 122, 85));
				addtocart9.setForeground(new Color(255, 255, 255));
				panel_add9.setBorder(null);
			}
		});

		JLabel pic9 = new JLabel("");
		pic9.setBounds(10, 11, 275, 215);
		pic9.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		pic9.setIcon(new ImageIcon(nine));
		container9.add(pic9);
		pic9.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				spinner9.setValue((int) spinner9.getValue() + 1);
			}

			public void mouseEntered(MouseEvent e) {
				pic9.setBorder(new LineBorder(new Color(255, 255, 255), 6));
				pic9.setBounds(5, 0, 275, 215);
			}

			public void mouseExited(MouseEvent e) {
				pic9.setBorder(null);
				pic9.setBounds(10, 11, 275, 215);
			}
		});

		JLabel price9 = new JLabel("<html><strong>PRICE: </strong> ₱65.00");
		price9.setHorizontalAlignment(SwingConstants.CENTER);
		price9.setFont(new Font("SansSerif", Font.PLAIN, 14));
		price9.setBounds(84, 250, 109, 25);
		container9.add(price9);

		comboBox9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String selectedOption = (String) comboBox1.getSelectedItem();
				if (selectedOption.equals("Small")) {
					price9.setText("<html><strong>PRICE: </strong> ₱65.00");
				} else if (selectedOption.equals("Medium")) {
					price9.setText("<html><strong>PRICE: </strong> ₱75.00");
				} else if (selectedOption.equals("Large")) {
					price9.setText("<html><strong>PRICE: </strong> ₱85.00");
				}
			}
		});

		JPanel container10 = new JPanel();
		container10.setBackground(new Color(255, 255, 255));
		container10.setLayout(null);
		container10.setBounds(330, 771, 295, 369);
		panel.add(container10);

		JLabel name10 = new JLabel("MACCHIATO");
		name10.setHorizontalAlignment(SwingConstants.CENTER);
		name10.setFont(new Font("SansSerif", Font.BOLD, 16));
		name10.setBounds(74, 225, 145, 28);
		container10.add(name10);

		JSpinner spinner10 = new JSpinner();
		spinner10.setBounds(182, 279, 68, 25);
		container10.add(spinner10);
		spinner10.addChangeListener(e -> {
			int value = (int) spinner10.getValue();
			if (value < 0) {
				spinner10.setValue(0); // Set the value to 0 if it is negative
			}
		});

		JPanel panel_add10 = new JPanel();
		panel_add10.setLayout(null);
		panel_add10.setBackground(new Color(97, 122, 85));
		panel_add10.setBounds(38, 315, 212, 40);
		container10.add(panel_add10);
		
		JComboBox comboBox10 = new JComboBox();
		comboBox10.addItem("Small");
		comboBox10.addItem("Medium");
		comboBox10.addItem("Large");
		comboBox10.setOpaque(true);
		comboBox10.setForeground(new Color(51, 51, 51));
		comboBox10.setFont(new Font("Arial", Font.PLAIN, 14));
		comboBox10.setFocusable(false);
		comboBox10.setBorder(BorderFactory.createLineBorder(new Color(204, 204, 204), 2));
		comboBox10.setBackground(Color.WHITE);
		comboBox10.setBounds(38, 280, 133, 24);
		container10.add(comboBox10);
		
		JLabel addtocart10 = new JLabel("ADD TO CART");
		addtocart10.setHorizontalAlignment(SwingConstants.CENTER);
		addtocart10.setForeground(Color.WHITE);
		addtocart10.setFont(new Font("Century Gothic", Font.BOLD, 17));
		addtocart10.setBounds(0, 0, 212, 40);
		addtocart10.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		panel_add10.add(addtocart10);
		addtocart10.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int spinnerValue = (Integer) spinner10.getValue();
				String selectedSize = (String) comboBox10.getSelectedItem();

				if (spinnerValue >= 1) {
					spinner10.setValue(0);
					ImageIcon icon = new ImageIcon(getClass().getResource("/img/check.png"));
					JOptionPane.showMessageDialog(null,
							"<html><font color='#0e1d73'><b>MACCHIATO</b></font> has been added to your cart."
									+ "<br><br><b>ITEM:</b> " + spinnerValue + "<br>" + " <b>SIZE:</b> "
									+ selectedSize + "</html>",
							"Successfully Added", JOptionPane.INFORMATION_MESSAGE, icon);
				} else {
					JOptionPane.showMessageDialog(null, "Please place an order before adding it to the cart.", "Warning",
							JOptionPane.WARNING_MESSAGE);
				}
			}

			public void mouseEntered(MouseEvent e) {
				panel_add10.setBackground(new Color(164, 208, 164));
				addtocart10.setForeground(new Color(22, 69, 35));
				panel_add10.setBorder(new LineBorder(new Color(22, 69, 35), 1));
			}

			public void mouseExited(MouseEvent e) {
				panel_add10.setBackground(new Color(97, 122, 85));
				addtocart10.setForeground(new Color(255, 255, 255));
				panel_add10.setBorder(null);
			}
		});

		JLabel pic10 = new JLabel("");
		pic10.setBounds(10, 11, 275, 215);
		pic10.setIcon(new ImageIcon(ten));
		pic10.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		container10.add(pic10);
		pic10.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				spinner10.setValue((int) spinner10.getValue() + 1);
			}

			public void mouseEntered(MouseEvent e) {
				pic10.setBorder(new LineBorder(new Color(255, 255, 255), 6));
				pic10.setBounds(5, 0, 275, 215);
			}

			public void mouseExited(MouseEvent e) {
				pic10.setBorder(null);
				pic10.setBounds(10, 11, 275, 215);
			}
		});

		JLabel price10 = new JLabel("<html><strong>PRICE: </strong> ₱65.00");
		price10.setHorizontalAlignment(SwingConstants.CENTER);
		price10.setFont(new Font("SansSerif", Font.PLAIN, 14));
		price10.setBounds(84, 250, 109, 25);
		container10.add(price10);

		comboBox10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String selectedOption = (String) comboBox10.getSelectedItem();
				if (selectedOption.equals("Small")) {
					price10.setText("<html><strong>PRICE: </strong> ₱65.00");
				} else if (selectedOption.equals("Medium")) {
					price10.setText("<html><strong>PRICE: </strong> ₱75.00");
				} else if (selectedOption.equals("Large")) {
					price10.setText("<html><strong>PRICE: </strong> ₱85.00");
				}
			}
		});

		JPanel container11 = new JPanel();
		container11.setBackground(new Color(255, 255, 255));
		container11.setLayout(null);
		container11.setBounds(630, 771, 295, 369);
		panel.add(container11);

		JLabel name11 = new JLabel("HOT ESPRESSO");
		name11.setHorizontalAlignment(SwingConstants.CENTER);
		name11.setFont(new Font("SansSerif", Font.BOLD, 16));
		name11.setBounds(74, 225, 145, 28);
		container11.add(name11);

		JSpinner spinner11 = new JSpinner();
		spinner11.setBounds(182, 279, 68, 25);
		container11.add(spinner11);
		spinner11.addChangeListener(e -> {
			int value = (int) spinner11.getValue();
			if (value < 0) {
				spinner11.setValue(0); // Set the value to 0 if it is negative
			}
		});

		JPanel panel_add11 = new JPanel();
		panel_add11.setLayout(null);
		panel_add11.setBackground(new Color(97, 122, 85));
		panel_add11.setBounds(38, 315, 212, 40);
		container11.add(panel_add11);

		JComboBox comboBox11 = new JComboBox();
		comboBox11.addItem("Small");
		comboBox11.addItem("Medium");
		comboBox11.addItem("Large");
		comboBox11.setOpaque(true);
		comboBox11.setForeground(new Color(51, 51, 51));
		comboBox11.setFont(new Font("Arial", Font.PLAIN, 14));
		comboBox11.setFocusable(false);
		comboBox11.setBorder(BorderFactory.createLineBorder(new Color(204, 204, 204), 2));
		comboBox11.setBackground(Color.WHITE);
		comboBox11.setBounds(38, 280, 133, 24);
		container11.add(comboBox11);
		
		JLabel addtocart11 = new JLabel("ADD TO CART");
		addtocart11.setHorizontalAlignment(SwingConstants.CENTER);
		addtocart11.setForeground(Color.WHITE);
		addtocart11.setFont(new Font("Century Gothic", Font.BOLD, 17));
		addtocart11.setBounds(0, 0, 212, 40);
		addtocart11.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		panel_add11.add(addtocart11);
		addtocart11.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int spinnerValue = (Integer) spinner11.getValue();
				String selectedSize = (String) comboBox11.getSelectedItem();

				if (spinnerValue >= 1) {
					spinner11.setValue(0);
					ImageIcon icon = new ImageIcon(getClass().getResource("/img/check.png"));
					JOptionPane.showMessageDialog(null,
							"<html><font color='#0e1d73'><b>HOT ESPRESSO</b></font> has been added to your cart."
									+ "<br><br><b>ITEM:</b> " + spinnerValue + "<br>" + " <b>SIZE:</b> "
									+ selectedSize + "</html>",
							"Successfully Added", JOptionPane.INFORMATION_MESSAGE, icon);
				} else {
					JOptionPane.showMessageDialog(null, "Please place an order before adding it to the cart.", "Warning",
							JOptionPane.WARNING_MESSAGE);
				}
			}

			public void mouseEntered(MouseEvent e) {
				panel_add11.setBackground(new Color(164, 208, 164));
				addtocart11.setForeground(new Color(22, 69, 35));
				panel_add11.setBorder(new LineBorder(new Color(22, 69, 35), 1));
			}

			public void mouseExited(MouseEvent e) {
				panel_add11.setBackground(new Color(97, 122, 85));
				addtocart11.setForeground(new Color(255, 255, 255));
				panel_add11.setBorder(null);
			}
		});

		JLabel pic11 = new JLabel("");
		pic11.setBounds(10, 11, 275, 215);
		pic11.setIcon(new ImageIcon(eleven));
		pic11.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		container11.add(pic11);
		pic11.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				spinner11.setValue((int) spinner11.getValue() + 1);
			}

			public void mouseEntered(MouseEvent e) {
				pic11.setBorder(new LineBorder(new Color(255, 255, 255), 6));
				pic11.setBounds(5, 0, 275, 215);
			}

			public void mouseExited(MouseEvent e) {
				pic11.setBorder(null);
				pic11.setBounds(10, 11, 275, 215);
			}
		});

		JLabel price11 = new JLabel("<html><strong>PRICE: </strong> ₱65.00");
		price11.setHorizontalAlignment(SwingConstants.CENTER);
		price11.setFont(new Font("SansSerif", Font.PLAIN, 14));
		price11.setBounds(84, 250, 109, 25);
		container11.add(price11);

		comboBox11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String selectedOption = (String) comboBox11.getSelectedItem();
				if (selectedOption.equals("Small")) {
					price11.setText("<html><strong>PRICE: </strong> ₱65.00");
				} else if (selectedOption.equals("Medium")) {
					price11.setText("<html><strong>PRICE: </strong> ₱75.00");
				} else if (selectedOption.equals("Large")) {
					price11.setText("<html><strong>PRICE: </strong> ₱85.00");
				}
			}
		});

		JPanel container12 = new JPanel();
		container12.setBackground(new Color(255, 255, 255));
		container12.setLayout(null);
		container12.setBounds(930, 771, 295, 369);
		panel.add(container12);

		JLabel name12 = new JLabel("LONG BLACK");
		name12.setHorizontalAlignment(SwingConstants.CENTER);
		name12.setFont(new Font("SansSerif", Font.BOLD, 16));
		name12.setBounds(74, 225, 145, 28);
		container12.add(name12);

		JSpinner spinner12 = new JSpinner();
		spinner12.setBounds(182, 279, 68, 25);
		container12.add(spinner12);
		spinner12.addChangeListener(e -> {
			int value = (int) spinner12.getValue();
			if (value < 0) {
				spinner12.setValue(0); // Set the value to 0 if it is negative
			}
		});

		JPanel panel_add12 = new JPanel();
		panel_add12.setLayout(null);
		panel_add12.setBackground(new Color(97, 122, 85));
		panel_add12.setBounds(38, 315, 212, 40);
		container12.add(panel_add12);

		JComboBox comboBox12 = new JComboBox();
		comboBox12.addItem("Small");
		comboBox12.addItem("Medium");
		comboBox12.addItem("Large");
		comboBox12.setOpaque(true);
		comboBox12.setForeground(new Color(51, 51, 51));
		comboBox12.setFont(new Font("Arial", Font.PLAIN, 14));
		comboBox12.setFocusable(false);
		comboBox12.setBorder(BorderFactory.createLineBorder(new Color(204, 204, 204), 2));
		comboBox12.setBackground(Color.WHITE);
		comboBox12.setBounds(38, 280, 133, 24);
		container12.add(comboBox12);
		
		JLabel addtocart12 = new JLabel("ADD TO CART");
		addtocart12.setHorizontalAlignment(SwingConstants.CENTER);
		addtocart12.setForeground(Color.WHITE);
		addtocart12.setFont(new Font("Century Gothic", Font.BOLD, 17));
		addtocart12.setBounds(0, 0, 212, 40);
		addtocart12.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		panel_add12.add(addtocart12);
		addtocart12.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int spinnerValue = (Integer) spinner12.getValue();
				String selectedSize = (String) comboBox12.getSelectedItem();

				if (spinnerValue >= 1) {
					spinner12.setValue(0);
					ImageIcon icon = new ImageIcon(getClass().getResource("/img/check.png"));
					JOptionPane.showMessageDialog(null,
							"<html><font color='#0e1d73'><b>LONG BLACK</b></font> has been added to your cart."
									+ "<br><br><b>ITEM:</b> " + spinnerValue + "<br>" + " <b>SIZE:</b> "
									+ selectedSize + "</html>",
							"Successfully Added", JOptionPane.INFORMATION_MESSAGE, icon);
				} else {
					JOptionPane.showMessageDialog(null, "Please place an order before adding it to the cart.", "Warning",
							JOptionPane.WARNING_MESSAGE);
				}
			}
			public void mouseEntered(MouseEvent e) {
				panel_add12.setBackground(new Color(164, 208, 164));
				addtocart12.setForeground(new Color(22, 69, 35));
				panel_add12.setBorder(new LineBorder(new Color(22, 69, 35), 1));
			}
			public void mouseExited(MouseEvent e) {
				panel_add12.setBackground(new Color(97, 122, 85));
				addtocart12.setForeground(new Color(255, 255, 255));
				panel_add12.setBorder(null);
			}
		});

		JLabel pic12 = new JLabel("");
		pic12.setBounds(10, 11, 275, 215);
		pic12.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		pic12.setIcon(new ImageIcon(twelve));
		container12.add(pic12);
		pic12.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				spinner12.setValue((int) spinner12.getValue() + 1);
			}
			public void mouseEntered(MouseEvent e) {
				pic12.setBorder(new LineBorder(new Color(255, 255, 255), 6));
				pic12.setBounds(5, 0, 275, 215);
			}
			public void mouseExited(MouseEvent e) {
				pic12.setBorder(null);
				pic12.setBounds(10, 11, 275, 215);
			}
		});

		JLabel price12 = new JLabel("<html><strong>PRICE: </strong> ₱65.00");
		price12.setHorizontalAlignment(SwingConstants.CENTER);
		price12.setFont(new Font("SansSerif", Font.PLAIN, 14));
		price12.setBounds(84, 250, 109, 25);
		container12.add(price12);

		comboBox12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String selectedOption = (String) comboBox12.getSelectedItem();
				if (selectedOption.equals("Small")) {
					price12.setText("<html><strong>PRICE: </strong> ₱65.00");
				} else if (selectedOption.equals("Medium")) {
					price12.setText("<html><strong>PRICE: </strong> ₱75.00");
				} else if (selectedOption.equals("Large")) {
					price12.setText("<html><strong>PRICE: </strong> ₱85.00");
				}
			}
		});

	}
}
