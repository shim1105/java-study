package oop.inherit;

public class Animal implements DoSom {
	int age;
	String type;

	public void eat() {  // 디폴트 접근제어자
		System.out.println(age + "살인 "+ type + "이 밥을 먹다");
	}

	public void sleep() {
		System.out.println(age + "살인 "+ type + "이 잠을 자다");		
	}

	public void run() {
		System.out.println(age + "살인 "+ type + "이 뛰다");
	}

	@Override  // 어노테이션  @ 이건 1.6부터 지원 
	public void jupm() {
		// TODO Auto-generated method stub  //=커맨드
		
	}
}
