package QuickRun;

public interface Sample1 {
    void fun1();
//    void fun2(){
//        System.out.println("Hello");
//    }
    default void fun2(){
        System.out.println("fun2");
    }
}
