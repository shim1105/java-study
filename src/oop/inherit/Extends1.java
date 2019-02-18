package oop.inherit;


class Mother1 extends Son{//데이터 타입으로 사용 가능하다.
	int age=55;
	String name="어머니";
	Mother1() {
		System.out.println("난 엄마 생성자!");
	}
	void attack() {
		System.out.println("엄마가 등짝 스매싱 기술을 시전합니다.");
	}
	
}
public class Extends1 extends Mother1{  //잘 안씀 상속을 받으면 아래처럼 
											// 쓸수 있다.
	Extends1() {
		System.out.println("난 확장 생성자!");
		attack();
	}
	void eat() {
		System.out.println("확장이 먹습니다.");
	}
	
	
	public static void main(String[] args) { 
		Extends1 m =new Extends1();
		System.out.println(m.age);
		m.eat();
	}
}
