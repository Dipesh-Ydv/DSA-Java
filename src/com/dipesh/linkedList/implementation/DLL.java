package com.dipesh.linkedlist.implementation;

public class DLL {
    private Node head;
    private Node tail;
    private int size;

    public DLL() {
        this.size = 0;
    }

    public void insertStart(int val) {
        Node node = new Node(val);
        node.next = head;
        node.prev = null;
        if (head != null) {
            head.prev = node;
        }
        head = node;

        if (tail == null) {
            tail = head;
        }

        size++;
    }
    public void insertLast(int val) {
        if (tail == null) {
            insertStart(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        node.next = null;
        node.prev = tail;
        tail = node;

        size++;
    }
    public void displayFromStart() {
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }
    private class Node {
        private int value;
        private Node next;
        private Node prev;
        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next, Node previous) {
            this.value = value;
            this.next = next;
            this.prev = previous;
        }
    }
}
