package fibonacci;

import java.util.Scanner;

public class fibonacci {
	int n1=0,n2=1,n3;
	fibonacci(int num){
		System.out.println(n1+"\n"+n2);
		for(int i=2;i<num;i++) {
			n3=n1+n2;
			n1=n2;
			n2=n3;
			System.out.println(n3);
		}
		
	}
    
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number how many numbers to be displayed from Fibonacci Series");
		int num=scan.nextInt();
		fibonacci fibo = new fibonacci(num);
	}
}