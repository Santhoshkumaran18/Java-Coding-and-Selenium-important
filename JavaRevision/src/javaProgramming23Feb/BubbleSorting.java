package javaProgramming23Feb;

import java.util.Arrays;

public class BubbleSorting {
	public static void main(String[] args) {
		int[] a= {1,2,3,4,5,-10,9,-8,-7};
		int n=a.length;
		for(int i=0;i<n-1;i++) {
			for(int j=0;j<n-i-1;j++) {
				if(a[j]>a[j+1]) {
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		System.out.println("Sorted Array:");
		for(int k=0;k<n;k++) {
			System.out.print(a[k] + " ");
		}
		System.out.println(Arrays.toString(a));
		System.out.println("Largest number in the array is: " + a[a.length-1]);
	}
}
