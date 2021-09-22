package Firservlet;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class StudentModel {
	
public static int nextPk() throws Exception {
		
		ResourceBundle rb = ResourceBundle.getBundle("com.shri.servlet.java.^app");
		Class.forName(rb.getString("driver"));
		Connection conn = DriverManager.getConnection(rb.getString("Url"), rb.getString("Username"),
				rb.getString("Password"));

		int Pk = 0;

		PreparedStatement ps = conn.prepareStatement("SELECT MAX(ID) FROM student");
		ResultSet rs = ps.executeQuery();
		while (rs.next()) {
			Pk = rs.getInt(1);
		}

	return Pk + 1;
}
	public static void add(StudentBean std) throws Exception {
		ResourceBundle rb = ResourceBundle.getBundle("com.shri.servlet.java.^app");
		Class.forName(rb.getString("driver"));
		Connection conn = DriverManager.getConnection(rb.getString("Url"), rb.getString("Username"),
				rb.getString("Password"));
		conn.setAutoCommit(false);
PreparedStatement ps = conn.prepareStatement("INSERT INTO student VALUES(?,?,?,?,?)");
	
ps.setInt(1, nextPk());
ps.setString(2, std.getRollNo());
ps.setString(3, std.getFirstName());
ps.setString(4, std.getLastName());
ps.setString(5, std.getSession());

ps.executeUpdate();
conn.commit();
System.out.println("Inserted");
ps.close();
conn.close();

	}
	
	
	public static void Update(StudentBean std) throws Exception {
		ResourceBundle rb = ResourceBundle.getBundle("com.shri.servlet.java.^app");
		Class.forName(rb.getString("driver"));
		Connection conn = DriverManager.getConnection(rb.getString("Url"), rb.getString("Username"),
				rb.getString("Password"));
		conn.setAutoCommit(false);
		PreparedStatement ps = conn
				.prepareStatement("UPDATE student SET FirstName=?,LastName=?,Session=? WHERE RollNo=?");
		
		
		ps.setString(4, std.getRollNo());
		ps.setString(1, std.getFirstName());
		ps.setString(2, std.getLastName());
		ps.setString(3, std.getSession());

		ps.executeUpdate();
		conn.commit();
		System.out.println("Updated");
		ps.close();
		conn.close();

	}

	public static void Delete(StudentBean std) throws Exception {
		ResourceBundle rb = ResourceBundle.getBundle("com.shri.servlet.java.^app");
		Class.forName(rb.getString("driver"));
		Connection conn = DriverManager.getConnection(rb.getString("Url"), rb.getString("Username"),
				rb.getString("Password"));
		conn.setAutoCommit(false);
		PreparedStatement ps = conn.prepareStatement("DELETE FROM student WHERE FirstName =?");
		ps.setString(1, std.getFirstName());

		ps.executeUpdate();
		conn.commit();
		System.out.println("Deleted");
		ps.close();
		conn.close();

	}
	public static void getRollNo(StudentBean std) throws Exception {
		ResourceBundle rb = ResourceBundle.getBundle("com.shri.servlet.java.^app");
		Class.forName(rb.getString("driver"));
		Connection conn = DriverManager.getConnection(rb.getString("Url"), rb.getString("Username"),
				rb.getString("Password"));
		conn.setAutoCommit(false);
		PreparedStatement ps = conn.prepareStatement("SELECT * FROM student WHERE RollNo =?");
		ps.setString(1, std.getRollNo());
		ResultSet rs = ps.executeQuery();
		conn.commit();
		System.out.println("getRollNo");
		System.out.println("ID\tRollno\tFName\tLName\tSession");
		while (rs.next()) {
			System.out.print(rs.getInt(1));
			System.out.print("\t" + rs.getString(2));
			System.out.print("\t" + rs.getString(3));
			System.out.print("\t" + rs.getString(4));
		
		}
		ps.close();
		conn.close();

	}
	public static ArrayList<StudentBean> Search() throws Exception {
		ArrayList<StudentBean> StudRec = new ArrayList<StudentBean>();
		ResourceBundle rb = ResourceBundle.getBundle("com.shri.servlet.java.^app");
		Class.forName(rb.getString("driver"));
		Connection conn = DriverManager.getConnection(rb.getString("Url"), rb.getString("Username"),
				rb.getString("Password"));
		conn.setAutoCommit(false);
		PreparedStatement ps = conn.prepareStatement("SELECT * FROM student");
		ResultSet rs = ps.executeQuery();
		System.out.println("ID\tRollno\tFName\tLName\tSession");
		while (rs.next()) {
			StudentBean bean = new StudentBean();
			bean.setID(rs.getInt(1));
			bean.setRollNo(rs.getString(2));
		    bean.setFirstName(rs.getString(3));
		    bean.setLastName(rs.getString(4));
		    bean.setSession(rs.getString(5));
		    StudRec.add(bean);
		}
		ps.close();
		conn.close();
		return StudRec;
	}
}
