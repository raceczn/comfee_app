package home;

import javax.swing.JPanel;
import javax.swing.JScrollBar;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Image;
import javax.swing.JScrollPane;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.Timer;
import java.awt.Font;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.border.LineBorder;

public class PanelAbout extends JPanel {

	private Image first = new ImageIcon(PanelAbout.class.getResource("/img/Aboutfirst.png")).getImage()
			.getScaledInstance(1370, 660, Image.SCALE_SMOOTH);
	private Image second = new ImageIcon(PanelAbout.class.getResource("/img/man.png")).getImage().getScaledInstance(765,
			646, Image.SCALE_SMOOTH);
	private Image circle = new ImageIcon(PanelAbout.class.getResource("/img/circle.png")).getImage()
			.getScaledInstance(720, 646, Image.SCALE_SMOOTH);
	private Image crbl = new ImageIcon(PanelAbout.class.getResource("/img/thirdd.png")).getImage()
			.getScaledInstance(1360, 345, Image.SCALE_SMOOTH);
	private Image circles = new ImageIcon(PanelAbout.class.getResource("/img/circlee.png")).getImage()
			.getScaledInstance(50, 50, Image.SCALE_SMOOTH);
	private Image four = new ImageIcon(PanelAbout.class.getResource("/img/backg1.png")).getImage()
			.getScaledInstance(1370, 660, Image.SCALE_SMOOTH);
	private Image end = new ImageIcon(PanelHome.class.getResource("/img/Footer.png"))
			.getImage()	.getScaledInstance(1370, 600, Image.SCALE_SMOOTH);
	
