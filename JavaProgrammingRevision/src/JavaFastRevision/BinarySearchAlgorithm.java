package JavaFastRevision;

public class BinarySearchAlgorithm {
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6};
		int target=5;
		int result=binarySearch(arr, target);
		if(result==-1) {
			System.out.println("Element is not present in the array");
			
		}else {
			System.out.println("Element is present in the index of : " + result);
		}
		
		
	}
	
	public static int binarySearch(int arr[],int target) {
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
