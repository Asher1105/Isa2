package person;

public class person {
	
	String name;
	int age;
	
	person(int age,String name){
		this.name=name;
		this.age=age;
	}
	
	void display() {
		System.out.println("Persons name is:"+name);
		System.out.println("Persons age is:"+age);
	}
    
	public static void main(String[] args) {
		person p1 = new person(26,"Harry");
		person p2 = new person(29,"Sandy");
		p1.display();
		p2.display();
	}
}