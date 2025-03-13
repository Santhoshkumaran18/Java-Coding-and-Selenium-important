package JavaProgramming28Feb;

import java.util.HashMap;
import java.util.Map;

public class CountTheCharactersAndWordsUsingHashMap {
	public static void main(String[] args) {
		String s="Automation is part of daily activity and Automation is best thing";
		String input=s.toLowerCase();
		
		HashMap<String,Integer> map=new HashMap<String,Integer>();
		HashMap<Character,Integer> letters=new HashMap<Character,Integer>();
		
		String[] words=s.split(" ");
		for(String w:words) {
			map.put(w, map.getOrDefault(w,0)+1);
		}
		for(Map.Entry<String,Integer> entry:map.entrySet()) {
			System.out.println(entry.getKey() + "->" + entry.getValue());
		}
		System.out.println("----------------------------------");
		for(char c:input.toCharArray()) {
			letters.put(c, letters.getOrDefault(c, 0)+1);
		}
		for(Map.Entry<Character,Integer> entry:letters.entrySet()) {
			System.out.println(entry.getKey() + "->"+ entry.getValue());
		}
 	}
}
