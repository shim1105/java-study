package collection.list;

class Person2{
	private String name;
	public void setName(String name) {
		this.name= name;
	}
	public String getName() {
		return this.name;
	}
}
public class PersonList02 {
	
	public static void main(String[] args) {
		Person2 p = new Person2();
		Person2 p2 = p;		
		p2= new Person2();
		p2.setName("hong");
		System.out.println(p.getName());
		System.out.println(p2.getName());

	}
	

}
