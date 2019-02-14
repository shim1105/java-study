package oop;

public class ThisExam2 {
	int a;
	String s;
	ThisExam2(){}
	ThisExam2(int a,String s){
		this.a= a;
		this.s=s;
		System.out.println(this.a);
		System.out.println(this.s);
		
	}
	
	public static void main(String[] args) {
		ThisExam2 t=new ThisExam2(10,"abc");
			
	}
}
