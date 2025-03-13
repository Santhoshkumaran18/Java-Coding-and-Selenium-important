package JavaProgramRevision;

import java.util.Arrays;

public class SelectionSorting {
	public static void main(String[] args) {
		int[] a= {1,2,6,3,2,10,-10};
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(a));
		System.out.println("Largest element in the array is : " +a[a.length-1]);
		System.out.println("Smallest element in the array is: " + a[0]);
	}
}
