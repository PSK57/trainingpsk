package Basics.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class JDBC_Insert {

	private final String url = "jdbc:postgresql://localhost/Example";
	private final String user = "postgres";
	private final String password = "admin";

	// private static final String SQL = "INSERT INTO student_insert" + " (name,
	// address) VALUES " + " (?, ?), (?,?);";
	private static final String sql = "UPDATE student_insert SET name=?, address=? WHERE name=?;";

	public static void main(String[] argv) throws SQLException {
		JDBC_Insert createTableExample = new JDBC_Insert();
		createTableExample.insertRecord();
	}

	public void insertRecord() throws SQLException {
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();
		String str2 = sc.nextLine();
		String str3 = sc.nextLine();
		System.out.println(sql);
		Connection connection = DriverManager.getConnection(url, user, password);
		// PreparedStatement preparedStatement = connection.prepareStatement(SQL);
		PreparedStatement preparedStatement2 = connection.prepareStatement(sql);
		try {
			/*
			 * preparedStatement.setString(1, "IJK"); preparedStatement.setString(2,
			 * "Earth"); preparedStatement.setString(3, "XYZ");
			 * preparedStatement.setString(4, "Mercury");
			 */

			preparedStatement2.setString(1, str1);
			preparedStatement2.setString(2, str2);
			preparedStatement2.setString(3, str3);

			System.out.println(preparedStatement2);
			preparedStatement2.executeUpdate();
		} catch (SQLException e) {
			printSQLException(e);
		}
		sc.close();
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