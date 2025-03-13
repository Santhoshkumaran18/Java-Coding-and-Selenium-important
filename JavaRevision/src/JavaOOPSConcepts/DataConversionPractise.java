package JavaOOPSConcepts;

public class DataConversionPractise {
	public static void main(String[] args) {
		String s="232434";
		
	 int b=Integer.parseInt(s);
	 System.out.println(b);
	 
	 String san="true";
	 boolean ba=Boolean.parseBoolean(san);
	 System.out.println(ba);
	 
	 int a=2343434;
	 String A=String.valueOf(a);
	 System.out.println(A);
	 
	 char yy='a';
	 String abc=String.valueOf(yy);
	 System.out.println(abc);
	}
}
