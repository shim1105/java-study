package db.board;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BoardService {
	public void selectBoard() {
		String sql= "select * from board_info";
		try {
			PreparedStatement ps= DBCon.getCon().prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			System.out.println("제목");
			while(rs.next()) {
				System.out.println(rs.getString("bi_title"));
				System.out.println("========================");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			DBCon.close();
		}
	}
	public void insertBoard(String title,String content) {
		String sql = "insert into board_info(bi_num,bi_title,bi_content,bi_credat,bi_cretim)";
				sql+="values(seq_bi_num.nextval,?,?,to_char(sysdate,'YYYYMMDD'),to_char(sysdate,'HH24MISs'))";
		try {
			PreparedStatement ps= DBCon.getCon().prepareStatement(sql);
			ps.setString(1, title);
			ps.setString(2, content);
			int cnt = ps.executeUpdate();
			if(cnt==1) {
				System.out.println("등록 되었다,");
			}else {		
				System.out.println("등록 실패 ...");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			DBCon.close();
		}
		
		
	}
	public void updateBoard(String num,String title,String content) {
		String sql= "update board_info set bi_title = ? ,bi_content=? where bi_num= ?";
		try {
			int st = Integer.parseInt(num);
			PreparedStatement ps = DBCon.getCon().prepareStatement(sql);
			ps.setString(1, title);
			ps.setString(2, content);
			ps.setInt(3, st);
			int cnt = ps.executeUpdate();
			if(cnt==1) {
				System.out.println("수정 완료");
			}else {
				System.out.println("수정 실패");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			DBCon.close();
		}
		
	}
	public void deleteBoard(int delete) {
		String sql= "delete from board_info where bi_num=?";
		try {
			PreparedStatement ps= DBCon.getCon().prepareStatement(sql);
			ps.setInt(1, delete);
			int cnt= ps.executeUpdate();
			if(cnt==1) {
				System.out.println("삭제 성공");
			}else {
				System.out.println("삭제 실패");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			DBCon.close();
		}
		
	}
}
