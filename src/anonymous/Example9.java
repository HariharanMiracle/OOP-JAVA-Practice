package anonymous;

interface IReference1{
	void dispaly();
}

public class Example9 {
	
	public static void method1() {
		System.out.println("Hello babe!!!");
	}
	
	public static void main(String args[]) {
		IReference1 iReference1 = Example9::method1;
		iReference1.dispaly();
	}
}
