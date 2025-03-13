package javaProgramming23Feb;

public class FactorialUsingRecursion {
	public static void main(String[] args) {
		try {
			int num=1;
			long result=factorial(num);
			System.out.println("Factorial of number is : " + result);
		} catch (IllegalArgumentException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
	
	public static long factorial(int n) {
		if(n<0) {
			throw new IllegalArgumentException("Factorial of a number cannot be negatve");
		}
		if(n==0 || n==1) {
			return 1;
		}
		return n*factorial(n-1);
	}
}
