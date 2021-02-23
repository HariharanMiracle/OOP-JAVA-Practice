//2nd thread tute

package thread;

class Multi2 implements Runnable{
	public void run() {
		System.out.println("Thread running");
	}
}

public class Thread2 {
	public static void main(String args[]) {
		Multi2 m1 = new Multi2();
		Thread t1 = new Thread(m1);
		t1.start();
	}
}
