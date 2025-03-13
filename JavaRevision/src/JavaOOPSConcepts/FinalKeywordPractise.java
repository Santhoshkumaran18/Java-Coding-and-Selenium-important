package JavaOOPSConcepts;

class abcd{
	 int x=10;
	final void display() {
		System.out.println("Value of x: " + x);
	}
}

final class bcd extends abcd{
	void display1() {
		System.out.println("It is part of the bcd class");
	}
}


public class FinalKeywordPractise {
	public static void main(String[] args) {
		abcd a=new abcd();
		a.x=20;
		a.display();
	}
}
