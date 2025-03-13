package JavaOOPSConcepts;

public class CallByValuemethods {
	int number;
	void m1(int number) {
		number+=1;
		System.out.println("Value in the method is: " + number);
	}
	
	void m2(CallByValuemethods t) {
		t.number+=10;
		System.out.println("Value in the method: " + t.number);
	}
}
