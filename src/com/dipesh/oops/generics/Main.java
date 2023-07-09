package com.dipesh.oops.generics;

public class Main implements GenericInterface<Integer> {
    public static void main(String[] args) {

    }

    @Override
    public void display(Integer data) {
        System.out.println(data);
    }
}
