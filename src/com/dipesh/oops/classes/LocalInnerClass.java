package com.dipesh.oops.classes;

/*
    * Local class is an inner class which is defined inside the method of an outer class.
    * Its scope is local to the method only.
    * Local classes are generally used when we are inheriting a class from some existing class.
*/

class Outside {
    void display() {
        class Inner {
            void innerDisplay() {
                System.out.println("Hello World");
            }
        }
        // Inner class scope will be only inside the method
        Inner i = new Inner();
        i.innerDisplay();
    }
}

public class LocalInnerClass {
    public static void main(String[] args) {

        Outside o = new Outside();
        o.display();
    }
}
