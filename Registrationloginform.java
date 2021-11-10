package firstdemo;


import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
public class Registrationloginform extends JFrame implements ActionListener {
	
	JFrame f1 = new JFrame("login");
	JFrame f2 = new JFrame("Registeration");
	JFrame f3 = new JFrame("Registeration list");
	Label l1 = new Label("Username:");
	TextField t1 = new TextField(20);
	Label l2 = new Label("Password:");
	TextField t2 = new TextField(20);
	Button b1 = new Button("login");
	Button b2 = new Button("Register");
	Label rl1 = new Label("name:");
	TextField rt1 = new TextField(20);
	Label rl2 = new Label("username:");
	TextField rt2 = new TextField(20);
	Label rl3 = new Label("email:");
	TextField rt3 = new TextField(20);
	Label rl4 = new Label("contact:");
	TextField rt4 = new TextField(20);
	Label rl5 = new Label("password:");
	TextField rt5 = new TextField(20);
	Button rb1=new Button("submit");
	JTable t;
	String [] columnNames = { "ID", "name","Username","Email","contact","Password"};
	//private Object EXIT_ON_CLOSE;

	Registrationloginform(){
		f1.setSize(400, 400);
		f1.setVisible(true);
		f1.setLayout(new FlowLayout());
		f1.add(l1);
		f1.add(t1);
		f1.add(l2);
		f1.add(t2);
		f1.add(b1);
		f1.add(b2);
		f1.getContentPane().setBackground(Color.orange);
		f2.getContentPane().setBackground(Color.BLUE);
		f3.getContentPane().setBackground(Color.YELLOW);
		b1.addActionListener(this);
		b2.addActionListener(this);
		rb1.addActionListener(this);
		
		
	}
	
	
public static void main(String[] args) {
	Registrationloginform rf=new Registrationloginform();
}


@SuppressWarnings("resource")
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	//Server: MySQL:3306 »Database: sanketsakpal »Table: registrationlist
try {	Class.forName("com.mysql.jdbc.Driver");
	Connection con1 = DriverManager.getConnection("jdbc:mysql://localhost:3308/sakshi", "root", "");
	Statement st = con1.createStatement();
	ResultSet rss = st.executeQuery("Select * from logininfo");
	if(e.getSource()==b1) {
		
		
		while(rss.next()) {
			if(rt1.getText().equals(rss.getString("Username"))&&rt2.getText().equals(rss.getString("Password"))) {
				f3.setVisible(true);
				f3.setSize(400, 400);
				t = new JTable();
				
				DefaultTableModel model = new DefaultTableModel(); 
				model.setColumnIdentifiers(columnNames);
				t.setModel(model);
				t.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
				t.setFillsViewportHeight(true);
				t.setEnabled(false);
				f3.add(t);
				st = con1.createStatement();
				JScrollPane sp = new JScrollPane(t);
				sp.setBounds(100, 100, 50, 100);
				f3.add(sp);
				t.setBounds(200, 60, 160, 30);
				rss = st.executeQuery("Select * from logininfo");
				
				while(rss.next()) {
					int i = 0;
					JTableHeader header = t.getTableHeader();
					int id = rss.getInt("ID");
					String name = rss.getString("name");
					String uname=rss.getString("Username");
					String email=rss.getString("Email");
					String cont=rss.getString("contact");
					String pass = rss.getString("Password");
					model.addRow(new Object[] { id, name, uname,email,cont,pass});
					i++;
					st.close();
					con1.close();
				}
				}
			else {
				  JOptionPane.showMessageDialog(f3,"incorrect password");
				  }
			}
			
	}
}
	catch (SQLException s) {
		System.out.println(s.getMessage());
	} catch (Exception ex) {
		System.out.println(ex.getMessage());
	}if (e.getSource() == b2) {
		f1.dispose();
		f2.setVisible(true);
		f2.setLayout(new FlowLayout());
		f2.setSize(400, 400);
		//rl1.setBounds(60, 50, 90, 23);
		//rt1.setBounds(147, 50, 300, 23);
		//rl2.setBounds(60, 89, 70, 23);
		//rt2.setBounds(147, 90, 300, 23);
		//rl3.setBounds(60, 125, 87, 23);
		//rt3.setBounds(147, 125, 300, 23);
		//rl4.setBounds(60,60,87,230);
		//rt4.setBounds(147, 160, 300, 23);
		//rl5.setBounds(60, 105, 87, 400);
		//rt5.setBounds(147, 196, 300, 23);
		//rb1.setBounds(250, 250, 50, 20);
		f2.add(rl1);
		f2.add(rt1);
		f2.add(rl2);
		f2.add(rt2);
		f2.add(rl3);
		f2.add(rt3);
		f2.add(rl4);
		f2.add(rt4);
		f2.add(rl5);
		f2.add(rt5);
		f2.add(rb1);
	}
	try {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con2 = DriverManager.getConnection("jdbc:mysql://localhost:3308/sakshi", "root", "");
		Statement st = con2.createStatement();
		if(e.getSource()==rb1){
			f2.dispose();
			String name=rt1.getText();
			String uname=rt2.getText();
			String email=rt3.getText();
			String cont=rt4.getText();
			String pass=rt5.getText();
			String s1="insert into logininfo(name,Username,Email,contact,Password)values(?,?,?,?,?)";
			
					PreparedStatement pr = con2.prepareStatement(s1);
					pr.setString(1, name);
					pr.setString(2, uname);
					pr.setString(3, email );
					pr.setString(4, cont);
					pr.setString(5, pass);
					pr.executeUpdate();
					JOptionPane.showMessageDialog(f1, "Registered successfully");
					con2.close();
		}
	} catch (SQLException s1) {
		System.out.println(s1.getMessage());
	} catch (Exception ex1) {
		System.out.println(ex1.getMessage());
	}
	
	}

}


