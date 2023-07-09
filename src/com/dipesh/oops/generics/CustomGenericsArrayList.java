package com.dipesh.oops.generics;

import java.util.ArrayList;
import java.util.Arrays;

public class CustomGenericsArrayList<T> {

    private Object[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0;

    public CustomGenericsArrayList() {
        data = new Object[DEFAULT_SIZE];
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

        CustomGenericsArrayList<Integer> list = new CustomGenericsArrayList<>();
//        list.add(3);
//        list.add(5);
//        list.add(4);

        for (int i = 0; i < 15; i++) {
            list.add(i * 2);
        }
        System.out.println(list);
    }

}
