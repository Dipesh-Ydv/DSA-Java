package com.dipesh.oops.classes;

/*
    * Inner class can access the members of outer class.
    * Outer class can't directly access the member of inner class.
    * We can access the members of inner class into outer using reference of inner class.
    * We can access private members of inner class into outer using object.
    * For every class different class file will be generated.
*/
class Outer {
    int x = 10;
    // creating object of inner class
    Inner i = new Inner();
    class Inner {
        int y = 20;
        public void innerDisplay() {
            System.out.println("Inner display: " + x + " " + y);
        }
    }

    public void outerDisplay() {
        // inner display will be called here
        i.innerDisplay();
        // can't access y directly without reference
        System.out.println(i.y);
    }
}
public class NestedInnerClass {
    public static void main(String[] args) {
        Outer o = new Outer();
        o.outerDisplay();

        // creating object of inner display
        Outer.Inner oi = new Outer().new Inner();
        // now I can access the members of Inner class only
        oi.y = 22;
        oi.innerDisplay();
    }
}
