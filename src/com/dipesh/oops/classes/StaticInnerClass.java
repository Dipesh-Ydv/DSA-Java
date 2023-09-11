package com.dipesh.oops.classes;

/*
    * Objects of static inner classes can be directly created without outer class.
    *
*/

class Container {
    static int x = 10;
    int y = 30;

    static class Inner {
        void display() {
            System.out.println("x is " + x);
            // here we can't access y as it is not static
//            System.out.println("y is " + y);
        }
    }
    public void display() {
        System.out.println("x is " + x);
        System.out.println("y is " + y);
    }
}
public class StaticInnerClass {
    public static void main(String[] args) {
        // object of inner class created without creating object of outer class
        Container.Inner i = new Container.Inner();
        i.display();

    }
}
