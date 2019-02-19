
package exam.ex02;

public class StringArarry2 {
	public String[] strs =new String[80000000];

	public static void main(String[] args) {
		StringArarry2 sa1= new StringArarry2();
		StringArarry2 sa2= new StringArarry2();
//		int b= sa2.strs.length;
//		for (int i=0;i<sa1.strs.length;i++) {
//			sa1.strs[i]=(i+1)+"";
//			sa2.strs[i]=b+"";
//			b--;
//		}
		
		for(int i= 0;i<sa1.strs.length;i++) {
			sa1.strs[i]=(i+1)+"";
			sa2.strs[i]=(sa2.strs.length-i)+"";
			
		}
		for(int j=0;j<sa1.strs.length;j++) {
			System.out.println("sa1.strs["+j+"]="+sa1.strs[j]);
			System.out.println("sa2.strs["+j+"]="+sa2.strs[j]);
		}
		

		
		
		
		
	}
}
