package JavaProgrammingRevision25Feb;

import java.util.HashMap;
import java.util.Map;

public class CountOfCharactersUsingHashMap {
	public static void main(String[] args) {
		String s="Automation Testing is part of Automation Testing";
		String input=s.toLowerCase();
		
		HashMap<String,Integer> word=new HashMap<String,Integer>();
		HashMap<Character,Integer> letters=new HashMap<Character,Integer>();
		String[] san=input.split(" ");
		for(String w:san) {
			word.put(w, word.getOrDefault(w,0)+1);
		}
		for(Map.Entry<String,Integer> entry:word.entrySet()) {
			System.out.println(entry.getKey()+ "->" + entry.getValue());
		}
		System.out.println("---------------------------------");
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
