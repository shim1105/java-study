package exam.ex05;

import java.util.ArrayList;
import java.util.Scanner;

public class NumGame {
	public static ArrayList<Integer> makeNums() {
		ArrayList<Integer> numsList = new ArrayList<>();
		for (int i = 0; i < 3; i++) {
			int num = (int) (Math.random() * 100) + 1;
			numsList.add(num);
		}
		return numsList;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> numsList = makeNums();
		for (int i = 0; i < numsList.size(); i++) {
			System.out.println(numsList.get(i));
		}

		scan.close();
	}
}
