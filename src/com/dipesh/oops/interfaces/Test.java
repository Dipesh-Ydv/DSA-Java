package com.dipesh.oops.interfaces;

public interface Test {
    // Identifiers names must be in capital letters
    // by default they are final and static
    int X = 10;
    void meth1();
    void meth2();

    // We can't give it a body
    // To give it a body it must be static
    static void meth3() {
        System.out.println("Say Hello");
    }
    default void method() {
        System.out.println("I'm default method");
    }
}
