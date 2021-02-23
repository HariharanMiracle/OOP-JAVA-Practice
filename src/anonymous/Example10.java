package anonymous;

import java.util.Arrays;

public class Example10 {
	public static void main(String args[]) {
		String[] strArr = {"Sam", "Richard", "Ann", "Udara", "John", "Peter", "Yasho"};
		
		Arrays.sort(strArr, String::compareToIgnoreCase);
		for(String s : strArr) {
			System.out.println("* " + s);
		}
	}
}
