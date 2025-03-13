package JavaCollectionsFramework;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetExercies {
	public static void main(String[] args) {
		TreeSet<Integer> set=new TreeSet<>();
		set.add(10);
		set.add(20);
		set.add(-10);
		System.out.println("Elements are sorted in ascending order"+ set);
		
		System.out.println(set.first());
		System.out.println(set.last());
		System.out.println(set.pollFirst());
		System.out.println(set);
		System.out.println(set.pollLast());
		System.out.println(set);
		
		set.add(100);
		set.add(200);
		System.out.println(set);
		System.out.println(set.headSet(100));
		System.out.println(set.tailSet(10));
		
		System.out.println("Set in the elements are: " +set);
		System.out.println(set.higher(10));
		System.out.println(set.lower(200));
		System.out.println(set.floor(10));
		
	}
}
