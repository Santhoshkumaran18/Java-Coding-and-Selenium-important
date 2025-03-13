package JavaImportantRevision;

import java.util.HashMap;

public class HashMapPractise {
	public static void main(String[] args) {
		HashMap<Object,Object> map=new HashMap<>();
		map.put("Santhosh", 1);
		map.put("Sanjay", 2);
		
		System.out.println(map.keySet());
		System.out.println(map.values());
		System.out.println(map.entrySet());
		
		map.remove("Santhosh");
		System.out.println(map.keySet());
		if(map.isEmpty()) {
			System.out.println("element not present");
		}else {
			System.out.println("element present");
		}
	}
	
	
}
