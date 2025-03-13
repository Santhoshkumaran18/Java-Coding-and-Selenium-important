package JavaOOPSConcepts;

public interface SanthoshKumaran {
	default void display() {
		System.out.println("It is part of the default method");
	}
	
	static void print() {
		System.out.println("It is part of the print method");
	}
	void h();
	
}

class san implements SanthoshKumaran{
	public void h() {
		System.out.println("It is an abstract method");
	}
}


