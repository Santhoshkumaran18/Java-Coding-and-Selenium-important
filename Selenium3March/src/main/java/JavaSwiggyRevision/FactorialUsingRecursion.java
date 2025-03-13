package JavaSwiggyRevision;

public class FactorialUsingRecursion {
	public static void main(String[] args) {
		long result=factorial(5);
		System.out.println(result);
	}
	public static long factorial(int n) {
		if(n<0) {
			System.out.println("Factorial of a number cannot be negative");
		}
		if(n==0 || n==1) {
			return 1;
		}
		return n*factorial(n-1);
	}
}
