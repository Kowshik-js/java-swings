package com.pack;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class FlowLayoutTest extends JFrame {
	JButton b1=new JButton("Red"),
	b2=new JButton("Green"),b3=new JButton("Blue"),
	b4=new JButton("Yellow"),b5=new JButton("Pink"),b6=new JButton("4SU21CS032");
   public FlowLayoutTest() {
      setTitle("FlowLayout Test");
      
      setLayout(new FlowLayout());
      setBounds(0,0,400,100);
      add(b1); add(b2); add(b3);
      add(b4); add(b5); add(b6);
   }
   public static void main(String args[]) {
      JFrame f = new FlowLayoutTest();
      f.setVisible(true);
   }
}
