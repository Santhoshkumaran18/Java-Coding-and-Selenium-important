package JavaProgrammingRevision25Feb;

import java.util.Arrays;

public class BinarySearchProgram {
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,7,8,9};
		int target=8;
		int result=binarySearch(arr, target);
		if(result==-1) {
			System.out.println("Element is not present in the array");
		}else {
			System.out.println("Element is present in the index of: " + result);
		}
		
	}
	
	public static int binarySearch(int arr[], int target) {
		Arrays.sort(arr);
		int low=0,high=arr.length;
		while(low<=high) {
			int mid=low+(high-low)/2;
			if(arr[mid]==target) {
				return mid;
			}
			if(arr[mid]<target) {
				low=mid+1;
			}else {
				high=mid-1;
			}
		}
		return -1;
	}
}
