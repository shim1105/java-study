package data;

public class DataCasting {
	public static void main(String[] arge) { 
//		int num= 1;
//		Integer i= num;//랩퍼타입 Integer는 정해지지 않는 데이터타입(참고형) 데이터타입은 Integer이다.
//		String str= i.toString();
		Byte b =new Byte((byte)10);
		Short s= new Short((short)10);
		Integer i= new Integer(10);
		Long l= new Long(10l);
		
		Float f=new Float(1.2f);
		Double d= new Double(1.2);
		
		Character c =new Character('c');
		Boolean bl=new Boolean(true);
		String numStr= "123.5";
		d=Double.parseDouble(numStr);
		int num= d.intValue();
		System.out.println(num+1);
		double db= Double.parseDouble(numStr);
		System.out.println(db+1);
		
		
		
	}
}
