package JavaProgrammingRevsion;

public class NumberCountInString {
	public static void main(String[] args) {
		String s="Santhosh123456789";
		String input=s.toLowerCase();
		int sum=0;
		for(char c:input.toCharArray()) {
			if(Character.isDigit(c)) {
				sum+=Character.getNumericValue(c);
			}
		}
		System.out.println("Sum of the digits in the string is: " + sum);
	}
}
