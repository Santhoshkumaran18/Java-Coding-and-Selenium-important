package javaProgramming23Feb;

import java.util.Arrays;

public class ArraysReverseUpdated {
	public static void main(String[] args) {
		int[] a= {1,2,3,4,5,6,7,8,9,10};
		int left=0,right=a.length-1;
		
		while(left<right) {
			int temp=a[left];
			a[left]=a[right];
			a[right]=temp;
			left++;
			right--;
		}
		System.out.println(Arrays.toString(a));
	}
}
