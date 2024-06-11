package com.pack;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class CardLayoutTest extends JFrame
    implements ActionListener {
  JButton b1 = new JButton("Red"),b2 = new JButton("Green"),
      b3 = new JButton("Blue"),b4 = new JButton("Yellow"),
      b5 = new JButton("Pink"), b6 = new JButton("4SU21CS032");
  CardLayout lo = new CardLayout();
  Container pane;
  public CardLayoutTest() {
    setTitle("CardLayout Test");
    pane = getContentPane();
    pane.setLayout(lo);
    setBounds(0,0,200,100);
    pane.add(b6,"1"); pane.add(b2,"2"); pane.add(b3,"3");  pane.add(b4,"4"); pane.add(b5,"5");pane.add(b1,"5");
    b1.addActionListener(this); b2.addActionListener(this);
    b3.addActionListener(this); b4.addActionListener(this);
    b5.addActionListener(this);
	}
  
public void actionPerformed(ActionEvent e) {
    if (e.getSource() == b1) lo.next(pane);
    else if (e.getSource() == b2) lo.next(pane);
    else if (e.getSource() == b3) lo.next(pane);
    else if (e.getSource() == b4) lo.next(pane);
    else if (e.getSource() == b5) lo.next(pane);
  }
  public static void main(String args[]) {
    JFrame f = new CardLayoutTest();
    f.setVisible(true);
  }
}

