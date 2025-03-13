package InterviewPreparation;

import java.util.*;

public class CountTheNumbersInTheString {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the mixed of String & numbers");
		String a=s.nextLine();
		int sum=0;
		for(char c:a.toCharArray()) {
			if(Character.isDigit(c)) {
				sum+=Character.getNumericValue(c);
			}
		}
		System.out.println("Sum of the numbers in the String is : " + sum);
	}

}
