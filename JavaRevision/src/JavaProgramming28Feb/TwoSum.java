package JavaProgramming28Feb;

import java.util.HashMap;

public class TwoSum {
	public static void main(String[] args) {
		int[] arr= {2,6,9,11,12,23};
		int target=23;
		int[] result=twoSum(arr, target);
		if(result!=null) {
			System.out.println("Element is present in the index of: " + result[0] +","+ result[1]);
		}else {
			System.out.println("Two sum element is not present");
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
