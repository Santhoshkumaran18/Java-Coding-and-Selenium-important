package JavaOOPSConcepts;


class SrinivasanUma{
	int id;
	String name;
	void show() {
		System.out.println(id + " " + name);
	}
}

class sanjay extends SrinivasanUma{
	String nameofStudent;
	int salary;
	
	void print() {
		System.out.println(nameofStudent + salary);
	}
}

class santhosh extends SrinivasanUma{
	String san;
	int id1;
	
	void print2() {
		System.out.println(san + " " + id1);
	}
}
public class HierachyInheritanceConcepts {
		public static void main(String[] args) {
			santhosh s=new santhosh();
			sanjay san=new sanjay();
			s.id1=10;
			s.print2();
		}
	
}
