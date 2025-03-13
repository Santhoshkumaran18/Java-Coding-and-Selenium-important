package javaProgramming23Feb;

import java.util.Scanner;

public class PrimeNumberfrom1toN {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number to print the prime numbers");
		int num=s.nextInt();
		
		for(int i=2;i<=num;i++) {
			if(isPrime(i)) {
				System.out.print(i + " ");
			}
		}
	}
	
	public static boolean isPrime(int n) {
		if(n<2) {
			return false;
		}
		for(int i=2;i*i<=n;i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}
}
