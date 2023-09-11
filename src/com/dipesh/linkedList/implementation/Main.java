package com.dipesh.linkedlist.implementation;

public class Main {
    public static void main(String[] args) {
/*
        // singly linked list
        LL list = new LL();

        list.insertFirst(3);
        list.insertFirst(5);
        list.insertFirst(7);
        list.insertFirst(6);
        list.insertLast(44);
        list.insert(99, 3);
//        list.insert(232, 102);      // it will print index out of bound
        list.display();
        System.out.println(list.deleteFirst());
        list.display();
        System.out.println(list.deleteLast());
        list.display();
        System.out.println(list.delete(1));
        list.display();
*/
        // Doubly Linked List
        DLL dl = new DLL();

        dl.insertLast(12);
        dl.insertLast(2);
        dl.displayFromStart();
        dl.insertStart(4);
        dl.insertStart(6);
        dl.displayFromStart();
    }
}
