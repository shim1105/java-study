package db.ballsballs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBCon_BB {
	private static final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
	private static final String USER = "bballu";
	private static final String PASSWORD = "11111111";
	private static Connection con = null;
	public static void main(String[] args) {
		getCon();
		close();
	}
	public static Connection getCon() {
		
		if (con == null) {
			try {
				con = DriverManager.getConnection(URL, USER, PASSWORD);
				System.out.println("로딩완료");
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return con;
	}
	public static void close() {
		if(con!=null) {
			try {
				con.close();
				System.out.println("종료");
			} catch (SQLException e) {
				e.printStackTrace();
			}
			con=null;
		}
		
	}
}
