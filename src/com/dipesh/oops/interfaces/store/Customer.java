package com.dipesh.oops.interfaces.store;

public class Customer implements Member {
    private String name;
    private int customerId;

    public Customer(String name, int customerId) {
        this.name = name;
        this.customerId = customerId;
    }

    @Override
    public void callBack() {
        System.out.println("Customer Id: " + this.customerId +" Name: " + this.name + ", will visit ");
    }

}
