package JavaProgrammingRevision25Feb;

import java.util.Arrays;

public class BubbleSorting {
	public static void main(String[] args) {
		int[] a= {1,2,3,4,5,6,7,8,10,-11,-12,-13};
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
		System.out.println("Sorted Arrays");
		System.out.println(Arrays.toString(a));
		System.out.println("Largest element in the array is: " + a[a.length-1]);
		System.out.println("Smallest element in the array is: " + a[0]);
		System.out.println("Second largest element in the array is: " + a[a.length-2]);
	}
}
