package com.dipesh.oops.classes;

/*
    * We use singleton class where we just want to create only one object of a class.
    * To create a singleton class we had to create its constructor private.
    * We have to provide a static method which can create only one instance of our class.
    * We can create instance of that class using that method only.
*/

public class SingletonClass {
    public static void main(String[] args) {
        // These all instances contains the same object
        CoffeeMachine myMachine = CoffeeMachine.getInstance();
        CoffeeMachine myMachine2 = CoffeeMachine.getInstance();
        CoffeeMachine myMachine3 = CoffeeMachine.getInstance();

        // this will print the same instance
        System.out.println(myMachine + " " + myMachine2 + " " + myMachine3);
        // this will return true
        System.out.println(myMachine == myMachine2 && myMachine2 == myMachine3);
        myMachine.makeCoffee();
    }
}
class CoffeeMachine {
    private float coffeeQty;
    private float milkQty;
    private float waterQty;
    private float sugarQty;

    static private CoffeeMachine my = null;
    private CoffeeMachine() {
        coffeeQty = 1;
        milkQty = 1;
        waterQty = 1;
        sugarQty = 1;
    }

    // It will only create one reference
    static public CoffeeMachine getInstance() {
        if (my == null) {
            my = new CoffeeMachine();
        }
        return my;
    }

    public void makeCoffee() {
        System.out.println("Making Coffee!");
    }
}
