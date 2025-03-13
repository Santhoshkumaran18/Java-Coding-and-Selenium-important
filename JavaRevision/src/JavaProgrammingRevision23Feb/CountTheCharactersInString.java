package JavaProgrammingRevision23Feb;

import java.util.HashMap;
import java.util.Map;

public class CountTheCharactersInString {
	public static void main(String[] args) {
		String s="Automation testing tool set Automation";
		String input=s.toLowerCase();
		HashMap<Object,Integer> words=new HashMap<Object,Integer>();
		HashMap<Object,Integer> letters=new HashMap<Object,Integer>();
		
		String[] san=s.split(" ");
		for(String sa:san) {
			words.put(sa, words.getOrDefault(sa,0)+1);
		}
		
		for(Map.Entry<Object,Integer> entry:words.entrySet()) {
			System.out.println(entry.getKey() + "->" + entry.getValue());
		}
		
		System.out.println("---------------------------------------");
		
		for(char c:input.toCharArray()) {
			if((c>='a' && c<='z')) {
				letters.put(c, letters.getOrDefault(c,0)+1);
			}
		}
		
		for(Map.Entry<Object,Integer> entry:letters.entrySet()) {
			System.out.println(entry.getKey() + "->" + entry.getValue());
		}
		
		
	}
}
