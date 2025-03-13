package JavaOOPSConcepts;

public interface InterfacePractise {
	int a=10;
	void display();
}

class uma implements InterfacePractise{
	public void display() {
		System.out.println("It is part of interface method");
	}
}

