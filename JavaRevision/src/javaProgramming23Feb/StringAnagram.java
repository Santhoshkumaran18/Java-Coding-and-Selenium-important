package javaProgramming23Feb;

import java.util.Arrays;

public class StringAnagram {
	public static void main(String[] args) {
		if(StringAnagramup("Silent","Listen")) {
			System.out.println("It is an anagram word");
		}else {
			System.out.println("It is not an anagram word");
		}
	}
	
	public static boolean StringAnagramup(String str1,String str2) {
		str1=str1.replaceAll("\\s", "");
		str2=str2.replaceAll("\\s", "");
		
		char[] c1=str1.toLowerCase().toCharArray();
		char[] c2=str2.toLowerCase().toCharArray();
		
		Arrays.sort(c1);
		Arrays.sort(c2);
		
		return Arrays.equals(c1, c2);
	}
}
