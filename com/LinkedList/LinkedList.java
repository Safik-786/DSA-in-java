package com.LinkedList;

// Linked list operations in Java

class LinkedList {
    Node head ;

    // Create a Node
    class Node {
        int data;
        Node next =null;

        Node(int d) {
            this.data = d;
            this.next = null;           // initially all Node have next value is null
        }
    }

    // Insert at the beginning
    public void insertAtBeginning(int new_data) {
        // insert the data
        Node new_node = new Node(new_data);
        if  ( head== null)    {     // it checks , kya linked list exist karti hai
            new_node= head;
            return;
        }
        new_node.next = head;
        head = new_node;
    }

        // Insert at the end
    public void insertAtEnd(int new_data) {
        Node new_node = new Node(new_data);

        if (head == null) {
            head = new_node;
            return;
        }

        new_node.next = null;

        Node last = head;           // pointer is created which go to the end-1
        while (last.next != null)
            last = last.next;

        last.next = new_node;
        return;
    }
    // Insert after a Node
    public void insertAfter(Node prev_node, int new_data) {
        if (prev_node == null) {
            System.out.println("The given previous Node cannot be null");
            return;
    }
        Node new_node = new Node(new_data);
        new_node.next = prev_node.next;
        prev_node.next = new_node;
    }

    //     Insert after an index
    public void insertIndex(int index, int data){
        int i= 0;
        Node new_node = new Node(data);
        if (index == 0) {
            new_node.next= head;
            head= new_node;

            return;
        }
        Node ptr = head;
        while (i!=index-1){
            ptr= ptr.next;
            i++;
        }
        new_node.next= ptr.next;
        ptr.next= new_node;
        return;
    }

    // Delete a Node
    void deleteNode(int position) {
        if (head == null)
            return;

        Node temp = head;

        if (position == 0) {
            head = temp.next;
            return;
        }
        // Find the key to be deleted
        for (int i = 0; temp != null && i < position - 1; i++)
            temp = temp.next;

        // If the key is not present
        if (temp == null || temp.next == null)
            return;

        // Remove the Node
        Node temp2= temp.next.next;    // or we can write ,  Node temp2= temp.next;

        temp.next = temp2;              // temp.next = temp2.next;
    }

    // Search a Node
    boolean search(Node head, int key) {
        Node current = head;
        while (current != null) {
            if (current.data == key)
                return true;
            current = current.next;
        }
        return false;
    }

    // Sort the linked list
    void sortLinkedList(Node head) {
        Node current = head;
        Node index = null;
        int temp;

        if (head == null) {
            return;
        } else {
            while (current != null) {
                // index points to the Node next to current
                index = current.next;

                while (index != null) {
                    if (current.data > index.data) {
                        temp = current.data;
                        current.data = index.data;
                        index.data = temp;
                    }
                    index = index.next;
                }
                current = current.next;
            }
        }
//        for (current= head; current != null; current = current.next){           //   BUBBLE SORT
//            for (index = current.next; index != null; index = current.next) {
//                if (current.data > index.data){
//                    temp = current.data;
//                    current.data = index.data;
//                    index.data = temp;
//                }
//            }
//        }
    }

    // Print the linked list
    public void printList() {
        Node tnode = head;
        while (tnode != null) {
            System.out.print(tnode.data + " ");
            tnode = tnode.next;
        }

    }

    public static void main(String[] args) {
        LinkedList llist = new LinkedList();

        llist.insertAtEnd(1);
        llist.insertAtBeginning(2);
        System.out.print("Now LL is: ");
        llist.printList();
        llist.insertAtBeginning(3);
        llist.insertAtEnd(4);
        llist.insertAfter(llist.head.next, 5);

        System.out.println("\nLinked list: ");
        llist.printList();

        System.out.println("\nAfter deleting an element: ");
        llist.deleteNode(3);
        llist.printList();
        
        System.out.println();
        int item_to_find = 3;
        if (llist.search(llist.head, item_to_find))
            System.out.println(item_to_find + " is found");
        else
            System.out.println(item_to_find + " is not found");

//        llist.sortLinkedList(llist.head);
//        System.out.println("\nSorted List: ");
//        llist.printList();
        llist.insertIndex(4,24);
        llist.printList();
    }
}