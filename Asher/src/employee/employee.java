package employee;

import java.util.Scanner;


//
public class employee {
	
	String name,job_title;
	float salary;
	float DA,basicsalary,HRA=5000;
	
	employee(String name,String job_title){
		this.name=name;
		this.job_title=job_title;
		
	}
	float calculate(float sal) {
		basicsalary=sal;
		DA=(10%basicsalary);
		salary=basicsalary+DA+HRA;
		return salary;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		float s=scan.nextFloat();
		employee emp = new employee("George","Data Analyst");
		System.out.println("Salary of the employee is:"+ emp.calculate(s));
	}
}