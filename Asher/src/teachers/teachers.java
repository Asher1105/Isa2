package teachers;

public class teachers {
	
	String type;
	
	teachers(String type){
		this.type=type;
	}
	
	void teaches() {
		System.out.println("Teacher is Teaching:"+type);
	}
}