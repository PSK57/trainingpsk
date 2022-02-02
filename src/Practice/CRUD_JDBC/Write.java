package Practice.CRUD_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Write {

	private final String url = "jdbc:postgresql://localhost/CRUD";
	private final String user = "postgres";
	private final String password = "admin";

	public void write(String table, int col) throws SQLException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of Rows you want to enter :-");
		int row = sc.nextInt();
		String query = "INSERT INTO " + table + " VALUES ";
		for (int i = 0; i < row; i++) {
			query = query + "(";
			for (int j = 0; j < col; j++) {
				query = query + "?";
				if (j == col - 1) {
					break;
				}
				query = query + ", ";
			}
			query = query + ")";
			if (i == row - 1) {
				break;
			}
			query = query + ", ";
		}
		query = query + ";";
		System.out.println(query);
		try {
			Connection conn = DriverManager.getConnection(url, user, password);
			PreparedStatement prepSt = conn.prepareStatement(query);
			sc.nextLine();
			int j = 0;
			for (int i = 0; i < row; i++) {
				for (; j < col * (i + 1); j++) {
					System.out.println("Enter value for Parameter Number " + (j + 1) + " :-");
					String inputS = sc.nextLine();
					prepSt.setString(j + 1, inputS);
				}
			}
			System.out.println(prepSt);
			prepSt.executeUpdate();
		} catch (SQLException e) {
			printSQLException(e);
		}
		sc.close();
	}

	public static void main(String args[]) throws SQLException {
		Scanner sc2 = new Scanner(System.in);
		System.out.println("Enter the Table Name :-");
		String table = sc2.nextLine();
		Write W = new Write();
		System.out.println("Enter the number of Columns you have :-");
		int col = sc2.nextInt();
		W.write(table, col);
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