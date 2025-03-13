package JavaProgrammingRevsion;

public class FactorialUsingrecursion {
	public static void main(String[] args) {
		long result=factorial(9);
		System.out.println("Factorial of a number is: " + result);
	}
	
	public static long factorial(int num) {
		if(num<0) {
			System.out.println("Factorial of a number cannot be negative");
		}
		if(num==0 || num==1) {
			return 1;
		}
		return num*factorial(num-1);
	}
}
