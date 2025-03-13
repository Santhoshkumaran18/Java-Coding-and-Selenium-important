package JavaProgrammingRevsion;

import java.util.HashMap;
import java.util.Map;

public class WordAndLetterCount {
	public static void main(String[] args) {
		String s="Santhosh Kumaran is part of the Project Santhosh";
		HashMap<String,Integer> wordCount=new HashMap<String,Integer>();
		String[] wordsCount=s.toLowerCase().split("\\s+");
		
		for(String word:wordsCount) {
			wordCount.put(word, wordCount.getOrDefault(word,0)+1);
		}
		for(Map.Entry<String,Integer> entry:wordCount.entrySet()) {
			System.out.println(entry.getKey()+ "->" + entry.getValue());
		}
		
		
	}
}
