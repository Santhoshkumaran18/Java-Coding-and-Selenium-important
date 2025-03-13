package JavaCollectionsFramework;

public class StringBufferKeyword {
	public static void main(String[] args) {
		String s="Santhosh";
		String s1=s.concat("Kumaran");
		System.out.println(s);
		System.out.println(s1);
		
		StringBuffer sa=new StringBuffer("Santhosh");
		sa.append("Kumaran");
		System.out.println(sa);
		System.out.println(sa.reverse());
		System.out.println(sa.charAt(1));
		System.out.println(sa.indexOf("S"));
		System.out.println(sa.codePointAt(1));
		System.out.println(sa.capacity());
		System.out.println();
	}
}
