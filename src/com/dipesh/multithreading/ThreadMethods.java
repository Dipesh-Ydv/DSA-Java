package com.dipesh.multithreading;

/*
    * Daemon thread is a dependent thread; it is depended upon another thread to be executed.
    * If the scope of the block where it is called finishes, then daemon thread will also stop executing.
    * Join is used to join multiple threads together.
    * Yield will tell a thread to wait and let other threads to execute.
    * Yield is used where there may be possibility of process starvation.
*/

public class ThreadMethods extends Thread {
    // making a constructor for our class to set the name of thread
    public ThreadMethods(String name) {
        // calling constructor of thread class
        super(name);
        // setting the priority of our thread
        setPriority(MIN_PRIORITY + 2);
    }

    @Override
    public void run() {
        int i = 0;
        while (i < 100) {
            System.out.println("Jai Shri Ram 🚩");
            i++;
            // sleep is a static method
            // it throws an error so must be caught in try-catch block
            try {
                Thread.sleep(1000L);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        ThreadMethods t = new ThreadMethods("First Thread");

        // some methods of thread class
        System.out.println("ID: " + t.getId());
        System.out.println("Name: " + t.getName());
        System.out.println("Priority: " + t.getPriority());
//        t.start();
        // It will interrupt the thread
//        t.interrupt();
        System.out.println("State: " + t.getState());
        System.out.println("Is Alive? " + t.isAlive());

        // It is a demon thread
        ThreadMethods t2 = new ThreadMethods("Second Thread");
        t2.setDaemon(true);
        t2.start();

//        try {
//            // making main method waiting
//            Thread.sleep(10000L);
//        } catch (InterruptedException e) {
//            System.out.println(e.getMessage());
//        }

        // getting the reference of main thread
        Thread mainThread = ThreadMethods.currentThread();
        // thread of the main method will join our daemon thread and stay alive till daemon thread finishes executing
        mainThread.join();

        // Showcasing yield() method
        int count = 1;
        while (true) {
            System.out.println("Hello " + count++);
            // here the main thread will hold itself for some time
            Thread.yield();
        }
    }
}
