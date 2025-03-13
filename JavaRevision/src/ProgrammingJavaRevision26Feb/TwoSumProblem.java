package ProgrammingJavaRevision26Feb;

import java.util.HashMap;

public class TwoSumProblem {
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6,7,8,9,10};
		int target=5;
		int[] result=twoSum(arr, target);
		if(result==null) {
			System.out.println("Not a valid addition");
		}else {
			System.out.println("Element is present in the index of: "+ result[0] +"," +result[1]);
		}
	}
	
	public static int[] twoSum(int[] nums,int target) {
		HashMap<Integer,Integer> map=new HashMap<>();
		for(int i=0;i<nums.length;i++) {
			int complement=target-nums[i];
			if(map.containsKey(complement)) {
				return new int[] {map.get(complement),i};
				
			}
			map.put(nums[i],i);
		}
		return null;
		
	}
}
