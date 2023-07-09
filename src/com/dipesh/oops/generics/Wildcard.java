package com.dipesh.oops.generics;

import java.util.Arrays;
import java.util.List;

// now we can only pass Number type or its subclasses
public class Wildcard<T extends Number> {

    private Object[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0;

    public Wildcard() {
        data = new Object[DEFAULT_SIZE];
    }

    public void getList(List<Number> list) {
        // do something

        // here we can pass only Number type
    }

    public void getList2(List<? extends Number> list) {
        // do something

        // here we can pass Number type as well as its subclasses
    }

    public void add(T num) {
        if (isFull()) {
            resize();
        }
        data[size++] = num;
    }

    private void resize() {
        Object[] temp = new Object[data.length * 2];
        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }

    private boolean isFull() {
        return size == data.length;
    }

    public T remove() {
        return (T)(data[--size]);
    }

    public int size() {
        return this.size;
    }

    public void set(int index, T value) {
        data[index] = value;
    }

    public T get(int index) {
        return (T)(data[index]);
    }

    @Override
    public String toString() {
        return "CustomArrayList{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {

        Wildcard<Integer> list = new Wildcard<>();
//        list.add(3);
//        list.add(5);
//        list.add(4);

        for (int i = 0; i < 15; i++) {
            list.add(i * 2);
        }
        System.out.println(list);
    }

}
