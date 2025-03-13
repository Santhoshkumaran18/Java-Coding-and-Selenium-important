package javaProgramming23Feb;

import java.util.Arrays;

public class CheckifArraySorted {
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,9,8,10};
		Arrays.sort(arr);
		System.out.println("Is sorted: " + isSorted(arr));
	}
	
	public static boolean isSorted(int arr[]) {
		for(int i=1;i<arr.length;i++) {
			if(arr[i]<arr[i-1]) {
				return false;
			}
		}
		return true;
	}
}
