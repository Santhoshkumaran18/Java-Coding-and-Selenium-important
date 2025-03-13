package InterviewPreparation;

import java.util.Scanner;

public class Sorting {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the numbers to print in the array");
		int n=s.nextInt();
		
		int[] a=new int[n];
		System.out.println("Enter the numbers in the array");
		for(int i=0;i<n;i++) {
			a[i]=s.nextInt();
		}
		
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(a[i]>a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("Sorted Array");
		for(int num:a) {
			System.out.print(num + " ");
		}
		System.out.println("Largest Element in the array:" + a[a.length-1]);
		System.out.println("Smallest element in the array:" + a[0]);
	}

}
