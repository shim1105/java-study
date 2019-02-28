package db.board2;

import java.util.Scanner;

public class Exam {
	public static int getBornYear() {
		Scanner scan = new Scanner(System.in);
		System.out.println("You age ?");
		int bornYear = 2019;
		try {
			bornYear -=  Integer.parseInt(scan.nextLine()) - 1;
			
		} catch (Exception e) {

			bornYear = getBornYear();
		}
		return bornYear;
	}

	public static void main(String[] args) {
		int gg=getBornYear();
		System.out.println(gg+"year");
	}
}
