package com.dipesh.oops.interfaces.store;

public class Main {
    public static void main(String[] args) {
        Store s1 = new Store();
        Customer c1 =  new Customer("Dipesh", 1);
        Customer c2 =  new Customer("Ankita", 2);
        Customer c3 =  new Customer("Varshank", 3);

        // Here in the parameter is of Member type, but we pass here Customer as an argument
        // We can use it as Customer implements Member
        s1.register(c1);
        s1.register(c2);
        s1.register(c3);

        s1.inviteToSale();
    }
}
