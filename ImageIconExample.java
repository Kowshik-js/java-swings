package com.pack;
import java.awt.FlowLayout;
import javax.swing.*;

public class ImageIconExample extends JFrame {
  public static void main(String[] args) {
    JFrame frame = new JFrame("ImageIcon Example");
    ImageIcon icon = new ImageIcon("C:\\Users\\Koushik\\Downloads\\dhanush.jfif");
    frame.setLayout(new FlowLayout()); 
    JButton button = new JButton(icon);
    frame.add(button);
    
    frame.setSize(245,100);
    frame.setVisible(true);
  }
}
