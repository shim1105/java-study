package exam.ex03;

public class Execute {
	public static void main(String[] arge) {
		Dog[] dogs= new Dog[10];
		for(int i=0;i<dogs.length;i++) {
			dogs[i]= new Dog(); // 배열 인덱스를 만듬
			dogs[i].setName(("멍멍이"+(i+1)));  // name의 맵버변수의 값을 대입하기 위해서 메소드 사용
			dogs[i].setAge(i+1); // age의 맵버변수의 값을 대입하기 위해서 메소드 사용
			// 대입하는 메소드 setter를 사용 해서 맵버변수한테 대입한다.
		}
		for(int i=0;i<dogs.length;i++) {
			System.out.println("이름은 "+dogs[i].getName()+", 나이는 "+dogs[i].getAge());
			// 가져오는 메소드인 getter를 사용해서 맵버변수를 가지고 옴
			}
	}
}
