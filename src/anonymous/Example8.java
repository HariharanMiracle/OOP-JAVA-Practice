package anonymous;

interface IReference{
	void display();
}

public class Example8 {

	public void method1() {
		System.out.println("Hello bro");
	}
	
	public static void main(String args[]) {
		Example8 obj = new Example8();
		IReference iReference = obj::method1;
		iReference.display();
	}
}
