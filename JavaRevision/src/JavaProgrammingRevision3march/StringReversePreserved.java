package JavaProgrammingRevision3march;

public class StringReversePreserved {
	public static void main(String[] args) {
		String str="Santhosh is a part of LBG project";
		System.out.println(str);
		StringReverse(str);
		
	}
	
	public static void StringReverse(String str) {
		int n=str.length();
		int left=0,right=n-1;
		
		char[] c=str.toCharArray();
		
		while(left<right) {
			
			if(c[left] == ' ') {
				left++;
				continue;
			}
			else if(c[right]== ' ') {
				right--;
				continue;
			}else {
				char temp=c[left];
				c[left]=c[right];
				c[right]=temp;
				left++;
				right--;
				
			}
			
		}
		System.out.println(String.valueOf(c));
	}


}
