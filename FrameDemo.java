package sakshigothal;

import java.awt.*;

public class FrameDemo {
	Frame f;
	Label l1,l2;
	TextField t1,t2;
	Button b1,b2;
	TextArea ta;
	Checkbox c1,c2,c3,c4;
	Choice ch;
	Checkbox cb1,cb2,cb3,cb4;
	CheckboxGroup cbg;
	public FrameDemo() {
		//frame
		f=new Frame("My File"); //or f.setTitle("sakshi");
		f.setBackground(Color.blue);
		f.setVisible(true);
		f.setSize(500,500);
		//f.setLayout(new FlowLayout());
		
		//component
		//label
		l1=new Label("UserName: ");
		l2=new Label("Password: ");
		
		//textfield
		t1=new TextField(20);
		t2=new TextField(20);
		t2.setEchoChar('*');// for hiding password
		//textarea
		ta=new TextArea(10,20);
		
		//button
		b1=new Button("Login");
		b2=new Button("Cancel");
		
		//checkbox
		c1= new Checkbox("java");
		c3= new Checkbox("android");
		c3= new Checkbox("flutter");
		c4= new Checkbox("php");
		
		//choice 
		ch = new Choice();
		ch.add("apple");
		ch.add("banana");
		ch.add("lichi");
		
		//checkboxgroup
		cbg=new CheckboxGroup();
		
		//radio button
		cb1=new Checkbox("vanilla",cbg,true);
		cb1=new Checkbox("butterscotch",cbg,true);
		cb1=new Checkbox("strawberry",cbg,true);
		cb1=new Checkbox("oreo",cbg,true);
		
		//bound
//		l1.setBounds(10, 50, 80, 20);
//		t2.setBounds(110, 50, 100, 20);
//		l2.setBounds(10, 80, 80, 80);
//		t2.setBounds(100, 80, 50, 20);
//		b1.setBounds(10, 50, 80, 20);
		//adding component
		//f.setLayout(null);
		f.setLayout(new FlowLayout());
	
		f.add(l1);
		f.add(t1);
		f.add(ta);
		f.add(l2);
		f.add(t2);
		f.add(b1);
		f.add(b2);
		f.add(c1);
		f.add(c2);
		f.add(c3);
		f.add(c4);
		f.add(cb1);
		f.add(cb2);
		f.add(cb3);
		f.add(cb4);
	}
public static void main(String[] args) {
	FrameDemo f=new FrameDemo();
}

}
