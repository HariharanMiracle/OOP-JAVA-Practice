package collection;

import java.util.*;

public class HashMapEx {
    public static void main (String args[]) {
        HashMap<String, List<Student>> mapList = new HashMap<>();

        List<Student> stdList1 = new ArrayList<>();
        List<Student> stdList2 = new ArrayList<>();

        Student std1 = new Student("hari", "20");
        Student std2 = new Student("yasi", "21");
        Student std3 = new Student("dillu", "22");
        Student std4 = new Student("vino", "23");
        Student std5 = new Student("rahul", "24");

        stdList1.add(std1);
        stdList1.add(std2);
        stdList2.add(std3);
        stdList2.add(std4);

        mapList.put("class1", stdList1);
        mapList.put("class2", stdList2);

        mapList.get("class1").add(std5);

        System.out.println(mapList.get("class1"));

    }
}
