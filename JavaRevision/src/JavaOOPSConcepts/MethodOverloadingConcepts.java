package JavaOOPSConcepts;

import java.util.Arrays;

public class MethodOverloadingConcepts {
	int a=10;
	int b=120;
	
	void m1() {
		System.out.println(a+b);
	}
	
	void m1(int a, int b) {
		System.out.println(a+b);
	}
	
	void m1(String b,int a) {
		System.out.println(a+ b);
	}
	void m1(double c,int d) {
		System.out.println(a+b);
	}
	
	void m1(int d,double c) {
		System.out.println(c+d);
	}
	
	public static void main(String[] args) {
		MethodOverloadingConcepts mlc=new MethodOverloadingConcepts();
		mlc.m1();
		mlc.m1(10,20);
		
	}

}
