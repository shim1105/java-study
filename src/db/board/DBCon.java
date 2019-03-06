package db.board;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBCon {
	private static final String URL = "jdbc:oracle:thin:@localhost:1521:xe"; // final 은 대문자로
	private static final String USER = "osfu";
	private static final String PASSWORD = "12345678";
	private static Connection con;

	DBCon() {

	}

	public static Connection getCon() {

		if (con == null) {
			try {
				con = DriverManager.getConnection(URL, USER, PASSWORD);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return con;
	}

	public static void close() {
		if (con != null) {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		con=null;
		System.out.println(con);
	}
	
	public static void main(String[] args) {
		getCon();
		close();
	}
}
