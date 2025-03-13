package JavaFastRevision;
import java.util.*;

public class FibonacciSeries {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number you want to check for the fibonacci series");
		int num=s.nextInt();
		
		int first=0,second=1;
		for(int i=1;i<=num;i++) {
			System.out.print(first + " ");
			int next=first+second;
			first=second;
			second=next;
		}
	}
}
