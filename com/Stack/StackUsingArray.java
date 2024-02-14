package com.Stack;

// customStack implementation in Java

public class StackUsingArray {

    // store elements of stack
    public int arr[];
    // represent top of stack
    private int top;
    // total capacity of the stack
    private int capacity;

    // Creating a stack
    StackUsingArray(int size) {
        // initialize the array
        // initialize the stack variables
        arr = new int[size];
        capacity = size;
        top = -1;
    }

    // push elements to the top of stack
    public boolean push(int x) {
//        if (isFull()) {
//            System.out.println("StackUsingArray OverFlow");
//            return true;
//            // terminates the program
////            System.exit(1);
//        }

        // insert element on top of stack

        top = top + 1;
        arr[top] = x;
        return true;
    }

    // pop elements from top of stack
    public int pop() {

        // if stack is empty
        // no element to pop
        if (isEmpty()) {
            System.out.println("STACK EMPTY");
            // terminates the program
            System.exit(1);
        }

        // pop element from top of stack
        top = top - 1;
        return arr[top + 1];
    }

    // return size of the stack
    public int getSize() {
        return top + 1;
    }

    // check if the stack is empty
    public Boolean isEmpty() {
        return top == -1;
    }

    // check if the stack is full
    public Boolean isFull() {
        return top == capacity - 1;
    }

    // display elements of stack
    public void printStack() {
        for (int i = 0; i <= top; i++) {
            System.out.print(arr[i] + "  ");
        }
    }

    public static void main(String[] args) {
//        dynamicStack stack = new dynamicStack(5);
//        if we have used custom stack means apply size limit of the stack then we need to use
        StackUsingArray stack = new StackUsingArray(5);
        System.out.println(stack.isEmpty());
        try {
            stack.push(1);
            stack.push(29);
            stack.push(3);
            stack.push(76);
            stack.push(32);
            stack.printStack();
            stack.push(9);


//        stack.push(94);

            System.out.print("StackUsingArray: ");
            stack.printStack();

//         remove element from stack

            System.out.println("\n Popped element is :" + stack.pop());
            System.out.println(" Popped element is :" + stack.pop());
            System.out.println("\nAfter popping out");
            stack.printStack();
        } catch (Exception e) {
            System.out.println("\nEither overflow or underflow");
        }

    }
}