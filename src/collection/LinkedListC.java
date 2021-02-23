package collection;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListC {

	public static void main (String args[]) {
		LinkedList<Integer> ll = new LinkedList<Integer>();
		ll.add(1);
		ll.add(5);
		ll.add(4);
		ll.add(3);
		ll.add(7);
		
		System.out.println(ll.toString());
		
		Iterator<Integer> x = ll.descendingIterator();
		while(x.hasNext()) {
			System.out.println(x.next());
		}
	}
	
}
