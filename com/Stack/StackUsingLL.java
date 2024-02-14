package com.Stack;

class StackUsingLL {
    public static class Node {
        int value;
        Node next;
        Node(int value){
            this.value = value;
        }
    }
    public static class LLStack{
        Node head = null;
        int size = 0;
        void push(int x){
            Node temp = new Node(x);
            temp.next = head;
            head= temp;
            size++;
        }
        void  displayReverse(){
            Node ptr = head;
            while (ptr != null){
                System.out.print(ptr.value+" ");
                ptr=ptr.next;
            }
            System.out.println();
        }
        void displayer(Node ptr){
            if (ptr==null){
                return;
            }
            displayer(ptr.next);
            System.out.print(ptr.value + " ");
        }
        void display(){
            Node ptr = head;
            displayer(ptr);
            System.out.println();
        }
        int pop(){
            if (head == null){
                return -1;
            }
            int x = head.value;
            head = head.next;
            return x;
        }
        int peek(){
            if (head == null){
                return -1;
            }
            int x = head.value;
            return x;
        }
        boolean isEmpty(){
//            if (head == null) {
//                return true;
//            }
            if (size == 0) return true;
            return false;
        }
        int size(){
            return size;
        }
    }

    public static void main(String[] args) {
        LLStack stk = new LLStack();
        stk.push(2);
        stk.push(20);
        stk.push(32);
        stk.push(24);
        stk.push(12);
        stk.push(27);
        stk.push(72);
        stk.display();
        stk.pop();
        stk.display();
        stk.pop();
        stk.display();
        stk.pop();
        stk.display();
        System.out.println("peek element is "+ stk.peek());
        stk.pop();
        stk.display();
        System.out.println("peek element is "+ stk.peek());
    }
}
