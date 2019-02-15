package exam;

import java.util.Scanner;

class Twt {
	String name;
	int num;

}
public class Adsff extends Food{
	public static void main(String[] args) {
		System.out.println("900이상 추천 안함.!!!");
		System.out.print("몇번 돌린것인지 입력 : ");
		Scanner sca=new Scanner(System.in);
		int ww= sca.nextInt();
		Twt[] tw=new Twt[ww*(int)(Math.random()*10)+1];
		for(int i=0;i<tw.length;i++) {
			tw[i]=new Twt();
			tw[i].num=i+1+i+1*((int)Math.PI+((int)(Math.random()*1000)));
			tw[i].name=i+1+"의 ";
		}
		for(int i=0;i<tw.length;i++) {
			System.out.println(tw[i].name+"값 "+tw[i].num);
			
		}
		Food f=new Food();
		System.out.println("===========extends===========");
		for(int i=0;i<tw.length;i++) {	
			f.work(tw[i].name,tw[i].num,ww);
		}
	}
	
	
	
}
