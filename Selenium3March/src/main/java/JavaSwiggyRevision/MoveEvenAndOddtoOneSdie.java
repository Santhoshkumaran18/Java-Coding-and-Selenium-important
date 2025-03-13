package JavaSwiggyRevision;

import java.util.Arrays;

public class MoveEvenAndOddtoOneSdie {
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,56,7,8,9,10};
		oddEven(arr);
	}
	
	public static void oddEven(int arr[]) {
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
		Arrays.sort(arr,0,lo);;
		Arrays.sort(arr,lo,arr.length);
		System.out.println(Arrays.toString(arr));
	}
}
