package collection.list;

import java.util.ArrayList;
import java.util.Scanner;

public class B21NumGame {
	public static ArrayList<Integer> makeGame(ArrayList<Integer> al,int size) {
		ArrayList<Integer> numGame=al;
		for(int i=0;i<size;i++) {
			int rd= (int)(Math.random()*100)+1;
			numGame.add(rd);
		}
		return numGame;
	}
	public static void printList(ArrayList<Integer> al) {
		for(int i=0;i<al.size();i++) {
			System.out.print(al.get(i));
			if(i%10 != 0)System.out.print(", ");
			if(i%10==0 && i!=0) System.out.println();
		}
	}
	
	public static void main(String[] arge) { // 선생님께서 하다 마신 NumGame을 픽셀로 만든것
		Scanner scan= new Scanner(System.in);
		System.out.print("List의 Size를 입력 하세요 : ");
		int num= scan.nextInt();
		ArrayList<Integer> al= new ArrayList<>();
		makeGame(al,num);  	// 랜덤의 숫자를 List에 삽입하는것
		printList(al);		// 나온 숫자를 콘솔의 출력하는것 
		scan.close();
	}
}
