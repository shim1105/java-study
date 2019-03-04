package db.user2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import db.board.DBCon;
import db.user.UserInfoVO;

public class UserService {

	public List<UserInfoVO> selectUser(UserInfoVO uivo) {
		String sql = "select * from user_info where 1=1";
		if (uivo != null) {
			if (uivo.getUiId() != null) {
				sql += " and ui_id =?";
			}
			if (uivo.getUiName() != null) {
				sql += " and ui_name=?";
			}
			Connection con = DBCon.getCon();

			try {
				PreparedStatement ps = con.prepareStatement(sql);
				int cnt = 1;
				if (uivo.getUiId() != null) {
					ps.setString(cnt++, uivo.getUiId());
				}
				if (uivo.getUiName() != null) {
					ps.setString(cnt++, uivo.getUiName());
				}
				if (uivo.getUiEmail() != null) {
					ps.setString(cnt++, uivo.getUiEmail());
				}
				ResultSet rs = ps.executeQuery();

				List<UserInfoVO> userList = new ArrayList<>();
				while (rs.next()) {
					UserInfoVO ui = new UserInfoVO();
					ui.setUiEmail(rs.getString("ui_email"));
					ui.setUiId(rs.getString("ui_id"));
					ui.setUiName(rs.getString("ui_name"));
					ui.setUiNum(rs.getInt("ui_num"));
					ui.setUiPwd(rs.getString("ui_pwd"));
					userList.add(ui);
				}
				return userList;
			} catch (SQLException e) {
				e.printStackTrace();
			}finally {
				DBCon.close();
			}
		}
		return null;
		
	}

}
