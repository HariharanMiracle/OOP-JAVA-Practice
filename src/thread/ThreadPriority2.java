//9th thread tute

package thread;

public class ThreadPriority2 {
    public static void main(String args[]){
        ThreadA tA = new ThreadA();
        ThreadA tB = new ThreadA();
        tA.setPriority(Thread.MAX_PRIORITY);
        tB.setPriority(Thread.MIN_PRIORITY);
        tA.setName("Thread A");
        tB.setName("Thread B");
        tA.start();
        tB.start();
    }
}

class ThreadA extends Thread{
    public void run(){
        System.out.println("Thread: " + Thread.currentThread().getName() + " - " + Thread.currentThread().getPriority());
    }
}