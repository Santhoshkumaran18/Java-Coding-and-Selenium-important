package InterviewPreparation;

import java.util.Scanner;
import java.util.*;

public class CountTheOccurenceInStringUsingForLoop {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the string of characters and numbers to check the occurence");
		String san=s.nextLine();
		
		int[] letterCounts=new int[26]; //Create an array with empty 26 boxed and assigned with 0 value
		String input=san.toLowerCase();
		
		for(char c:input.toCharArray()) {
			if(Character.isLetter(c)) {
				letterCounts[c-'a']++; //using the unicode value of the alphabets like for small 
				//letter of a--> it is 97 based on that it keep on
				//it keep on increasing when the repeatative letter comes in 
			
			}
		}
		
		for(int i=0;i<26;i++) {
			if(letterCounts[i]>0) {
				System.out.println((char)(i+'a')+ "->" + letterCounts[i]);
			}
		}
	}

}
