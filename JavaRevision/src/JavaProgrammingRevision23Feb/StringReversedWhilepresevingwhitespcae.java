package JavaProgrammingRevision23Feb;

public class StringReversedWhilepresevingwhitespcae {
	public static void main(String[] args) {
		String str="Santhosh is good boy in the class";
		System.out.println(str);
		reverse(str);
	}
	
	public static void reverse(String str) {
		int n=str.length();
		int start=0;
		int end=n-1;
		char[] ch=str.toCharArray();
		while(start<end) {
			if(ch[start]== ' ') {
				start++;
				continue;
			}
			else if(ch[end]== ' ') {
				end--;
				continue;
			}
			else {
				char temp=ch[start];
				ch[start]=ch[end];
				ch[end]=temp;
				start++;
				end--;
			}
			
		}
		System.out.println(String.valueOf(ch));
	}
}
