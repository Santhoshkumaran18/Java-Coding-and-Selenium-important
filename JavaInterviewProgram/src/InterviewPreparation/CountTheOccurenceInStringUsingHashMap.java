package InterviewPreparation;
import java.util.*;
public class CountTheOccurenceInStringUsingHashMap {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the string of characters and numbers to check the occurence");
		String san=s.nextLine();
		
		//SantaaClaause
		Map<Character,Integer> map=new TreeMap<Character,Integer>();
		for(char c: san.toCharArray()) {
			if(Character.isLetter(c)) { //To check if the character has the letter
				map.put(c, map.getOrDefault(c, 0)+1); //get the default value or set it to 0 or add plus one
			}
			
		}
		
		for(Map.Entry<Character,Integer> entry:map.entrySet()) {
			System.out.println(entry.getKey() + "->" + entry.getValue()); //get the key and the value of the map array
		}
		

	}

}
