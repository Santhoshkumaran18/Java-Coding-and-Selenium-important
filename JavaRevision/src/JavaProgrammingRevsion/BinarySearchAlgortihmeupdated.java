package JavaProgrammingRevsion;
import java.util.*;
public class BinarySearchAlgortihmeupdated {
	public static void main(String[] args) {
		int arr[]= {1,2,3123,5,6,7674,2231};
		int target=7674;
		int result=binarySearchAlgorithm(arr, target);
		System.out.println(Arrays.toString(arr));
		if(result==-1) {
			System.out.println("Element is not present in the array");
		}else {
			System.out.println("Element is present in the index of : " + result);
		}
		
	}
	
	public static int binarySearchAlgorithm(int arr[], int target) {
		
		Arrays.sort(arr);
		int low=0,high=arr.length-1;
		
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
