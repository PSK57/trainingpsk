package Practice.CRUD_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Read {

	private final String url = "jdbc:postgresql://localhost/CRUD";
	private final String user = "postgres";
	private final String password = "admin";

	public void read(String table, int col) {
		Scanner sc = new Scanner(System.in);
		String query = "SELECT ";
		System.out.println("Enter number of Columns you want to print (type 0 for All) :-");
		int input = sc.nextInt();
		if (input == 0) {
			query = query + "*";
		} else if (input <= col) {
			sc.nextLine();
			for (int i = 1; i <= input; i++) {
				System.out.println("Enter Column Name :-");
				String colname = sc.nextLine();
				query = query + colname;
				if (i == input) {
					break;
				}
				query = query + ", ";
			}
		}
		query = query + " FROM " + table;
		System.out.println("You want to put WHERE Condition? (1 for Yes/0 for No)");
		int where = sc.nextInt();
		if (where == 1) {
			query = query + " WHERE ";
			System.out.println("Enter the name of the Column for WHERE Condition :-");
			sc.nextLine();
			String wherecol = sc.nextLine();
			query = query + wherecol + " = ";
			System.out.println("Enter the comparison condition for WHERE :-");
			query = query + "?;";
			try {
				Connection conn = DriverManager.getConnection(url, user, password);
				PreparedStatement prepSt = conn.prepareStatement(query);
				sc.nextLine();
				System.out.println("Enter value for Comparison :-");
				String inputS = sc.nextLine();
				prepSt.setString(1, inputS);
				System.out.println(prepSt);
				ResultSet rs = prepSt.executeQuery(query);
				while (rs.next()) {
					for (int i = 0; i < col; i++) {
						System.out.print(rs.getString(i) + " ");
					}
					System.out.println("\n");
				}
			} catch (SQLException e) {
				printSQLException(e);
			}
		} else {
			try {
				query = query + ";";
				System.out.println(query);
				Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/CRUD", "postgres",
						"admin");
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(query);
				while (rs.next()) {
					for (int i = 1; i <= col; i++) {
						System.out.print(rs.getString(i) + " ");
					}
					System.out.println("\n");
				}
			} catch (SQLException e) {
				printSQLException(e);
			}
		}
		sc.close();
	}

	public static void main(String args[]) {
		Scanner sc2 = new Scanner(System.in);
		System.out.println("Enter the Table Name :-");
		String table = sc2.nextLine();
		System.out.println("Enter the number of Columns you have :-");
		int col = sc2.nextInt();
		Read R = new Read();
		R.read(table, col);
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