package anonymous;

public class Example7 {

	public static void main(String args[]) {
		Example7 obj = new Example7();
		obj.method();
	}
	
	void method() {
		int x = 5;
		Runnable r = () -> {System.out.println("count: " + x); };
		Thread t = new Thread(r);
		t.start();
	}
}
