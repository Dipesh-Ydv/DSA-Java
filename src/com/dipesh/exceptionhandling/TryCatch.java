package com.dipesh.exceptionhandling;

import java.util.Scanner;

/*
    * We can handle exceptions using try catch blocks.
    * We can have multiple catch block of a single try block.
    * While declaring the catch block we have to declare the subclass first and super class at the last.
    * try block checks a block of code for exception.
    * catch block catches that exception and does require task given it that block.
    * finally block will always get executed no matter we get an exception or not.
    * We can also write try and finally block only.
    * If we are not catching the exception then we can omit finally block.
*/

public class TryCatch {
    public static void main(String[] args) {
        int a, b, c, i;
        int[] arr = {1, 2, 3, 4, 5};
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter first number: ");
            a = sc.nextInt();
            System.out.println("Enter second number: ");
            b = sc.nextInt();
            c = a / b;
            System.out.println("Division of a by b is: " + c);

            // accessing an index which doesn't exist
            System.out.println("Enter the index of array to access: ");
            i = sc.nextInt();
            System.out.println(arr[i]);
        } catch (ArithmeticException e) {   // catch any arithmetic exception
            System.out.println("Can't divide by zero! ");
            System.out.println(e);
        } catch (ArrayIndexOutOfBoundsException e) {    // catch the index out of bound exception
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Finally block will always execute");
        }

        // This will be executed as the flow of program will be managed by the try catch block.
        System.out.println("Program END!");
    }
}
