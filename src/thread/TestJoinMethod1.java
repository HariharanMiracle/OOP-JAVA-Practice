//5th thread tute

package thread;

public class TestJoinMethod1 extends Thread{
	public void run(){
		for(int i = 1; i <= 5; i++) {
			try{
				Thread.sleep(500);
			}
			catch(Exception e) {
				System.out.println("Error" + e);
			}
			
			System.out.println("Thread " + i);
		}
	}

	public static void main (String args[]) {
		TestJoinMethod1 t1 = new TestJoinMethod1();
		TestJoinMethod1 t2 = new TestJoinMethod1();
		TestJoinMethod1 t3 = new TestJoinMethod1();
		t1.start();
		
		try {
			t1.join();
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println("Error: " + e);
		}
		
		t2.start();
		t3.start();
		
	}
}
