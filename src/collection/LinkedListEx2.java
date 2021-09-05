package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class LinkedListEx2 {

    public static void main (String args[]) {
        Student std1 = new Student("hari", "25");
        Student std2 = new Student("yasi", "21");
        Student std3 = new Student("dillu", "28");
        Student std4 = new Student("vino", "23");
        Student std5 = new Student("rahul", "10");

        List<Student> studentList = new ArrayList<>();
        studentList.add(std1);
        studentList.add(std2);
        studentList.add(std3);
        studentList.add(std4);
        studentList.add(std5);

        studentList.stream().map(std -> {
            System.out.println("Std: " + std);
            return std;
        }).collect(Collectors.toList());

        System.out.println("\n\n\nSORTING\n\n\n");
        Collections.sort(studentList, (o1, o2) -> {
            return o1.getName().compareTo(o2.getName());
        });

        studentList.stream().map(std -> {
            System.out.println("Std: " + std);
            return std;
        }).collect(Collectors.toList());
    }

}
