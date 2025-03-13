package JavaImportantRevision;

import java.util.Arrays;

public class FindMaximumAndMinimumUsingInbuiltMethods{
	public static void main(String[] args) {
		int[] a= {1,2,3,4,77,110,-1};
		Arrays.sort(a);
		System.out.println("Maximum Element in the array is: " + a[a.length-1]);
		System.out.println("Minimum element in the array is : " + a[0]);
	}
}

