package QuickRun;

@FunctionalInterface
public interface Func {
    void fun1();
    default void fun2(){
        System.out.println("Hello1");
    }
    static void fun3(){
        System.out.println("Hello");
    }
}
