package home;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

public class PanelOthers extends JPanel {

	private Image one = new ImageIcon(dashboard.class.getResource("/menuimg/Aeropress Coffee Maker.png")).getImage()
			.getScaledInstance(275, 215, Image.SCALE_SMOOTH);
	private Image two = new ImageIcon(dashboard.class.getResource("/menuimg/Coffee Dripper.png")).getImage()
			.getScaledInstance(275, 215, Image.SCALE_SMOOTH);
	private Image three = new ImageIcon(dashboard.class.getResource("/menuimg/Coffee Maker Set.png")).getImage()
			.getScaledInstance(275, 215, Image.SCALE_SMOOTH);
	private Image four = new ImageIcon(dashboard.class.getResource("/menuimg/Coffee Pot Slender.png")).getImage()
			.getScaledInstance(275, 215, Image.SCALE_SMOOTH);
	private Image five = new ImageIcon(dashboard.class.getResource("/menuimg/Espresso Glass.png")).getImage()
			.getScaledInstance(275, 215, Image.SCALE_SMOOTH);
	private Image six = new ImageIcon(dashboard.class.getResource("/menuimg/Stainless Poltafilter.png")).getImage()
			.getScaledInstance(275, 215, Image.SCALE_SMOOTH);
	private Image seven = new ImageIcon(dashboard.class.getResource("/menuimg/Turkish Coffee Pot.png")).getImage()
			.getScaledInstance(275, 215, Image.SCALE_SMOOTH);
	private Image eight = new ImageIcon(dashboard.class.getResource("/menuimg/Coffee Maker.png")).getImage()
			.getScaledInstance(275, 215, Image.SCALE_SMOOTH);
	
