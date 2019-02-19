package exam.ex02;

import java.util.Scanner;

public class StringArarry {

	public String[] strs;

	public StringArarry() {
		strs = new String[0];
	}

	public static void main(String[] args) {
		StringArarry sa = new StringArarry();
		System.out.println("여려개의 글자를 , 를 기준으로 입력해주세여.");
		Scanner scan = new Scanner(System.in);// 기본 생성자가 없어서
		String input = scan.nextLine();
		System.out.println(input);
		sa.strs = input.split(",");
		System.out.println("검색할 문자를 입력 하세여.");
		String seacrch =scan.nextLine();
		
		for (int i = 0; i<sa.strs.length; i++) {
			if(seacrch.equals(sa.strs[i])){
				System.out.println("sa.strs [ "+i+" ] ="+sa.strs[i]);
			}
		}
//		for(int i=sa.strs.length-1;i>-1;i--){
//			System.out.println("sa.strs [ "+i+" ] ="+sa.strs[i]);
//		}
		scan.close();

	}
}
