package javaProgramming23Feb;

import java.util.HashMap;

public class TwoSumProgram {
	public static void main(String[] args) {
		int[] nums= {2,9,11,22,33,38};
		int target=33;
		int[] result=twoSum(nums, target);
		if(result!=null) {
			System.out.println("Element is present in the index of: " + result[0] +"," + result[1]);
		}else {
			System.out.println("Number is not present in the array");
		}
	}

	public static int[] twoSum(int[] nums, int target) {
		HashMap<Integer, Integer> map = new HashMap<>();
		
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
