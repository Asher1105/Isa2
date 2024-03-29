package shapes;

public class triangle extends Shapes{

	double area,perimeter,base,height,side1,side2,side3;
	
	triangle(double base,double height,double side1,double side2,double side3){
		this.base=base;
		this.height=height;
		this.side1=side1;
		this.side2=side2;
		this.side3=side3;
	}
	
	@Override
	double calculateArea() {
		area=0.50*base*height;
		return area;
	}

	@Override
	double calculatePerimeter() {
		perimeter=side1+side2+side3;
		return perimeter;
	}

}