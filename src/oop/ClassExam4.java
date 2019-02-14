package oop;

public class ClassExam4 {
	
	public static void main(String[] args) {
		int num1=1;				//데이터의 순서를 바꿀러면 다른 공간으로 밖으는것을 스압
		int num2=2;
		int tmp=num1;
		num1=num2;
		num2=tmp;
		System.out.println("num1 = "+num1);
		System.out.println("num2 = "+num2);
	}
}
