package db.board;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class View {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String cmd = "";
		do {
			System.out.println("|=====j=======================j=====|=====j=======================j=====");
			System.out.println("|====j=========================j====|====j=========================j====");
			System.out.println("|===j===========================j===|===j===========================j===");
			System.out.println("|==j=============================j==|==j=============================j==");
			System.out.println("|=j===============================j=|=j===============================j=");
			System.out.println("|j=================================j|j=================================j");
			System.out.println("|========================환녕 합니다 호갱님=============================");
			System.out.println("=============================아래에서 ID입력============================");
			System.out.println("|j=================================j|j=================================j");
			System.out.println("|=j===============================j=|=j===============================j=");
			System.out.println("|==j=============================j==|==j=============================j==");
			System.out.println("|===j===========================j===|===j===========================j===");
			System.out.println("|====j=========================j====|====j=========================j====");
			System.out.println("|=====j=======================j=====|=====j=======================j=====");

			int cut = 0;
			System.out.print("id : ");
			String id = scan.nextLine();
			if ("osfu".equals(id)) {
				System.out.print("비번 : ");
				String pwd = scan.nextLine();
				if ("12345678".equals(pwd)) {
					BoardService bs = new BoardService();
					System.out.println("환녕합니다" + id + "님!!");
					while (!"q".equals(cmd)) {
						System.out.println("1.게시물 등록");
						System.out.println("2.게시물 삭제");
						System.out.println("3.게시물 조회");
						System.out.println("4.게시물 수정");
						System.out.println("q 종료");
						System.out.println("원하시는 번호를 누르세요");
						System.out.print("번호 : ");
						cmd = scan.nextLine();
						if ("3".equals(cmd)) {
							bs.selectBoard();
						}else if("1".equals(cmd)) {
							System.out.print("제목 : ");
							String title = scan.nextLine();
							System.out.print("내영 : ");
							String content = scan.nextLine();
							bs.insertBoard(title,content);
						}else if("2".equals(cmd)) {
							System.out.print("지울 놈의 번호는 : ");
							int delete=scan.nextInt();
							bs.deleteBoard(delete);
						}else if("4".equals(cmd)) {
							System.out.print("변경할 번호: ");
							String upNum = scan.nextLine();
							System.out.print("변경 제목 : ");
							String title = scan.nextLine();
							System.out.print("변경 내영 : ");
							String content = scan.nextLine();							
							bs.updateBoard(upNum,title,content);
						}
					}
				} else {
					System.out.println("비번 틀밈");
				}
			} else {
				System.out.println("없음!!!!1");
			}
		} while (!"q".equals(cmd));
		System.out.println("ㄲㅈㄲㅈㄲㅈ!!!!");
		scan.close();
	}
}
