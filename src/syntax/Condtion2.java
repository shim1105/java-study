package syntax;

public class Condtion2 {
	public static String getStr() {
		return "ABC";
	}
	public static void main(String[] args) {
		int a = 4;
//		String str="a는 3이 아니다,";
//		if(a==3) {
//			str= "a는 3인다.";
//		}
		String str = (a == 3) ? "a는 3이가." : "a는 3이아니다."; // 삼합연사자
								// (논리형) 참 : 거짓  ;
		System.out.println(str);
		
		String s1 = "Dog";
		System.out.println(s1.toLowerCase().equals("dog"));// 소문자로 변환대어 구분함
		System.out.println(s1.equalsIgnoreCase("dog")); // 대소문자 구분 안함 
		String str1 = getStr();
		System.out.println(str1); //ABC
		System.out.println(str1.toLowerCase()); //abc
		System.out.println(str1);//ABC
		str1=str1.toLowerCase(); // 대입하여 값을 바꾼다.
		System.out.println(str1);//abc
		
		
	}
}
