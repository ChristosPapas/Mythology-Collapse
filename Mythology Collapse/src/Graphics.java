import java.awt.datatransfer.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
import java.io.*;
import javax.swing.*;
public class Graphics implements ActionListener{
	public void createWindow() {
		JButton  aButton,bButton,cButton,submitButton;
		JLabel message;
		String x;
		JTextField panel;
		JLabel outcome;
		JFrame f;
		f= new JFrame("Mythology Collapse");  // creating instance of JFrame with message a on the upper left corner of the Window
		message=new JLabel("<html>� ����� ������� ��� ������ ���� ���� ��� ����������� (������� ���� ��� ����� ��� ����� ��� �������). <br/>"
				+ "��� �� ��������� �� ������ ����� ��� �� �������� ��� ������� ������ �� ������������� ��� ������� ��� ����������� ����:<br/>"
				+ "���� � ������� ������ ��� ��� ���� �� ����� ����� ��� ����������� ��� ����� 2 ��������:<br/>"
				+ "1) �� �������� �� ��� ��������� ������� ��� ������� �� ��������� �� �����<br/>"
				+ "2) �� ��� �������� ���� ���������� ��� �������� ��� ������� ��� ��� ��������� �� ����������� ��������<html>", SwingConstants.CENTER);//creating label with message b above 
		message.setBounds(-100,0,1000,100);//x axis, y axis, width, height  
		aButton = new JButton("A"); //adding an a button
		bButton= new JButton("B");//adding a b button
		cButton=new JButton("C");//adding a c button
		aButton.setBounds(10,200,80,25);
		bButton.setBounds(150,200,80,25);
		cButton.setBounds(290,200,80,25);
		f.add(aButton);
		f.add(bButton);
		f.add(cButton);
		f.add(message);//adding message in JFrame  
		f.setSize(1000,300);//400 width and 500 height  
		f.setLayout(null);//using no layout managers  
		f.setVisible(true);//making the frame visible
		submitButton=new JButton("Submit");
		submitButton.setBounds(10,100,80,25);
		submitButton.addActionListener(new Graphics());
		submitButton.setBounds(100,100,80,25);
	}
	public static void main(String[] args) {
		Graphics window=new Graphics();
		window.createWindow();
	}
}

