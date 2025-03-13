package JavaSwiggyRevision;

import java.util.HashMap;
import java.util.Map;

public class CountOfEachLetters {
	public static void main(String[] args) {
		String s="Santhosh Kumaran is part of the project";
		String input=s.toLowerCase();
		
		HashMap<String,Integer> map=new HashMap<String,Integer>();
		String[] words=input.split(" ");
		for(String w:words) {
			map.put(w, map.getOrDefault(w,0)+1);
		}
		for(Map.Entry<String,Integer> entry:map.entrySet()) {
			System.out.println(entry.getKey() + "-> " + entry.getValue());
		}
	} 
}
