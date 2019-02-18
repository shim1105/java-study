package exam.ex01;

public class Executer {
	public static void main(String[] args) {
		Object f = new Father();
		System.out.println(f.toString());
		Father f1 = new Father();
		Son s = new Son();
		Father f2 = new Father();
		f2 = new Son();

		Object o1 = new Son();
		Father o2 = new Son();
		Son o3 = new Son();

//		o1.printInfo();
		o2.printInfo();
		o3.printInfo();
		Object[] objs= new Object[3];
		objs[0]=o1;
		objs[1]=o2;
		objs[2]=o3;
		((Father)objs[1]).printInfo();

	}
}
