package com.pack;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class BorderLayoutTest extends JFrame {
	JButton b1=new JButton("Red"),
	b2=new JButton("Green"),b3=new JButton("Blue"),
	b4=new JButton("Yellow"),b5=new JButton("4SU21CS032");
	public BorderLayoutTest() 
        {
		setTitle("BorderLayout Test");
		
		setLayout(new BorderLayout());
		setBounds(0,0,400,150);
		add(b1,"North"); add(b2,"South");	add(b3,"East");
     	add(b4,"West"); add(b5,"Center");
	}
   public static void main(String args[]) {
   	JFrame f = new BorderLayoutTest();
     	f.setVisible(true);
	}
}
