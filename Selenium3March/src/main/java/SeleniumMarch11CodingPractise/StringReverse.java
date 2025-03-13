package SeleniumMarch11CodingPractise;

public class StringReverse {
	public static void main(String[] args) {
		String s="Santhosh Kumaran S";
		String reversed="";
		for(int i=s.length()-1;i>=0;i--) {
			reversed+=s.charAt(i);
		}
		System.out.println("Reversed word:" + reversed);
	}
}
