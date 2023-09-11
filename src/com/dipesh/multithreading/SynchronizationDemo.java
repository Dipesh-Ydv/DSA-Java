package com.dipesh.multithreading;

/*
    * To synchronize a block of code, we use synchronized keyword.
    * It will restrict the block to be accessed by single thread at a time.
    * We can also use synchronized keyword at function declaration to synchronize the complete fun.
*/

class MyData {
    public void display(String str) {
        // this will synchronize the block of code i.e., only one thread can access it at a time
        synchronized (this) {
            for (int i = 0; i < str.length(); i++) {
                System.out.print(str.charAt(i));
                // even it is sleeping no other thread is entering in
                try {
                    Thread.sleep(400L);
                } catch (InterruptedException e) {
                    System.out.println(e.getMessage());
                }
            }
        }
    }
}

class FirstThread extends Thread {
    MyData str;
    public FirstThread(MyData obj) {
        str = obj;
    }

    @Override
    public void run() {
        str.display("Hello World");
    }
}

class SecondThread extends Thread {
    MyData str;
    public SecondThread(MyData obj) {
        str = obj;
    }

    @Override
    public void run() {
        str.display("Dipesh Yadav");
    }
}

public class SynchronizationDemo {
    public static void main(String[] args) {

        MyData data = new MyData();
        FirstThread t1 = new FirstThread(data);
        SecondThread t2 = new SecondThread(data);

        t1.start();
        t2.start();
    }
}
