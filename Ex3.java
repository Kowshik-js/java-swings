package com.pack;
import java.awt.*;
import java.awt.event.*;
public class Ex3 extends Frame implements ActionListener
{
	int i,ch=5;
	MenuBar mbar;
	Menu draw,ext;
	MenuItem mit[]=new MenuItem[5];
	
	public Ex3(String str)
	{
		super(str);
		WinAdapter wa=new WinAdapter(this);
		addWindowListener(wa);
		mbar=new MenuBar();
		draw=new Menu("Draw");
		ext=new Menu("Exit");
		mit[0]=new MenuItem("Draw Line");
		mit[1]=new MenuItem("Draw Arc");
		mit[2]=new MenuItem("Draw Rectangle");
		mit[3]=new MenuItem("Draw Oval");
		mit[4]=new MenuItem("Exit");
		setMenuBar(mbar);
		for(i=0;i<4;i++)
		{
			draw.add(mit[i]);
		}
		ext.add(mit[4]);
		mbar.add(draw);
		mbar.add(ext);
		for(i=0;i<5;i++)
		{
			mit[i].addActionListener(this);
		}
		
	}
	
	public void paint(Graphics g)
	{	
		switch(ch)
		 {
		 case 0: 
		 		g.setColor(Color.RED);
		 		g.drawLine(150,150,300,150);
		 		break;
		 case 1: 
		 		g.setColor(Color.YELLOW);
		 		g.fillArc(350,350,200,125,180,180);
		 		break;
		 case 2: 
		 		g.setColor(Color.BLUE);
		 		g.fillRect(150,350,200,150);
		 		break;
		 case 3: 
		 		g.setColor(Color.GREEN);
		 		g.fillOval(450,150,150,150);
		 		break;
		 case 4:
		 		System.exit(0);
		 default:
		 		
		}
	
	}
	public void actionPerformed(ActionEvent ae)
	{	
		for(i=0;i<5;i++)
		{
		if(ae.getSource()==mit[i])
		{
			ch=i;
		}
		}
		repaint();
		
	}
		public static void main(String args[])
	{
		Ex3 win=new Ex3("Paint Window");
		win.setSize(800,600);
		win.setVisible(true);
	}
}

class WinAdapter extends WindowAdapter
{	
	Ex3 obj;
	public WinAdapter(Ex3 ex)
	{
		this.obj=ex;
	}
	
	public void windowClosing(WindowEvent we)
	{
		obj.setVisible(false);
	}
}
