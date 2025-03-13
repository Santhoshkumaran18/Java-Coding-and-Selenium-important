package JavaOOPSConcepts;

class Animaal{
	String colour="Green";
	
	void displaycolor() {
		System.out.println(colour + " is the color of dog");
	}
	
	Animaal(){
		System.out.println("it is part of Animal group");
	}
}

class Dog extends Animaal{
	String colour;
	
	void displaycolor() {
		super.displaycolor();
		System.out.println("It is part of dog class");
	}
}

class Lion extends Animaal{
	Lion(){
		super();
	}
}
public class SuperKeywordInjava {
	public static void main(String[] args) {
		Dog d=new Dog();
		
	}
}
