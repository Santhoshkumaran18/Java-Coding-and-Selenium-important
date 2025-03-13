package JavaProgrammingRevision3march;

import java.util.HashMap;
import java.util.Map;

public class StringCompression {
	public static void main(String[] args) {
		String s="aaabbbccc";
		System.out.println(compression(s));
	}
	public static String compression(String str) {
		
		String input=str.toLowerCase();
		
		HashMap<Character,Integer> map=new HashMap<Character,Integer>();
		StringBuilder result=new StringBuilder();
		
		for(char c:input.toCharArray()) {
			map.put(c, map.getOrDefault(c, 0)+1);
		}
		for(Map.Entry<Character,Integer> entry:map.entrySet()) {
			result.append(entry.getKey()).append(entry.getValue());
		}
		return String.valueOf(result);
	}
}
