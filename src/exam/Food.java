package exam;

public class Food {
	void work(String name,int num) {
		Twt[] t=new Twt[10];
		for(int i=0;i<t.length;i++) {
			t[i]=new Twt();
			t[i].name=name + "다시의 "+i+"의 값";
			t[i].num=num*(int)(Math.random()*100);
			
		}
		for(int i=0;i<t.length;i++) {
			System.out.println(t[i].name+t[i].num);
		}
		
	}
	
}
