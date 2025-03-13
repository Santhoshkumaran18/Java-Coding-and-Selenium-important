package JavaOOPSConcepts;

public interface InterfaceRevision {
	int a=10;
	void m1();
	
	void animal();
	static void m2() {
		System.out.println("It is part of the static method in interface");
	}
	default void m3() {
		System.out.println("It is part of the default method in the interface");
	}
}
class a implements InterfaceRevision{

	@Override
	public void m1() {
		System.out.println("It is abstract methods");
		
	}

	@Override
	public void animal() {
		System.out.println("It is an abstract method");
		
	}
	
}
