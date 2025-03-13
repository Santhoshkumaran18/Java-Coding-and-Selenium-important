package JavaImportantRevision;

public class CountThenumbersinString {
	public static void main(String[] args) {
		String s="Santhosh123456";
		int sum=0;
		for(char c:s.toCharArray()) {
			if(Character.isDigit(c)) {
				sum+=Character.getNumericValue(c);
			}
		}
		System.out.println("Sum of the elements in the string is: " + sum);
	}
}
