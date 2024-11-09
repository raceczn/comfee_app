package home;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.Timer;

import java.awt.Font;
import javax.swing.border.LineBorder;

public class PanelMenu extends JPanel {

	// panels to call for food, drinks
	private PanelCoffee panelcoffee;
	private PanelFood panelfood;
	private PanelNoncoffee panelnoncof;
	private PanelOthers panelothers;
	private PanelBeans panelbeans;

	// images
	private Image bg = new ImageIcon(PanelMenu.class.getResource("/menuimg/menubg.png")).getImage()
			.getScaledInstance(1370, 450, Image.SCALE_SMOOTH);
	private JLabel category;
	private Image end = new ImageIcon(PanelHome.class.getResource("/img/Footer.png"))
			.getImage()	.getScaledInstance(1370, 600, Image.SCALE_SMOOTH);

	public PanelMenu() {
		setBackground(new Color(255, 255, 255));
		setBounds(0, 0, 1370, 660);
		setLayout(null);

		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 1370, 660);
		add(panel);
		panel.setLayout(null);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBorder(new EmptyBorder(0, 0, 0, 0));
		scrollPane.setBounds(0, 0, 1370, 660);
		scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);

		scrollPane.getVerticalScrollBar().setUnitIncrement(35);
		scrollPane.getVerticalScrollBar().setBlockIncrement(50);
		panel.add(scrollPane);

		JPanel mainpanel = new JPanel();
		mainpanel.setBackground(new Color(255, 255, 255));
		mainpanel.setPreferredSize(new Dimension(1370, 2410));
		scrollPane.setViewportView(mainpanel);
		mainpanel.setLayout(null);

		JPanel ordernow_panel = new JPanel();
		ordernow_panel.setBackground(new Color(97, 122, 85));
		ordernow_panel.setBounds(580, 233, 192, 43);
		mainpanel.add(ordernow_panel);
		ordernow_panel.setLayout(null);

		JLabel ordernow = new JLabel("<html><strong>ORDER NOW</strong></hrml>");
		ordernow.setForeground(new Color(255, 255, 255));
		ordernow.setFont(new Font("SansSerif", Font.PLAIN, 16));
		ordernow.setHorizontalAlignment(SwingConstants.CENTER);
		ordernow.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		ordernow.setBounds(0, 0, 192, 43);
		ordernow_panel.add(ordernow);
		ordernow.addMouseListener(new MouseAdapter() {
			private final int scrollStep = 15;
			private Timer timer;

			@Override
			public void mouseClicked(MouseEvent e) {
				if (timer != null && timer.isRunning()) {
					timer.stop();
				}

				JScrollBar verticalScrollBar = scrollPane.getVerticalScrollBar();
				int targetPosition = verticalScrollBar.getValue() + 475;
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
				ordernow_panel.setBackground(new Color(160, 196, 157));
				ordernow.setForeground(new Color(0, 0, 0));
				ordernow_panel.setBorder(new LineBorder(new Color(0, 0, 0)));
			}

			public void mouseExited(MouseEvent e) {
				ordernow_panel.setBackground(new Color(97, 122, 85));
				ordernow.setForeground(new Color(255, 255, 255));
				ordernow_panel.setBorder(null);
			}
		});

		JLabel title = new JLabel("<html><strong> COMFEE'S MENU </strong</html>");
		title.setFont(new Font("Tahoma", Font.PLAIN, 50));
		title.setForeground(new Color(255, 255, 255));
		title.setHorizontalAlignment(SwingConstants.CENTER);
		title.setBounds(432, 141, 507, 93);
		mainpanel.add(title);

		JLabel menubgg = new JLabel("");
		menubgg.setBounds(0, 0, 1370, 450);
		menubgg.setIcon(new ImageIcon(bg));
		mainpanel.add(menubgg);

		panelcoffee = new PanelCoffee();
		panelcoffee.setSize(1235, 1300);
		panelfood = new PanelFood();
		panelfood.setSize(1235, 1300);
		panelnoncof = new PanelNoncoffee();
		panelbeans = new PanelBeans();
		panelothers = new PanelOthers();
		panelothers.setSize(1235, 1300);

		JPanel menupanel = new JPanel();
		menupanel.setBackground(new Color(192, 192, 192));
		menupanel.setBounds(54, 580, 1235, 1300);
		mainpanel.add(menupanel);
		menupanel.add(panelcoffee);
		menupanel.add(panelfood);
		menupanel.add(panelnoncof);
		menupanel.add(panelothers);
		menupanel.add(panelbeans);
		menupanel.setLayout(null);


		JPanel coffee_panel = new JPanel();
		coffee_panel.setBackground(new Color(255, 255, 255));
		coffee_panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		coffee_panel.setBounds(270, 510, 150, 50);
		mainpanel.add(coffee_panel);
		coffee_panel.setLayout(null);

		JLabel coffee = new JLabel("COFFEE");
		coffee.setBounds(0, 0, 150, 50);
		coffee.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		coffee_panel.add(coffee);
		coffee.setHorizontalAlignment(SwingConstants.CENTER);
		coffee.setFont(new Font("SansSerif", Font.BOLD, 18));
		coffee.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				menuClicked(panelcoffee);
			}
			public void mouseEntered(MouseEvent e) {
				coffee_panel.setBorder(new LineBorder(new Color(96, 153, 102),4));
			}
			public void mouseExited(MouseEvent e) {
				coffee_panel.setBorder(new LineBorder(new Color(0, 0, 0)));
			}
		});
		

		JPanel food_panel = new JPanel();
		food_panel.setLayout(null);
		food_panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		food_panel.setBackground(Color.WHITE);
		food_panel.setBounds(610, 510, 150, 50);
		mainpanel.add(food_panel);

		JLabel food = new JLabel("FOOD");
		food.setBounds(0, 0, 150, 50);
		food.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		food_panel.add(food);
		food.setHorizontalAlignment(SwingConstants.CENTER);
		food.setFont(new Font("SansSerif", Font.BOLD, 18));
		food.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				menuClicked(panelfood);
			}
			public void mouseEntered(MouseEvent e) {
				food_panel.setBorder(new LineBorder(new Color(96, 153, 102),4));
			}
			public void mouseExited(MouseEvent e) {
				food_panel.setBorder(new LineBorder(new Color(0, 0, 0)));
			}
		});


		JPanel noncoffee_panel = new JPanel();
		noncoffee_panel.setLayout(null);
		noncoffee_panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		noncoffee_panel.setBackground(Color.WHITE);
		noncoffee_panel.setBounds(440, 510, 150, 50);
		mainpanel.add(noncoffee_panel);

		JLabel noncoffee = new JLabel("NON-COFFEE");
		noncoffee.setHorizontalAlignment(SwingConstants.CENTER);
		noncoffee.setFont(new Font("SansSerif", Font.BOLD, 18));
		noncoffee.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		noncoffee.setBounds(0, 0, 150, 50);
		noncoffee_panel.add(noncoffee);
		noncoffee.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				menuClicked(panelnoncof);
			}
			public void mouseEntered(MouseEvent e) {
				noncoffee_panel.setBorder(new LineBorder(new Color(96, 153, 102),4));
			}
			public void mouseExited(MouseEvent e) {
				noncoffee_panel.setBorder(new LineBorder(new Color(0, 0, 0)));
			}
		});

		category = new JLabel("CATEGORIES:");
		category.setHorizontalAlignment(SwingConstants.CENTER);
		category.setFont(new Font("Tahoma", Font.PLAIN, 16));
		category.setBounds(612, 469, 135, 30);
		mainpanel.add(category);
		
		JPanel beans_panel = new JPanel();
		beans_panel.setLayout(null);
		beans_panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		beans_panel.setBackground(Color.WHITE);
		beans_panel.setBounds(780, 510, 150, 50);
		mainpanel.add(beans_panel);
		
		JLabel beans = new JLabel("BEANS");
		beans.setHorizontalAlignment(SwingConstants.CENTER);
		beans.setFont(new Font("SansSerif", Font.BOLD, 18));
		beans.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		beans.setBounds(0, 0, 150, 50);
		beans_panel.add(beans);
		beans.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				menuClicked(panelbeans);
			}
			public void mouseEntered(MouseEvent e) {
				beans_panel.setBorder(new LineBorder(new Color(96, 153, 102),4));
			}
			public void mouseExited(MouseEvent e) {
				beans_panel.setBorder(new LineBorder(new Color(0, 0, 0)));
			}
		});
		
		JPanel others_panel = new JPanel();
		others_panel.setLayout(null);
		others_panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		others_panel.setBackground(Color.WHITE);
		others_panel.setBounds(950, 510, 150, 50);
		mainpanel.add(others_panel);
		
		JLabel others = new JLabel("OTHERS");
		others.setHorizontalAlignment(SwingConstants.CENTER);
		others.setFont(new Font("SansSerif", Font.BOLD, 18));
		others.setBounds(0, 0, 150, 50);
		others_panel.add(others);
		others.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		others.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				menuClicked(panelothers);
			}
			public void mouseEntered(MouseEvent e) {
				others_panel.setBorder(new LineBorder(new Color(96, 153, 102),4));
			}
			public void mouseExited(MouseEvent e) {
				others_panel.setBorder(new LineBorder(new Color(0, 0, 0)));
			}
		});

		JPanel footer = new JPanel();
		footer.setBounds(0, 1810, 1370, 600);
		mainpanel.add(footer);
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
		aboutus.setFont(new Font("Tahoma", Font.BOLD, 18));
		aboutus.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
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
		
	}
	

	public void menuClicked(JPanel panel) {
		panelcoffee.setVisible(false);
		panelfood.setVisible(false);
		panelnoncof.setVisible(false);
		panelothers.setVisible(false);
		panelbeans.setVisible(false);
		panel.setVisible(true);
	}
}
