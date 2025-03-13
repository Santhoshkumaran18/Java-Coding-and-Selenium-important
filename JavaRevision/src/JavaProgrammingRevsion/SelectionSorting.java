package JavaProgrammingRevsion;

import java.util.Arrays;

public class SelectionSorting {
	public static void main(String[] args) {
		int[] a= {1,2,3,4,5,-10,-9,-7};
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("Sorted Arrays: ");
		for(int j=0;j<a.length;j++) {
			System.out.print(a[j] + " ");
		}
		System.out.println(Arrays.toString(a));
	}
}
