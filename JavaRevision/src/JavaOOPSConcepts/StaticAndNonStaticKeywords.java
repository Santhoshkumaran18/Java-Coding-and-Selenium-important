package JavaOOPSConcepts;

public class StaticAndNonStaticKeywords {
	int a=10;
	static int b=10;
	
	static void m1() {
		System.out.println("Static method" +b);
	}
	
	void additionofandn() {
		System.out.println("Output of two numbers :" + (a+b));
	}
	
	void nonstaticup() {
		m1();
		additionofandn();
		a=10;
		b=10;
		System.out.println(a+b);
	}
	public static void main(String[] args) {
		m1();
		StaticAndNonStaticKeywords.b=20;
		StaticAndNonStaticKeywords.m1();
		
		StaticAndNonStaticKeywords st=new StaticAndNonStaticKeywords();
		st.b=10;
		st.a=20;
		st.additionofandn();
		st.nonstaticup();
		
	}
}
