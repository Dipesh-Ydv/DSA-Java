package com.dipesh.oops.classes;

/*
    * Anonymous class is a class without any name.
    * We can also create an anonymous class by using an interface.
    * It is defined at the creation of an object.
    * Generally useful for abstract classes and interfaces.
*/

// This is an abstract class
abstract class My {
    abstract void display();
}
class Super {
    public void printMessage() {
        // here anonymous class is created i.e. a class without any name
        My m = new My() {
            // we are able to create an instance of abstract class as we override its method
            @Override
            void display() {
                System.out.println("Hello Java");
            }
        };
        // here we called the overridden method
        m.display();
    }
}
public class AnonymousInnerClass {
    public static void main(String[] args) {
        Super sp = new Super();
        sp.printMessage();
    }
}
