package teachers;

import java.util.Scanner;

public class teacherteaches extends teachers{
	
	String name;
	
	teacherteaches(String name,String type){
		super(type);
		this.name=name;
	}
	
	void subject() {
		System.out.println("Teacher name is:"+name);
		super.teaches();
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter teacher name");
		String name = scan.nextLine();
		System.out.println("Enter teacher subject");
		String type = scan.nextLine();
		
		teacherteaches t = new teacherteaches(name,type);
		t.subject();
	}
}