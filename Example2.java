package com.pack;

import java.io.*;
import java.awt.*;
import java.awt.event.*;

public class Example2 extends Frame implements ActionListener
{
	int i,j;
	TextField t1;
	String op1,op2,oprs,value="";
	Button b[]=new Button[13];
	Button opr[]=new Button[4];
	GridBagLayout gbl;
	GridBagConstraints gbc;
	public Example2(String str)
	{
		super(str);
		WinAdapter wa=new WinAdapter(this);
		addWindowListener(wa);
		t1=new TextField(18);
		for(i=0;i<10;i++)
		{
			b[i]=new Button(""+i);
		}
		b[10]=new Button(".");
		b[11]=new Button("=");
		opr[0]=new Button("+");
		opr[1]=new Button("-");
		opr[2]=new Button("*");
		opr[3]=new Button("/");
		
		gbl=new GridBagLayout();
		gbc=new GridBagConstraints();
		Panel p1=new Panel();
		Panel p2=new Panel();
		Panel p3=new Panel();
		setLayout(new BorderLayout());
		add("North",p1);
		add("Center",p2);
		add("East",p3);
		p1.add(t1);
		p2.setLayout(gbl);
		gbc.ipadx=15;
		gbc.ipady=15;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		gbc.fill = GridBagConstraints.NONE;
		gbc.anchor = GridBagConstraints.CENTER;

		gbc.gridx=0;
		gbc.gridy=0;
		p2.add(b[1],gbc); gbc.gridx++;
		p2.add(b[2],gbc); gbc.gridx++;
		p2.add(b[3],gbc); gbc.gridx=0; gbc.gridy++;
		p2.add(b[4],gbc); gbc.gridx++;
		p2.add(b[5],gbc); gbc.gridx++;
		p2.add(b[6],gbc); gbc.gridx=0; gbc.gridy++;
		p2.add(b[7],gbc); gbc.gridx++;
		p2.add(b[8],gbc); gbc.gridx++;
		p2.add(b[9],gbc); gbc.gridx=0; gbc.gridy++;
		p2.add(b[10],gbc); gbc.gridx++;
		p2.add(b[0],gbc); gbc.gridx++;
		p2.add(b[11],gbc); gbc.gridx=0; gbc.gridy++;
		
		
		
		gbc.gridx=3;
		gbc.gridy=0; 
		for(i=0;i<4;i++)
		{
		p2.add(opr[i],gbc);gbc.gridy++;
		}
		
		for(i=0;i<12;i++)
		{
		b[i].addActionListener(this);
		}
		for(i=0;i<4;i++)
		{
		opr[i].addActionListener(this);
		}
	}
	
	public void actionPerformed(ActionEvent ae)
	{	
		try{
		value+=ae.getActionCommand();
		for(i=0;i<4;i++)
		{
		if(ae.getSource()==opr[i])
		{
			op1=t1.getText();
			oprs=ae.getActionCommand();
			value="";
		}
		}
				
		if(ae.getActionCommand()=="=")
		{
			op2=t1.getText();
			double x,y;double z=0.0;
			x=Double.parseDouble(op1);
			y=Double.parseDouble(op2);
			if(oprs=="+")
			{ z=x+y;}
			if(oprs=="-")
			{ z=x-y;}
			if(oprs=="*")
			{ z=x*y;}
			if(oprs=="/")
			{ z=x/y;}
			t1.setText(""+z);
			oprs="";
			op1="";
			op2="";
			value="";
		}
		else
		{
			t1.setText(value);
		}
		
		
		for(i=0;i<4;i++)
		{
		if(ae.getSource()==opr[i])
		{
			t1.setText("");
		}
		}		
		
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	
	public static void main(String args[])
	{
		Example2 win=new Example2("4SU21CS032");
		win.setSize(250,250);
		win.setVisible(true);
	}
}

class WinAdapter extends WindowAdapter
{	
	Example2 obj;
	public WinAdapter(Example2 ex)
	{
		this.obj=ex;
	}
	
	public void windowClosing(WindowEvent we)
	{
		obj.setVisible(false);
	}
}
