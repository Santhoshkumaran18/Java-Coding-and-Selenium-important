package Java13MarchRevision;

import java.util.Scanner;

public class FactorialOfANumber {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number to check for the factorial");
		int n=s.nextInt();
		
		if(n<0) {
			System.out.println("Factorial of a number cannot be negative");
		}
		else {
			long factorial=1;
			for(int i=1;i<=n;i++) {
				factorial*=i;
			}
			System.out.println("Factorial of a number is: " + factorial) ;
		}
	}
}	
