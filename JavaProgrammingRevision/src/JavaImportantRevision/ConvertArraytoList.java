package JavaImportantRevision;

import java.util.ArrayList;
import java.util.Arrays;

public class ConvertArraytoList {
	public static void main(String[] args) {
		Integer[] a= {1,2,3,5,6,7,10};
		try {
			ArrayList<Integer> list=new ArrayList<Integer>(Arrays.asList(a));
			System.out.println(list.get(8));
		}catch (Exception e) {
			System.out.println("It throws an exception");
			e.getMessage();
			
		}finally {
			System.out.println("Please check the index ");
		}
		
	}
}
