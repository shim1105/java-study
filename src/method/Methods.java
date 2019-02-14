package method;

public class Methods {
	static String getStr() {
		return "abc";
	}
	static void setStr(String str) {
		System.out.println(str);
	}
	
	public static void main(String[] args) {
		setStr(getStr());
		String str=getStr();
		System.out.println(str);
	}
}
