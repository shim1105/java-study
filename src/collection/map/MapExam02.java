package collection.map;

import java.util.HashMap;
import java.util.Set;

public class MapExam02 {
	public static void main(String[] args) {
		HashMap<String,String> map= new HashMap<>();
		map.put("이름","홍길동");
		map.put("나이","33");
		map.put("주소", "전라도 광주");
		map.put("직업","도적");
		System.out.println(map);
		Set<String> keys=map.keySet();
		System.out.println(keys.size());
		for(String key:keys) {
			System.out.println(key + " : "+map.get(key));  // 이런 식으로 map의 key와 벨루 값을 
															// 가지고 올수 있음
		}
		
	}
}
