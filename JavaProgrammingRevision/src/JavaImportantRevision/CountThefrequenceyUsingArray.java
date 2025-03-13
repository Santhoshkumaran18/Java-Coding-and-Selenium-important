package JavaImportantRevision;

public class CountThefrequenceyUsingArray {
	public static void main(String[] args) {
		String s="Automation Testing ";
		String input=s.toLowerCase();
		int[] letterCount=new int[26];
		for(char c:input.toCharArray()) {
			if((c>='a' && c<='z')) {
				letterCount[c-'a']++;
			}
		}
		for(int i=0;i<26;i++) {
			if(letterCount[i]>0) {
				System.out.println((char)(i+'a') + "->" + letterCount[i]);
			}
		}
	}
}
