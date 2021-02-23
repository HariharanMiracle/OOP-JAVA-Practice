//First thread tute
//https://www.javatpoint.com/multithreading-in-java

package thread;

class Multi extends Thread {
	public void run() {
		System.out.println("Thread is running");
	}
}

public class Thread1 {
	public static void main(String args[]) {
		Multi t1 = new Multi();
		t1.start();
	}
}
