package JavaImportantRevision;

import java.util.Collections;

public class SelectionSorting {
	public static void main(String[] args) {
		Integer[] a= {12,3,44,66,99,100};
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
		System.out.println("Maximum elements in the array is: " + a[a.length-1]);
		System.out.println("Minimum elements in the array is: " + a[0]);
	}
}
