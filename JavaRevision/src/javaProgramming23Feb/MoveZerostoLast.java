package javaProgramming23Feb;

import java.util.Arrays;

public class MoveZerostoLast {
	public static void main(String[] args) {
		int[] a= {12,3,4,5,6,67,700,0,0,22,0};
		int count=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]!=0) {
				a[count++]=a[i];
			}
		}
		while(count<a.length) {
			a[count++]=0;
		}
		System.out.println(Arrays.toString(a));
	}
}
