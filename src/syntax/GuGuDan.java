package syntax;

public class GuGuDan {
	public static void main(String[] args) {
		for (int j = 9; j > 0; j--) {
			for (int i = 9; i > 0; i--) {
				String a=j + " X " + i + " = " + (j * i);
				if (i != 1) {
					System.out.print(a + ", ");
				} else {
					System.out.print(a + " ");
				}
				if (j * i < 10) {
					System.out.print(" ");
				}
			}
			System.out.println("");
		}

	}
}
