package InterviewPreparation;

import java.util.*;

public class FactorialNumber {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number to be factorial: ");
		int n=s.nextInt();
		
		if(n<0) {
			System.out.println("Factorial cannot be non-negative numbers");
		}else {
			long factorial=1;
			for(int i=1;i<=n;i++) {
				factorial*=i;
				
			}
			System.out.println("Factorial of a number " + n + " is " + factorial);
		}
	}

}
