package JavaProgrammingRevision25Feb;

public class StringPalindrome {
	public static void main(String[] args) {
		if(Stringpalindromeu("madam")) {
			System.out.println("It is a palindrome string");
		}else {
			System.out.println("It is not a palindrome String");
		}
	}
	
	public static boolean Stringpalindromeu(String str) {
		String str1=str.replaceAll("\\s", "");
		String cleanedStr=new StringBuilder(str1).reverse().toString();
		return str1.equals(cleanedStr);
	}
}
