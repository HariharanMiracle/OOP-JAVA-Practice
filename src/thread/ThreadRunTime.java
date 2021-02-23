//13th thread tute

package thread;

public class ThreadRunTime {
    public static void main(String args[]) throws Exception{
        Runtime.getRuntime().exec("notepad");//will open a new notepad
        System.out.println(Runtime.getRuntime().availableProcessors());
    }
}
