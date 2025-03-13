package JavaOOPSConcepts;

class Lione{
	String name;
	
	Lione(){
		System.out.println("It is part of Lione contructor");
	}
	
	void display() {
		System.out.println("Display is part of Lione classe");
	}
}

class man extends Lione{
	man(){
		super();
	}
	
	void print() {
		super.display();
		System.out.println("It is part of man class");
	}
}
public class SuperKeywordPractise {
	public static void main(String[] args) {
		man m=new man();
		m.print();
	}
}
