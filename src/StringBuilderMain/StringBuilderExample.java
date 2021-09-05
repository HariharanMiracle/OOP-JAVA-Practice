package StringBuilderMain;

public class StringBuilderExample {

    public static void main(String a[]){
        StringBuilder var = new StringBuilder("Hello");
        var.append("abc");
        var.append(",abc");
        System.out.println(var);

        var = new StringBuilder("SUCC");
        System.out.println(var);

    }

}
