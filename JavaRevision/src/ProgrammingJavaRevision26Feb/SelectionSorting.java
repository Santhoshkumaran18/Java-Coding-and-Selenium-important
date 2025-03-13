package ProgrammingJavaRevision26Feb;

import java.util.Arrays;

public class SelectionSorting {
	public static void main(String[] args) {
		int[] a= {1,2,-10,-15,-20,21};
		int n=a.length;
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(a[i]>a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(a));
	}
}
