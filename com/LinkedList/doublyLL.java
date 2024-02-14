package com.LinkedList;

class doublyLL {
    Node head = null;

    private class Node {
        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public void displays() {
        Node ptr = head;
        while (ptr != null) {
            System.out.print(ptr.data + " ");
            ptr = ptr.next;
        }
    }


    public void insertFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        newNode.prev = null;
        head = newNode;
    }

    public void insertEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node ptr = head;
        newNode.next = null;
        while (ptr.next != null) {
            ptr = ptr.next;
        }
        ptr.next = newNode;
        newNode.prev = ptr;

    }

    public void deleteNode(int position) {
        if (head == null) {
            return;
        }
        if (position==0){
            head= head.next;
            return;
        }
        Node ptr, ptr2 ,ptr3;
        ptr= head;
        int i=0;
        while (i != position-1 ) {
            ptr = ptr.next;
            i++;
        }
        ptr2= ptr.next.next;
        ptr.next=ptr2;
        ptr2.prev=ptr;
    }


    public static void main(String[] args) {
        doublyLL dl = new doublyLL();
        dl.insertFirst(45);
        dl.insertFirst(4);
        dl.insertFirst(5);
        dl.displays();
        dl.insertEnd(76);
        dl.insertEnd(89);
        System.out.println();
        dl.displays();
        dl.deleteNode(4);
        System.out.println();
        dl.displays();

    }


}
