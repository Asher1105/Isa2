package vehicle;

public class vehicle {
	
	int horsepower;
	
	vehicle(int horsepower){
		this.horsepower=horsepower;
	}
	
	void drive() {
		System.out.println("This vehicle horsepower is:"+horsepower);
	}

	public static void main(String[] args) {
		
		car c = new car(80,50);
		c.drive();
	}

}