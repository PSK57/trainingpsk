package Basics.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class PracticeTrial {
	Connection con = null;
	PreparedStatement ptstmt = null;
	Statement stmt = null;

	public static void main(String args[]) {
		try {
			Class.forName("org.postgresql.Driver");
			Connection con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Example", "postgres",
					"admin");
			Statement stmt = con.createStatement();
			stmt.executeQuery("insert into PSK3 values('Anurag',5244233,'anurag.rawat@gmail.com',12345,99);");
			ResultSet rs = stmt.executeQuery("select * from PSK3;");
			while (rs.next()) {
				String lastname = rs.getString(1);
				String firstname = rs.getString(2);
				System.out.println(lastname + " " + firstname + " " + rs.getString(3) + " " + rs.getString(4));
			}
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}