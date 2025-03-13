package javaProgramming23Feb;

public class CountTheCharactersUsingArrays {
	public static void main(String[] args) {
		String s="Santhosh kumaran S";
		String input=s.toLowerCase();
		int[] letterscount=new int[26];
		
		for(char c:input.toCharArray()) {
			if((c>='a' && c<='z')) {
				letterscount[c-'a']++;
			}
		}
		for(int i=0;i<26;i++) {
			if(letterscount[i]>0) {
				System.out.println((char)(i+'a') + "->" + letterscount[i]);
			}
		}
	}
}
