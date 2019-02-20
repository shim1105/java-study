package exam.ex03;

public class Cat {
	public String name;
	public int age;

	public String toString() {
		return "이 고양이의 이름은 " + this.name + "이구나요, 나이는 " + this.age + "입니다.";
	}

	public static void main(String[] arge) {
		int a = ((int) (Math.random() * 100)) + 1;
		Cat[] c = new Cat[a];
		for (int i = 0; i < c.length; i++) {
			c[i] = new Cat();
			c[i].name = "이름" + (i + 1);
			c[i].age = i;
		}
		for (int i = 0; i < c.length; i++) {
			System.out.println(i + "번째 고양이 이름은 " + c[i].name);
			System.out.println(i + "번째 고양이 나이는 " + c[i].age);
			System.out.println(c[i]);
		}
	}
}
