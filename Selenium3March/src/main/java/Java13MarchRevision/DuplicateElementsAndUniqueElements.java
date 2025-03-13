package Java13MarchRevision;

import java.util.HashSet;

public class DuplicateElementsAndUniqueElements {
	public static void main(String[] args) {
		int[] a= {1,2,3,5,666,6,6,6,7,7,7,9,9,9,20,20};
		HashSet<Integer> uniqueId=new HashSet<Integer>();
		HashSet<Integer> duplicateId=new HashSet<Integer>();
		for(int b:a) {
			if(!uniqueId.add(b)) {
				duplicateId.add(b);
			}
		}
		System.out.println(uniqueId);
		System.out.println(duplicateId);
	}
}
