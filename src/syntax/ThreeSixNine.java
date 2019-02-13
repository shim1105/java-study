package syntax;

public class ThreeSixNine {
	public static void main(String[] args) {
		for(int i=1;i<30;i++) {
			int mod= i%10;
			if(mod%3 == 0  || mod == 0) {
				System.out.print("짝 , ");
			}else {
				System.out.print(i+", ");
			}
		}
	}
}
