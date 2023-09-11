package com.dipesh.multithreading;

class ATM {
    synchronized public void checkBalance(String name) {
        System.out.println(name + " is checking balance.");
//        try {
//            Thread.sleep(1000L);
//        } catch (InterruptedException e) {
//            System.out.println(e.getMessage());
//        }
    }

    synchronized public void withdraw(String name, int amt) {
        System.out.println(name + " is withdrawing " + amt + " rupees.");
//        try {
//            Thread.sleep(1000L);
//        } catch (InterruptedException e) {
//            System.out.println(e.getMessage());
//        }
    }
}

class Customer extends Thread {
    private ATM atm;
    private String name;
    private int amount;

    Customer(String name, ATM atm, int amount) {
        this.name = name;
        this.atm = atm;
        this.amount = amount;
    }

    public void useATM() {
        atm.checkBalance(name);
        atm.withdraw(name, amount);
    }

    @Override
    public void run() {
        useATM();
    }
}

public class ATMMachineExample {
    public static void main(String[] args) {
        ATM atm = new ATM();
        Customer c1 = new Customer("Dipesh", atm, 4000);
        Customer c2 = new Customer("Ankita", atm, 4400);

        c1.start();
        c2.start();
    }
}
