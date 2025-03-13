package JavaProgrammingRevision25Feb;

import java.util.Arrays;

public class SelectionSorting {
	public static void main(String[] args) {
		int[] a= {1,2,3,4,5,6,7,10,-11,12};
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
		System.out.println("Largest element in the array: "+ a[a.length-1]);
		System.out.println("Smallest element in the array: " + a[0]);
	}
}
