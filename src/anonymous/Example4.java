package anonymous;

interface IGreetService4{
	void hello(String greet, String name);
}

public class Example4 {

	public static void main(String args[]) {
		IGreetService4 iGreetService4 = (greet, name) -> System.out.println(greet + " " + name);
		iGreetService4.hello("hi", "Harry Potter");
	}
	
}
