package StringBuffer;

public class StringBufferExample {

    public static void main(String args[]){
        StringBuffer sbf = new StringBuffer("HELLO");
        System.out.println(sbf);
        sbf.append(", HELLO");
        System.out.println(sbf);
        sbf.append(", HELLO");
        System.out.println(sbf);
        sbf.replace(0, 5, "POLLO");
        System.out.println(sbf);

        float a = 50;
        Float b = Float.valueOf(a);
        a = b.floatValue();
    }

}
