package JavaOOPSConcepts;

public class Methods {
	
	void m1() {
		System.out.println("This is no params and no return values");
	}
	
	String m2(String name) {
		name="Santhosh";
		System.out.println("This is params and return value:");
		return name;
	}
	
	void m3(String name) {
		System.out.println("This is params and no return values: " + name);
	}
	
	int m4() {
		int value=10;
		System.out.println("This is part of value" + value);
		return value;
		
	}
}
