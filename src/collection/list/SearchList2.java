package collection.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SearchList2 {
	public static void main(String[] args) {
		ArrayList<Integer> numList = new ArrayList<>();
		Scanner scan=new Scanner(System.in);
		System.out.println("입력하세여 (, 기준으로)");
		String strNum= scan.nextLine();
		String[] strNums= strNum.split(",");
		ArrayList<Integer> anList = new ArrayList<>();
		for(int i=0;i<strNums.length;i++) {
			int num= Integer.parseInt(strNums[i]);//Integer.parseInt 이 메소드가 String을 int로 바꾸어 리턴함
			anList.add(num);
		}
//		System.out.println(anList); //(해쉬코드가 출력 안됌) 어디가에는 오버라이딩해서 []로 실행됨 
		
//		for(int i=0;i<5;i++) {
//			int ranNum = (int)(Math.random()*20)+1;
//			numList.add(ranNum);
//		}
		int nums=0;
		int an=0;
		for(int i=0;i<anList.size();i++) {
			int ranNum= (int)(Math.random()*20)+1;
			numList.add(ranNum);
			for(int j=0;j<numList.size();j++) {
				if(numList.get(i)<numList.get(j)) {
					Collections.swap(numList,j,i);
				}
			}
//			if(numList.indexOf(ranNum) !=-1) {
//				nums++;
//			}
			if(anList.indexOf(ranNum) != -1) {
				an++;
			}
		}
//		System.out.println("자동 맞춘 갯수"+nums);
		System.out.println("numList : "+numList);
		System.out.println("anList : "+anList);
		System.out.println("USER 맞춘 갯수"+an);
		scan.close();
	}
}
