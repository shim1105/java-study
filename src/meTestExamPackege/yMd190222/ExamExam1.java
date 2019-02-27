package meTestExamPackege.yMd190222;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ExamExam1 {
	public static void main(String[] arge) {
		String url= "jdbc:oracle:thin:@localhost:1521:xe";
		String id= "osfu";
		String pwd = "12345678";
		try {
			Connection com= DriverManager.getConnection(url,id,pwd);
			Statement stm= com.createStatement();
			List<HashMap<Object,Object>> conList = new ArrayList<>();
			ResultSet rs  = stm.executeQuery("select * from board");
			while(rs.next()) {
				HashMap<Object ,Object> mp=new HashMap<>();
				mp.put(rs.getString("num"),rs.getString("title"));
				mp.put(rs.getString("reg_date"),rs.getString("content"));
				conList.add(mp);
			}
			for(HashMap<Object,Object> h:conList) {
				System.out.println(h);
			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
