package com.dipesh.multithreading;

class WhiteBoard {
    String txt;
    int numOfStudents = 0;
    int count = 0;
    public void attendance() {
        numOfStudents++;
    }
    synchronized public void write(String t) {
        System.out.println("Teacher is Writing: " + t);
        while (count != 0) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
            txt = t;
            count = numOfStudents;
            notifyAll();
        }
    }
    synchronized public String read() {
        while (count == 0) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
        String t = txt;
        count--;
        if (count == 0) {
            notify();
        }
        return t;
    }
}

class Teacher extends Thread {
    WhiteBoard wb;
    String[] notes = {"Java is language", "It is OOPs", "It is Platform Independent","It support Threads", "end"};
    public Teacher(WhiteBoard wb) {
        this.wb = wb;
    }

    @Override
    public void run() {
        for (String note : notes) {
            wb.write(note);
        }
    }
}

class Student extends Thread {
    String name;
    WhiteBoard wb;
    public Student(String name, WhiteBoard wb) {
        this.name = name;
        this.wb = wb;
    }

    @Override
    public void run() {
        String text;
        wb.attendance();

        do {
            text = wb.read();
            System.out.println(name + " is Reading: " + text);
            System.out.flush();
        } while(!text.equals("end"));
    }
}

public class TeacherStudentExample {
    public static void main(String[] args) {
        WhiteBoard wb = new WhiteBoard();
        Teacher t = new Teacher(wb);

        Student s1 = new Student("1. Dipesh", wb);
        Student s2 = new Student("2. Ankita", wb);
        Student s3 = new Student("3. Varshank", wb);
        Student s4 = new Student("4. Jimmy", wb);

        t.start();

        s1.start();
        s2.start();
        s3.start();
        s4.start();
    }
}
