package com.dipesh.oops.generics.comparing;

public class Student implements Comparable<Student> {
    int rollno;
    float marks;
    public Student(int rollno, float marks) {
        this.rollno = rollno;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return rollno + ": " + marks;
    }

    @Override
    public int compareTo(Student o) {
        System.out.println("Comparing");
        int diff = (int)(this.marks - o.marks);

        // if diff == 0: both has equal marks
        // if diff < 0: means o is bigger else o is smaller
        return diff;
    }
}
