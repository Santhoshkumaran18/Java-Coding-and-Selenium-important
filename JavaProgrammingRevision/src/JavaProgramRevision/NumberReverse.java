package JavaProgramRevision;

public class NumberReverse {
	public static void main(String[] args) {
		int n=16461;
		int a=n;
		int rev=0;
		while(n!=0) {
			rev=rev*10 + n%10;
			n/=10;
		}
		System.out.println("Reversed Number " +rev);
		if(a==rev) {
			System.out.println("It is palindrome");
		}else {
			System.out.println("It is not a palindrome");
		}
	}
}
