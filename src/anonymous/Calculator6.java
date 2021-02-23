package anonymous;

interface ICalculatorService{
	float operation(float a, float b);
}

public class Calculator6 {
	public static void main(String args[]) {
		ICalculatorService addition = (a, b) -> (a + b);
		ICalculatorService substraction = (a, b) -> (a - b);
		ICalculatorService multiplication = (a, b) -> (a * b);
		ICalculatorService division = (a, b) -> (a / b);
		
		System.out.println("addition 5 + 6 => " + addition.operation(5, 6));
		System.out.println("substarction 10 - 3 => " + substraction.operation(10, 3));
		System.out.println("multiplication 5 * 5 => " + multiplication.operation(5, 5));
		System.out.println("division 5 / 2 => " + division.operation(5, 2));
	}
}
