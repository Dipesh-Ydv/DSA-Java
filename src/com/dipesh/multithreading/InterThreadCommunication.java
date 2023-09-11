package com.dipesh.multithreading;

public class InterThreadCommunication {
    public static void main(String[] args) {
        MyValue value = new MyValue();

        Producer p = new Producer(value);
        Consumer c = new Consumer(value);

        p.start();
        c.start();
    }
}

class MyValue {
    int value = 0;
    boolean flag = true;

    synchronized public void setValue(int value) {
        while (flag != true) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
        this.value = value;
        flag = false;
        notify();
    }

    synchronized public int getValue() {
        while (flag != false) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
        int x = this.value;
        flag = true;
        notify();
        return x;
    }
}

class Producer extends Thread {
    MyValue v;
    Producer (MyValue data) {
        v = data;
    }

    @Override
    public void run() {
        int i = 1;
        while (true) {
            v.setValue(i);
            System.out.println("Producer: " + i);
            i++;
        }
    }
}

class Consumer extends Thread {
    MyValue v;

    Consumer(MyValue data) {
        v = data;
    }

    @Override
    public void run() {
        while (true) {
            System.out.println("Consumer: " + v.getValue());
        }
    }
}