package JavaProgrammingRevsion;
import java.util.*;

public class VowelsAndConsonants {
	public static void main(String[] args) {
		String s="Santhosh Kumaran S";
		String input=s.toLowerCase();
		int vowel=0;
		int consonants=0;
		HashSet<Character> uniqueVowels=new HashSet<>();
		for(int i=0;i<s.length();i++) {
			char ch=input.charAt(i);
			if(ch=='a' || ch =='e'|| ch=='i'|| 
					ch =='o'|| ch=='u') {
				uniqueVowels.add(ch);
				vowel++;
			}else {
				consonants++;
			}
		}
		System.out.println("Vowels count: " + vowel);
		System.out.println("Unique vowels count: "+ uniqueVowels.size());
		System.out.println("Consonants count: " + consonants);
	}
}
