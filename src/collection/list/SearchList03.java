package collection.list;

import java.util.ArrayList;
import java.util.Scanner;

public class SearchList03 {
	public static void main(String[] args) {
		ArrayList<Integer> numList = new ArrayList<>();
		for(int i=0;i<6;i++) {
			int num= (int)(Math.random()*45)+1;
			numList.add(num);
			
		}
		System.out.println(numList);
		Scanner scam= new Scanner(System.in);
		System.out.println(",를 구분자로 숫자 6개를 입력해주세요");
		String numStr= scam.nextLine();
		String[] numStrs= numStr.split(",");
		System.out.println("입력하신 숫자는 : "+numStr);
		int asd=0;
		for(String str:numStrs) {
			int num = Integer.parseInt(str);
			if(numList.indexOf(num)!= -1) {
				asd++;
			}
		}
		System.out.println("맞춘 갯수는 : "+ asd);

	}

}
