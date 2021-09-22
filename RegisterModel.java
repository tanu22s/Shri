package Firservlet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;



public class RegisterModel {
	
public RegisterBean Authenticate(String username, String password) throws Exception {
		
		ResourceBundle rb = ResourceBundle.getBundle("com.shri.servlet.java.^app");
		Class.forName(rb.getString("driver"));
		Connection conn = DriverManager.getConnection(rb.getString("Url"), rb.getString("Username"),
				rb.getString("Password"));

		
		PreparedStatement ps = conn.prepareStatement("SELECT * FROM registration WHERE USERNAME= ? AND PASSWORD=? ");
		
		
		ps.setString(1, username);
		ps.setString(2, password);
		ResultSet rs = ps.executeQuery();
		RegisterBean bean = new RegisterBean();
	
		while (rs.next()) {
		bean.setID(rs.getInt(1));
		bean.setusername(rs.getString(2));
		bean.setLname(rs.getString(3));
		bean.setPassword(rs.getString(4));
		bean.setGmail(rs.getString(5));
		bean.setMobileNumber(rs.getString(6));
		bean.setAge(rs.getString(7));
		bean.setGender(rs.getString(8));
		bean.setAddress(rs.getString(9));
			
	System.out.println("Welcome"+ rs.getString(1)+ rs.getString(2)+ rs.getString(3)+ rs.getString(4)+rs.getString(5)+rs.getString(6)+rs.getString(7)+ rs.getString(8) +rs.getString(9));
			
		}
	ps.close();
	rs.close();
		return bean;
}
	public int nextPk() throws Exception {
		
		ResourceBundle rb = ResourceBundle.getBundle("com.shri.servlet.java.^app");
		Class.forName(rb.getString("driver"));
		Connection conn = DriverManager.getConnection(rb.getString("Url"), rb.getString("Username"),
				rb.getString("Password"));

		int Pk = 0;

		PreparedStatement ps = conn.prepareStatement("SELECT MAX(ID) FROM Registration");
		ResultSet rs = ps.executeQuery();
		while (rs.next()) {
			Pk = rs.getInt(1);
		}

	return Pk + 1;
}
	public void add(RegisterBean bean) throws Exception {
		ResourceBundle rb = ResourceBundle.getBundle("com.shri.servlet.java.^app");
		Class.forName(rb.getString("driver"));
		Connection conn = DriverManager.getConnection(rb.getString("Url"), rb.getString("Username"),
				rb.getString("Password"));
		conn.setAutoCommit(false);
PreparedStatement ps = conn.prepareStatement("INSERT INTO Registration VALUES(?,?,?,?,?,?,?,?,?)");
//(ID INT PRIMARY KEY , FNAME VARCHAR(50),LNAME VARCHAR(50), PASSWORD VARCHAR(50),GMAIL VARCHAR(50),MOBILENUMBER VARCHAR(50), AGE INT, GENDER VARCHAR(50), ADDRESS VARCHAR(50))")
	
ps.setInt(1, nextPk());
ps.setString(2, bean.getusername());
ps.setString(3, bean.getLname());
ps.setString(4, bean.getPassword());
ps.setString(5, bean.getGmail());
ps.setString(6, bean.getMobileNumber());
ps.setString(7, bean.getAge());             
ps.setString(8, bean.getGender());
ps.setString(9, bean.getAddress());

ps.executeUpdate();
conn.commit();
System.out.println("Inserted");
ps.close();
conn.close();

	}
	
	
	public void Update(RegisterBean bean) throws Exception {
		ResourceBundle rb = ResourceBundle.getBundle("com.shri.servlet.java.^app");
		Class.forName(rb.getString("driver"));
		Connection conn = DriverManager.getConnection(rb.getString("Url"), rb.getString("Username"),
				rb.getString("Password"));
		conn.setAutoCommit(false);
		PreparedStatement ps = conn
				.prepareStatement("UPDATE Registration SET FNAME=?,LNAME=?,PASSWORD=?,GMAIL=?,MOBILENO=?,AGE =?,GENDER=?,ADDRESS=? WHERE ID =?");
		
		
		ps.setString(1, bean.getusername());
		ps.setString(2, bean.getLname());
		ps.setString(3, bean.getPassword());
		ps.setString(4, bean.getGmail());
		ps.setString(5, bean.getMobileNumber());
		ps.setString(6, bean.getAge());
		ps.setString(7, bean.getGender());
		ps.setString(8, bean.getAddress());
		ps.setInt(9, bean.getID());

		ps.executeUpdate();
		conn.commit();
		System.out.println("Updated");
		ps.close();
		conn.close();

	}

	public void Delete(RegisterBean bean) throws Exception {
		ResourceBundle rb = ResourceBundle.getBundle("com.shri.servlet.java.^app");
		Class.forName(rb.getString("driver"));
		Connection conn = DriverManager.getConnection(rb.getString("Url"), rb.getString("Username"),
				rb.getString("Password"));
		conn.setAutoCommit(false);
		PreparedStatement ps = conn.prepareStatement("DELETE FROM Registration WHERE FNAME =?");
		ps.setString(1, bean.getusername());

		ps.executeUpdate();
		conn.commit();
		System.out.println("Deleted");
		ps.close();
		conn.close();

	}
	public void Select(RegisterBean bean) throws Exception {
		ResourceBundle rb = ResourceBundle.getBundle("com.shri.servlet.java.^app");
		Class.forName(rb.getString("driver"));
		Connection conn = DriverManager.getConnection(rb.getString("Url"), rb.getString("Username"),
				rb.getString("Password"));
		conn.setAutoCommit(false);
		
	 PreparedStatement ps = conn.prepareStatement("SELECT * FROM Registration");

		ResultSet rs = ps.executeQuery();

		System.out.println("ID\tfname\tlname\tpassword\tgmail\tmobileno\tage\tgender\taddress");
		while (rs.next()) {
			System.out.print(rs.getInt(1));
			System.out.print("\t" + rs.getString(2));
			System.out.print("\t" + rs.getString(3));
			System.out.print("\t" + rs.getString(4));
			System.out.print("\t" + rs.getInt(5));
			System.out.print("\t" + rs.getInt(6));
			System.out.println("\t" + rs.getInt(7));
		}
		ps.close();
		conn.close();

}
}

