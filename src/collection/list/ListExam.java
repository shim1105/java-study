package collection.list;

import java.util.ArrayList;

public class ListExam {
	public static void main(String[] args) {
		ArrayList<String> al= new ArrayList<>(); //<>는 데이터타입을 고정 할수 있음 <>(다이야몬드)부름
											//<>뒤에 들어가는것을 요즘은 없에는 것다.
//		al.add(10); // 인덱스의 값을 추가한다.
//		al.add(20l); // 인덱스의 값을 추가한다.
		al.add("abc");
//		al.add(true);
//		al.add('c');
//		al.add(1.1);
		System.out.println(al.size());
//		al.remove("abc"); // 인덱스에 있는 값을 지움
		al.remove(0); // 인덱스의 번호를 지우는	것
		System.out.println(al.size());
		ArrayList<Integer> numList= new ArrayList<>();// <>기본형은 사용 못함. 
		//그래서 참조형(렙퍼클래스)으로 사용 
		
		
	}
}