	public PanelAbout() {
		setPreferredSize(new Dimension(1370, 660));
		setLayout(null);
		setVisible(true);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBorder(new EmptyBorder(0, 0, 0, 0));
		scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane.setPreferredSize(new Dimension(1370, 660));
		scrollPane.setBounds(0, 0, 1370, 660);

		// Get the vertical scroll bar and set its properties
		JScrollBar verticalScrollBar = scrollPane.getVerticalScrollBar();
		verticalScrollBar.setUnitIncrement(25);
		verticalScrollBar.setBlockIncrement(50);
		verticalScrollBar.setPreferredSize(new Dimension(20, Integer.MAX_VALUE));

		add(scrollPane);

		JPanel panel_scrollpane = new JPanel();
		panel_scrollpane.setBackground(new Color(255, 255, 255));
		panel_scrollpane.setPreferredSize(new Dimension(1370, 2920));
		panel_scrollpane.setLayout(null);

		JPanel panel_readmore = new JPanel();
		panel_readmore.setBackground(new Color(97, 122, 85));
		panel_readmore.setBounds(585, 310, 177, 45);
		panel_scrollpane.add(panel_readmore);

		JLabel readmore = new JLabel("<html>  READ MORE </html>");
		readmore.setBorder(new EmptyBorder(0, 0, 0, 0));
		readmore.addMouseListener(new MouseAdapter() {
			private final int scrollStep = 15;
			private Timer timer;

			@Override
			public void mouseClicked(MouseEvent e) {
				if (timer != null && timer.isRunning()) {
					// Stop the previous animation if it's still running
					timer.stop();
				}

				JScrollBar verticalScrollBar = scrollPane.getVerticalScrollBar();
				int targetPosition = verticalScrollBar.getValue() + 701;
				int currentPosition = verticalScrollBar.getValue();

				// Calculate the number of steps needed to reach the target position
				int numSteps = Math.abs(targetPosition - currentPosition) / scrollStep;

				// Start the animation timer
				timer = new Timer(10, new ActionListener() {
					private int stepCount = 0;

					@Override
					public void actionPerformed(ActionEvent e) {
						if (stepCount >= numSteps) {
							// Animation complete, stop the timer
							((Timer) e.getSource()).stop();
							return;
						}

						// Increment the scroll position
						int scrollPosition = verticalScrollBar.getValue() + scrollStep;
						verticalScrollBar.setValue(scrollPosition);

						// Increment the step count
						stepCount++;
					}
				});
				timer.start();
			}

			public void mouseEntered(MouseEvent e) {
				readmore.setForeground(new Color(65, 100, 74));
				panel_readmore.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
				panel_readmore.setBackground(new Color(196, 215, 178));
			}

			public void mouseExited(MouseEvent e) {
				readmore.setForeground(new Color(255, 255, 255));
				panel_readmore.setBorder(null);
				panel_readmore.setBackground(new Color(96, 153, 102));
			}
		});

		panel_readmore.setLayout(null);
		readmore.setFont(new Font("SansSerif", Font.PLAIN, 16));
		readmore.setForeground(new Color(255, 255, 255));
		readmore.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		readmore.setHorizontalAlignment(SwingConstants.CENTER);
		readmore.setBounds(0, 0, 177, 45);
		panel_readmore.add(readmore);

		JPanel learnmore_panel = new JPanel();
		learnmore_panel.setBackground(new Color(97, 122, 85));
		learnmore_panel.setBounds(755, 1190, 157, 45);
		panel_scrollpane.add(learnmore_panel);
		learnmore_panel.setLayout(null);

		JLabel learnmore_lbl = new JLabel("<html> LEARN MORE</html>");
		learnmore_lbl.setForeground(new Color(255, 255, 255));
		learnmore_lbl.setFont(new Font("SansSerif", Font.PLAIN, 16));
		learnmore_lbl.setHorizontalAlignment(SwingConstants.CENTER);
		learnmore_lbl.setBounds(0, 0, 157, 45);
		learnmore_lbl.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		learnmore_lbl.addMouseListener(new MouseAdapter() {
			private final int scrollStep = 15;
			private Timer timer;
			@Override
			public void mouseClicked(MouseEvent e) {
				if (timer != null && timer.isRunning()) {
					timer.stop();
				}

				JScrollBar verticalScrollBar = scrollPane.getVerticalScrollBar();
				int targetPosition = verticalScrollBar.getValue() + 950;
				int currentPosition = verticalScrollBar.getValue();

				// Calculate the number of steps needed to reach the target position
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
				learnmore_lbl.setForeground(new Color(22, 69, 35));
				learnmore_panel.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
				learnmore_panel.setBackground(new Color(164, 208, 164));
			}

			public void mouseExited(MouseEvent e) {
				learnmore_lbl.setForeground(new Color(255, 255, 255));
				learnmore_panel.setBackground(new Color(96, 153, 102));
				learnmore_panel.setBorder(null);
			}
		});
		learnmore_panel.add(learnmore_lbl);

		JPanel panel4 = new JPanel();
		panel4.setBackground(new Color(255, 255, 255));
		panel4.setBounds(0, 1665, 1370, 660);
		panel_scrollpane.add(panel4);
		panel4.setLayout(null);
		
		JPanel viewmore_panel = new JPanel();
		viewmore_panel.setBackground(new Color(97, 122, 85));
		viewmore_panel.setBounds(879, 427, 235, 52);
		panel4.add(viewmore_panel);
		viewmore_panel.setLayout(null);
		
		JLabel viewmore = new JLabel("VIEW MORE");
		viewmore.setForeground(new Color(255, 255, 255));
		viewmore.setFont(new Font("Tahoma", Font.PLAIN, 22));
		viewmore.setHorizontalAlignment(SwingConstants.CENTER);
		viewmore.setBounds(0, 0, 235, 52);
		viewmore.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		viewmore_panel.add(viewmore);
		viewmore.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				viewmore.setForeground(new Color(22, 69, 35));
				viewmore_panel.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
				viewmore_panel.setBackground(new Color(164, 208, 164));
			}

