package JavaProgramming28Feb;

import java.util.Arrays;

public class MoveZerosTofront {
	public static void main(String[] args) {
		int[] a= {1,2,3,5,0,0,9,11,12};
		int count=a.length-1;
		for(int i=count;i>=0;i--) {
			if(a[i]!=0) {
				a[count--]=a[i];
			}
		}
		while(count>=0) {
			a[count--]=0;
		}
		System.out.println(Arrays.toString(a));
	}
}
