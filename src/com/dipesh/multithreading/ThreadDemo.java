package com.dipesh.multithreading;

/*
    * We can achieve multithreading using Thread class or Runnable interface.
    * We must override the run() method of Thread class.
    * run() method is the starting point of a thread.
    * In the main method, we had to create an object of thread class and call its start() method.
    * If a thread is terminated, we can't restart it again, we have to create a new thread.
    * The Priority of threads lies between 1 and 10 where 1 is Minimum, 5 is Normal and 10 is Max.
    * Jvm has its own scheduler.
*/

public class ThreadDemo extends Thread {
    @Override
    public void run() {
        int i = 1;
        while (i < 1000) {
            System.out.println(i + " Hello");
            i++;
        }
    }
}

class Test {
    public static void main(String[] args) {
        ThreadDemo t = new ThreadDemo();
        // calling the start method to start the thread,
        // it will internally call the run method
        t.start();

        // It will return the priority of the thread
        System.out.println(t.getPriority());

        int i = 1;
        while (i < 1000) {
            System.out.println(i + " World");
            i++;
        }
        // here this will throw of illegalThreadState as we called it after it is terminated
//        t.start();
    }
}
