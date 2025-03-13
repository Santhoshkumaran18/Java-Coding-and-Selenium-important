package JavaProgramRevision;

public class CountTheCharactersUsingArrayMethod {
	public static void main(String[] args) {
		String s="Santhosh Kumaran S";
		String input=s.toLowerCase();
		int[] lettersCount=new int[26];
		for(char c:input.toCharArray()) {
			if((Character.isLetter(c))) {
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
