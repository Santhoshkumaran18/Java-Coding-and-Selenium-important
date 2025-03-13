package InterviewPreparation;

import java.util.*;

public class FibonacciSeries {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number to be in the fibonacci series: ");
		int n=s.nextInt();
		
		int first=0,second=1;
		for(int i=0;i<n;i++) {
			System.out.print(first + " ");
			int next=first+second;
			first=second;
			second=next;
		}

	}

}
