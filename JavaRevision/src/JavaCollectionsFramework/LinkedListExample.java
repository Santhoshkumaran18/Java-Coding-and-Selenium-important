package JavaCollectionsFramework;

import java.util.LinkedList;

public class LinkedListExample {
	public static void main(String[] args) {
		LinkedList<Integer> list=new LinkedList<Integer>();
		list.add(1);
		list.add(2);
		
		list.addFirst(5);
		list.addLast(10);
		
		list.remove(1);
		list.removeFirst();
		list.removeLast();
		
		list.poll();
		list.pollLast();
		list.pollFirst();
		
	}
}
