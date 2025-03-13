package JavaProgrammingRevsion;

import java.util.HashMap;

public class TwoSumArray {
	public static void main(String[] args) {
		int[] nums= {2,7,9,11,29};
		int target=9;
		int[] result=twoSum(nums, target);
		if(result!=null) {
			System.out.println("It is present in the index of: " + result[0] + "," + result[1]);
		}else {
			System.out.println("No Pairs found");
		}
		
		
	}
	
	public static int[] twoSum(int[] nums,int target) {
		HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
		for(int i=0;i<nums.length;i++) {
			int complement=target-nums[i];
			
			if(map.containsKey(complement)) {
				return new int[]{map.get(complement),i};
			}
			map.put(nums[i],0);
		}
		return null;
	}
}
