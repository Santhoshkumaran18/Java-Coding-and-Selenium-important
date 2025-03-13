package SeleniumMarch11CodingPractise;

public class RemoveThereapeatingcharacters {
	public static void main(String[] args) {
		String s="aaabbbbcccdddd";
		String input=s.toLowerCase();
		StringBuilder result=new StringBuilder();
		for(int i=0;i<input.length();i++) {
			if(i==0|| s.charAt(i)!=s.charAt(i-1)) {
				result.append(s.charAt(i));
			}
		}
		System.out.println(result.toString());
	}
}
