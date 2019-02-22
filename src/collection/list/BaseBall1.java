package collection.list;

import java.util.ArrayList;
import java.util.Scanner;

public class BaseBall1 {

	public static void main(String[] args) {
		ArrayList<Integer> numList = new ArrayList<>();
		for (int i = 0; i < 3; i++) {
			int random = (int) (Math.random() * 9) + 1;
			if (numList.indexOf(random) == -1) {
				numList.add(random);
			} else {
				i--;
			}
		}
		Scanner scan = new Scanner(System.in);
		System.out.println("야구 계임 시작");
		for (int j = 0; j < 10; j++) {
			String[] strs = scan.nextLine().split(",");
			int[] nums = new int[strs.length];
			for (int i = 0; i < strs.length; i++) {
				nums[i] = Integer.parseInt(strs[i]);
			}
			int ballcon = 0;
			int stra = 0;

			for (int i = 0; i < numList.size(); i++) {
				if (numList.indexOf(nums[i]) != -1) {
					if (numList.indexOf(nums[i]) == i) {
						stra++;
						continue;
					}
					ballcon++;
				}
			}
			
			System.out.println(ballcon + "B" + stra + "S");
			if(stra!=3) {
				j--;
			}else {
				j+= 1000;
			}
		}
		System.out.println(numList);
	}
}
