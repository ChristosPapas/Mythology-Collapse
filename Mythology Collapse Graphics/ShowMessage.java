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

	private JFrame frmMythologyCollapse;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
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

	/**
	 * Create the application.
	 */
	public ShowMessage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
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
		frmMythologyCollapse.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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
				Instructions.setText("<html>��������� ������ ����� ������ ��� Mythology Collapse.<br/>"
										+ "�� Mythology Collapse ����� ��� �������� ��������. <br/>"
										+ "��������� ���� ������ ��� �������� ������ ������� <br/>"
										+ "��������� �� ���� �� �������� ��� ��� ����� �� �������� <br/>"
										+ "�� ��������� �� ���������� �� ����� ��� ���������� <br/>"
										+ "�������� ������ ������ ��������� ���� ������� <br/>"
										+ "���� �� ������ �������� ��� �� ��������� ���� ������  <html>");
				Instructions.setForeground(Color.WHITE);
				frmMythologyCollapse.getContentPane().add(InstructionPanel);
				InstructionPanel.add(label);
				label.setVisible(true);
				label.add(Instructions);
				InstructionPanel.setVisible(true);
				Instructions.setVisible(true);
				Continue=new JButton("Continue");
				Continue.setSize(100, 20);
				Continue.setLocation(350,500);
				label.add(Continue);
				Continue.setVisible(true);
				Continue.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						Continue.setVisible(false);
						Instructions.setText("������� ���� ����");
						Instructions.setLocation(400, -170);
						JButton Perseas = new JButton("�������");
						JButton Odysseus = new JButton("��������");
						JButton Hercules = new JButton("�������");
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
								frmMythologyCollapse.dispatchEvent(new WindowEvent(frmMythologyCollapse, WindowEvent.WINDOW_CLOSING));
								 Graphics panel = new Graphics();
								try {
									Perseas story = new Perseas(panel);
							} catch (InterruptedException e1) {
									// TODO Auto-generated catch block
									e1.printStackTrace();
								}
								
							}
						}); 
						Odysseus.addActionListener(new ActionListener() {
							
							
							@Override
							public void actionPerformed(ActionEvent e) {
								frmMythologyCollapse.dispatchEvent(new WindowEvent(frmMythologyCollapse, WindowEvent.WINDOW_CLOSING));
								Graphics panel = new Graphics();
								try {
									Odysseus story = new Odysseus(panel);
								} catch (InterruptedException e1) {
									// TODO Auto-generated catch block
									e1.printStackTrace();
								}
								
							}
						});
						Hercules.addActionListener(new ActionListener() {
							
							@Override
							public void actionPerformed(ActionEvent e) {
								frmMythologyCollapse.dispatchEvent(new WindowEvent(frmMythologyCollapse, WindowEvent.WINDOW_CLOSING));
								Graphics panel = new Graphics();
								try {
									Hercules story = new Hercules(panel);
								} catch (InterruptedException e1) {
									// TODO Auto-generated catch block
									e1.printStackTrace();
								}
								
							}
						});
					}
		        });
			}
		});
	}
}
