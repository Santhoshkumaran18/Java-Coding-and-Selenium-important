package JavaProgrammingRevision25Feb;

import java.util.Scanner;

public class PrimeNumberCheck {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number to check for the prime number");
		int num=s.nextInt();
		
		int count=0;
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				count++;
			}
		}
		if(count==2) {
			System.out.println("It is a prime number");
		}else {
			System.out.println("It is not a prime number");
		}
	}
}
