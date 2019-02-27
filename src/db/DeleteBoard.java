package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteBoard {
	public static void main(String[] args) {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String id = "osfu";
		String pwd = "12345678";
		Connection con = null;
		try {
			con = DriverManager.getConnection(url, id, pwd);
			String sql= "delete from board_info where bi_num=?";
			PreparedStatement ps= con.prepareStatement(sql);  // 준비가 끝났음 .
			ps.setInt(1, 4);
//			ps.executeQuery(); // 되기 되지만 DML에서 안씀  table에 영향을 안줄때 사용
			int cnt=ps.executeUpdate(); // 몇개가 실행되는지 확인이 필요해서 사용
			if(cnt==1) {
				System.out.println("삭제되었스빈");
			}else {
				System.out.println("오류 아님, 원래 없어서.");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
