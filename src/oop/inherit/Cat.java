package oop.inherit;

public class Cat extends Animal {
	Cat(int age, String type) {
		this.age = age;
		this.type = type;
	}
	
	
	public static void main(String[] args) {
		Cat cat=new Cat(6,"Sam");
		Animal dog=new Dog(6,"Pudlr"); // 상속받으면 가능 하지만 반대는 안됌
		cat.eat();						// 
		cat.sleep();
		cat.run();
		dog.eat();
		dog.sleep();
		dog.run();
//		Dog ani= new Animal();   /// 이건 안된다  
		
	}
}
