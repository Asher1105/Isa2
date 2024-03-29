package dog;

public class dog {
	
	String name,breed;
	
	dog(String name,String breed){
		this.name=name;
		this.breed=breed;
	}
	void updated(String name,String breed) {
		this.breed=breed;
		this.name=name;
	}
	void display() {
		System.out.println("Dog name:"+name);
		System.out.println("Dog breed:"+breed);
	}

	public static void main(String[] args) {
		
		dog d = new dog("Rex","Rotweiler");
		d.display();
	}

}