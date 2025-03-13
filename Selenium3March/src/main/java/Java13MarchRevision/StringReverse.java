package Java13MarchRevision;

public class StringReverse {
	public static void main(String[] args) {
		String s="Santhosh Kumaran ";
		String reversed="";
		for(int i=s.length()-1;i>=0;i--) {
			reversed+=s.charAt(i);
		}
		System.out.println("Reversed word: " + reversed);
	}
}
