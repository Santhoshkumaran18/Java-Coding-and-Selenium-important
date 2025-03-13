package JavaOOPSConcepts;

public class CallByValue {
	public static void main(String[] args) {
		CallByValuemethods cv=new CallByValuemethods();
		int number=100;
		System.out.println("Before method: " + number);
		cv.m1(number);
		System.out.println("After method:" + number);
		cv.number=110;
		System.out.println("-------------------");
		System.out.println("Before method: " + cv.number);
		cv.m1(number);
		System.out.println("After method:" + cv.number);
		cv.m2(cv);
		
	}
}
