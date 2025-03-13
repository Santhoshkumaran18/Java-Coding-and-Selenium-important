package JavaProgrammingRevision3march;

import java.util.HashMap;
import java.util.Map;

public class CountTheCharacters {
	public static void main(String[] args) {
		String s="Automation Testing is the real Time testing";
		String inputString=s.toLowerCase();
		
		HashMap<String,Integer> map=new HashMap<String,Integer>();
		String[] st=s.split(" ");
		for(String sa:st) {
			map.put(sa, map.getOrDefault(sa, 0)+1);
		}
		for(Map.Entry<String,Integer> entry:map.entrySet()) {
			System.out.println(entry.getKey() + "->" + entry.getValue());
		}
	}
}
