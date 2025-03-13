package JavaProgrammingRevsion;

public class CountTheOccurenceUsingArrays {
	public static void main(String[] args) {
		String s="Automation testing";
		String input=s.toLowerCase();
		int[] lettersCount=new int[26];
		
		for(char c:input.toCharArray()) {
			if((c>='a' && c<='z')) {
				lettersCount[c-'a']++;
			}
		}
		for(int i=0;i<26;i++) {
			if(lettersCount[i]>0) {
				System.out.println((char)(i+'a') + "->" + lettersCount[i]);
			}
		}
	}
}
