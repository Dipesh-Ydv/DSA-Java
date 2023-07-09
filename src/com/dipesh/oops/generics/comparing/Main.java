package com.dipesh.oops.generics.comparing;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Student dipesh = new Student(12, 94.3f);
        Student ankita = new Student(35, 98.5f);
        Student ayush = new Student(8, 79.7f);
        Student varshank = new Student(6, 94.8f);
        Student jimmy = new Student(24, 88.99f);

        Student[] list = {dipesh, ankita, ayush, varshank, jimmy};

        System.out.println(Arrays.toString(list));

        // this will work as we had implemented the compareTo method
//        Arrays.sort(list);

        // alternative way to sort
        Arrays.sort(list, new Comparator<Student>(){
            @Override
            public int compare(Student o1, Student o2) {
                return (int)(o1.marks - o2.marks);
            }
        });

        System.out.println(Arrays.toString(list));

//        if (dipesh.compareTo(ankita) < 0) {
//            System.out.println("Ankita has more marks");
//        }
    }
}
