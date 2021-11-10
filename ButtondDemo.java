package sakshigothal;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public class ButtondDemo implements ActionListener {
	Frame f;
	Label l1,l2;
	TextField t1,t2;
	Button b1,b2;
	
	ButtondDemo(){
		f=new Frame("Login Screen");
		l1=new Label("UserName: ");
		l2=new Label("Password: ");
		t1=new TextField(20);
		t2=new TextField(20);
		b1=new Button("Login");
		b2=new Button("Cancel");
		
		f.setVisible(true);
		f.setSize(200,200);
		f.setLayout(new FlowLayout());
		f.add(l1);
		f.add(t1);
		f.add(l2);
		f.add(t2);
		f.add(b1);
		f.add(b2);
		b1.addActionListener(this);
		b2.addActionListener(this);
	}
	
public static void main(String[] args) {
	ButtondDemo b=new ButtondDemo();
}

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	if(e.getSource()==b1) {
		String tx=t1.getText();
		String tx1=t2.getText();
		//System.out.println(tx+" "+tx1);
		
		if(tx.equalsIgnoreCase("admin")&& tx1.equalsIgnoreCase("admin")) {
			//System.out.println("Login sucuccesfully");
			JOptionPane.showMessageDialog(f, "Login sucuccesfully");
		}
		else {
			//System.out.println("Unsuccessfully");
			JOptionPane.showMessageDialog(f, "Login Unsucuccesfully");
		}
	}
	if(e.getActionCommand().equalsIgnoreCase("Cancel")) {
		//System.out.println("b2 pressed");
		f.dispose();
	}
}
}
