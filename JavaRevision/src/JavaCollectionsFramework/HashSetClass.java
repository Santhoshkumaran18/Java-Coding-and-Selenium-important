package JavaCollectionsFramework;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class HashSetClass {
	public static void main(String[] args) {
		HashSet<String> set=new HashSet<String>();
		set.add("Santhosh");
		set.add("Sanjay");
		set.add("Santhosh");
		
		System.out.println(set.contains("Santhosh"));
		System.out.println(set);
		
		LinkedHashSet<Integer> li=new LinkedHashSet<>();
		li.add(2);
		li.add(20);
		li.add(21);
		System.out.println(li.size());
		System.out.println(li);
		
	}
}
