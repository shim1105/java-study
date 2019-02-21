package syntax;

public class Loop2 {
	public static void main(String[] args) {
		System.out.println("┌──────────────────────────────────────────────────────────────┐");
		for(int i=1;i<10;i++) {
			System.out.println(" ─────────────────────────────────────────────────────────────");

			System.out.print("│");
			for(int j =1;j<10;j++) {
				System.out.print(i +"x"+j+"="+i*j);
				if(i*j<10) {
					System.out.print(" ");
				}
				if(j<9) {
					System.out.print(",");
				}
			}
			System.out.println("│");
		}
		System.out.println("└──────────────────────────────────────────────────────────────┘");
	}
	
}
