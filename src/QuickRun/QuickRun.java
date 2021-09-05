package QuickRun;

public class QuickRun {

    public static void main(String[] args) {
        Sample sm = new Sample() {
            @Override
            public String print3() {
                return "null";
            }
        };

        System.out.println(sm.print2("Hari"));

        Population population = new Population();
        population.last();
        population.print();

        // ###################################################

        Sample1Impl sample1 = new Sample1Impl();
        sample1.fun1();
        sample1.fun2();

        System.out.println(Sample2EN.HIGH);
        System.out.println(Sample2EN.values());

    }

}
