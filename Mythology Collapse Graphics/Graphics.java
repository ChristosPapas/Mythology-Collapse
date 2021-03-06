package MythologyCollapse;


import java.awt.Color;
import java.awt.datatransfer.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.image.BufferedImage;
import java.awt.*;
import java.io.*;
import java.util.concurrent.TimeUnit;

import javax.swing.*;

public class Graphics extends Thread implements ActionListener {
	
	
	
	private ImageIcon image;
	private JLabel lab;
	JLabel warningMessage;   //a warning message for false inputs
	JFrame f;   
	JLabel message;   //the message shown to the player
	JTextField answer;  //the text field where the answer is located
	String input;      //the users input
	boolean pressed=false; //checks if the button has been pressed
	String lastMessage=null; //variable that keeps the users last message
	
	public Graphics() {
		f = new JFrame("Mythology Collapse");  // creating instance of JFrame with message a on the upper left corner of the Window
		f.setResizable(false);
		message = new JLabel("", SwingConstants.CENTER);//creating label with message  
		message.setBounds(30,30,900,400);	//x axis, y axis, width, height  
		message.setForeground(Color.WHITE);
		warningMessage = new JLabel("");
		warningMessage.setBounds(100, 230, 800, 30);
		f.add(message);		//adding message in JFrame  
		f.add(warningMessage);
		f.setSize(1000,600);	//1000 width and 500 height  
		f.setLayout(null);		//using no layout managers  
		JButton submitButton = new JButton("Submit"); 
		submitButton.setBounds(500, 450, 100, 30);
		submitButton.addActionListener(this);
		submitButton.setVisible(true);
		f.add(submitButton);
		answer = new JTextField(20);
		answer.setBounds(new Rectangle(350, 450, 100, 30));
		f.add(answer);
		answer.setVisible(true);
	//making the frame visible
	}
	public void setMessage(String stringMessage) {  //method that changes the message shown to the user
		message.setText(stringMessage);
		lastMessage=stringMessage;
	}
	public void addWarningMessage(String stringMessage) {   //method that shows a warning message for false inputs 
		warningMessage.setText(stringMessage);
	}
	public void close() {
		f.dispose();
	}
	public void actionPerformed(ActionEvent e){  //actionlistener for the button
		warningMessage.setText(null);
        input = answer.getText();
        pressed=true;
	}  
	public String getInputInt() throws InterruptedException { //method that returns the input of the user according to the game logic
		while(pressed == false){
		    try {
		       Thread.sleep(100);
		   } catch(InterruptedException e) {
		    	e.printStackTrace();
		    }
		}
		pressed = false;	// deactivate permanently the button till the next question is displayed
		return  input;
	}

	public void errorInputMessage(int no) {
		JFrame fr = new JFrame("Error");
		fr.setSize(200,200);
		JOptionPane.showMessageDialog(fr, "???????????? ???? ?????????????????????????????? ???????? ?????????????? ???????????? 1 ??????"+no+".???????????????????? ????????!",null, JOptionPane.ERROR_MESSAGE);	
	}
	public void addMessage(String message) { // method that adds a message below the initial message
		this.message.setText(lastMessage +" <br/> "+ message);
		lastMessage=lastMessage +" <br/> "+ message;
	}
	
	public void setImage(String s) {
		image = new ImageIcon(this.getClass().getResource(s));
		lab = new JLabel(image);
		lab.setSize(1000,600);
		f.add(lab);
		f.setVisible(true);	
	}
	public void closeFrame() {
		f.dispatchEvent(
				new WindowEvent(f, WindowEvent.WINDOW_CLOSING));
	}
}