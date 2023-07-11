package com.dipesh.oops.interfaces;

/*
    * Interfaces are similar to abstract classes.
    * We can create a reference of an interface.
    * Interfaces are meant to achieve polymorphism only.
    * We can achieve a kind of multiple inheritance(not multiple inheritance) using interfaces.
    * One class can implement more than one interfaces.
    * If we not override all the methods of an interface while implementing it then the class will became abstract class.
    * By default, methods are public and abstract.
    * We can't create methods private.
    * We can create identifiers, but they should be declared in capital letters.
    * By default, identifiers/variables are static and final.
    * Only static methods can have body.
    * An interface can extend another interface.
    * Interfaces can have default members which can be declared with the "default" keyword.
*/
public class Main {
    public static void main(String[] args) {
        Test t = new MyClass();
        t.meth1();
        t.meth2();
        // We can't call it as the reference is of Test type
//        t.meth4();

        // Accessing static members
        System.out.println(Test.X);
        Test.meth3();

        // Here we can call all the 3 methods
        MyClass my = new MyClass();
        my.meth1();
        my.meth2();
        my.meth4();

    }
    static class MyClass implements Test {

        @Override
        public void meth1() {
            System.out.println("Method 1 of my class");
        }

        @Override
        public void meth2() {
            System.out.println("Method 2 of my class");
        }

        public void meth4() {
            System.out.println("Method 3 of my class");
        }
    }
}
