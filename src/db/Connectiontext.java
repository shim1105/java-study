package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Connectiontext {	

	public static void main(String[] args) {
		
		String url = "jdbc:oracle:thin:@192.168.0.2:1521:xe";
		String id= "osfu";
		String pwd = "12345678";
		try {
			Connection con=DriverManager.getConnection(url,id,pwd);
			Statement stmt= con.createStatement();  // 
			ResultSet rs= stmt.executeQuery("select * from board");  // execute는 exe의 약자이면 '실행하다'이다.
			// 
			while(rs.next()) {
				System.out.print(rs.getString("num1")+",");
				System.out.print(rs.getString("num2")+",");
				System.out.print(rs.getString("sum")+",");
				System.out.print(rs.getString("title")+",");
				System.out.print(rs.getString("reg_date")+",");
				System.out.println(rs.getString("content"));
			}
			System.out.println("연결성공");
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();  // 오류를 잡아 준다.
			
		}
	}

}
