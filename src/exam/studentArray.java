package exam;

class Student {
	String name;
	int grade;
	String shooclName;
}

public class studentArray {
	public static void main(String[] arge) {
		Student[] students = new Student[10];// students 만 메모리생성
		for (int i = 0; i < students.length; i++) {// 배열의 값이 null로 되는것을
													// 배열을 다시 만듬
			students[i] = new Student(); // students[i]의 메모리를 생성
			students[i].grade = i + 1;
			
		}
		for (int i = 0; i < students.length; i++) {
			System.out.println(students[i].grade);  
		}
	}
}
