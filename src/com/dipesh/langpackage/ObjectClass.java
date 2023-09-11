package com.dipesh.langpackage;

/*
    * java.lang package is a default package that is by default imported.
    * Object class is the parent of every class in java.
    * Every class is in by default extends from object class.
    * It contains some methods from which we can override some methods.
    * finalize() method works similarly as destructor in C++.
    * Every object in java contains a uniquely identifying code which is hashCode.
    * As we can't directly access the address of an object, so there is a hashCode generated for each object.
*/

public class ObjectClass {
    public static void main(String[] args) {
        Object o1 = new Object();
        Object o2 = new Object();
        Object o3 = o2;

        System.out.println(o1.equals(o2));  // It will return false
        System.out.println(o2.equals(o3));  // It will return true as both are reference to the same object.

        System.out.println(o1.hashCode());  // unique code will be printed for each object
        System.out.println(o2.hashCode());

        System.out.println(o2);      // toString() method will be called automatically

        MyObject obj1 = new MyObject();
        MyObject obj2 = new MyObject();

        System.out.println(obj1.equals(obj2));

        System.out.println(obj1.hashCode());    // both will return the same value
        System.out.println(obj2.hashCode());

        System.out.println(obj1);
    }

    static class MyObject extends Object {      // No need to extend, it will be automatically extended from Object class

        @Override
        public String toString() {
            return "To String Method is called:)";
        }

        @Override
        public int hashCode() {
            // It is not a good practice to override hashCode() method.
            return 101 ;         // It will return the same hashcode for every object.
        }

        @Override
        public boolean equals(Object obj) {
            // It will return always true as hashCode of every object is the same.
            return this.hashCode() == obj.hashCode();
        }
    }
}
