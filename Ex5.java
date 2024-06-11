package com.pack;
import java.io.*;
import java.awt.*;
import java.awt.event.*;

public class Ex5 extends Frame implements ActionListener
{
	TextField t1;
	TextArea t2;
	Button b1,b2;
	GridBagLayout gbl;
	GridBagConstraints gbc;
	FileDialog fd;
	public Ex5(String str)
	{
		super(str);
		WinAdapter wa=new WinAdapter(this);
   		addWindowListener(wa);
		t1=new TextField(75);
		t2=new TextArea(25,75);
		b1=new Button("Browse");
		b2=new Button("Display");
		gbl=new GridBagLayout();
		gbc=new GridBagConstraints();
		fd=new FileDialog(this,"Open File Dialog",FileDialog.LOAD);
		setLayout(gbl);
		gbc.gridx=0;
		gbc.gridy=0;
		add(t1,gbc);
		gbc.gridx++;
		add(b1,gbc);
		gbc.gridx--;
		gbc.gridy++;
		add(t2,gbc);
		gbc.gridx++;
		add(b2,gbc);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		
	}
	
	public void actionPerformed(ActionEvent ae)
	{	
		try{
		if(ae.getSource()==b1)
		{
			fd.show();
		}
		if(ae.getSource()==b2)
		{
		int c;
		String s="";
		FileInputStream in = new FileInputStream(fd.getDirectory()+fd.getFile());
		while((c = in.read())!=-1)
		{
		s+=(char)c;
		}
		t2.setText(s);
		}
		t1.setText(fd.getDirectory() + fd.getFile());
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	
		public static void main(String args[])
	{
		Ex5 win=new Ex5("FileReader Window");
		win.setSize(800,600);
		win.setVisible(true);
	}
}

class WindowAdapter extends WindowAdapter
{	
	Ex5 obj;
	public WinAdapter(Ex5 ex)
	{
		this.obj=ex;
	}
	
	public void windowClosing(WindowEvent we)
	{
		obj.setVisible(false);
	}
}