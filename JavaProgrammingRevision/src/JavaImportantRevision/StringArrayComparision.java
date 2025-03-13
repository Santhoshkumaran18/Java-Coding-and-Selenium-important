package JavaImportantRevision;

import java.util.Arrays;

public class StringArrayComparision {
	public static void main(String[] args) {
		int[] a= {12,3,5,456,6,56,1};
		
		for(int i=0;i<a.length/2;i++) {
			int temp=a[i];
			a[i]=a[a.length-1-i];
			a[a.length-1-i]=temp;
		}
		System.out.println(Arrays.toString(a));
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
	}
}
