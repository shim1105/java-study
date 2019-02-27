package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ConnectionText2 {
	
	public static void main(String[] args) {
		String url= "jdbc:oracle:thin:@localhost:1521:xe";
		String id= "osfu";
		String pwd = "12345678";
		
		Connection con= null;
		try {
			con = DriverManager.getConnection(url,id,pwd);
			Statement stmt= con.createStatement();
			String sql= "select BI_NUM,BI_TITLE,BI_CONTENT,BI_CREDAT,"
			+ "BI_CRETIM,BI_CNT,BI_ISACTIVE from board_info";
			ResultSet rs=stmt.executeQuery(sql);
			List<HashMap<String,String>> rowList= new ArrayList<>();
			while (rs.next()) {
				HashMap<String,String> row= new HashMap<>();
				String biTitle= rs.getString("BI_TITLE");
				String biNum= rs.getString("BI_num");
				String biContent = rs.getString("bi_content");
				String biCredat= rs.getString("bi_credat");
				String biCretim= rs.getString("bi_Cretim");
				String biCnt= rs.getString("bi_cnt");
				String biIsactive= rs.getString("bi_isactive");
				row.put("biNum",biNum);
				row.put("biTitle",biTitle);
				row.put("biContent",biContent);
				row.put("biCredat",biCredat);
				row.put("biCretim",biCretim);
				row.put("biCnt",biCnt);
				row.put("biIsactiv",biIsactive);
				rowList.add(row);			
			}
			for(HashMap<String,String> h:rowList) {
				System.out.println(h);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
}
