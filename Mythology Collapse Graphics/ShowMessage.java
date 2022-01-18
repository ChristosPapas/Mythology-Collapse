package MythologyCollapse;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import java.awt.BorderLayout;
import java.awt.Canvas;

import javax.swing.JLabel;
import javax.swing.JScrollPane;
import java.awt.Toolkit;
import javax.swing.JProgressBar;
import javax.swing.JMenuBar;
import javax.swing.JTree;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.ComponentOrientation;
import java.awt.Component;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import javax.swing.JInternalFrame;
import javax.swing.JTextField;


public class ShowMessage extends Canvas {
	JButton Continue;
	private int option;
	private JFrame frmMythologyCollapse;

	/**
	 * Launch the application.
	 */
	public void runShow() {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ShowMessage window = new ShowMessage();
					window.frmMythologyCollapse.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	int getOption() {
		while(option == 0){
		    try {
		       Thread.sleep(100);
		   } catch(InterruptedException e) {
		    	e.printStackTrace();
		    }
		}
		return option;
	}
	/**
	 * Create the application.
	 */
	public ShowMessage() {
		initialize();
		frmMythologyCollapse.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public void initialize() {
		frmMythologyCollapse = new JFrame();
		frmMythologyCollapse.getContentPane().setBackground(Color.WHITE);
		JLabel WelcomeLabel = new JLabel("Welcome To Mythology Collapse");
		WelcomeLabel.setAlignmentY(Component.BOTTOM_ALIGNMENT);
		WelcomeLabel.setHorizontalAlignment(SwingConstants.CENTER);
		WelcomeLabel.setVerticalAlignment(SwingConstants.TOP);
		frmMythologyCollapse.getContentPane().add(WelcomeLabel, BorderLayout.CENTER);
		
		JButton StartButton = new JButton("Start Game");
		frmMythologyCollapse.getContentPane().add(StartButton, BorderLayout.SOUTH);
		StartButton.setSize(100, 20);

		frmMythologyCollapse.setTitle("Mythology Collapse");
		frmMythologyCollapse.setIconImage(Toolkit.getDefaultToolkit().getImage(ShowMessage.class.getResource("/resources/IconNoBackGround.png")));
		frmMythologyCollapse.setBounds(100, 100, 452, 404);
		frmMythologyCollapse.setLocationRelativeTo(null);
		

        ImageIcon image = new ImageIcon(Toolkit.getDefaultToolkit().getImage(ShowMessage.class.getResource("/resources/FirstImage.png")));
        ImageIcon logo = new ImageIcon(Toolkit.getDefaultToolkit().getImage(ShowMessage.class.getResource("/resources/Mythology Collapse Logo.png")));
        JLabel label = new JLabel(image);
        JLabel label2 = new JLabel(logo);
       
        label.setHorizontalAlignment(JLabel.CENTER);
        frmMythologyCollapse.getContentPane().add(label);
        label2.setHorizontalAlignment(JLabel.CENTER);
        frmMythologyCollapse.getContentPane().add(label2);
        
        StartButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				label.setVisible(false);
				label2.setVisible(false);
				StartButton.setVisible(false);
				frmMythologyCollapse.getContentPane().remove(StartButton);
				JPanel InstructionPanel=new JPanel();
				InstructionPanel.setSize(200, 300);
				InstructionPanel.setBackground(Color.BLACK);
				JLabel Instructions=new JLabel();
				Instructions.setLocation(250, -170); 
				Instructions.setSize(500, 1000);
				Instructions.setText("<html>Καλησπέρα παίχτη καλως όρισες στο Mythology Collapse.<br/>"
										+ "Το Mythology Collapse είναι ένα παιχνίδι επιλογών. <br/>"
										+ "Επιλέγεις έναν παίχτη και καλείσαι λάβεις κάποιες <br/>"
										+ "αποφάσεις με βάση τα δεδομένα που σου δίνει το παιχνίδι <br/>"
										+ "Οι αποφάσεις θα καθορίσουν το τέλος του παιχνιδιού <br/>"
										+ "υπάρχουν δηλαδή πολλές απολήξεις στην Ιστορία <br/>"
										+ "Πάτα το κουμπί συνέχισε για να επιλέξεις έναν παίκτη  <html>");
				Instructions.setForeground(Color.WHITE);
				frmMythologyCollapse.getContentPane().add(InstructionPanel);
				InstructionPanel.add(label);
				label.setVisible(true);
				label.add(Instructions);
				InstructionPanel.setVisible(true);
				Instructions.setVisible(true);
				Continue=new JButton("Continue");
				Continue.setSize(100, 20);
				Continue.setLocation(400, 500);
				label.add(Continue);
				Continue.setVisible(true);
				Continue.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						Continue.setVisible(false);
						Instructions.setText("Επέλεξε έναν ήρωα");
						Instructions.setLocation(400, -170);
						JButton Perseas = new JButton("Περσέας");
						JButton Odysseus = new JButton("Οδυσσέας");
						JButton Hercules = new JButton("Ηρακλής");
						Perseas.setSize(100, 20);
						Odysseus.setSize(100, 20);
						Hercules.setSize(100, 20);
						Perseas.setLocation(250, 500);
						Odysseus.setLocation(400, 500);
						Hercules.setLocation(550, 500);
						label.add(Perseas);
						label.add(Odysseus);
						label.add(Hercules);
						Perseas.addActionListener(new ActionListener() {
							
							
							@Override
							public void actionPerformed(ActionEvent e) {
								option=1;	
								frmMythologyCollapse.dispatchEvent(new WindowEvent(frmMythologyCollapse, WindowEvent.WINDOW_CLOSING));																								
							}
						}); 
						Odysseus.addActionListener(new ActionListener() {
						
							
							@Override
							public void actionPerformed(ActionEvent e) {
								option=2;
								frmMythologyCollapse.dispatchEvent(new WindowEvent(frmMythologyCollapse, WindowEvent.WINDOW_CLOSING));
							}
						});
						Hercules.addActionListener(new ActionListener() {
							
							@Override
							public void actionPerformed(ActionEvent e) {
								option=3;
								frmMythologyCollapse.dispatchEvent(new WindowEvent(frmMythologyCollapse, WindowEvent.WINDOW_CLOSING));
							}
							
						}); 
					}
		        }); 
			}
		});
	}
}

