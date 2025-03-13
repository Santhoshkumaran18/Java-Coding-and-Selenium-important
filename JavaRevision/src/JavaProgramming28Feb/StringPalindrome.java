package JavaProgramming28Feb;

import java.util.Arrays;

public class StringPalindrome {
	public static void main(String[] args) {
		if(StringPalindorme("madam")) {
			System.out.println("It is a palindrome word");
		}else {
			System.out.println("It is not a palindrome word");
		}
	}
	
	public static boolean StringPalindorme(String str) {
		String str1=str.replaceAll("\\s+", "");
		String cleanedString=new StringBuilder(str1).reverse().toString();
		return str1.equals(cleanedString);
		
	}
}
