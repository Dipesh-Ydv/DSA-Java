package com.dipesh.exceptionhandling;

import java.util.Scanner;

public class NestedTryCatch {
    public static void main(String[] args) {
        int a, b, c, i;
        int[] arr = {1, 2, 3, 4, 5};
        Scanner sc = new Scanner(System.in);

        try {
            try {
                System.out.println("Enter first number: ");
                a = sc.nextInt();
                System.out.println("Enter second number: ");
                b = sc.nextInt();
                c = a / b;
                System.out.println("Division of a by b is: " + c);
            } catch (ArithmeticException e) {   // catch any arithmetic exception
                System.out.println("Can't divide by zero! ");
                System.out.println(e);
            }

            // This will still execute even we get an exception in above block.
            // accessing an index which doesn't exist
            System.out.println("Enter the index of array to access: ");
            i = sc.nextInt();
            System.out.println(arr[i]);
        } catch (ArrayIndexOutOfBoundsException e) {    // catch the index out of bound exception
            System.out.println(e.getMessage());
        } finally {
            System.out.println("This is finally block and it will always get executed.");
        }

        System.out.println("END of Program!");
    }
}
