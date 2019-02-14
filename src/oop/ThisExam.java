package oop;

public class ThisExam {
	int num = 10;

	void setNun(int num) {
		this.num=num;
	}

	int getNum() {
		return this.num;
	}

	public static void main(String[] args) {
		ThisExam te= new ThisExam();
		System.out.println(te.num);
		System.out.println(te.getNum());
		te.setNun(5);
		System.out.println(te.num);
		System.out.println(te.getNum());
	}

}
