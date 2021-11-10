package sakshigothal;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class BorderDemo implements ActionListener{
	JFrame f;
	Button b1,b2,b3,b4;
	TextArea ta;
	BorderDemo(){
		f=new  JFrame("Border");
		f.setSize(200,200);
		f.setVisible(true);
		f.setLayout(new BorderLayout());
		b1=new Button("North");
		b2=new Button("South");
		b3=new Button("East");
		b4=new Button("West");
		ta=new TextArea(10,20);
		f.add(b1,BorderLayout.NORTH);
		f.add(b2,BorderLayout.SOUTH);
		f.add(b3,BorderLayout.EAST);
		f.add(b4,BorderLayout.WEST);
		f.add(ta,BorderLayout.CENTER);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
public static void main(String[] args) {
	BorderDemo b=new BorderDemo();
}
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	if(e.getSource()==b1) {
		ta.setText("you have selected north");
	}
	if(e.getSource()==b2) {
		ta.setText("you have selected south");
	}
	if(e.getSource()==b3) {
		ta.setText("you have selected east");
	}
	if(e.getSource()==b4) {
		ta.setText("you have selected west");
	}
	
}
}
