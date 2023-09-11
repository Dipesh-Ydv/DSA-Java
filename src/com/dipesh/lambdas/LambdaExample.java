/**
 * @author Dipesh Yadav
 */
package com.dipesh.lambdas;

/**
 * Lambda Expressions are used for defining anonymous methods.
 * They are defined with the help of interfaces.
 * Interface with only one method is called functional interface.
 *
 */

@FunctionalInterface
interface MyLambda {
    void display();
}

/**
 * Defining lambda with a parameter and return type.
 */
@FunctionalInterface
interface AvgLambda {
    /**
     *
     * @param x First Number
     * @param y Second Number
     * @return returns average of both numbers
     */
    int avg(int x, int y);
}

public class LambdaExample {
    public static void main(String[] args) {
        /*
          It is an anonymous inner class.
         */
        MyLambda my = new MyLambda() {
            /**
             * Overriding display method
             */
            @Override
            public void display() {
                System.out.println("Hello World");
            }
        };
        my.display();

        /*
          It is an anonymous method that is acting as an object.
         */
        MyLambda m = () -> System.out.println("I'm a lambda expression");
        m.display();

        /*
           Using a lambda with return value and parameters.
         */
        AvgLambda a = ((x, y) -> (x+y)/2);
        System.out.println(a.avg(4, 10));
    }
}
