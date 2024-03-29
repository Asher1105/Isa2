package shapes;

import java.util.Scanner;

public class circle extends Shapes{
	double area,perimeter,radius;
	final double pi=3.14;
	
	circle(double radius){
		this.radius=radius;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Radius");
		double radius=scan.nextDouble();
		circle c = new circle(radius);

		System.out.println("Enter the base");
		double base=scan.nextDouble();
		System.out.println("Enter the height");
		double height=scan.nextDouble();
		System.out.println("Enter side 1");
		double side1=scan.nextDouble();
		System.out.println("Enter side 2");
		double side2=scan.nextDouble();
		System.out.println("Enter side 3");
		double side3=scan.nextDouble();
		
		triangle t = new triangle(base,height,side1,side2,side3);
		System.out.println("Area of Circle is:"+c.calculateArea());
		System.out.println("Perimeter of Circle is:"+c.calculatePerimeter());
		System.out.println("Area of Triangle is:"+t.calculateArea());
		System.out.println("Perimeter of Triangle is:"+t.calculatePerimeter());
	}

	@Override
	double calculateArea() {
		area=pi*radius*radius;
		return area;
	}

	@Override
	double calculatePerimeter() {
		perimeter=2*pi*radius;
		return perimeter;
	}

}