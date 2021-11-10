package firstdemo;

import com.mysql.jdbc.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//import java.beans.Statement;
//import java.sql.DriverManager;
import java.sql.*;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;


public class Project implements ActionListener{
	JFrame f,f2,f3;
	Label l1,l2,l3,l4,l5;
	Label lb1,lb2,lb3;
	TextField t1,t2,t3,t4,t5;
	TextField tf1,tf2;
	Button b1;
	Button bb1,bb2,bb3;
	JTable t;
	String[] columnNames = { "ID", "Name", "Username", "Email", "Contact", "Password"};
	Project(){
//		f=new JFrame("Registration Form");
//		f.setVisible(true);
//		f.setSize(500,350);
//		f.setBackground(Color.YELLOW);
//		f.setLayout(null);
		//f.setLayout(new FlowLayout());
		
		l1=new Label("Name : ");
		t1=new TextField(20);
		l2=new Label("Username : ");
		t2=new TextField(20);
		l3=new Label("Email : ");
		t3=new TextField(20);
		l4=new Label("Contact :");
		t4=new TextField(20);
		l5=new Label("Password :");	
		t5=new TextField(20);
//		//t5.setEchoChar('*');
		b1=new Button("SUBMIT");
		
		//frame 2
		f2=new JFrame("Login");
		
		f3=new JFrame("Registartion table");
		f2.setSize(500,350);
		f2.setVisible(true);
		f2.setLayout(null);
		f2.getContentPane().setBackground(Color.cyan);
		//f2.setLayout(new FlowLayout());
		
		lb1=new Label("Username : ");
		tf1=new TextField(20);
		lb2= new Label("Password : ");
		tf2=new TextField(20);
		lb3=new Label("You have to Register first then Login");
		bb1=new Button("Login");
		bb2=new Button("Register");
		bb3=new Button("Submit");
		f2.add(lb3);
		f2.add(lb1);
		f2.add(tf1);
		f2.add(bb1);
		f2.add(bb2);
		f2.add(lb2);
		f2.add(tf2);
		bb1.addActionListener(this);
		bb2.addActionListener(this);
		
		lb1.setBounds(60, 50, 90, 25);
		tf1.setBounds(147, 50, 300, 25);
		lb2.setBounds(60, 89, 70, 25);
		tf2.setBounds(147, 90, 300, 25);
		lb3.setBounds(170, 10, 200, 25);
		bb1.setBounds(150, 150, 60, 30);
		bb2.setBounds(300, 150, 60, 30);
	}

public static void main(String[] args) {
	Project p=new Project();
}

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3308/sakshi","root","");
		Statement st = (Statement) con.createStatement();
		ResultSet rss = ((java.sql.Statement) st).executeQuery("Select * from logins");
		if(e.getSource()==bb1) { //login
			while(rss.next()) {
				if (tf1.getText().equals(rss.getString("Username"))&&
					tf2.getText().equals(rss.getString("Password"))) {
					f2.dispose();
					f3.setVisible(true);
					f3.setSize(800,350);
					
					t=new JTable();
					DefaultTableModel model=new DefaultTableModel();
					model.setColumnIdentifiers(columnNames);
					t.setModel(model);
					t.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
					t.setEnabled(false);
					f3.add(t);
					st=(Statement) con.createStatement();
					JScrollPane sp = new JScrollPane(t);
					sp.setBounds(100, 100, 50, 100);
					f3.add(sp);
					t.setBounds(200, 60, 160, 30);
					rss =((java.sql.Statement) st).executeQuery("Select * from logins");
					while(rss.next()) {
						int i = 0;
						JTableHeader header = t.getTableHeader();
						int id = rss.getInt("ID");
						String name = rss.getString("Name");
						String uname = rss.getString("Username");
						String em=rss.getString("Email");
						String cont=rss.getString("Contact");
						String pass=rss.getString("Password");
						model.addRow(new Object[] { id, name, uname,em,cont,pass });
						i++;
					}
				}
				
				else {
					  JOptionPane.showMessageDialog(f2,"Please insert correct Password");
					  }
			}
		}
	}
	
	 	catch (SQLException s) {
			System.out.println(s.getMessage());
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}

		if(e.getSource()==bb2) {   //register
			f=new JFrame("Registration Form");
			f.setVisible(true);
			f.setSize(500,350);
			f.getContentPane().setBackground(Color.PINK);
			f.setLayout(null);
			f.add(l1);
			f.add(t1);
			f.add(l2);
			f.add(t2);
			f.add(l3);
			f.add(t3);
			f.add(l4);
			f.add(t4);
			f.add(l5);
			f.add(t5);
			f.add(b1);
			b1.addActionListener(this);
			
			l1.setBounds(60, 50, 90, 23);
			t1.setBounds(147, 50, 300, 23);
			
			l2.setBounds(60, 89, 70, 23);
			t2.setBounds(147, 90, 300, 23);
			
			l3.setBounds(60, 125, 87, 23);
			t3.setBounds(147, 125, 300, 23);
			
			l4.setBounds(60, 160, 87, 23);
			t4.setBounds(147, 160, 300, 23);
			
			l5.setBounds(60, 196, 87, 23);
			t5.setBounds(147, 196, 300, 23);
			
			b1.setBounds(250, 250, 50, 20);
			
		}
		
//		if(e.getSource()==b1) {
//			
//			JOptionPane.showMessageDialog(f, "Details save sucessfully!!!!!!!!");
//			f.dispose();
//		}
		
//		if(e.getSource()==bb1) { /// login
//			f3.setVisible(true);
//			f3.setSize(500,350);
//		}
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con1 = DriverManager.getConnection("jdbc:mysql://localhost:3308/sakshi","root","");
			Statement st = (Statement) con1.createStatement();
			if(e.getSource()==b1) {  //submit
				f2.dispose();
				//int id = t1.getInt("ID");
				String name = t1.getText();
				String uname = t2.getText();
				String em=t3.getText();
				String cont=t4.getText();
				String pass=t5.getText(); 
				String s1 = "insert into logins(Name,Username,Email,Contact,Password)values(?,?,?,?,?)"; 
				PreparedStatement pr=con1.prepareStatement(s1);
				pr.setString(1, name);
				pr.setString(2, uname);
				pr.setString(3, em);
				pr.setString(4, cont);
				pr.setString(5, pass);
				pr.executeUpdate();
				JOptionPane.showMessageDialog(f, "Details Save Successfully !!!!!!");
				con1.close();
				f.dispose();
			}
		}
		catch (SQLException s1) {
			System.out.println(s1.getMessage());
		} catch (Exception ex1) {
			System.out.println(ex1.getMessage());
		}
		
		}
}

