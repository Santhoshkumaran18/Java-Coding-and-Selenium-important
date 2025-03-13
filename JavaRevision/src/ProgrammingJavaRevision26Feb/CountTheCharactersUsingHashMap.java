package ProgrammingJavaRevision26Feb;

import java.util.HashMap;
import java.util.Map;

public class CountTheCharactersUsingHashMap {
	public static void main(String[] args) {
		String s = "Automation testing is most important in today's world of Automation12341";
		String input = s.toLowerCase();

		HashMap<String, Integer> map = new HashMap<String, Integer>();
		HashMap<Character, Integer> letters = new HashMap<Character, Integer>();
		String[] words = input.split(" ");
		for (String w : words) {
			map.put(w, map.getOrDefault(w, 0) + 1);
		}
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + "->" + entry.getValue());
		}
		System.out.println("--------------------------------------------");
		System.out.println("Count of Each characters are as below");

		for (char c : input.toCharArray()) {
			letters.put(c, letters.getOrDefault(c, 0) + 1);
		}
		for (Map.Entry<Character, Integer> entry : letters.entrySet()) {

			System.out.println(entry.getKey() + "->" + entry.getValue());

		}

	}
}
