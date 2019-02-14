package syntax;

public class ClassExam {
	int a=1;
	char c='1';
	String s="1";
	
	void test() {
		System.out.println("난 ClassExam꺼!");
	}
	
	public static void main(String[] args) {// 여기가 시작점
		int a=1;
		ClassExam ce= new ClassExam();
		System.out.println(ce.a);
		System.out.println(ce.c);
		System.out.println(ce.s);
		ce.test();
	}
}
