package JavaProgramming28Feb;

public class CountTheCharactersUsingArray {
	public static void main(String[] args) {
		String s="Santhosh Kumaran ";
		String input=s.toLowerCase().trim();
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
