package JavaOOPSConcepts;import java.awt.image.AreaAveragingScaleFilter;

class AgeValidationException extends Exception{
	public AgeValidationException(String message) {
		super(message);
	}
}

public class CustomExceptionsInJava{
	static void validateAge(int age)throws AgeValidationException{
		if(age<18) {
			throw new AgeValidationException("Age must not be less than or equal to 18");
		}
		System.out.println("You are eligible to vote");
	}


public static void main(String[] args) {
	try {
		validateAge(16);
	}catch (AgeValidationException e) {
		System.out.println("Exception handles at: " + e.getMessage());
	}
}
}


