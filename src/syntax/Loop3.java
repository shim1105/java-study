package syntax;

public class Loop3 {
	public static void main(String[] arge) {
		int[] nums= new int[10];
		for(int i=0;i<nums.length;i++) {
			nums[i]=i;
		}
		for(int i =0;i< nums.length;i++) { /// 이걸
			int num=nums[i];
			System.out.println(nums[i]);
		}
		for(int num:nums) { /// 위에걸 줄이건 
			System.out.println(num);
		}
	}
}
