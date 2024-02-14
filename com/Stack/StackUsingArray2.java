package com.Stack;

public class StackUsingArray2 {
    public static class Stack {
        private int[] arr = new int[40];
        private int index = 0;

        void push(int x) {
            if (isFull()) {
                System.out.println("Stack overFlow");
                return;
            }
            arr[index] = x;
            index++;
        }

        int pop() {
            if (isEmpty()) {
                System.out.println("Stack underflow");
            }
            int item = arr[index];
            index--;
            return item;
        }

        int peek() {
            if (isEmpty()) {
                System.out.println("Stack underflow");
            }
            int item = arr[index-1];
            return item;
        }

        void display() {
            if (isEmpty()) {
                System.out.println("Stack is Empty");
                return;
            }
            for (int i = 0; i <=index - 1; i++) {
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }

        int size() {
            return index;
        }

        boolean isFull() {
            if (size() == arr.length) {
                return true;
            }
            return false;
        }

        boolean isEmpty() {
            if (size() == 0) return true;
            else return false;
        }
    }

    public static void main(String[] args) {
        Stack stk = new Stack();
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
