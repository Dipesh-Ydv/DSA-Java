package com.dipesh.oops.inheritance.abstractClass;

/*
    * A class contain at least one abstract method is an Abstract class.
    * If a class contain an abstract method then, it is necessary to declare it as an abstract class.
    * Abstract class may contain some non-abstract methods.
    * We can not create object of an abstract class.
    * But we can create a reference of an abstract class.
    * Abstract class is important for defining or imposing standards.
 */

public class AbstractClassExample {
    public static void main(String[] args) {
        // creating reference of abstract class
        Hospital h1 = new MyHospital();

        // overridden methods of child class will be called
        h1.appointment();
        h1.admit();
        h1.ambulance();
        h1.emergency();
        h1.billing();
    }

    static abstract class Hospital {
        abstract public void appointment();
        abstract public void ambulance();
        abstract public void admit();
        abstract public void emergency();
        abstract public void billing();
    }

    static class MyHospital extends Hospital {
        @Override
        public void appointment() {
            System.out.println("Appointment can be taken through website");
        }

        @Override
        public void ambulance() {
            System.out.println("Have an ambulance");
        }

        @Override
        public void admit() {
            System.out.println("You can admit patient");
        }

        @Override
        public void emergency() {
            System.out.println("We have an emergency ward");
        }

        @Override
        public void billing() {
            System.out.println("Billing is done through computer");
        }
    }
}
