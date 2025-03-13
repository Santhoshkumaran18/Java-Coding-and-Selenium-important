package JavaOOPSConcepts;

public class MultipleInheritancemain implements Santhoshkum,SanjayKum {

	@Override
	public void m2() {
		System.out.println("It is part of Sanjay Kum");
		
	}

	@Override
	public void m1() {
		System.out.println("It is part of Santhosh kumaran S");
	}
	
	public static void main(String[] args) {
		MultipleInheritancemain m=new MultipleInheritancemain();
		m.m1();
		m.m2();
	}

}
