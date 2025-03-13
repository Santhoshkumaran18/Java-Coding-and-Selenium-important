package JavaProgrammingRevision25Feb;

public class NumberReverse {
	public static void main(String[] args) {
		int a=16462;
		int rev=0;
		while(a!=0) {
			rev=rev*10 + a%10;
			a/=10;
		}
		System.out.println("Reversed number: "+ rev);
	}
}
