package meTestExamPackege.yMd190222;

import java.util.ArrayList;
import java.util.Collections; // Collections 클래스 생성.

public class Stat {
	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			a.add(i);
		}
		System.out.println(a); // [0,1,2,3,4,5,6,7,8,9]
		Collections.swap(a, 0, 9); // List를 swap하는것. (List , a1 ,a6)=[a6,a2,a3,a4,a5,a1] 인덱스를 교체
		System.out.println(a);// [9,1,2,3,4,5,6,7,8,1]
		Collections.swap(a, 0, 9);
		System.out.println(a);// [0,1,2,3,4,5,6,7,8,9]
		Collections.swap(a, 4, 7);
		System.out.println(a); // [0,1,2,3,7,5,6,4,8,9]
		for (int j = 0; j < a.size(); j++) { // 
			for (int i = 0; i < a.size(); i++) {
				if (a.get(j) > a.get(i)) {
					Collections.swap(a, j, i );
				}
			}
		}
		System.out.println(a);
	}

}
