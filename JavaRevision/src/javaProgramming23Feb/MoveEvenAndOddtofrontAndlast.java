package javaProgramming23Feb;

import java.util.Arrays;

public class MoveEvenAndOddtofrontAndlast {
	public static void main(String[] args) {
		int arr[]= {12,3,4,5,6,7,8,9,0};
		moveOddEven(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	public static void moveOddEven(int arr[]) {
		int lo=0,hi=arr.length-1;
		
		while(lo<hi) {
			while(arr[lo]%2==0 && lo<hi) {
				lo++;
			}
			while(arr[hi]%2==1 && lo<hi) {
				hi--;
			}
			if(lo<hi) {
				int temp=arr[lo];
				arr[lo]=arr[hi];
				arr[hi]=temp;
				lo++;
				hi--;
			}
		}
		Arrays.sort(arr,0,lo);
		Arrays.sort(arr,lo,arr.length);
	}
}
