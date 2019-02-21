package syntax;

public class Loop4 {
	public static void main(String[] args) {
		for(int i=1;i<=10;i++) {
			if(i%2!=0)continue; //  continue 위에 있는 조건문으로 올라간다.
			System.out.println(i);
		}
	}
}
