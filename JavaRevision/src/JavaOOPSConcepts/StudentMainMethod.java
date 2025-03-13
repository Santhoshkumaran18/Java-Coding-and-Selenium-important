package JavaOOPSConcepts;

public class StudentMainMethod {
	public static void main(String[] args) {
		
		//Using object reference variable we can assign the values
		StudentsUpdated st=new StudentsUpdated(1,"Santhosh");
		StudentsUpdated st1=new StudentsUpdated();
		st.id=10;
		st.name="Santhosh";
		st.studentData();
		
		st.setStuData(2, "Sanjay",'B');
		
		//Using constructor
		

	}
}
