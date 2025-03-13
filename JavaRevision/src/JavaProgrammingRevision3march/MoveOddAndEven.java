package JavaProgrammingRevision3march;

import java.util.Arrays;

public class MoveOddAndEven {
	public static void main(String[] args) {
		int[] a= {1,2,3,4,5,6,7,8,9,10,12};
		moveOddAndEven(a);
		System.out.println(Arrays.toString(a));
		
	}
	
	public static void moveOddAndEven(int arr[]) {
		int lo=0,hi=arr.length-1;
		while(lo<hi) {
			while(arr[lo] %2==0 && lo<hi) {
				lo++;
			}
			while(arr[hi] %2==1 && lo<hi) {
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
