package sakshigothal;

import java.awt.*;

public class DemoFrame {
	Frame f;
	Label l1,l2,l3,l4;
	TextField t1,t2,t3,t4;
	Button b1,b2;
	Checkbox c1,c2,c3,c4;
	public DemoFrame() {
		f=new Frame("Student Regisration Form");
		f.setBackground(Color.cyan);
		f.setVisible(true);
		f.setSize(700,700);
		f.setLayout(new FlowLayout());
		
		l1=new Label("Student Name: ");
		l2=new Label("College Name: ");
		l3=new Label("Contact No.: ");
		l4=new Label("Adress: ");
		
		t1=new TextField(50);
		t2=new TextField(50);
		t2.setEchoChar('*');
		t3=new TextField(50);
		t4=new TextField(50);
		
		b1=new Button("Submit");
		b2=new Button("Back");
		
		l1.setBounds(10, 50, 80, 20);
		t2.setBounds(110, 50, 100, 20);
		l2.setBounds(10, 80, 80, 80);
		t2.setBounds(100, 80, 50, 20);
		b1.setBounds(10, 50, 80, 20);
		f.setLayout(null);
		
		f.add(l1);
		f.add(t1);
//		f.add(l2);
//		f.add(t2);
//		f.add(l3);
//		f.add(t3);
//		f.add(l4);
//		f.add(t4);
//		f.add(b1);
//		f.add(b2);
	}
public static void main(String[] args) {
	DemoFrame d= new DemoFrame();
}

}
