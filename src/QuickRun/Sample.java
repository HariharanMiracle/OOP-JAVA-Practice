package QuickRun;

public abstract class Sample {
    public void print(){
        System.out.println("Hello");
    }

    public String print2(String text) {
        return text + " Hello";
    }

    public abstract String print3() ;
}
