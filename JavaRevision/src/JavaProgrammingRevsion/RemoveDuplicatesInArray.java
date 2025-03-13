package JavaProgrammingRevsion;
import java.util.*;

public class RemoveDuplicatesInArray {
	public static void main(String[] args) {
		int[] a= {1,2,3,3,4,4,45,5,5,6,7,9};
		HashSet<Integer> duplicates=new HashSet<Integer>();
		HashSet<Integer> nonduplicates=new HashSet<Integer>();
		
		for(int b:a) {
			if(!nonduplicates.add(b)) {
				duplicates.add(b);
			}
		}
		System.out.println(duplicates);
		System.out.println(nonduplicates);
	}
}