			public void mouseExited(MouseEvent e) {
				viewmore.setForeground(new Color(255, 255, 255));
				viewmore_panel.setBackground(new Color(96, 153, 102));
				viewmore_panel.setBorder(null);
			}
		});

		JLabel descrip = new JLabel("<html><center>For many years we work hard and start our "
				+ "little business. Since 2 years we became one of the biggest coffee "
				+ "house in the town. We love our clients and work hard everyday to make "
				+ "the best coffee and bakery for them. We will be happy to see you in "
				+ "Comfeeland!</center></html>");
		descrip.setFont(new Font("Century Gothic", Font.PLAIN, 25));
		descrip.setBounds(753, 154, 521, 262);
		panel4.add(descrip);

		JLabel ourstory = new JLabel("<html> <strong> OUR STORY </strong> </html>");
		ourstory.setFont(new Font("Tahoma", Font.PLAIN, 45));
		ourstory.setHorizontalAlignment(SwingConstants.CENTER);
		ourstory.setBounds(768, 79, 463, 100);
		panel4.add(ourstory);

		JLabel icon4 = new JLabel("");
		icon4.setBackground(new Color(97, 122, 85));
		icon4.setBounds(0, 10, 1370, 660);
		icon4.setIcon(new ImageIcon(four));
		panel4.add(icon4);

		JPanel thirdpanel = new JPanel();
		thirdpanel.setBackground(new Color(23, 23, 23));
		thirdpanel.setForeground(new Color(0, 0, 0));
		thirdpanel.setBounds(0, 1320, 1360, 345);
		panel_scrollpane.add(thirdpanel);
		thirdpanel.setLayout(null);

		JLabel thirdy = new JLabel("");
		thirdy.setBounds(0, 0, 1360, 345);
		thirdy.setIcon(new ImageIcon(crbl));
		thirdpanel.add(thirdy);

		JLabel manphoto = new JLabel("");
		manphoto.setBounds(-100, 675, 765, 646);
		manphoto.setIcon(new ImageIcon(second));
		panel_scrollpane.add(manphoto);
		manphoto.addMouseListener(new MouseAdapter() {
			// Increase size on mouse enter
			public void mouseEntered(MouseEvent e) {
				manphoto.setBounds(-85, 655, 800, 700);
			}

			// Decrease size on mouse exit
			public void mouseExited(MouseEvent e) {
				manphoto.setBounds(-100, 675, 750, 646);
			}
		});
		JLabel circleb = new JLabel("");
		circleb.setBounds(-20, 675, 720, 646);
		circleb.setIcon(new ImageIcon(circle));
		panel_scrollpane.add(circleb);

		JLabel welcome = new JLabel("<html> <strong>  We " + "pride ourselves on making "
				+ "<span style='color:#033d1e;'>Coffee</span> from " + "the best ingredients.</strong></html>");
		welcome.setForeground(new Color(0, 0, 0));
		welcome.setBounds(750, 750, 529, 180);
		welcome.setFont(new Font("Century Gothic", Font.PLAIN, 45));
		panel_scrollpane.add(welcome);

		JLabel description = new JLabel("<html> A cozy little coffee haven that's all about "
				+ "comfort and coffee! Our passion for both is at the heart of everything "
				+ "we do, from sourcing the finest beans to crafting the perfect latte art. "
				+ "But we're more than just a coffee shop. We're a place where you can escape "
				+ "the daily grind and find some peace and quiet. So come on in, kick off your shoes, "
				+ "and stay awhile. We promise you'll leave feeling refreshed, recharged, and ready "
				+ "to take on whatever the day throws your way.</html>");
		description.setForeground(new Color(0, 0, 0));
		description.setBounds(755, 920, 500, 274);
		description.setFont(new Font("Century Gothic", Font.PLAIN, 18));
		panel_scrollpane.add(description);

		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new EmptyBorder(0, 0, 0, 0));
		panel_1.setBounds(0, 660, 1370, 660);
		panel_1.setBackground(new Color(255, 255, 255));
		panel_scrollpane.add(panel_1);
		panel_1.setLayout(null);

		JLabel About = new JLabel("<html> <strong>  GET TO KNOW US  </strong></html>");
		About.setForeground(new Color(255, 255, 255));
		About.setFont(new Font("Tahoma", Font.PLAIN, 47));
		About.setBounds(480, 214, 457, 85);
		panel_scrollpane.add(About);

		JLabel photobg = new JLabel("");
		photobg.setBackground(new Color(0, 128, 64));
		photobg.setBounds(-15, 0, 1370, 660);
		photobg.setIcon(new ImageIcon(first));
		panel_scrollpane.add(photobg);
		
		JPanel footer = new JPanel();
		footer.setBounds(0, 2325, 1370, 600);
		panel_scrollpane.add(footer);
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
		gallery.setBounds(688, 313, 132, 35);
		gallery.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
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

		scrollPane.setViewportView(panel_scrollpane);

	}
}
