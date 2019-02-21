package collection.list;

import java.util.ArrayList;

public class ListExam2 {

	public static void main(String[] args) {
		ArrayList<Integer> numList = new ArrayList<>();
		for(int i=100;i>=10;i--) {
			if(i%10 != 0)continue;
			numList.add(i);
		}
//		for(int i=100;i>=10;i-=10) {
//			numList.add(i);
//		}
//		for(int i=10;i>=1;i--) {
//			numList.add(i*10);
//		}
//		for (int i = 100; i >= 1; i--) {
//			if (i % 10 == 0) {
//				numList.add(i);
//			}
//		}
		for (int i = 0; i < 10; i++) {
			System.out.println(numList.get(i));
		}
//		for(int num:numList) {
//			System.out.println(num);
//		}
	}
}
