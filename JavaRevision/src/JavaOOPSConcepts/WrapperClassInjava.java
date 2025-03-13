package JavaOOPSConcepts;

public class WrapperClassInjava {
	public static void main(String[] args) {
		int a=10;
		byte b=1;
		short c=20;
		long d=30;
		boolean e=false;
		char f='A';
		float g=0.1f;
		double y=2.5;
		
		//Autoboxing is nothing but used to convert the primitive datatypes to object datatypes
		Integer iobj=a;
		Double doub=y;
		System.out.println(iobj);
		System.out.println(doub);
		Character ch=f;
		System.out.println(ch);
		
		//Unboxing is used to convert the Object datatypes to primitive datatypes
		
		int intValue=iobj;
		Double da=doub;
		System.out.println(iobj.hashCode());
		System.out.println(da.hashCode());
		
		
		
		
		
	}
}
