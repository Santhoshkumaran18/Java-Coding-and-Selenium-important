package javaProgramming23Feb;

public class FibonacciSeriesuingRecursion {
	public static void main(String[] args) {
		int num=6;
		for(int i=0;i<num;i++) {
			System.out.print(fib(i) + " ");
		}
	}
	
	public static int fib(int n) {
		if(n<=1) {
			return n;
		}
		return fib(n-1) + fib(n-2);
	}
}
