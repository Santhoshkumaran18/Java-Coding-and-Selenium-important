package JavaProgramming28Feb;

public class BinaarySerarchAlgorithm {
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,9,10};
		int result=binarySearchalgo(arr, 10);
		if(result==-1) {
			System.out.println("Element is not present in the array");
		}else {
			System.out.println("Element is present in the index of:" + result);
		}
		
	}
	
	public static int binarySearchalgo(int arr[],int target) {
		int low=0,high=arr.length-1;
		while(low<=high) {
			int mid=low+ (high-low)/2;
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
