package anonymous;

interface IGreetService3 {
	void hello(String name);
}

public class Example3 {

	public static void main(String ars[]) {
		IGreetService3 iGreetService3 = (name) -> System.out.println("Hello " + name);
		iGreetService3.hello("Harry");	
	}
	
}
