package JavaOOPSConcepts;

public class ThisKeywordPractise {
	 int x,y; // x& y are the instance/class variables
	 
	 void setData(int a,int b) { //a & b are the local variables
		 x=a;
		 y=b;
	 }
	 
	 void setDatathis(int x,int y) {
		 this.x=x;
		 this.y=y;
	 }
	 
	 void display() {
		 System.out.println(x + " " + y);
	 }
	 
	 public static void main(String[] args) { //we need to create an object to access the method present in the class
		ThisKeywordPractise th=new ThisKeywordPractise();
//		th.setData(10,20);
		th.setDatathis(10,200);
		th.display();
	}
}
