package JavaOOPSConcepts;

public class StudentsUpdated {
	int id;
	String name;
	
	 StudentsUpdated(int id,String name) {
		System.out.println(id + " " + name);
	}
	StudentsUpdated(){
		System.out.println("It is part of the default constructor");
	}
	
	void studentData() {
		System.out.println(id +name);
	}
	
	void setStuData(int id,String name,char grade) {
		System.out.println(id + " " + name + " " +grade);
		
	}
}
