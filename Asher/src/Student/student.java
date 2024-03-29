package Student;

public class student {
	
	String name,address;
	int age;
	
	student(){
		name="Unknown";
		age=0;
		address="Not Available";
	}
	void setinfo(String name,int age) {
		this.name=name;
		this.age=age;
	}
	void setinfo(String name,String address,int age) {
		this.name=name;
		this.address=address;
		this.age=age;
	}
	void display() {
		System.out.println("Name of Student:"+name);
		System.out.println("Age of Student:"+age);
		System.out.println("Address of Student:"+address);
	}
	
	public static void main(String[] args) {
		
		student s1 = new student();
		student s2 = new student();
		student s3 = new student();

	}

}