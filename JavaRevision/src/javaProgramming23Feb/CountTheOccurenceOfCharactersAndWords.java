package javaProgramming23Feb;

import java.util.HashMap;
import java.util.Map;

public class CountTheOccurenceOfCharactersAndWords {
	public static void main(String[] args) {
		String s="Santhosh Kumaran is part of Automation testing group of Automation";
		String input=s.toLowerCase();
		
		HashMap<String,Integer> words=new HashMap<String,Integer>();
		HashMap<Character,Integer> letters=new HashMap<Character,Integer>();
		String[] san=input.split(" ");
		for(String a:san) {
			words.put(a, words.getOrDefault(a,0)+1);
		}
		for(Map.Entry<String,Integer> entry:words.entrySet()) {
			System.out.println(entry.getKey() + "->" + entry.getValue());
		}
		
		System.out.println("-------------------------------------");
		
		for(char c:input.toCharArray()) {
			if((c>='a' && c<='z')) {
				letters.put(c, letters.getOrDefault(c, 0)+1);
			}
		}
		for(Map.Entry<Character,Integer> entry:letters.entrySet()) {
			System.out.println(entry.getKey() + "->" + entry.getValue());
		}
	}
}
