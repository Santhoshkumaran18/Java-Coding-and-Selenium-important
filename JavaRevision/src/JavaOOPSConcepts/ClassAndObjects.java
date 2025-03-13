package JavaOOPSConcepts;


class Employee{
	String name;
	private int salary;
	
	
	private void E1() {
		System.out.println("Employee Details found and their salary is: " + salary);
	}
}

class Students extends Employee{
	void e2() {
		System.out.println("Student details found");
	}
}
public class ClassAndObjects {
	public static void main(String[] args) {
		Students s=new Students();
		
		
	}
}
