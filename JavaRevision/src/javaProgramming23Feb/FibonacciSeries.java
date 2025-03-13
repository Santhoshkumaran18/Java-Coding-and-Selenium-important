package javaProgramming23Feb;

public class FibonacciSeries {
	public static void main(String[] args) {
		int num=6;
		int first=0,second=1;
		for(int i=1;i<=num;i++) {
			System.out.print(first + " ");
			int next=first+second;
			first=second;
			second=next;
		}
	}
}
