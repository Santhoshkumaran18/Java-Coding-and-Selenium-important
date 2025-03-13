package JavaCollectionsFramework;

import java.util.HashMap;
import java.util.Map;

public class HashMapExercise {
	public static void main(String[] args) {
		HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
		map.put(1, 2);
		map.put(2, 3);
		map.put(1, 2);
		map.put(1, 4);
		map.put(1, null);
		map.put(3,5);
		map.put(4, 5);
		HashMap<Object,Object> map1=new HashMap<Object,Object>();
		map1.put(1, "Santhosh");
		map1.put(2, "Santhosh");
		map1.put(2, "Sanjay");
		map1.put(3, "Sanjay");
		System.out.println(map.entrySet());
		System.out.println(map1.entrySet());
		System.out.println(map.values());
		System.out.println(map.keySet());
		for(Map.Entry<Integer,Integer> entry:map.entrySet()) {
			System.out.println(entry.getKey() + "->" + entry.getValue());
		}
		
	}
}
