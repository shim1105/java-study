package method;

public class ReturnMethod {
	public static void main(String[] args) {
		int[]nums=new int[3];
		nums[0]=7;
		nums[1]=4;
		nums[2]=1;
		for(int i=0;i<nums.length;i++) {
			if(nums[i]==7) {
				System.out.println(i);
			}
			
		}
	}
}
