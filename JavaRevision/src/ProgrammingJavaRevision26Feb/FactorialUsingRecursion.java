package ProgrammingJavaRevision26Feb;

public class FactorialUsingRecursion {
	public static void main(String[] args) {
		long factorial=factorial(5);
		System.out.println(factorial);
	}
	
	public static long factorial(int n) {
		if(n<0) {
			throw new IllegalArgumentException("Factorial of a number cannot be negative");
		}
		if(n==0 || n==1) {
			return 1;
		}
		return n*factorial(n-1);
	}
}
