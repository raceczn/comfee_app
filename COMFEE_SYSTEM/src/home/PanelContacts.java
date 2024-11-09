package home;

import javax.swing.JPanel;
import javax.swing.JScrollBar;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.JScrollPane;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.border.EmptyBorder;
import javax.swing.SwingConstants;
import javax.swing.Timer;

import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JSeparator;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class PanelContacts extends JPanel {

	private Image bgcontact = new ImageIcon(PanelAbout.class.getResource("/img/CONTACT.png")).getImage()
			.getScaledInstance(1370, 660, Image.SCALE_SMOOTH);
	private Image lappy = new ImageIcon(PanelAbout.class.getResource("/img/coffeew_lappy.jpg")).getImage()
			.getScaledInstance(610, 564, Image.SCALE_SMOOTH);
	private Image end = new ImageIcon(PanelHome.class.getResource("/img/Footer.png"))
			.getImage()	.getScaledInstance(1370, 600, Image.SCALE_SMOOTH);

	private JTextField name;
	private JTextField email;
	private JTextArea message;

	public PanelContacts() {
		setBackground(new Color(255, 255, 255));
		setBounds(0, 69, 1370, 660);
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
		firstpanel.setPreferredSize(new Dimension(1370, 1870));
		scrollPane.setViewportView(firstpanel);
		firstpanel.setLayout(null);

		JPanel panel_emailUS = new JPanel();
		panel_emailUS.setBackground(new Color(97, 122, 85));
		panel_emailUS.setBounds(596, 270, 176, 47);
		firstpanel.add(panel_emailUS);
		panel_emailUS.setLayout(null);

		JLabel emailNow = new JLabel("EMAIL NOW");
		emailNow.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		emailNow.setForeground(new Color(255, 255, 255));
		emailNow.setFont(new Font("Century Gothic", Font.BOLD, 15));
		emailNow.setHorizontalAlignment(SwingConstants.CENTER);
		emailNow.setBounds(0, 0, 176, 47);
		emailNow.addMouseListener(new MouseAdapter() {
			private final int scrollStep = 15;
			private Timer timer;

			@Override
			public void mouseClicked(MouseEvent e) {
				if (timer != null && timer.isRunning()) {
					// Stop the previous animation if it's still running
					timer.stop();
				}

				JScrollBar verticalScrollBar = scrollPane.getVerticalScrollBar();
				int targetPosition = verticalScrollBar.getValue() + 616;
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
				panel_emailUS.setBackground(new Color(160, 196, 157));
				emailNow.setForeground(new Color(21, 21, 21));
				panel_emailUS.setBorder(new LineBorder(new Color(0, 0, 0)));
			}

			public void mouseExited(MouseEvent e) {
				panel_emailUS.setBackground(new Color(96, 153, 102));
				emailNow.setForeground(new Color(255, 255, 255));
				panel_emailUS.setBorder(null);

			}
		});
		panel_emailUS.add(emailNow);

		JPanel secpanel = new JPanel();
		secpanel.setBackground(new Color(255, 255, 255));
		secpanel.setBounds(0, 616, 1370, 660);
		firstpanel.add(secpanel);
		secpanel.setLayout(null);

		JPanel sendpanel = new JPanel();
		sendpanel.setBackground(new Color(97, 122, 85));
		sendpanel.setBounds(725, 555, 155, 49);
		secpanel.add(sendpanel);
		sendpanel.setLayout(null);

		JLabel send = new JLabel("SEND");
		send.setForeground(new Color(224, 224, 224));
		send.setFont(new Font("Century Gothic", Font.BOLD, 16));
		send.setHorizontalAlignment(SwingConstants.CENTER);
		send.setBounds(0, 0, 155, 49);
		send.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		sendpanel.add(send);
		send.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				name.setText("");
				email.setText("");
				message.setText("");
				JOptionPane.showMessageDialog(null, "Sent successfully.");
			}

			public void mouseEntered(MouseEvent e) {
				sendpanel.setBackground(new Color(160, 196, 157));
				sendpanel.setBorder(new LineBorder(new Color(0, 0, 0)));
				send.setForeground(new Color(21, 21, 21));
			}

			public void mouseExited(MouseEvent e) {
				sendpanel.setBackground(new Color(96, 153, 102));
				send.setForeground(new Color(224, 224, 224));
				sendpanel.setBorder(null);
			}
		});

		JLabel contact_label = new JLabel("<html> <strong> CONTACT US </strong> </html>");
		contact_label.setForeground(new Color(20, 64, 20));
		contact_label.setFont(new Font("Tahoma", Font.PLAIN, 26));
		contact_label.setBounds(725, 45, 274, 67);
		secpanel.add(contact_label);

		JSeparator separator = new JSeparator();
		separator.setBackground(new Color(20, 64, 20));
		separator.setBounds(725, 100, 171, 15);
		secpanel.add(separator);

		JLabel reminder = new JLabel("<html>Please use the form below to send us a message "
				+ "and we will replay within one business day. You can also drop us an email "
				+ "anytime or feel free to give us a call. We'd love to hear from you!</html>");
		reminder.setFont(new Font("Verdana", Font.PLAIN, 14));
		reminder.setBounds(725, 100, 512, 80);
		secpanel.add(reminder);

		name = new PlaceHolder("Full Name");
		name.setFont(new Font("Tahoma", Font.PLAIN, 12));
		name.setBorder(new LineBorder(new Color(20, 64, 20), 1, true));
		name.setBounds(730, 195, 492, 49);
		secpanel.add(name);
		name.setColumns(10);
		name.setForeground(Color.black);
		name.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createLineBorder(new Color(20, 64, 20), 1), BorderFactory.createEmptyBorder(0,  5 , 0, 0)));
		//name.setText(" Full name");
		
		email = new PlaceHolder("Email Address");
		email.setFont(new Font("Tahoma", Font.PLAIN, 12));
		email.setBorder(new LineBorder(new Color(20, 64, 20)));
		email.setColumns(10);
		email.setBounds(730, 265, 492, 49);
		secpanel.add(email);
		email.setForeground(Color.black);
		email.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createLineBorder(new Color(20, 64, 20), 1), BorderFactory.createEmptyBorder(0,  5 , 0, 0)));
		//email.setText(" Email address");

		message = new PlaceHolderArea("Your Message");
		message.setFont(new Font("Tahoma", Font.PLAIN, 12));
		message.setBorder(new LineBorder(new Color(20, 64, 20)));
		message.setColumns(10);
		message.setBounds(730, 340, 492, 184);
		secpanel.add(message);
		message.setForeground(Color.black);
		message.setBorder(BorderFactory.createCompoundBorder(BorderFactory.createLineBorder(new Color(20, 64, 20), 1), BorderFactory.createEmptyBorder(10,  5 , 0, 0)));
		
		//message.setText(" Your message");

		JPanel tabfirstname = new JPanel();
		tabfirstname.setBackground(new Color(97, 122, 85));
		tabfirstname.setBounds(724, 195, 7, 49);
		secpanel.add(tabfirstname);

		JLabel photo = new JLabel("");
		photo.setBounds(45, 53, 610, 564);
		photo.setIcon(new ImageIcon(lappy));
		secpanel.add(photo);

		JPanel tab_secname = new JPanel();
		tab_secname.setBackground(new Color(97, 122, 85));
		tab_secname.setBounds(725, 265, 7, 49);
		secpanel.add(tab_secname);

		JPanel tab_third = new JPanel();
		tab_third.setBackground(new Color(97, 122, 85));
		tab_third.setBounds(725, 340, 7, 184);
		secpanel.add(tab_third);

		// when clicked, the placeholder will disappear
		name.addFocusListener(new FocusListener() {
			public void focusGained(FocusEvent e) {
				if (name.getText().equals(" Full name")) {
					name.setText("");
					name.setForeground(Color.BLACK);
				}
			}

			public void focusLost(FocusEvent e) {
				if (name.getText().isEmpty()) {
					name.setText(" Full name");
					name.setForeground(Color.GRAY);
				}
			}
		});

		email.addFocusListener(new FocusListener() {
			public void focusGained(FocusEvent e) {
				if (email.getText().equals(" Email address")) {
					email.setText("");
					email.setForeground(Color.BLACK);
				}
			}

			public void focusLost(FocusEvent e) {
				if (email.getText().isEmpty()) {
					email.setText(" Email address");
					email.setForeground(Color.GRAY);
				}
			}
		});

		message.addFocusListener(new FocusListener() {
			public void focusGained(FocusEvent e) {
				if (message.getText().equals(" Your message")) {
					message.setText("");
					message.setForeground(Color.BLACK);
				}
			}

			public void focusLost(FocusEvent e) {
				if (message.getText().isEmpty()) {
					message.setText(" Your message");
					message.setForeground(Color.GRAY);
				}
			}
		});

		JLabel contact_us = new JLabel("<html> <strong>  CONTACT US </strong> </html>");
		contact_us.setFont(new Font("Tahoma", Font.PLAIN, 53));
		contact_us.setHorizontalAlignment(SwingConstants.CENTER);
		contact_us.setForeground(new Color(255, 255, 255));
		contact_us.setBounds(488, 190, 406, 69);
		firstpanel.add(contact_us);

		JLabel firstpic = new JLabel("");
		firstpic.setBounds(0, 0, 1370, 616);
		firstpic.setIcon(new ImageIcon(bgcontact));
		firstpanel.add(firstpic);
		
		JPanel footer = new JPanel();
		footer.setBounds(0, 1270, 1370, 600);
		firstpanel.add(footer);
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
	class PlaceHolder extends JTextField{
		public String text;
		public PlaceHolder(String text) {
			this.text = text;
		}
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			if(getText().isBlank()) {
			g.setColor(Color.GRAY);
			g.drawString(text, getInsets().left, g.getFontMetrics().getAscent() + getInsets().top + 15);
			}
			
		}
	}
	class PlaceHolderArea extends JTextArea{
		public String text;
		public PlaceHolderArea(String text) {
			this.text = text;
		}
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			if(getText().isBlank()) {
			g.setColor(Color.GRAY);
			g.drawString(text, getInsets().left, g.getFontMetrics().getAscent() + getInsets().top);
			}
			
		}
	}
}
