package ProgrammingJavaRevision26Feb;

import java.util.Locale;

public class StringReverse {
	public static void main(String[] args) {
		String s="straße";
		String reversed= "";
		for(int i=s.length()-1;i>=0;i--) {
			reversed+=s.charAt(i);
		}
		System.out.println("Reversed String:" + reversed);
		System.out.println(s.lastIndexOf("s"));
		System.out.println(s.length());
		System.out.println(s.concat(" Kumaran"));
		System.out.println(s.contains("thos"));
		System.out.println(s.codePointAt(1));
		System.out.println(s.compareToIgnoreCase("santhosh"));
		System.out.println(s.hashCode());
		System.out.println(s.startsWith("S"));
		System.out.println(s.codePointBefore(1));
		System.out.println((char)(83));
		System.out.println(s.toUpperCase());
		System.out.println(s.toUpperCase(Locale.CHINA));
		System.out.println(s.toUpperCase(Locale.GERMANY));
		System.out.println(s.toUpperCase(Locale.FRENCH));
		
	}
}
