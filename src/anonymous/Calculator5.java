package anonymous;

interface ICalculator{
	int add(int x, int y);
}

public class Calculator5 {

	public static void main(String args[]) {
		ICalculator iCalculator = (x, y) -> ( x + y );
		System.out.println("Add 5 + 10 = " + iCalculator.add(5, 10));
	}
	
}
