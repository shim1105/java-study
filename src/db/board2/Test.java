package db.board2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import db.board.DBCon;

public class Test {
	public static void main(String[] args) {
		BoardService bs =new BoardService();
		List<BoardInfoVO> biList =bs.selectBoard(); //biList가 죽을때 까지 계속 메모리가 남
	}
}
