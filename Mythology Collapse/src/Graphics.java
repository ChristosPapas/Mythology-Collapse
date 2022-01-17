package MythologyCollapse;

import java.awt.datatransfer.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
import java.io.*;
import java.util.concurrent.TimeUnit;

import javax.swing.*;

public class Graphics extends Thread implements ActionListener {
	JLabel warningMessage;   //a warning message for false inputs
	JFrame f;   
	JLabel message;   //the message shown to the player
	JTextField answer;  //the text field where the answer is located
	String input;      //the users input
	boolean pressed=false; //checks if the button has been pressed
	
	public Graphics() {
		f = new JFrame("Mythology Collapse");  // creating instance of JFrame with message a on the upper left corner of the Window
		f.setResizable(false);
		message = new JLabel("", SwingConstants.CENTER);//creating label with message  
		message.setBounds(80,0,800,300);		//x axis, y axis, width, height  
		warningMessage = new JLabel("");
		warningMessage.setBounds(100, 230, 800, 30);
		f.add(message);		//adding message in JFrame  
		f.add(warningMessage);
		f.setSize(1000,600);		//1000 width and 500 height  
		f.setLayout(null);		//using no layout managers  
		JButton submitButton = new JButton("Submit"); 
		submitButton.setBounds(500, 350, 100, 30);
		submitButton.addActionListener(this);
		submitButton.setVisible(true);
		f.add(submitButton);
		answer = new JTextField(20);
		answer.setBounds(new Rectangle(350, 350, 100, 30));
		f.add(answer);
		answer.setVisible(true);
		f.setVisible(true);		//making the frame visible
	}
	public void setMessage(String stringMessage) {  //method that changes the message shown to the user
		message.setText(stringMessage);
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
		JOptionPane.showMessageDialog(fr, "Πρέπει να πληκτρολογήσεις έναν ακέραιο μεταξύ 1 και"+no+".Προσπάθησε ξανά!",null, JOptionPane.ERROR_MESSAGE);	
	}

}

