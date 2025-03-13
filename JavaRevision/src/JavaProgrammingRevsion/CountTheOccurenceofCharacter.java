package JavaProgrammingRevsion;
import java.util.*;

public class CountTheOccurenceofCharacter {
	public static void main(String[] args) {
		String s="Automation Testing";
		String input=s.toLowerCase();
		HashMap<Character,Integer> map=new HashMap<Character,Integer>();
		
		for(char c:input.toCharArray()) {
			if((c>='a' && c<='z')) {
				map.put(c, map.getOrDefault(c,0)+1);
			}
		}
		for(Map.Entry<Character,Integer> entry:map.entrySet()) {
			System.out.println(entry.getKey() + "->" + entry.getValue());
		}
	}
}
