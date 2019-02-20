package exam.ex03;

public class MethodExam01 {
	public String name="HongGirDong";
	
	public static void setTest(MethodExam01 me) {
		me= new MethodExam01();//  새로운 me와 새로운 메모리를 생성한다.
//		me.name="aaa"; // .name은 MethodExam01에 선언된 name임 바꾼다.
	}
	public static void main(String[] args) {
		MethodExam01 me= new MethodExam01();
		me.name= "EmGGJ";
		MethodExam01.setTest(me); // .으로 쓴것을 static으로 되어있다.
		System.out.println(me.name);
	}
}
