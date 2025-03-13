package JavaOOPSConcepts;

class Aa{
	int id;
	String name;
	double salary;
	
	void display() {
		System.out.println(id + "" + name + " " + salary);
	}
}

class Bb extends Aa{
	int max;
	void print() {
		System.out.println(max);
	}
}

class Cc extends Bb{
	int min;
	void show() {
		System.out.println(min +name);
	}
}
public class MultiLevelInheritanceConcepts {
	public static void main(String[] args) {
		Cc cd=new Cc();
		cd.name="Santhosh";
		cd.min=10;
		cd.show();
	}
}
