package exam.ex03;

public class StaticExam01 {
	public static String name="haha"; // static이 먼저 실행 되는 우선 순위
	public String name1="hoho";
	public static void main(String[] args) {
		StaticExam01 se01= new StaticExam01();	//static로 정의 되 있으면 new 선언해도 초기화가 안된다.
		StaticExam01.name="hihi";
		se01.name1="hihi";
		se01=new StaticExam01();
		System.out.println(se01.name1);			//
		System.out.println(StaticExam01.name);	//
		
	}
}
