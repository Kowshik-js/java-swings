package com.pack;


import javax.swing.*;

public class HelloWorldSwing {
	public static void main(String[] args) {
		JFrame frame = new JFrame("HelloWorldSwing");
		
		JLabel label = new JLabel("Hello World          [4SU21CS032]");
		frame.add(label); 	
 	
 		// Give the frame an initial size.
        frame.setSize(275, 100);
        //frame.pack();                
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
} 
