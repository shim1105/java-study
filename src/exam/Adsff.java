package exam;


class Twt extends Food{
	String name;
	int num;

}
public class Adsff extends Food{
	public static void main(String[] args) {
		Twt[] tw=new Twt[10];
		for(int i=0;i<tw.length;i++) {
			tw[i]=new Twt();
			tw[i].num=i+1+i+1*((int)Math.PI+((int)(Math.random()*100)));
			tw[i].name=i+1+"의 ";
		}
		for(int i=0;i<tw.length;i++) {
			System.out.println(tw[i].name+"값 "+tw[i].num);
			
		}
		Food f=new Food();
		for(int i=0;i<tw.length;i++) {	
			f.work(tw[i].name,tw[i].num);
		}
	}
	
	
	
}
