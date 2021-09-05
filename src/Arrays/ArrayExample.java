package Arrays;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ArrayExample {

    public static void main(String a[]){
        boolean[] validate = new boolean[5];
        Arrays.fill(validate, false);

        for(boolean validateObj : validate){
            System.out.println(validateObj);
        }


        Test[] testList = new Test[5];
        Test test = new Test();
        test.setId(0);
        Arrays.fill(testList, test);

        for(Test t : testList){
            System.out.println(t.toString());
        }

        // NEW
        int[] marks = {50, 80, 30, 99, 51};
        int[] marks2 = {50, 80, 30, 99, 51};
        System.out.println(Arrays.mismatch(marks, marks2));
        Arrays.stream(marks).forEach(m -> System.out.println(m));

    }

}
