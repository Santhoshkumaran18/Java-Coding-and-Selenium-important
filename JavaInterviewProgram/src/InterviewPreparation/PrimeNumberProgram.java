package InterviewPreparation;

import java.util.*;

public class PrimeNumberProgram {

	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		System.out.println("Enter the number to check if it is prime: ");
		int n=s.nextInt();
		int count=0;
		//To check the number is divisible by itself and the number one
		for(int i=1;i<=n;i++) {
			if(n % i==0) {
				count++;
			}
		}
		
		if(count==2) {
			System.out.println(n + " is the prime number");
		}else {
			System.out.println(n + " is not the prime number");
		}
	}

}
