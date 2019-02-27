package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertBoard {
	public static void main(String[] args) {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String id = "osfu";
		String pwd = "12345678";
		Connection con = null;
		try {
			con = DriverManager.getConnection(url, id, pwd); // ojdbc가 자동 으로 commit이 디폴더로 되어 있음
//			Statement stmt = con.createStatement();// 절대 쓰지 말걸.. 보안이 없음.
//			con.setAutoCommit(false);// 해주어야  commit을 안함.

			String title = "게시물제목!!";
			String content = "내용";
			String sql = "insert into board_info";
			sql += "(bi_num,bi_title,bi_content, \r\n bi_credat,bi_cretim)";
			sql += "values(6,?,?,to_char(sysdate,'YYYYMMDD'),to_char(sysdate,'HH24miss'))";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, title);
			ps.setString(2, content);
			int cnt = ps.executeUpdate();
			System.out.println(cnt);
			if (cnt == 1) {
				System.out.println("정상적으로 1개가 입력괴었다");
			} else if (cnt == 0) {
				System.out.println("몰라 안들어 갔는데 ? ");
			}
		} catch (SQLException e) {

			e.printStackTrace();
		}finally {   // 이렇게 해야지 정석 마지막에 실행 되야 하니깐
			try {
				if (con != null) {  // null포인트 에러가 생기는걸 방지
//				con.rollback();// atuoCommit이 false가 되어 있어야지 롤백이 됌/
					con.close();// 자동commit을 함
				}
			} catch (SQLException e) {

				e.printStackTrace();
			}
		}
	}
}
