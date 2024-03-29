package factorial;

import java.util.Scanner;

public class factorial {
	int i,fact=1;
	factorial(int num){
		for(i=1 ;i<=num;i++) {
			fact*=i;
		}
		System.out.println(fact);
		
	}
	
    public static void main(String[] args) {
    
    	Scanner scan = new Scanner(System.in);
    	System.out.println("Enter the Factorial Number");
    	int num=scan.nextInt();    	
    	factorial fact = new factorial(num);
    	
    }
    
}