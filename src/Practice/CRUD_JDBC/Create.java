package Practice.CRUD_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

public class Create {

	private static final String url = "jdbc:postgresql://localhost/CRUD";
	private static final String user = "postgres";
	private static final String password = "admin";
	public static String table;
	public static int Col;
	public static ArrayList<String> arr = new ArrayList<>();

	public static void main(String args[]) throws SQLException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the New Table Name :-");
		String table_name = sc.nextLine();
		table = table_name;
		String query = "CREATE TABLE " + table_name + "(";
		System.out.println("Enter Number of Columns you want to put :-");
		int N = sc.nextInt();
		Col = N;
		sc.nextLine();
		for (int i = 1; i <= N; i++) {
			System.out.println("Enter Column No " + i + "'s Name :-");
			String column = sc.nextLine();
			arr.add(column);
			query = query + column + " ";
			System.out.println("Choose Column No " + i + "'s Data Type (only varchar/char applicable) :-");
			String datatype = sc.nextLine();
			query = query + datatype;
			System.out.println("Invalid Input");
			if (i == N) {
				break;
			}
			query = query + ", ";
		}
		query = query + "); select * from " + table + ";";
		System.out.println(query);
		try {
			Connection conn = DriverManager.getConnection(url, user, password);
			Statement St = conn.createStatement();
			ResultSet rs = St.executeQuery(query);
			while (rs.next()) {
				for (int i = 0; i < Col; i++) {
					String str90 = rs.getString(i + 1);
					System.out.print(str90 + " ");
				}
			}
		} catch (SQLException e) {
			printSQLException(e);
		}
		System.out.println("Let's go forward to write in it.");
		Write W = new Write();
		W.write(table, Col);
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