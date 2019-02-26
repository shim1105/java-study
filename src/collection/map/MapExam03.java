package collection.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MapExam03 {
	public static void main(String[] args) {
//		HashMap<Integer, String> map = new HashMap<>();
//		map.put(1,"가만주니 않겠다");
//		map.put(2,"마지막이다");
//		map.put(3,"음  .....");
//		System.out.println(map);

//		HashMap<String, Object> cat= new HashMap<>();
//		cat.put("name","냥이1");
//		cat.put("age",11);
//		cat.put("kind","쌈");
//		System.out.println(cat);
//		System.out.println(cat.get("Kind")); // 대소문자 구분으로 null 이 나온다.
		List<HashMap<String, Object>> catList = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			HashMap<String, Object> cat = new HashMap<>();
			cat.put("name", "낭이" + (i + 1));
			cat.put("age", (int) (Math.random() * 30) + 1);
			cat.put("Number", (int) (Math.random() * 99999) + 1);
			catList.add(cat);
		}
		for (HashMap<String, Object> h : catList) {
			System.out.println(h);
		}

	}
}
