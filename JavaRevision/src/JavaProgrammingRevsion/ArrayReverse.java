package JavaProgrammingRevsion;

import java.util.Arrays;

public class ArrayReverse {
	public static void main(String[] args) {
		int[] a= {1,2,10,8,11};
		int n=a.length;
		for(int i=0;i<a.length/2;i++) {
			int temp=a[i];;
			a[i]=a[n-1-i];
			a[n-i-1]=temp;
			
			
		}
		System.out.println(Arrays.toString(a));
	}
}
