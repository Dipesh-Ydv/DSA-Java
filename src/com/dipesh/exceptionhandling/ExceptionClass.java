package com.dipesh.exceptionhandling;

/*
    -> Hierarchy of exception class:
                            OBJECT
                               |
                           THROWABLE
                          /        \
                   EXCEPTION       ERROR
                       |
                   -- These all are checked exceptions --
                   1. CLASS NOT FOUND EXCEPTION
                   2. I/O EXCEPTION
                   3. INTERRUPTED EXCEPTION
                   4. NUMBER FORMAT EXCEPTION
                   -- These all are unchecked exceptions --
                   5. RUNTIME EXCEPTION
                        i.   ARITHMETIC EXCEPTION
                        ii.  INDEX OUT OF BOUND EXCEPTION
                        iii. NULL POINTER EXCEPTION

    -> Checked exceptions are those exceptions which must be checked for an exception.
    -> Unchecked exceptions doesn't require to be checked for an exception.

*/

// creating our own exception class
class LowBalanceException extends Exception {
    @Override
    public String toString() {
        return "Balance should not be less than 5000";
    }
}

public class ExceptionClass {
    static void fun1() {
        // It will throw a LowBalanceException
        try {
            throw new LowBalanceException();
        } catch (LowBalanceException l) {
            System.out.println(l);
            // It will print the stack of exception at the last of the program
            l.printStackTrace();
        }
    }
    static void fun2() {
        fun1();
    }
    static void fun3() {
        fun2();
    }

    public static void main(String[] args) {
        fun3();
        System.out.println("Program END!");
    }
}
