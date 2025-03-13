package JavaOOPSConcepts;

public interface InterfacePractise1 {
	int a=10;
	int b=20;
	
	void h1();
	default void h2() {
		System.out.println("It is part of default method inside interface");
	}
	static void h3() {
		System.out.println("It is part of static method inside interface");
	}
}

class h4 implements InterfacePractise1{

	@Override
	public void h1() {
		System.out.println("It is in the class and it is overided method accordingly");
		
	}
	
}
