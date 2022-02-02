package Practice.CRUD_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Update {

	private final String url = "jdbc:postgresql://localhost/CRUD";
	private final String user = "postgres";
	private final String password = "admin";

	public void update(String table) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Column Name :-");
		String col1 = sc.nextLine();
		System.out.println("Enter Reference Column Name :-");
		String refcol = sc.nextLine();
		String query = "UPDATE " + table + " SET " + col1 + " = ? WHERE " + refcol + " = ?;";
		System.out.println(query);
		try {
			Connection conn = DriverManager.getConnection(url, user, password);
			PreparedStatement prepSt = conn.prepareStatement(query);
			System.out.println("Enter value for Parameter Number 1 :-");
			String inputS = sc.nextLine();
			prepSt.setString(1, inputS);
			System.out.println("Enter value for Parameter Number 2 :-");
			String inputS2 = sc.nextLine();
			prepSt.setString(2, inputS2);
			System.out.println(prepSt);
			prepSt.executeUpdate();
		} catch (SQLException e) {
			printSQLException(e);
		}
		sc.close();
	}

	public static void main(String args[]) {
		Scanner sc2 = new Scanner(System.in);
		System.out.println("Enter the Table Name :-");
		String table = sc2.nextLine();
		Update U = new Update();
		U.update(table);
		sc2.close();
	}

	public static void printSQLException(SQLException ex) {
		for (Throwable e : ex) {
			if (e instanceof SQLException) {
				e.printStackTrace(System.err);
				System.err.println("SQLState: " + ((SQLException) e).getSQLState());
				System.err.println("Error Code: " + ((SQLException) e).getErrorCode());
				System.err.println("Message: " + e.getMessage());
				Throwable t = ex.getCause();
				while (t != null) {
					System.out.println("Cause: " + t);
					t = t.getCause();
				}
			}
		}
	}
}