	public PanelOthers() {
		setBackground(new Color(255, 255, 255));
		setBounds(0, 0, 1235, 1300);
		setLayout(null);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 255, 255));
		panel.setBounds(0, 0, 1235, 1300);
		add(panel);
		panel.setLayout(null);

		JPanel container1 = new JPanel();
		container1.setBackground(new Color(255, 255, 255));
		container1.setBounds(29, 21, 295, 369);
		panel.add(container1);
		container1.setLayout(null);

		JLabel name1 = new JLabel("<html><center>AEROPRESS COFFEE MAKER</center></html>");
		name1.setBounds(31, 225, 219, 43);
		name1.setHorizontalAlignment(SwingConstants.CENTER);
		name1.setFont(new Font("SansSerif", Font.BOLD, 16));
		container1.add(name1);

		JSpinner spinner1 = new JSpinner();
		spinner1.setBounds(182, 279, 68, 25);
		container1.add(spinner1);

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
				spinner1.setValue(0);
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
		Font newFont = new Font("Arial", Font.PLAIN, 14);

		JLabel price1 = new JLabel("<html><strong>PRICE: </strong> ₱2,500.00");
		price1.setFont(new Font("SansSerif", Font.PLAIN, 14));
		price1.setHorizontalAlignment(SwingConstants.CENTER);
		price1.setBounds(41, 277, 131, 25);
		container1.add(price1);

		JPanel container2 = new JPanel();
		container2.setBackground(new Color(255, 255, 255));
		container2.setLayout(null);
		container2.setBounds(330, 21, 295, 369);
		panel.add(container2);

		JLabel name2 = new JLabel("COFFEE DRIPPER");
		name2.setHorizontalAlignment(SwingConstants.CENTER);
		name2.setFont(new Font("SansSerif", Font.BOLD, 16));
		name2.setBounds(38, 225, 212, 28);
		container2.add(name2);

		JSpinner spinner2 = new JSpinner();
		spinner2.setBounds(182, 279, 68, 25);
		container2.add(spinner2);

		JPanel panel_add2 = new JPanel();
		panel_add2.setLayout(null);
		panel_add2.setBackground(new Color(97, 122, 85));
		panel_add2.setBounds(38, 315, 212, 40);
		container2.add(panel_add2);

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
				spinner2.setValue(0);

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

		JLabel price2 = new JLabel("<html><strong>PRICE: </strong> ₱2,499.00");
		price2.setHorizontalAlignment(SwingConstants.CENTER);
		price2.setFont(new Font("SansSerif", Font.PLAIN, 14));
		price2.setBounds(38, 277, 133, 25);
		container2.add(price2);

		JPanel container3 = new JPanel();
		container3.setBackground(new Color(255, 255, 255));
		container3.setLayout(null);
		container3.setBounds(630, 21, 295, 369);
		panel.add(container3);

		JLabel name3 = new JLabel("COFFEE MAKER SET");
		name3.setHorizontalAlignment(SwingConstants.CENTER);
		name3.setFont(new Font("SansSerif", Font.BOLD, 16));
		name3.setBounds(38, 225, 212, 28);
		container3.add(name3);

		JSpinner spinner3 = new JSpinner();
		spinner3.setBounds(182, 279, 68, 25);
		container3.add(spinner3);

		JPanel panel_add3 = new JPanel();
		panel_add3.setLayout(null);
		panel_add3.setBackground(new Color(97, 122, 85));
		panel_add3.setBounds(38, 315, 212, 40);
		container3.add(panel_add3);

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
				spinner3.setValue(0);

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

		JLabel price3 = new JLabel("<html><strong>PRICE: </strong> ₱3,000.00");
		price3.setHorizontalAlignment(SwingConstants.CENTER);
		price3.setFont(new Font("SansSerif", Font.PLAIN, 14));
		price3.setBounds(38, 277, 133, 25);
		container3.add(price3);

		JPanel container4 = new JPanel();
		container4.setBackground(new Color(255, 255, 255));
		container4.setLayout(null);
		container4.setBounds(930, 21, 295, 369);
		panel.add(container4);

		JLabel name4 = new JLabel("<html><center>COFFEE POT SLENDER</center></html>");
		name4.setHorizontalAlignment(SwingConstants.CENTER);
		name4.setFont(new Font("SansSerif", Font.BOLD, 16));
		name4.setBounds(38, 225, 212, 28);
		container4.add(name4);

		JSpinner spinner4 = new JSpinner();
		spinner4.setBounds(182, 279, 68, 25);
		container4.add(spinner4);

		JPanel panel_add4 = new JPanel();
		panel_add4.setLayout(null);
		panel_add4.setBackground(new Color(97, 122, 85));
		panel_add4.setBounds(38, 315, 212, 40);
		container4.add(panel_add4);

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
				spinner4.setValue(0);

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

		JLabel price4 = new JLabel("<html><strong>PRICE: </strong> ₱3,500.00");
		price4.setHorizontalAlignment(SwingConstants.CENTER);
		price4.setFont(new Font("SansSerif", Font.PLAIN, 14));
		price4.setBounds(38, 277, 134, 25);
		container4.add(price4);

		JPanel container5 = new JPanel();
		container5.setBackground(new Color(255, 255, 255));
		container5.setLayout(null);
		container5.setBounds(29, 395, 295, 369);
		panel.add(container5);

		JLabel name5 = new JLabel("ESPRESSO GLASS");
		name5.setHorizontalAlignment(SwingConstants.CENTER);
		name5.setFont(new Font("SansSerif", Font.BOLD, 16));
		name5.setBounds(58, 225, 171, 28);
		container5.add(name5);

		JSpinner spinner5 = new JSpinner();
		spinner5.setBounds(182, 279, 68, 25);
		container5.add(spinner5);

		JPanel panel_add5 = new JPanel();
		panel_add5.setLayout(null);
		panel_add5.setBackground(new Color(97, 122, 85));
		panel_add5.setBounds(38, 315, 212, 40);
		container5.add(panel_add5);

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
				spinner5.setValue(0);
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

		JLabel price5 = new JLabel("<html><strong>PRICE: </strong> ₱250.00");
		price5.setHorizontalAlignment(SwingConstants.CENTER);
		price5.setFont(new Font("SansSerif", Font.PLAIN, 14));
		price5.setBounds(38, 277, 134, 25);
		container5.add(price5);

		JPanel container6 = new JPanel();
		container6.setBackground(new Color(255, 255, 255));
		container6.setLayout(null);
		container6.setBounds(330, 395, 295, 369);
		panel.add(container6);

		JLabel name6 = new JLabel("<html><center>STAINLESS POLTA FILTER</center></html>");
		name6.setHorizontalAlignment(SwingConstants.CENTER);
		name6.setFont(new Font("SansSerif", Font.BOLD, 16));
		name6.setBounds(54, 225, 176, 43);
		container6.add(name6);

		JSpinner spinner6 = new JSpinner();
		spinner6.setBounds(182, 279, 68, 25);
		container6.add(spinner6);

		JPanel panel_add6 = new JPanel();
		panel_add6.setLayout(null);
		panel_add6.setBackground(new Color(97, 122, 85));
		panel_add6.setBounds(38, 315, 212, 40);
		container6.add(panel_add6);

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
				spinner6.setValue(0);
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

		JLabel price6 = new JLabel("<html><strong>PRICE: </strong> ₱750.00");
		price6.setHorizontalAlignment(SwingConstants.CENTER);
		price6.setFont(new Font("SansSerif", Font.PLAIN, 14));
		price6.setBounds(38, 277, 134, 25);
		container6.add(price6);

		JPanel container7 = new JPanel();
		container7.setBackground(new Color(255, 255, 255));
		container7.setLayout(null);
		container7.setBounds(630, 395, 295, 369);
		panel.add(container7);

		JLabel name7 = new JLabel("<html><center>TURKISH COFFEE POT</center></html>");
		name7.setHorizontalAlignment(SwingConstants.CENTER);
		name7.setFont(new Font("SansSerif", Font.BOLD, 16));
		name7.setBounds(20, 225, 249, 28);
		container7.add(name7);

		JSpinner spinner7 = new JSpinner();
		spinner7.setBounds(182, 279, 68, 25);
		container7.add(spinner7);

		JPanel panel_add7 = new JPanel();
		panel_add7.setLayout(null);
		panel_add7.setBackground(new Color(97, 122, 85));
		panel_add7.setBounds(38, 315, 212, 40);
		container7.add(panel_add7);

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
				spinner7.setValue(0);
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

		JLabel price7 = new JLabel("<html><strong>PRICE: </strong> ₱4,000.00");
		price7.setHorizontalAlignment(SwingConstants.CENTER);
		price7.setFont(new Font("SansSerif", Font.PLAIN, 14));
		price7.setBounds(38, 277, 138, 25);
		container7.add(price7);

		JPanel container8 = new JPanel();
		container8.setBackground(new Color(255, 255, 255));
		container8.setLayout(null);
		container8.setBounds(930, 395, 295, 369);
		panel.add(container8);

		JLabel name8 = new JLabel("COFFEE MAKER");
		name8.setHorizontalAlignment(SwingConstants.CENTER);
		name8.setFont(new Font("SansSerif", Font.BOLD, 16));
		name8.setBounds(74, 225, 145, 28);
		container8.add(name8);

		JSpinner spinner8 = new JSpinner();
		spinner8.setBounds(182, 279, 68, 25);
		container8.add(spinner8);

		JPanel panel_add8 = new JPanel();
		panel_add8.setLayout(null);
		panel_add8.setBackground(new Color(97, 122, 85));
		panel_add8.setBounds(38, 315, 212, 40);
		container8.add(panel_add8);

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
				spinner8.setValue(0);
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

		JLabel price8 = new JLabel("<html><strong>PRICE: </strong> ₱2,005.00");
		price8.setHorizontalAlignment(SwingConstants.CENTER);
		price8.setFont(new Font("SansSerif", Font.PLAIN, 14));
		price8.setBounds(38, 277, 134, 25);
		container8.add(price8);
	}

}
