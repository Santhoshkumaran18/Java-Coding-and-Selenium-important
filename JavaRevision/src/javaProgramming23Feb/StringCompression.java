package javaProgramming23Feb;

import java.util.LinkedHashMap;
import java.util.Map;

public class StringCompression {
	public static void main(String[] args) {
		String s="aaaabbbbccc";
		String compressedStringu=compressedString(s);
		System.out.println(compressedStringu);
	}
	
	public static String compressedString(String s) {
		while(s==null || s.isEmpty()) {
			return "";
		}
		
		Map<Character,Integer> map=new LinkedHashMap<Character,Integer>();
		
		for(char c:s.toCharArray()) {
			map.put(c, map.getOrDefault(c,0)+1);
		}
		StringBuilder result=new StringBuilder();
		for(Map.Entry<Character,Integer> entry:map.entrySet()) {
			result.append(entry.getKey()).append(entry.getValue());
		}
		return result.toString();
	}
}
