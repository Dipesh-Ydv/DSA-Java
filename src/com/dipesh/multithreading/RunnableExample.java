package com.dipesh.multithreading;

/*
    * If a class implement runnable then it must override run() method.
    * We have to pass the object of the Runnable class to the constructor of the object of Thread class.
    * If a class is implementing runnable it can't run by itself, it will need a thread.
*/

public class RunnableExample  implements Runnable {
    @Override
    public void run() {
        int i = 1;
        while (true) {
            System.out.println(i + " Hello");
            i++;
        }
    }

    public static void main(String[] args) {
        RunnableExample r = new RunnableExample();
        // passing the object to the constructor of the Thread object.
        Thread t = new Thread(r);
        // starting thread
        t.start();

        int i = 1;
        while (true) {
            System.out.println(i + " World");
            i++;
        }
    }
}
