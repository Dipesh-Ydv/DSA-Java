package com.dipesh.langpackage;

/*
    * Enum is a class that is used to store enumerated data.
    * Each data in an enum class is its object.
    * Enums are best used with switch cases.
*/

enum Department {
    CSE("Dipesh Yadav", "Vivekananda Block"),
    MANAGEMENT("Ram", "Rao Tula Ram Block"),
    PHARMA("Ankit", "Vivekananda Block");

    final private String head;
    final private String location;

    Department(String head, String location) {
        this.head = head;
        this.location = location;
    }

    public void displayInfo() {
        System.out.println("Details of " + this.name() + " department: ");
        System.out.println("Head: " + this.head + "; Location: " + this.location);
    }

    public void display() {
        System.out.println(this.name() + " " + this.ordinal());
    }

    public String getHead() {
        return head;
    }

    public String getLocation() {
        return location;
    }
}

public class EnumClass {
    public static void main(String[] args) {

        Department d = Department.CSE;
        d.displayInfo();
        d.display();
        Department[] list = Department.values();

        for (Department x : list) {
            System.out.println(x.name() + " " + x.ordinal());
        }

        String headName = Department.PHARMA.getHead();
        String location = Department.PHARMA.getLocation();

        System.out.println(headName);
        System.out.println(location);
    }
}
