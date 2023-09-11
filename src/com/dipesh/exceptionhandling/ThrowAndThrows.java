package com.dipesh.exceptionhandling;

/*
    * throw keyword will tell that here exception is thrown.
    * throws keyword tell that a which is throwing an exception.
    * If someone throws exception it must be caught using try catch block.
    * Either we throws an exception or has to catch it there only.
    * We can use throws for multiple times also but at last we must catch the exception.
*/

// creating our own exception class
class DimensionNegativeException extends Exception {
    @Override
    public String toString() {
        return "Dimensions can't be negative";
    }
}

public class ThrowAndThrows {
    static int area(int a, int b) throws Exception {
        if (a < 0 || b < 0) {
            throw new DimensionNegativeException();
        }
        return a * b;
    }
    static void fun2(int a, int b) {
        try {
            int ar = area(a, b);
            System.out.println("Area of Rectangle is: " + ar);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        fun2( 3, 5);
    }
}
