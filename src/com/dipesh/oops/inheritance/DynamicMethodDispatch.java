package com.dipesh.oops.inheritance;

/*
     -> Dynamic method dispatch is used to achieve run time polymorphism.
     -> In this we create an object of Sub type having reference to a Super type.
 */

public class DynamicMethodDispatch {
    public static void main(String[] args) {

        Super s1 = new Sub();
        // It will call the meth1 of Super class
        s1.meth1();
        // It will call the meth2 of Sub class as the object is of Sub type
        s1.meth2();

        // It will give error as the reference is of super type
//        s1.meth3();

    }
     static class Super {
        public void meth1() {
            System.out.println("Super meth1");
        }
        public void meth2() {
            System.out.println("Super meth2");
        }
    }
    static class Sub extends Super {
        @Override
        public void meth2() {
            System.out.println("Sub meth2");
        }
        public void meth3() {
            System.out.println("Sub meth3");
        }
    }
}
