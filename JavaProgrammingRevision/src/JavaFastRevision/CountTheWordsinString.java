package JavaFastRevision;
import java.util.*;

public class CountTheWordsinString {
	public static void main(String[] args) {
		String s="Santhosh Kumaran is Santhosh Kumaran";
		String input=s.toLowerCase();
		String[] words=input.split(" ");
		HashMap<String,Integer> map=new HashMap<>();
		
		for(String word:words) {
			map.put(word, map.getOrDefault(word,0)+1);
		}
		for(Map.Entry<String,Integer> entry:map.entrySet()) {
			System.out.println(entry.getKey().toUpperCase() + "->" + entry.getValue());
		}
	}
}
