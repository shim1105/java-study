package oop;

public class ClassExam {
	int[] nums = new int[3];
	String str = "abc";

	public static void main(String[] args) {
		ClassExam ce = new ClassExam();
		System.out.println(ce.str);
		ce.str = "바꾸자!~";
		System.out.println(ce.str);
//		ce=null;
//		System.out.println(ce.str);
		for (int i = 0; i < 3; i++) {
			ce.nums[i] = (1 + i) * 10;
			
		}
		for (int i=0;i<3;i++) {
			System.out.println("ClassExam의 nums[" + i + "]" + " = " + ce.nums[i]);
		}
	}

}
