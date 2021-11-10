package sakshigothal;

import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

public class AWTDATABASE implements ActionListener {
	JFrame f1 = new JFrame("login");
	JFrame f2 = new JFrame("Registeration");
	JFrame f3 = new JFrame("Registeration list");
	Label l1 = new Label("Username:");
	TextField t1 = new TextField(20);
	Label l2 = new Label("Password:");
	TextField t2 = new TextField(20);
	Button b1 = new Button("login");
	Button b2 = new Button("Register");
	Label rl1 = new Label("Username:");
	TextField rt1 = new TextField(20);
	Label rl2 = new Label("Password:");
	TextField rt2 = new TextField(20);
	Button rb1 = new Button("Submit");
	JTable t;
	String[] columnNames = { "ID", "Username", "Password" };

	AWTDATABASE() {
		f1.setSize(400, 400);
		f1.setVisible(true);
		f1.setLayout(new FlowLayout());
		f1.add(l1);
		f1.add(t1);
		f1.add(l2);
		f1.add(t2);
		f1.add(b1);
		f1.add(b2);
		f1.getContentPane().setBackground(Color.GRAY);
		f2.getContentPane().setBackground(Color.orange);
		f3.getContentPane().setBackground(Color.lightGray);
		b1.addActionListener(this);
		b2.addActionListener(this);
		rb1.addActionListener(this);
	}

	public static void main(String[] args) {
		AWTDATABASE a = new AWTDATABASE();
	}

	public void actionPerformed(ActionEvent e) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3308/sakshi","root","");
			Statement st = con.createStatement();
			ResultSet rss = st.executeQuery("Select * from proj");
			if (e.getSource() == b1) { //login

				while (rss.next()) {

					if (t1.getText().equals(rss.getString("Username")) && t2.getText().equals(rss.getString("Password"))) {
						f3.setVisible(true);
						f3.setSize(400, 400);
						// f3.setLayout(new GridLayout(1,4));
						t = new JTable();

						DefaultTableModel model = new DefaultTableModel(); //table structure
						model.setColumnIdentifiers(columnNames); //table column
						t.setModel(model);
						t.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
//						t.setFillsViewportHeight(true);
						t.setEnabled(false);
						f3.add(t);
						st = con.createStatement();
						JScrollPane sp = new JScrollPane(t);
						sp.setBounds(100, 100, 50, 100);
						f3.add(sp);
						t.setBounds(200, 60, 160, 30);
						rss = st.executeQuery("Select * from proj");
						// ResultSet rrs=st.executeQuery("select * from proj");
						while (rss.next()) {
							int i = 0;
							JTableHeader header = t.getTableHeader();
							int id = rss.getInt("id");
							String uname = rss.getString("Username");
							String pass = rss.getString("Password");
							model.addRow(new Object[] { id, uname, pass });
							i++;
						}

					}
					/*
					 * else {
					 * JOptionPane.showMessageDialog(null,"incorrect password");
					 * }
					 */

				}

			}

		} catch (SQLException s) {
			System.out.println(s.getMessage());
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}

		if (e.getSource() == b2) {  // register
			f1.dispose();
			f2.setVisible(true);
			f2.setLayout(new FlowLayout());
			f2.setSize(400, 400);
			f2.add(rl1);
			f2.add(rt1);
			f2.add(rl2);
			f2.add(rt2);
			f2.add(rb1);
		}
		// st.executeUpdate(s1);

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con1 = DriverManager.getConnection("jdbc:mysql://localhost:3308/sakshi","root","");
			Statement st = con1.createStatement();
			if (e.getSource() == rb1) { //submit
				f2.dispose();
				String uname = rt1.getText();
				String pass = rt2.getText();
				String s1 = "insert into proj(Username,Password)values(?,?)";
				PreparedStatement pr = con1.prepareStatement(s1);
				pr.setString(1, uname);
				pr.setString(2, pass);
				pr.executeUpdate();
				JOptionPane.showMessageDialog(null, "Registered successfully");
				con1.close();
			}			 
		} catch (SQLException s1) {
			System.out.println(s1.getMessage());
		} catch (Exception ex1) {
			System.out.println(ex1.getMessage());
		}

	}
}
