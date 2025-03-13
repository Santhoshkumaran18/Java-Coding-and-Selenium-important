package InterviewPreparation;

import java.util.*;

public class ArraySorting {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number you want to sort in the array");
		int n=s.nextInt();
		int[] a=new int[n];
		System.out.println("Enter the numbers in the array:");
		for(int i=0;i<n;i++) {
			a[i]=s.nextInt();
		}
		
		Arrays.sort(a);
		System.out.print("Sorted Array:" + Arrays.toString(a));
		System.out.println("Largest Number in the Array: " + a[a.length-1]);
		System.out.println("Smallest Number in the array: " + a[0]);
		System.out.println("Sum of the first and last numbers in the array: " + ((a[a.length-1] + a[0])));
	}

}
