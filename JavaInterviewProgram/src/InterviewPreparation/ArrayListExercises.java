package InterviewPreparation;
import java.util.*;

public class ArrayListExercises {

	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(5);
		list.add(7);
		list.add(-10);
		System.out.println(list);
		
		
		Collections.sort(list);
		System.out.println(list);
		System.out.println("Maximum element in the array: " + Collections.max(list));
		System.out.println("Minimum element in the array: " +  Collections.min(list));
		
		LinkedList<Integer> linklist=new LinkedList<Integer>();
		linklist.add(2);
		linklist.add(5);
		linklist.add(-99);
		
		System.out.println(linklist);
		System.out.println(linklist.get(2));

	}

}
