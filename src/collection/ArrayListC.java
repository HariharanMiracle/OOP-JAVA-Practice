package collection;

import java.util.ArrayList;

public class ArrayListC {

	public static void main (String args[])
	{
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(2);
		al.add(5);
		al.add(8);
		al.add(6);
		al.add(3);
		
		System.out.println(al.toString());
		System.out.println(al.contains(2));
	}
	
}
