package count;

import java.util.Scanner;

public class digicount {
	int i=0,n;
	digicount(int num){
		n=num;
		while(n!= 0) {
			i++;
			n=n/10;
		}
		System.out.println(i);
	}
    
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number");
		int num=scan.nextInt();
		
		digicount digit = new digicount(num);
		
	}
}