package collection.list;

import java.util.ArrayList;
import java.util.List;

class Dog {
	private String name;
	private Integer age;

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return this.name;
	}

	public Integer getAge() {
		return this.age;
	}

}

public class DogList {
	public static void main(String[] args) {
		List<Dog> dogList = new ArrayList<>();
		int size = 10;
		for (int i = 0; i < size; i++) {
			Dog g = new Dog();
			g.setName("강아지" + (i + 1));
			g.setAge(i + 1);
			dogList.add(g);
		}
		for (Dog g : dogList) {
			System.out.print("Name " + g.getName() + " Age ");
			System.out.println(g.getAge());
		}
		for(int i=0;i<size;i++) {
			Dog g = dogList.get(i);
			System.out.print("Name " + g.getName() + " Age ");
			System.out.println(g.getAge());
			
		}
		
	}

}
