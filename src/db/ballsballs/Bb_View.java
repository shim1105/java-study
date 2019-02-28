package db.ballsballs;

import java.util.Scanner;

public class Bb_View {
	public static void main(String[] args) {
		String cmd = null;
		Scanner scan = new Scanner(System.in);
		do {
			System.out.println("READY??");
			System.out.println("1.SINGLE GO");
			System.out.println("2.MULTI GO");
			System.out.println("3. EXIT");
			cmd = scan.nextLine();
			int cmdNum = Integer.parseInt(cmd);
			switch (cmdNum) {
			case 1:

				break;
			case 2:

				break;
			}
		} while (!"3".equals(cmd));

	}
}
