package syntax;

public class MutltiConditions {
	public static void main(String[] args) {
		int num1 = 1;
		int num2 = 4;

		if (num1 == 1 && num2 == 4) {
			System.out.println("OK!");
		} else {
			System.out.println("NO!!!!!");
		}
		if (num1 == 2 || num2 == 3) {
			System.out.println("OK!");
		} else {
			System.out.println("NO!!!!!!");
		}
	}
}
