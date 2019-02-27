package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateBoard {
	public static void main(String[] args) {
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		String id="osfu";
		String pwd = "12345678";
		Connection con=null;
		try {
			con= DriverManager.getConnection(url,id,pwd);
			String sql="update board_info \r\n"
					+ "set bi_title =?, \r\n"
					+ "bi_content=? \r\n"
					+ "where bi_num=?";
			PreparedStatement ps= con.prepareStatement(sql);
			ps.setString(1, "제목");
			ps.setString(2, "내영");
			ps.setInt(3, 1);    // 타입에 따라 맞추는게 좋음
			int cnt= ps.executeUpdate(); // 
			if(cnt==1) {
				System.out.println("정상업데이트");
			}else {
				System.out.println("업데이트실패 근데 오류는 아님.");
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
