package ProgrammingJavaRevision26Feb;

public class StringPalindrome {
	public static void main(String[] args) {
		if(StringPalindrome("ma")) {
			System.out.println("palindrome");
		}else {
			System.out.println("Not a palindrome");
		}
	}
	
	public static boolean StringPalindrome(String str) {
		String str1=str.replaceAll("\\s+", "");
		String cleanedString=new StringBuilder(str1).reverse().toString();
		return str1.equals(cleanedString);
	}
}
