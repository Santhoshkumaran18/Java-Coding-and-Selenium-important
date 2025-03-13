package Java13MarchRevision;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatingCharacters {
	public static void main(String[] args) {
		String s="automation";
		String input=s.toLowerCase();
		LinkedHashMap<Character,Integer> map=new LinkedHashMap<Character,Integer>();
		for(char c:input.toCharArray()) {
			map.put(c, map.getOrDefault(c, 0)+1);
		}
		for(char c:input.toCharArray()) {
			if(map.get(c)==1) {
				System.out.println(c);
				break;
			}
			
		}
		
		
		
		
	}
}
