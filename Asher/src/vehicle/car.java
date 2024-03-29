package vehicle;

public class car extends vehicle{
	
	int horsepower;
	
	car(int horsepowerr,int horsepower){
		super(horsepower);
		this.horsepower=horsepowerr;	
	}

	@Override
	void drive() {
		super.drive();
		System.out.println("This cars horsepower is:"+horsepower);
	}
}