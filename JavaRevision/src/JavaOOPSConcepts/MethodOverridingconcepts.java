package JavaOOPSConcepts;
class D{
	int a;
	int b;
	void display() {
		System.out.println(a+b);
	}
	void print() {
		System.out.println("Addition of two numbers: " + (a+b));
	}
	void print(int salary) {
		System.out.println("Salary of two people: " + salary);
	}
}

class E extends D{
	@Override
	void display() {
		System.out.println(a-b);
	}
	
	void print(String name) {
		System.out.println(name);
	}
}
public class MethodOverridingconcepts {
	public static void main(String[] args) {
		E e=new E();
		e.a=10;
		e.b=20;
		
		e.display();
		e.print();
		e.print(100);
		e.print("Santhosh");
	}
}
