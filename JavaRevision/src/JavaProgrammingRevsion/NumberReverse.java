package JavaProgrammingRevsion;

public class NumberReverse {
	public static void main(String[] args) {
		int num=1633442;
		int rev=0;
		while(num!=0) {
			rev=rev*10 + num%10;
			num/=10;
		}
		System.out.println("Reversed number is: " + rev);
	}
}
