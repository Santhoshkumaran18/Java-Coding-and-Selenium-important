package JavaCollectionsFramework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;



public class ArrayListExample {
	 public void Arraylistexercise(){
		 List<String> arraylist=new ArrayList<String>();
			//<>--> it is called as generics which is used in java 
			arraylist.add("Benz");
			arraylist.add("Bently");
			arraylist.add("BMW");
			arraylist.add("Bently");
			//List basic follows and maintains the insertion order and 
			//it can store any number of duplicate elements
			System.out.println(arraylist);
			//To get the elements based on the index
			System.out.println(arraylist.get(0));
			//To get the index based on the value
			System.out.println(arraylist.indexOf("Benz"));
			System.out.println(arraylist.lastIndexOf("Bently"));
			
			List<String> anotherString=new ArrayList<String>();
			System.out.println(anotherString.addAll(arraylist));
			System.out.println(anotherString);
			anotherString.clear();
			System.out.println(anotherString);
			
			anotherString.add(null);
			System.out.println(anotherString);
			List<String> list=new ArrayList<String>();
			list.add("Santhosh");
			list.add("Sanjay");
			list.add("Umasankari");
			list.add("Srinivasan");
			 Iterator<String> it=list.iterator();
			 while(it.hasNext()) {
				 System.out.println(it.next());
			 }
			 ListIterator<String> li=list.listIterator();
			 li.add("Santhosh");
				li.add("Sanjay");
				li.add("Umasankari");
				li.add("Srinivasan");
			 
			 while(li.hasPrevious()) {
				 System.out.println(li.previous());
			 }
			
			
			
	}
	 
	 public static void main(String[] args) {
		 ArrayListExample a=new ArrayListExample();
		 a.Arraylistexercise();
		 
	 }
}
