package home;

import javax.swing.JPanel;
import javax.swing.JScrollBar;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;

import javax.swing.SwingConstants;
import javax.swing.Timer;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

public class PanelHome extends JPanel {

	
	private Image bggif = new ImageIcon(PanelHome.class.getResource("/img/home1.gif"))
			.getImage();
	private Image second = new ImageIcon(PanelHome.class.getResource("/img/highqual.png"))
			.getImage()	.getScaledInstance(1370, 660, Image.SCALE_SMOOTH);
	private Image third = new ImageIcon(PanelHome.class.getResource("/img/Menu.png"))
			.getImage()	.getScaledInstance(1370, 660, Image.SCALE_SMOOTH);
	private Image end = new ImageIcon(PanelHome.class.getResource("/img/Footer.png"))
			.getImage()	.getScaledInstance(1370, 600, Image.SCALE_SMOOTH);
	
	public PanelHome() {
		setBackground(new Color(255, 255, 255));
		setBounds(0, 69, 1370, 660);
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
		panel_scroll.setPreferredSize(new Dimension(1370, 2580));
		panel_scroll.setLayout(null);
		
		// add your components to the panel_scroll here
		
		scrollPane.setViewportView(panel_scroll);
		
		JPanel panel3 = new JPanel();
		panel3.setBounds(0, 1320, 1370, 660);
		panel_scroll.add(panel3);
		panel3.setLayout(null);
		
		JLabel menu = new JLabel("");
		menu.setBounds(0, 0, 1370, 660);
		menu.setIcon(new ImageIcon(third));
		panel3.add(menu);
		
		JPanel sec_panel = new JPanel();
		sec_panel.setBounds(0, 660, 1370, 660);
		panel_scroll.add(sec_panel);
		sec_panel.setLayout(null);
		
		JLabel bestlbl = new JLabel("THE BEST COFFEE WE GOT");
		bestlbl.setFont(new Font("Tahoma", Font.PLAIN, 30));
		bestlbl.setHorizontalAlignment(SwingConstants.CENTER);
		bestlbl.setForeground(new Color(255, 128, 0));
		bestlbl.setBounds(791, 83, 505, 68);
		sec_panel.add(bestlbl);
		
		JLabel photo2 = new JLabel("");
		photo2.setBounds(0, 0, 1370, 660);
		photo2.setIcon(new ImageIcon(second));
		sec_panel.add(photo2);
		
		JPanel footer = new JPanel();
		footer.setBounds(0, 1980, 1370, 600);
		panel_scroll.add(footer);
		footer.setLayout(null);
		
		JLabel contacts = new JLabel("CONTACTS");
		contacts.setHorizontalAlignment(SwingConstants.CENTER);
		contacts.setForeground(Color.WHITE);
		contacts.setFont(new Font("Tahoma", Font.BOLD, 18));
		contacts.setBackground(Color.WHITE);
		contacts.setBounds(688, 349, 132, 35);
		contacts.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
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
		gallery.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		gallery.setForeground(Color.WHITE);
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
		shop.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		shop.setForeground(Color.WHITE);
		shop.setFont(new Font("Tahoma", Font.BOLD, 18));
		shop.setBackground(Color.WHITE);
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
		aboutus.setFont(new Font("Tahoma", Font.BOLD, 18));
		aboutus.setBackground(Color.WHITE);
		aboutus.setBounds(688, 240, 132, 35);
		aboutus.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
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
		
		JLabel tagline = new JLabel("<html> <strong> Experience the taste of Comfort </strong></html>");
		tagline.setForeground(new Color(255, 255, 255));
		tagline.setFont(new Font("Tahoma", Font.PLAIN, 54));
		tagline.setBounds(88, 106, 633, 181);
		panel_scroll.add(tagline);
		
		JLabel smalldescript = new JLabel("<html> \"Come for the coffee, stay for the comfort\"</html>");
		smalldescript.setForeground(new Color(255, 255, 255));
		smalldescript.setFont(new Font("Tahoma", Font.PLAIN, 16));
		smalldescript.setBounds(88, 258, 494, 59);
		panel_scroll.add(smalldescript);
		
		JPanel readmore_panel = new JPanel();
		readmore_panel.setBounds(88, 334, 151, 48);
		readmore_panel.setBackground(new Color(97, 122, 85));
		panel_scroll.add(readmore_panel);
		readmore_panel.setLayout(null);
		
		JLabel readmore = new JLabel("READ MORE");
		readmore.setForeground(new Color(255, 255, 255));
		readmore.setFont(new Font("Tahoma", Font.PLAIN, 17));
		readmore.setHorizontalAlignment(SwingConstants.CENTER);
		readmore.setBounds(0, 0, 151, 48);
		readmore.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		readmore_panel.add(readmore);
		readmore.addMouseListener(new MouseAdapter() {
			private final int scrollStep = 15;
			private Timer timer;
			@Override
			public void mouseClicked(MouseEvent e) {
				if (timer != null && timer.isRunning()) {
					timer.stop();
				}

				JScrollBar verticalScrollBar = scrollPane.getVerticalScrollBar();
				int targetPosition = verticalScrollBar.getValue() + 660;
				int currentPosition = verticalScrollBar.getValue();
				int numSteps = Math.abs(targetPosition - currentPosition) / scrollStep;

				timer = new Timer(10, new ActionListener() {
					private int stepCount = 0;

					@Override
					public void actionPerformed(ActionEvent e) {
						if (stepCount >= numSteps) {
							((Timer) e.getSource()).stop();
							return;
						}
						int scrollPosition = verticalScrollBar.getValue() + scrollStep;
						verticalScrollBar.setValue(scrollPosition);
						stepCount++;
					}
				});
				timer.start();
			}

			public void mouseEntered(MouseEvent e) {
				readmore_panel.setBackground(new Color(164, 208, 164));
				readmore.setForeground(new Color(34, 34, 34));
				readmore_panel.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
			}
			public void mouseExited(MouseEvent e) {
				readmore_panel.setBackground(new Color(97, 122, 85));
				readmore.setForeground(new Color(255, 255, 255));
				readmore_panel.setBorder(null);
			}
		});
		
		JPanel ordernow_panel = new JPanel();
		ordernow_panel.setLayout(null);
		ordernow_panel.setBackground(new Color(0, 64, 64));
		ordernow_panel.setBounds(249, 334, 151, 48);
		panel_scroll.add(ordernow_panel);
		
		JLabel order = new JLabel("ORDER NOW");
		order.setHorizontalAlignment(SwingConstants.CENTER);
		order.setForeground(Color.WHITE);
		order.setFont(new Font("Tahoma", Font.PLAIN, 17));
		order.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		order.setBounds(0, 0, 151, 48);
		ordernow_panel.add(order);
		order.addMouseListener(new MouseAdapter() {
			private final int scrollStep = 15;
			private Timer timer;
			@Override
			public void mouseClicked(MouseEvent e) {
				if (timer != null && timer.isRunning()) {
					timer.stop();
				}

				JScrollBar verticalScrollBar = scrollPane.getVerticalScrollBar();
				int targetPosition = verticalScrollBar.getValue() + 1320;
				int currentPosition = verticalScrollBar.getValue();
				int numSteps = Math.abs(targetPosition - currentPosition) / scrollStep;

				timer = new Timer(10, new ActionListener() {
					private int stepCount = 0;

					@Override
					public void actionPerformed(ActionEvent e) {
						if (stepCount >= numSteps) {
							((Timer) e.getSource()).stop();
							return;
						}
						int scrollPosition = verticalScrollBar.getValue() + scrollStep;
						verticalScrollBar.setValue(scrollPosition);
						stepCount++;
					}
				});
				timer.start();
			}

			public void mouseEntered(MouseEvent e) {
				ordernow_panel.setBackground(new Color(164, 208, 164));
				order.setForeground(new Color(34, 34, 34));
				ordernow_panel.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
			}
			public void mouseExited(MouseEvent e) {
				ordernow_panel.setBackground(new Color(0, 64, 64));
				order.setForeground(new Color(255, 255, 255));
				ordernow_panel.setBorder(null);
			}
		});
		
		
		JLabel photo = new JLabel("");
		photo.setBounds(0, 0, 1370, 660);
		photo.setIcon(new ImageIcon(bggif));
		panel_scroll.add(photo);
	}
}
