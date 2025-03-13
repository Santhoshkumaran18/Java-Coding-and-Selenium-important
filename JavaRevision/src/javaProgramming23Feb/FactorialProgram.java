package javaProgramming23Feb;

public class FactorialProgram {
	public static void main(String[] args) {
		int num=7;
		if(num<0) {
			System.out.println("Factorial of a number cannot be negative");
		}else {
			long factorial=1;
			for(int i=1;i<=num;i++) {
				factorial*=i;
			}
			System.out.println("Factorial of a number is: " + factorial);
		}
	}
}
