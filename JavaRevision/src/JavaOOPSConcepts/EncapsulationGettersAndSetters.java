package JavaOOPSConcepts;

public class EncapsulationGettersAndSetters {
	private int a,b;
	
	EncapsulationGettersAndSetters(int a,int b){
		this.a=a;
		this.b=b;
		
	}
	
	public void setID(int a,int b) {
		this.a=a;
		this.b=b;
		
	}
	
	public int getID() {
		return(a+b);
	}
	
}
