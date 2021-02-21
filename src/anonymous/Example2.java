package anonymous;

interface IgreetService2{
	void hello();
}

public class Example2 {

	public static void main (String args[]) {
		IgreetService2 igreetService2 = () -> System.out.println("Hello Hariharan!");
		igreetService2.hello();
	}
	
}
