package JavaProgrammingRevision25Feb;

public class FactorialUsingRecursion {
	public static void main(String[] args) {
		try {
			long result=factorial(5);
			System.out.println("Factorial of a number using recursion: " + result);
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
	
	public static long factorial(int n) {
		if(n<0) {
			throw new IllegalArgumentException("Factorial of a number cannot be negative");
		}
		 if(n==0 || n==1) {
			return 1;
		}else {
			return n*factorial(n-1);
		}
		
	}
}
