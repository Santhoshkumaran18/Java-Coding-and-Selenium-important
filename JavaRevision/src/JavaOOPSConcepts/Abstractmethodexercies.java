package JavaOOPSConcepts;

abstract class m1{
	abstract void m1();
	
	void m2() {
		System.out.println("It is part of abstract class method");
	}	
	m1(){
		System.out.println("It is part of the abstract constructor");
	}
}

class sant extends m1{
	public void m1() {
		System.out.println("It is part of the abstract class methods");
	}
}
public class Abstractmethodexercies {
	public static void main(String[] args) {
		sant s=new sant();
		
	}
}
