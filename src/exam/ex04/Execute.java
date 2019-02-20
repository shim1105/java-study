package exam.ex04;

public class Execute {

	public static void space(Action a) {
		a.sleep();
	}

	public static void main(String[] arge) {
		Action c = new Cat();
		Action p = new Person();
		
		space(c);
		space(p);
	}

}
