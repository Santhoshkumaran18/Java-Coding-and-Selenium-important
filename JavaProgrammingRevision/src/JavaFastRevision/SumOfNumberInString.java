package JavaFastRevision;

public class SumOfNumberInString {
	public static void main(String[] args) {
		String s="Santhosh12235";
		int sum=0;
		for(char c:s.toCharArray()) {
			if(Character.isDigit(c)) {
				sum+=Character.getNumericValue(c);
			}
		}
		System.out.println(sum);
	}
}
