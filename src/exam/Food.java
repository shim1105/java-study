package exam;

public class Food {
	void work(String name,int num,int gg) {
		Twt[] t=new Twt[gg*(int)(Math.random()*10)+1];
		int j=1;
		for(int i=0;i<t.length;i++) {
			t[i]=new Twt();
			t[i].name=name + "다시의 "+j+"의 값";
			t[i].num=num*(int)(Math.random()*1000);
			j++;
			
		}
		for(int i=0;i<t.length;i++) {
			System.out.println(t[i].name+t[i].num);
		}
		
	}
	
}
