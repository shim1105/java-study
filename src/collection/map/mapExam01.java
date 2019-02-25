package collection.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class mapExam01 {
	public static void main(String[] args) {
		HashMap<String,String> hm= new HashMap<>(); // Map은 키와 벨류가 있어서 다 값을 설정 해야한다.
		hm.put("이름", "Honhgildong");
		hm.put("이름2", "Honhgildong1j"); // 키가 중복이면 마지막 값이 나온다.ㅌ
		System.out.println(hm);
		List<String> ll = new ArrayList<>();
		ll.add("이름1");
		ll.add("이름2");
		ll.add("이름3");
		ll.add("이름4");
		ll.add("이름5");
		ll.add("이름6");
		ll.add("이름7");
		ll.add("이름8");
		ll.add("이름9");
		System.out.println(ll);
		System.out.println(hm.get("이름"));
	}
}
