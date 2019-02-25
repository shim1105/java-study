package collection.list;

import java.util.ArrayList;
import java.util.List;

class Person {
	private String name;

	public void setName(String name) {
		this.name = name;

	}

	public String getName() {
		return this.name;

	}

}

public class PersonList {
	public static void main(String[] arge) {

//		p.setName("HongGirDong");
//		System.out.println(p.getName());

		List<Person> pList = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			Person p = new Person();
			pList.add(p);
			p.setName("이름" + (i + 1));

		}
		for (Person str : pList) {
			System.out.println(str.getName());
		}
	}
}
