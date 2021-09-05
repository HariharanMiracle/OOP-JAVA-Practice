package collection;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.stream.Collectors;

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


		Collections.sort(ll);
		ll.stream().map(data -> {
			System.out.println("data: " + data);
			return data;
		}).collect(Collectors.toList());
	}
	
}
