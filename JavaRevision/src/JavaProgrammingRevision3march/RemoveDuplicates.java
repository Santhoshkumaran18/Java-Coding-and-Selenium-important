package JavaProgrammingRevision3march;

import java.util.HashSet;

public class RemoveDuplicates {
	public static void main(String[] args) {
		int[] a= {1,2,3,4,5,6,7,1,1,1,2,2,2,3,3};
		HashSet<Integer> duplicates=new HashSet<Integer>();
		HashSet<Integer> nonduplicates=new HashSet<Integer>();
		for(int s:a) {
			if(!nonduplicates.add(s)) {
				duplicates.add(s);
			}
		}
		System.out.println("Duplicates: " + duplicates);
		System.out.println("Non duplicates: " + nonduplicates);
		
	}
}
