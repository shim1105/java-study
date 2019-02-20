package exam.ex03;

public class Dog {
	private String name;
	private int age;
	
	public void setName(String name) {
		this.name= name;
	}
	public String getName() {
		return this.name;
	}
	public void setAge(int age) { //  'get/set' 메소드 많이 쓴다 getter,setter 메소드 라고 부른다.
		this.age=age;				// 이게 표준 
	}
	public int getAge() {
		return this.age;
	}
	
}
