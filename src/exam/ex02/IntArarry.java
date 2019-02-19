package exam.ex02;

public class IntArarry {

	public int[] nums;

	public boolean compare(int num) {
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 0) return false; // 메소드를 한번에 나갈떄 이렇게 씀
			if (nums[i] == num) return true;
		}
		return false;
	}
	public static void main(String[] arge) {
		IntArarry ia = new IntArarry();
		int random= (int)(Math.random()*100)+1;
		ia.nums = new int[random];
		for (int i = 0; i < ia.nums.length; i++) {
			int num = (int) (Math.random() * 100) + 1;
			if (ia.compare(num)) {
//				ia.nums[i] = num;
				i--;
			} else {
				ia.nums[i] = num;
			}
		}
		for (int i = 0; i < ia.nums.length; i++) {
			for (int j = i + 1; j < ia.nums.length; j++) {
				if (ia.nums[i] > ia.nums[j]) {
					int a = ia.nums[i];
					ia.nums[i] = ia.nums[j];
					ia.nums[j] = a;
				}
			}
		}
		for (int i = 0; i < ia.nums.length; i++) {
			System.out.println("ia.nums[" + i + "]=" + ia.nums[i]);

		}
	}
}
