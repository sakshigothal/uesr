package sakshigothal;
import java.sql.*;
import java.sql.SQLException;

public class Database {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");//java database connector //register
			//System.out.println("here");
			Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3308/sakshi","root",""); //get connection
			Statement st = con.createStatement(); //statement create
			String s="insert into student(name,address,contact) values('virat','delhi','877665554')"; //query
			st.executeUpdate(s);//execute query
			
			ResultSet r =st.executeQuery("select * from student");
			while(r.next()) {
				System.out.println("user data:"+r.getInt("id")+" "+r.getString("name")+" "+r.getString("address")+" "+r.getString("contact"));
				//System.out.println("user data:"+r.getString("name"));
			}
			
		}
		catch(SQLException s) {
			System.out.println(s.getErrorCode());
		}
		catch(Exception s) {
				s.getMessage();
		}
	}
}