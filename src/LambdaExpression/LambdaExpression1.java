package LambdaExpression;

interface Operation {
    float operation(float a, float b);
}

public class LambdaExpression1 {

    public static void main(String args[]){
        System.out.println("Refer to anonymous");

        Operation addition = (float a, float b) -> {
            System.out.println("addition of " + a + " + " + b);
            return a + b;
        };

        System.out.println("Result: " + addition.operation(5, 6));

    }

}
