package home;

import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.Timer;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class PanelGallery extends JPanel {
	// images
	private Image gallery = new ImageIcon(dashboard.class.getResource("/img/gallery2.png")).getImage()
			.getScaledInstance(1370, 600, Image.SCALE_SMOOTH);
	private Image insta = new ImageIcon(dashboard.class.getResource("/img/instagramIcon.png")).getImage()
			.getScaledInstance(67, 51, Image.SCALE_SMOOTH);
	private Image one = new ImageIcon(dashboard.class.getResource("/img/picOne.jpg"))
			.getImage().getScaledInstance(336,266, Image.SCALE_SMOOTH);
	private Image two = new ImageIcon(dashboard.class.getResource("/img/pic2.png")).getImage().getScaledInstance(336,
			266, Image.SCALE_SMOOTH);
	private Image three = new ImageIcon(dashboard.class.getResource("/img/pic2.jpg")).getImage().getScaledInstance(336,
			266, Image.SCALE_SMOOTH);
	private Image four = new ImageIcon(dashboard.class.getResource("/img/pic4.png")).getImage().getScaledInstance(336,
			266, Image.SCALE_SMOOTH);
	private Image five = new ImageIcon(dashboard.class.getResource("/img/pic5.png")).getImage().getScaledInstance(336,
			266, Image.SCALE_SMOOTH);
	private Image six = new ImageIcon(dashboard.class.getResource("/img/pic6.png")).getImage().getScaledInstance(336,
			266, Image.SCALE_SMOOTH);
	private Image seven = new ImageIcon(dashboard.class.getResource("/img/pic7.png")).getImage().getScaledInstance(336,
			266, Image.SCALE_SMOOTH);
	private Image eight = new ImageIcon(dashboard.class.getResource("/img/pic8.png")).getImage().getScaledInstance(336,
			266, Image.SCALE_SMOOTH);
	private Image nine = new ImageIcon(dashboard.class.getResource("/img/pic9.png")).getImage().getScaledInstance(336,
			266, Image.SCALE_SMOOTH);
	private Image ten = new ImageIcon(dashboard.class.getResource("/img/pic10.png")).getImage().getScaledInstance(336,
			266, Image.SCALE_SMOOTH);
	private Image eleven = new ImageIcon(dashboard.class.getResource("/img/pic11.png")).getImage().getScaledInstance(336,
			266, Image.SCALE_SMOOTH);
	private Image twelve = new ImageIcon(dashboard.class.getResource("/img/pic12.png")).getImage().getScaledInstance(336,
			266, Image.SCALE_SMOOTH);
	private Image thirteen = new ImageIcon(dashboard.class.getResource("/img/pic13.png")).getImage().getScaledInstance(336,
			266, Image.SCALE_SMOOTH);
	private Image fourteen = new ImageIcon(dashboard.class.getResource("/img/pic14.png")).getImage().getScaledInstance(336,
			266, Image.SCALE_SMOOTH);
	private Image fifteen = new ImageIcon(dashboard.class.getResource("/img/pic15.png")).getImage().getScaledInstance(336,
			266, Image.SCALE_SMOOTH);
	private Image sixteen = new ImageIcon(dashboard.class.getResource("/img/pic16.png")).getImage().getScaledInstance(336,
			266, Image.SCALE_SMOOTH);
	private Image seventeen = new ImageIcon(dashboard.class.getResource("/img/pic17.png")).getImage().getScaledInstance(336,
			266, Image.SCALE_SMOOTH);
	private Image eighteen = new ImageIcon(dashboard.class.getResource("/img/pic18.png")).getImage().getScaledInstance(336,
			266, Image.SCALE_SMOOTH);
	private Image nineteen = new ImageIcon(dashboard.class.getResource("/img/pic19.png")).getImage().getScaledInstance(336,
			266, Image.SCALE_SMOOTH);
	private Image twenty = new ImageIcon(dashboard.class.getResource("/img/pic20.png")).getImage().getScaledInstance(336,
			266, Image.SCALE_SMOOTH);
	private Image twentyone = new ImageIcon(dashboard.class.getResource("/img/pic21.png")).getImage().getScaledInstance(336,
			266, Image.SCALE_SMOOTH);
	
	private Image end = new ImageIcon(PanelHome.class.getResource("/img/Footer.png"))
			.getImage()	.getScaledInstance(1370, 600, Image.SCALE_SMOOTH);
	

	public PanelGallery() {
		setBackground(new Color(255, 255, 255));
		setBounds(0, 0, 1370, 648);
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

		// Increase the scroll speed
		scrollPane.getVerticalScrollBar().setUnitIncrement(35);
		scrollPane.getVerticalScrollBar().setBlockIncrement(50);
		panel.add(scrollPane);

		JPanel firstpanel = new JPanel();
		firstpanel.setPreferredSize(new Dimension(1370, 3300));
		scrollPane.setViewportView(firstpanel);
		firstpanel.setLayout(null);
		
		JLabel description = new JLabel("<html><center> \"Memories — the one thing that can never be taken away from us. "
				+ "Make lots of them!\"</center></html>");
		description.setForeground(new Color(255, 255, 255));
		description.setFont(new Font("Century Gothic", Font.PLAIN, 16));
		description.setBounds(506, 248, 363, 51);
		firstpanel.add(description);

		JPanel photos_panel = new JPanel();
		photos_panel.setBackground(new Color(255, 255, 255));
		photos_panel.setBounds(0, 590, 1370, 2180);
		firstpanel.add(photos_panel);
		photos_panel.setLayout(null);

		JLabel coffeegallerylabel = new JLabel("<html><strong>comfee_gallery</strong> </html>");
		coffeegallerylabel.setForeground(new Color(26, 26, 26));
		coffeegallerylabel.setFont(new Font("Tahoma", Font.PLAIN, 26));
		coffeegallerylabel.setHorizontalAlignment(SwingConstants.CENTER);
		coffeegallerylabel.setBounds(227, 61, 211, 81);
		photos_panel.add(coffeegallerylabel);

		JLabel instagramIcon = new JLabel("");
		instagramIcon.setBounds(162, 78, 67, 51);
		instagramIcon.setIcon(new ImageIcon(insta));
		photos_panel.add(instagramIcon);

		JLabel pic1 = new JLabel("");
		pic1.setBounds(162, 147, 336, 266);
		pic1.setIcon(new ImageIcon(one));
		photos_panel.add(pic1);
		pic1.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				pic1.setBorder(new LineBorder(new Color(255, 128, 128),4));
			}

			public void mouseExited(MouseEvent e) {
				pic1.setBorder(null);
			}
		});

		JLabel pic2 = new JLabel("");
		pic2.setBounds(521, 147, 336, 266);
		pic2.setIcon(new ImageIcon(two));
		photos_panel.add(pic2);
		pic2.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				pic2.setBorder(new LineBorder(new Color(255, 128, 128), 4));
			}

			public void mouseExited(MouseEvent e) {
				pic2.setBorder(null);
			}
		});

		JLabel pic_3 = new JLabel("");
		pic_3.setBounds(876, 147, 336, 266);
		pic_3.setIcon(new ImageIcon(three));
		photos_panel.add(pic_3);
		pic_3.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				pic_3.setBorder(new LineBorder(new Color(255, 128, 128), 4));
			}

			public void mouseExited(MouseEvent e) {
				pic_3.setBorder(null);
			}
		});

		JLabel pic4 = new JLabel("");
		pic4.setBounds(162, 424, 336, 266);
		pic4.setIcon(new ImageIcon(four));
		photos_panel.add(pic4);
		pic4.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				pic4.setBorder(new LineBorder(new Color(255, 128, 128), 4));
			}

			public void mouseExited(MouseEvent e) {
				pic4.setBorder(null);
			}
		});

		JLabel pic5 = new JLabel("");
		pic5.setBounds(521, 424, 336, 266);
		pic5.setIcon(new ImageIcon(five));
		photos_panel.add(pic5);
		pic5.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				pic5.setBorder(new LineBorder(new Color(255, 128, 128), 4));
			}

			public void mouseExited(MouseEvent e) {
				pic5.setBorder(null);
			}
		});

		JLabel pic6 = new JLabel("");
		pic6.setBounds(876, 424, 336, 266);
		pic6.setIcon(new ImageIcon(six));
		photos_panel.add(pic6);
		pic6.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				pic6.setBorder(new LineBorder(new Color(255, 128, 128), 4));
			}

			public void mouseExited(MouseEvent e) {
				pic6.setBorder(null);
			}
		});

		JLabel pic7 = new JLabel("");
		pic7.setBounds(162, 714, 336, 266);
		pic7.setIcon(new ImageIcon(seven));
		photos_panel.add(pic7);
		pic7.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				pic7.setBorder(new LineBorder(new Color(255, 128, 128), 4));
			}

			public void mouseExited(MouseEvent e) {
				pic7.setBorder(null);
			}
		});

		JLabel pic8 = new JLabel("");
		pic8.setBounds(521, 714, 336, 266);
		pic8.setIcon(new ImageIcon(eight));
		photos_panel.add(pic8);
		pic8.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				pic8.setBorder(new LineBorder(new Color(255, 128, 128), 4));
			}

			public void mouseExited(MouseEvent e) {
				pic8.setBorder(null);
			}
		});

		JLabel pic9 = new JLabel("");
		pic9.setBounds(876, 714, 336, 266);
		pic9.setIcon(new ImageIcon(nine));
		photos_panel.add(pic9);
		pic9.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				pic9.setBorder(new LineBorder(new Color(255, 128, 128), 4));
			}

			public void mouseExited(MouseEvent e) {
				pic9.setBorder(null);
			}
		});
		
		JLabel pic10 = new JLabel("");
		pic10.setBounds(162, 1002, 336, 266);
		photos_panel.add(pic10);
		pic10.setIcon(new ImageIcon(ten));
		pic10.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				pic10.setBorder(new LineBorder(new Color(255, 128, 128), 4));
			}

			public void mouseExited(MouseEvent e) {
				pic10.setBorder(null);
			}
		});
		
		JLabel pic11 = new JLabel("");
		pic11.setBounds(521, 1002, 336, 266);
		pic11.setIcon(new ImageIcon(eleven));
		photos_panel.add(pic11);
		pic11.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				pic11.setBorder(new LineBorder(new Color(255, 128, 128), 4));
			}

			public void mouseExited(MouseEvent e) {
				pic11.setBorder(null);
			}
		});
		
		JLabel pic12 = new JLabel("");
		pic12.setBounds(876, 1002, 336, 266);
		pic12.setIcon(new ImageIcon(twelve));
		photos_panel.add(pic12);
		pic12.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				pic12.setBorder(new LineBorder(new Color(255, 128, 128), 4));
			}

			public void mouseExited(MouseEvent e) {
				pic12.setBorder(null);
			}
		});
		
		JLabel pic13 = new JLabel("");
		pic13.setBounds(162, 1279, 336, 266);
		pic13.setIcon(new ImageIcon(thirteen));
		photos_panel.add(pic13);
		pic13.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				pic13.setBorder(new LineBorder(new Color(255, 128, 128), 4));
			}

			public void mouseExited(MouseEvent e) {
				pic13.setBorder(null);
			}
		});
		
		JLabel pic14 = new JLabel("");
		pic14.setBounds(521, 1279, 336, 266);
		pic14.setIcon(new ImageIcon(fourteen));
		photos_panel.add(pic14);
		pic14.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				pic14.setBorder(new LineBorder(new Color(255, 128, 128), 4));
			}

			public void mouseExited(MouseEvent e) {
				pic14.setBorder(null);
			}
		});
		
		JLabel pic15 = new JLabel("");
		pic15.setBounds(876, 1279, 336, 266);
		pic15.setIcon(new ImageIcon(fifteen));
		photos_panel.add(pic15);
		pic15.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				pic15.setBorder(new LineBorder(new Color(255, 128, 128), 4));
			}

			public void mouseExited(MouseEvent e) {
				pic15.setBorder(null);
			}
		});
		
		JLabel pic16 = new JLabel("");
		pic16.setBounds(162, 1563, 336, 266);
		pic16.setIcon(new ImageIcon(sixteen));
		photos_panel.add(pic16);
		pic16.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				pic16.setBorder(new LineBorder(new Color(255, 128, 128), 4));
			}

			public void mouseExited(MouseEvent e) {
				pic16.setBorder(null);
			}
		});
		
		JLabel pic17 = new JLabel("");
		pic17.setBounds(521, 1563, 336, 266);
		pic17.setIcon(new ImageIcon(seventeen));
		photos_panel.add(pic17);
		pic17.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				pic17.setBorder(new LineBorder(new Color(255, 128, 128), 4));
			}
			public void mouseExited(MouseEvent e) {
				pic17.setBorder(null);
			}
		});
		
		JLabel pic18 = new JLabel("");
		pic18.setBounds(876, 1563, 336, 266);
		pic18.setIcon(new ImageIcon(eighteen));
		photos_panel.add(pic18);
		pic18.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				pic18.setBorder(new LineBorder(new Color(255, 128, 128), 4));
			}
			public void mouseExited(MouseEvent e) {
				pic18.setBorder(null);
			}
		});
		
		JLabel pic19 = new JLabel("");
		pic19.setBounds(162, 1840, 336, 266);
		pic19.setIcon(new ImageIcon(nineteen));
		photos_panel.add(pic19);
		pic19.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				pic19.setBorder(new LineBorder(new Color(255, 128, 128), 4));
			}
			public void mouseExited(MouseEvent e) {
				pic19.setBorder(null);
			}
		});
		
		JLabel pic20 = new JLabel("");
		pic20.setBounds(521, 1840, 336, 266);
		pic20.setIcon(new ImageIcon(twenty));
		photos_panel.add(pic20);
		pic20.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				pic20.setBorder(new LineBorder(new Color(255, 128, 128), 4));
			}
			public void mouseExited(MouseEvent e) {
				pic20.setBorder(null);
			}
		});
		
		JLabel pic21 = new JLabel("");
		pic21.setBounds(876, 1840, 336, 266);
		pic21.setIcon(new ImageIcon(twentyone));
		photos_panel.add(pic21);
		pic21.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				pic21.setBorder(new LineBorder(new Color(255, 128, 128), 4));
			}
			public void mouseExited(MouseEvent e) {
				pic21.setBorder(null);
			}
		});
		
		
		

		JLabel gallerylabel = new JLabel("<html><strong>COMFEE GALLERY</strong></html>");
		gallerylabel.setHorizontalAlignment(SwingConstants.CENTER);
		gallerylabel.setForeground(new Color(255, 255, 255));
		gallerylabel.setFont(new Font("Tahoma", Font.PLAIN, 55));
		gallerylabel.setBounds(416, 149, 529, 119);
		firstpanel.add(gallerylabel);

		JPanel viewmore_panel = new JPanel();
		viewmore_panel.setBackground(new Color(97, 122, 85));
		viewmore_panel.setBounds(590, 315, 189, 45);
		viewmore_panel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		firstpanel.add(viewmore_panel);
		viewmore_panel.setLayout(null);

		JLabel viewmore = new JLabel("<html><strong>VIEW MORE</strong></html>");
		viewmore.addMouseListener(new MouseAdapter() {
			private final int scrollStep = 15;
			private Timer timer;
			@Override
			public void mouseClicked(MouseEvent e) {
				if (timer != null && timer.isRunning()) {
					// Stop the previous animation if it's still running
					timer.stop();
				}

				JScrollBar verticalScrollBar = scrollPane.getVerticalScrollBar();
				int targetPosition = verticalScrollBar.getValue() + 661;
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

						int scrollPosition = verticalScrollBar.getValue() + scrollStep;
						verticalScrollBar.setValue(scrollPosition);

						stepCount++;
					}
				});
				timer.start();
			}

			public void mouseEntered(MouseEvent e) {
				viewmore_panel.setBackground(new Color(160, 196, 157));
				viewmore.setForeground(new Color(0, 0, 0));
				viewmore_panel.setBorder(new LineBorder(new Color(0, 0, 0)));
			}

			public void mouseExited(MouseEvent e) {
				viewmore_panel.setBackground(new Color(97, 122, 85));
				viewmore.setForeground(new Color(255, 255, 255));
				viewmore_panel.setBorder(null);
			}
		});
		viewmore.setForeground(new Color(255, 255, 255));
		viewmore.setHorizontalAlignment(SwingConstants.CENTER);
		viewmore.setFont(new Font("SansSerif", Font.PLAIN, 16));
		viewmore.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		viewmore.setBounds(0, 0, 189, 45);
		viewmore_panel.add(viewmore);

		JLabel galleryphoto = new JLabel("");
		galleryphoto.setBounds(0, -24, 1370, 637);
		galleryphoto.setIcon(new ImageIcon(gallery));
		firstpanel.add(galleryphoto);
		
		JPanel footer = new JPanel();
		footer.setBounds(0, 2750, 1370, 600);
		firstpanel.add(footer);
		footer.setLayout(null);
		
		JLabel contacts = new JLabel("CONTACTS");
		contacts.setHorizontalAlignment(SwingConstants.CENTER);
		contacts.setForeground(Color.WHITE);
		contacts.setFont(new Font("Tahoma", Font.BOLD, 18));
		contacts.setBackground(Color.WHITE);
		contacts.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
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
		shop.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
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
		home.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
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
		
		
	}
}
