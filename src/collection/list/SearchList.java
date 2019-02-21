package collection.list;

import java.util.ArrayList;

public class SearchList {
	public static void main(String[] args) {
		ArrayList<Integer> intList= new ArrayList<>();
		for(int i=1;i<=5;i++) {
			intList.add(i);
		}
		System.out.println(intList.indexOf(6)); // 배열 처럼 indexOf가 된다. 나올수 없는 값 -1 이 나옴
	}
}
